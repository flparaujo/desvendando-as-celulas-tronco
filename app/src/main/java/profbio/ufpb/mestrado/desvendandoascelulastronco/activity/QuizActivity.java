package profbio.ufpb.mestrado.desvendandoascelulastronco.activity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import profbio.ufpb.mestrado.desvendandoascelulastronco.R;
import profbio.ufpb.mestrado.desvendandoascelulastronco.model.Question;
import profbio.ufpb.mestrado.desvendandoascelulastronco.model.QuestionsData;

public class QuizActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private List<Question> questions;
    private int questionCounter;
    private int totalQuestions;
    private Question currentQuestion;

    private int choice;
    private int level;

    private boolean confirmed;

    private boolean usedHelp1;
    private boolean usedHelp2;
    private boolean usedHelp3;

    private TextView question;
    private TextView questionTitle;
    private TextView currentLevel;

    private TextView answer1;
    private TextView answer2;
    private TextView answer3;

    private TextView[] labelAnswer;

    private LinearLayout[] btnAnswer;

    private int[] cellsImg;

    private Button btnNext;

    private ScrollView scrollView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        question = findViewById(R.id.question_text);
        questionTitle = findViewById(R.id.question_title);
        currentLevel = findViewById(R.id.current_level_text);

        answer1 = findViewById(R.id.answer1_text);
        answer2 = findViewById(R.id.answer2_text);
        answer3 = findViewById(R.id.answer3_text);

        labelAnswer = new TextView[]{findViewById(R.id.answer1_label), findViewById(R.id.answer2_label), findViewById(R.id.answer3_label)};

        btnAnswer = new LinearLayout[]{findViewById(R.id.answer_1), findViewById(R.id.answer_2), findViewById(R.id.answer_3)};

        cellsImg = new int[] {R.drawable.ct1, R.drawable.cta, R.drawable.ctp};

        btnNext = findViewById(R.id.next_button);

        scrollView1 = findViewById(R.id.scrollView1);

        level = 1;

        questions = new ArrayList<>(QuestionsData.getQuestions().subList(0, 8));
        totalQuestions = questions.size();

        showNextQuestion();

        btnAnswer[0].setOnClickListener(v -> {
            if (!confirmed) {
                choice = 1;
                selectButton(0, 1, 2);
            }
        });
        btnAnswer[1].setOnClickListener(v -> {
            if (!confirmed) {
                choice = 2;
                selectButton(1, 0, 2);
            }
        });
        btnAnswer[2].setOnClickListener(v -> {
            if (!confirmed) {
                choice = 3;
                selectButton(2, 0, 1);
            }
        });


        btnNext.setOnClickListener(v -> {
            if (choice == 0) {
                Toast.makeText(this, "Escolha uma alternativa", Toast.LENGTH_SHORT).show();
            } else {
                if (choice == currentQuestion.getCorrectId()) {
                    if (!confirmed) {
                        confirmed = true;
                        btnNext.setText("Continuar");
                        scrollView1.smoothScrollTo(0, btnAnswer[choice - 1].getTop());
                        showCorrect();
                    } else {
                        if(questionCounter < totalQuestions-1) {
                            questionCounter++;
                            showNextQuestion();
                        } else {
                            showAlertDialogLevelCompleted();
                        }
                    }
                } else {
                    if(!confirmed) {
                        confirmed = true;
                        btnNext.setVisibility(View.INVISIBLE);
                        scrollView1.smoothScrollTo(0, btnAnswer[choice - 1].getTop());
                        showIncorrect();
                    }
                    showAlertDialogRestartLevel();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        showExitDialog();
    }

    private void showCorrect() {
        btnAnswer[choice - 1].setBackgroundColor(ContextCompat.getColor(this, R.color.rightAnswerColor));
        labelAnswer[choice - 1].setText("✓");
    }

    private void showIncorrect() {
        btnAnswer[choice - 1].setBackgroundColor(ContextCompat.getColor(this, R.color.wrongAnswerColor));
        labelAnswer[choice - 1].setText("✗");
    }

    private void selectButton(int select, int deselect1, int deselect2) {
        btnAnswer[select].setBackgroundColor(ContextCompat.getColor(this, R.color.selectedAnswerColor));
        btnAnswer[deselect1].setBackgroundColor(Color.LTGRAY);
        btnAnswer[deselect2].setBackgroundColor(Color.LTGRAY);
    }

    private void showNextQuestion() {

        if (questionCounter < totalQuestions) {
            currentQuestion = questions.get(questionCounter);
            question.setText(currentQuestion.getQuestion());
            answer1.setText(currentQuestion.getAnswer1());
            answer2.setText(currentQuestion.getAnswer2());
            answer3.setText(currentQuestion.getAnswer3());

            questionTitle.setText("Questão " + currentQuestion.getId());
            choice = 0;
            confirmed = false;
            btnNext.setText("Responder");

            scrollView1.fullScroll(ScrollView.FOCUS_UP);
            scrollView1.pageScroll(ScrollView.FOCUS_UP);
            for (int i = 0; i < 3; i++) {
                btnAnswer[i].setBackgroundColor(Color.LTGRAY);
                btnAnswer[i].setVisibility(View.VISIBLE);
            }
            labelAnswer[0].setText("A");
            labelAnswer[1].setText("B");
            labelAnswer[2].setText("C");
        }

    }

    private void showAlertDialogLevelCompleted() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        View layoutView = getLayoutInflater().inflate(R.layout.dialog_next_level, null);

        Button nextLevelButton = layoutView.findViewById(R.id.dialog_btn);
        TextView instructions = layoutView.findViewById(R.id.instruction_text);

        if(level == 3) {
            instructions.setText("Clique no botão abaixo para sair"); //TODO botar outra coisa depois
            nextLevelButton.setText("finalizar");
        }

        TextView title = layoutView.findViewById(R.id.dialog_title);
        title.setText(level < 3 ? "NÍVEL " + level +" COMPLETO" : "☺ ✌ VOCÊ VENCEU!!!");

        ImageView img = layoutView.findViewById(R.id.stem_cell_image);
        img.setImageResource(cellsImg[level-1]);

        dialogBuilder.setView(layoutView);
        dialogBuilder.setCancelable(false);

        AlertDialog alertDialog = dialogBuilder.create();

        alertDialog.getWindow().setWindowAnimations(R.style.DialogAnimation);

        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        nextLevelButton.setOnClickListener(view -> {
            if(level == 3) {
                finish();
            }
            alertDialog.dismiss();
            gotoNextLevel();
        });


        alertDialog.show();

    }

    private void showAlertDialogRestartLevel() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        View layoutView = getLayoutInflater().inflate(R.layout.dialog_restart_level, null);
        Button restartButton = layoutView.findViewById(R.id.dialog_btn);

        dialogBuilder.setView(layoutView);
        dialogBuilder.setCancelable(false);

        AlertDialog alertDialog = dialogBuilder.create();

        alertDialog.getWindow().setWindowAnimations(R.style.DialogAnimation);
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        restartButton.setOnClickListener(view -> {
            alertDialog.dismiss();
            restartGame();
        });

        alertDialog.setOnDismissListener(dialog -> btnNext.setVisibility(View.VISIBLE));

        alertDialog.show();

    }

    private void gotoNextLevel() {
        if(level == 3) { return; }
        level++;
        questions = new ArrayList<>(QuestionsData.getQuestions().subList(8*(level-1), (8*(level-1)) + 8));
        totalQuestions = questions.size();
        questionCounter = 0;
        currentLevel.setText("Nível "+level);
        showNextQuestion();
    }

    private void restartGame() {
        usedHelp1 = false;
        usedHelp2 = false;
        usedHelp3 = false;
        level = 1;
        questions = new ArrayList<>(QuestionsData.getQuestions().subList(8*(level-1), (8*(level-1)) + 8));
        totalQuestions = questions.size();
        questionCounter = 0;
        currentLevel.setText("Nível "+level);
        showNextQuestion();
    }

    public void showPopup(View view) {
        if(usedHelp1 && usedHelp2 && usedHelp3) {
            Toast.makeText(this, "Já utilizou todas as ajudas", Toast.LENGTH_SHORT).show();
            return;
        }
        ContextThemeWrapper ctw = new ContextThemeWrapper(this, R.style.CustomPopupTheme);
        PopupMenu popupMenu = new PopupMenu(ctw, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menu_popup);

        if(confirmed) {
            popupMenu.getMenu().getItem(0).setEnabled(false);
            popupMenu.getMenu().getItem(1).setEnabled(false);
            popupMenu.getMenu().getItem(2).setEnabled(false);
        }

        if(usedHelp1) {
            popupMenu.getMenu().getItem(0).setVisible(false);
        }
        if(usedHelp2) {
            popupMenu.getMenu().getItem(1).setVisible(false);
        }
        if(usedHelp3) {
            popupMenu.getMenu().getItem(2).setVisible(false);
        }

        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.help1:
                changeQuestion();
                return true;
            case R.id.help2:
                eraseTwoWrong();
                return true;
            case R.id.help3: 
                showKeyword();
                return true;
            default:
                return false;
        }
    }

    private void showKeyword() {
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        TextView title = new TextView(this);
        title.setText("⚷ Palavra-chave");
        title.setPadding(10, 10, 10, 20);
        title.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        title.setTextSize(15);
        alertDialog.setCustomTitle(title);

        TextView keyword = new TextView(this);

        keyword.setText(currentQuestion.getKeyword());
        keyword.setGravity(Gravity.CENTER_HORIZONTAL);
        keyword.setPadding(20, 0, 20, 0);
        keyword.setTextColor(Color.BLACK);
        keyword.setTextSize(18);
        alertDialog.setView(keyword);

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "fechar", (dialog, which) -> {});

        alertDialog.show();
        usedHelp3 = true;
    }

    private void showExitDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(QuizActivity.this);
        builder.setTitle("❎ Sair do jogo");
        builder.setMessage("Tem certeza que quer sair?")
                .setPositiveButton("Sim", (dialog, id) -> finish())
                .setNegativeButton("Não", (dialog, id) -> dialog.cancel());
        AlertDialog alert = builder.create();
        alert.show();
    }

    private void eraseTwoWrong() {
        for(int i = 0; i < 3; i++) {
            if(currentQuestion.getCorrectId() != (i+1)) {
                btnAnswer[i].setVisibility(View.GONE);
            }
        }
        Toast.makeText(this, "Você eliminou duas alternativas incorretas", Toast.LENGTH_SHORT).show();
        usedHelp2 = true;
    }

    private void changeQuestion() {
        if (this.questionCounter == totalQuestions-1) {
            Toast.makeText(this, "Essa é a última questão da fase atual", Toast.LENGTH_SHORT).show();
        } else {
            int min = this.questionCounter+1;
            int val = new Random().nextInt((7 - min) + 1) + min;
            Collections.swap(this.questions, this.questionCounter, val);
            this.usedHelp1 = true;
            showNextQuestion();
            Toast.makeText(this, "Você mudou a questão", Toast.LENGTH_SHORT).show();
        }
    }


}

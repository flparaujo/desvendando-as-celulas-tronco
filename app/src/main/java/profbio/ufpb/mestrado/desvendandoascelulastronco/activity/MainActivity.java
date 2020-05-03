package profbio.ufpb.mestrado.desvendandoascelulastronco.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import profbio.ufpb.mestrado.desvendandoascelulastronco.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button play = findViewById(R.id.btn_play);
        Button learnMore = findViewById(R.id.btn_learn_more);

        play.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, QuizActivity.class));
            overridePendingTransition(R.anim.slide_down_long, R.anim.slide_up_long);
        });

        learnMore.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AboutStemCellsActivity.class));
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
    }
}

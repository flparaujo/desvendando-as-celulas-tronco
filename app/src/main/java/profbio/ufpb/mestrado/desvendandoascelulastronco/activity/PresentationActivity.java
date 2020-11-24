package profbio.ufpb.mestrado.desvendandoascelulastronco.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.text.HtmlCompat;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import profbio.ufpb.mestrado.desvendandoascelulastronco.R;

public class PresentationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation);

        Toolbar toolbar = findViewById(R.id.presentation_toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView text = findViewById(R.id.presentation_text);
        text.setText(HtmlCompat.fromHtml("<h5>APRESENTA&Ccedil;&Atilde;O</h5>\n" +
                "<p>A ideia em investir no tema C&eacute;lulas-Tronco surgiu da necessidade de aprofundar o assunto ainda pouco explorado nos livros dedicados ao Ensino M&eacute;dio. A escolha por explor&aacute;-lo baseado em novas tecnologias, surge com o desejo de ampliar o acesso a esse tema, bem como atender a uma demanda por aplicativos educacionais. Assim, o aplicativo &ldquo;Desvendando as C&eacute;lulas-Tronco&rdquo; visa tanto trazer informa&ccedil;&otilde;es em um n&iacute;vel mais aprofundado quanto contribuir com o acesso &agrave; essas informa&ccedil;&otilde;es em um mundo em que precisamos cada vez mais termos acessos &agrave; conte&uacute;dos de forma remota.<br />O app &ldquo;Desvendando as c&eacute;lulas-tronco&rdquo;, roda off-line e &eacute; disponibilizado na plataforma Android. &Eacute; constitu&iacute;do por tr&ecirc;s se&ccedil;&otilde;es: 1) ESTUDO: se&ccedil;&atilde;o te&oacute;rica que versa sobre a tem&aacute;tica c&eacute;lulas-tronco, detalhando e apresentando o tema aos que ir&atilde;o utilizar o software; 2) CURIOSIDADES: se&ccedil;&atilde;o que agrupa as curiosidades sobre a utiliza&ccedil;&atilde;o das c&eacute;lulas-tronco; 3) JOGO: se&ccedil;&atilde;o que contempla uma parte interativa formado por um conjunto de perguntas distribu&iacute;das em tr&ecirc;s n&iacute;veis (QUIZ).<br />Esperamos que sua utiliza&ccedil;&atilde;o, em ambientes intra e extra-escolares, possa proporcionar aos seus usu&aacute;rios, sobretudo aos estudantes do Ensino M&eacute;dio, uma aproxima&ccedil;&atilde;o necess&aacute;ria a um assunto t&atilde;o atual na &aacute;rea da ci&ecirc;ncia.</p>\n" +
                "<p><br/><em>Prof. Alerson de Brito Almeida</em><br/><em>Orientadora: Naila Francis Paulo de Oliveira</em><br/><em>Mestrado Profissional em Ensino de Biologia (PROFBIO)</em><br/><em>Universidade Federal da Para&iacute;ba (UFPB)</em><br/><em>Jo&atilde;o Pessoa- PB</em></p>\n" +
                "<p><em>Novembro de 2020</em></p>", HtmlCompat.FROM_HTML_MODE_LEGACY));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            text.setJustificationMode(android.text.Layout.JUSTIFICATION_MODE_INTER_WORD);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
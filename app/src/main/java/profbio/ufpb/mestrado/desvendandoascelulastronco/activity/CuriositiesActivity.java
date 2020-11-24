package profbio.ufpb.mestrado.desvendandoascelulastronco.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.text.HtmlCompat;

import profbio.ufpb.mestrado.desvendandoascelulastronco.R;

public class CuriositiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curiosities);

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView text = findViewById(R.id.curiosities_text);
        text.setText(HtmlCompat.fromHtml("<h5>CURIOSIDADES SOBRE AS CT’S</h5>" +
                "<p>A comunidade científica vem demonstrando grande interesse pelo estudo desse grupo celular, e isso tem sido divulgado " +
                "por diversos meios de comunicação. Entretanto, poucos imaginam que existem várias pesquisas em que o cultivo de células-tronco" +
                " em laboratório podem apresentar novidades promissoras na forma como a medicina propõe tratamentos e diagnósticos dos mais diversos" +
                " tipos de doenças. Veja algumas curiosidades ainda não tão divulgadas:</p>" +
                "<h6>Você sabia que Células-tronco são utilizadas como ferramenta de pesquisa?</h6>" +
                "<p>O biólogo Stevens Rehen da UFRJ, foi um dos primeiros biólogos a demonstrar a relação entre infecção pelo <i>zika</i> vírus e microcefalia. " +
                "Chefe do departamento de pesquisa do Instituto D’Or de Pesquisa e Ensino, o neurocientista é fascinado pelo estudo com células-tronco.</p>" +
                "<p>Em seus estudos com reprogramação celular são colhidos fragmentos de pele ou da urina de uma pessoa, fazendo as mesmas a voltarem no tempo" +
                " e se comportarem como células embrionárias. Com isso, formam-se “minicérebros” que simulam o funcionamento do cérebro em desenvolvimento " +
                "possibilitando, assim, melhor entendimento sobre distúrbios de neurodesenvolvimento e testagem de medicamentos que combatam tal anomalia. " +
                "Aprofundem-se mais sobre o estudo em: https://science.sciencemag.org/content/352/6287/816/tab-pdf" +
                "<h6>Você sabia que poderemos, em um futuro próximo, criar órgãos em laboratório?</h6>" +
                "<p>Assim como retratado no tópico anterior, existem várias pesquisas que produzem órgãos em laboratório a partir de fragmentos celulares e usando " +
                "a técnica de reprogramação celular. “Miniórgãos” já são produzidos para estudos de funcionamento, porém não existe relatos de utilização real " +
                "em organismos vivos. Empresas de cosméticos intensificam estudos para criação de pele artificial, com o intuito de testagem de produtos. A ciência" +
                " se esforça na busca em descobrir como “moldar” essas células, transformando-as de modo a desempenharem funções específicas nos organismos vivos.</p>" +
                "<p>O que nos deixa com muita esperança em um futuro próximo, produzir órgãos em laboratórios e diminuir a fila por transplantes nos hospitais em todo mundo.</p>" +
                "<h6>Você sabia que o desenvolvimento de novas medicações poderá ser otimizado pelo teste com células-tronco?</h6>" +
                "<p>Com a produção de “órgãos em laboratório”, como relatado no tópico anterior, além de diminuir o sofrimento de pessoas à espera de órgãos para transplante, " +
                "possibilitará a testagem de novos fármacos em laboratório, compreendendo dessa forma a sintomatologia apresentada por cada doença. Outro ponto a ser levantado" +
                " é sobre as implicações éticas com testes em animais, uma vez que, cada espécie reage de forma diferente aos compostos químicos, o que complica bastante o " +
                "processo de aprovação de novos remédios. Fármacos, cosméticos e vacinas serão rapidamente produzidos, testados e liberados para consumo com eficácia bem mais" +
                " potencializada de forma ética e com responsabilidade social.</p>" +
                "<h6>Você sabia que o estudo com células-tronco pode revolucionar os tratamentos de doenças até então incuráveis?</h6>" +
                "<p>O estudo mais aprofundado em laboratório sobre as particularidades de diversas patologias, ajudará na compreensão de características específicas dessas doenças, " +
                "além de apresentar resultados da ação de fármacos na resposta aos sintomas apresentados em organismos distintos.</p>" +
                "<p>A medicina regenerativa busca através destes estudos, mudar a vida de quem vai utilizar a terapia celular apresentando repostas positivas as necessidades e demandas individuais.</p>" +
                "<h6>Você sabia que existem bancos de armazenamento de células-tronco?</h6>" +
                "<p>É pessoal, várias empresas privadas ligadas a medicina regenerativa, através do processo de criopreservação, congelam células-tronco para disponibilização aos pacientes em casos de necessidade em tratamento futuros.</p>" +
                "<p>No Brasil, diversos laboratórios utilizam esta técnica para conservação de aglomerados celulares para utilização em terapias ligadas a medicina regenerativa. Conheça mais em: http://www.r-crio.com/sobre-nos/.</p>" +
                "<h6>Você sabia que podemos extrair células-tronco do cordão umbilical, dos dentes de leite e até do dente siso?</h6>" +
                "<p>Os estudos mais recorrentes na mídia de uma forma geral, apontam as células-tronco extraídas da medula-óssea ou até do cordão umbilical. Porém estudos avançam e mostram resultados positivos no tratamento de diversas doenças, a utilização de células-tronco extraídas dos dentes de leite e até do dente siso. Como são constituídos por células mais jovens que os outros grupos celulares, apresentam grande potencialidade em transformar-se em tecidos, ossos ou até músculos do corpo. " +
                "Aprofundem-se mais sobre o assunto acessando: https://ccb.med.br/texto/polpa-do-dente#:~:text=Vantagens%20do%20armazenamento%20das%20c%C3%A9lulas,tamb%C3%A9m%20a%20toda%20sua%20fam%C3%ADlia.</p>", HtmlCompat.FROM_HTML_MODE_LEGACY));

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

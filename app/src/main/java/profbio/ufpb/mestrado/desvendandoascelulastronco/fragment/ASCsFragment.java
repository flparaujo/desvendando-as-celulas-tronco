package profbio.ufpb.mestrado.desvendandoascelulastronco.fragment;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import profbio.ufpb.mestrado.desvendandoascelulastronco.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ASCsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ASCsFragment extends PageFragment {

    public ASCsFragment() {
        // Required empty public constructor
    }

    public static ASCsFragment newInstance(int page, String title) {
        ASCsFragment fragment = new ASCsFragment();
        Bundle args = new Bundle();
        args.putInt("page", page);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView[] txtviews = {view.findViewById(R.id.esc_p1), view.findViewById(R.id.esc_p2),};
        txtviews[0].setText(HtmlCompat.fromHtml("<h5>CÉLULAS-TRONCO EMBRIONÁRIAS (CTE)</h5>\n" +
                "<p>Verifica-se, algumas vezes, certa confusão na compreensão do conceito de célula-tronco embrionária (CTE). Para compreensão deste grupo celular, é extremamente necessário demonstrarmos o estágio de desenvolvimento em que ela ocorre. As CTE, são assim denominadas,  por serem células derivadas da massa celular interna de um blastocisto, um estágio inicial de pré-implantação no útero. Os embriões humanos atingem a fase de blastocisto por volta de 4-5 dias após a fertilização, sendo constituídas em média de 50-150 células. Para utilizar este tipo celular é preciso isolar o embrioblasto ou a massa celular interior acarretando na destruição do blastocisto, o que levanta questões éticas, como: “os embriões na fase de pré-implantação devem ou não ter o mesmo <em>status</em> moral ou legal que os embriões no estágio de desenvolvimento pós-implantação do blastocisto?”</p>\n" +
                "<h6><em>PROPRIEDADES</em></h6>\n" +
                "<p>As CTEs, derivadas dos embriões de mamíferos no estágio de blastocisto (figura 4) distinguem-se por sua capacidade de se propagar. As propriedades das CTEs incluem o cariótipo normal, a manutenção da atividade elevada da telomerase e o potencial proliferativo notável a longo prazo, sendo assim, conhecidas como células pluripotentes ou totipotentes. Tal grupo celular recebe essa denominação por apresentar a capacidade de transformar-se em qualquer outra célula constituinte do embrião. As CTEs humanas medem aproximadamente 14µm.</p>\n" +
                "<small><strong>Figura 4 – Origem das CTEs a partir das células derivadas do embrioblasto.</strong></small>", HtmlCompat.FROM_HTML_MODE_LEGACY));
        txtviews[1].setText(HtmlCompat.fromHtml("<small>Fonte: Depositphotos, modificado por ALMEIDA, 2020</small>\n" +
                "<h6><em>PORQUE SÃO TOTIPOTENTES?</em></h6>\n" +
                "<p>As CTEs da massa celular interna são totipotentes, ou seja, possuem a capacidade de diferenciação para gerar ectoderme primitiva, que finalmente se diferencia durante a gastrulação em todas as derivações das três camadas germinativas primárias: ectoderme, endoderme e mesoderme. Estas incluem cada um dos mais de 220 tipos de células no corpo adulto. A pluripotência distingue células-tronco embrionárias de células-troncoadultas: enquanto as CTEs podem gerar todos os tipos de células no corpo, as CTAs são multipotentes e podem produzir apenas um número limitado de tipos de células. Se o potencial de diferenciação pluripotente das células-tronco embrionárias pudesse ser aproveitado <em>in vitro</em>, poderia ser um meio de derivar virtualmente os tipos de células ou tecidos. Isso proporcionaria uma nova abordagem radical de tratamento para uma ampla variedade de condições em que a idade, a doença ou o trauma levaram a danos ou disfunções nos tecidos.</p>\n" +
                "<h6><em>COMO OCORRE A SUA PROPAGAÇÃO?</em></h6>\n" +
                "<p>Em condições definidas, as CTEs são capazes de se propagarem indefinidamente de forma indiferenciada, presumivelmente através da formação de células precursoras, para quase todos os fenótipos celulares maduros. Isso permite que as CTEs sejam empregadas como ferramentas úteis tanto para a pesquisa quanto para a medicina regenerativa, porque elas podem produzir números ilimitados de si mesmas.</p>\n" +
                "<h6><em>QUAIS AS UTILIDADES?</em></h6>\n" +
                "<p>Devido à sua plasticidade e capacidade potencialmente ilimitada de auto renovação, as terapias com CTEs foram propostas para a medicina regenerativa e a substituição de tecidos após lesão ou doença. Doenças que poderiam potencialmente ser tratadas por células-tronco pluripotentes incluem uma série de doenças genéticas, cânceres e distúrbios relacionados ao sistema imunológico e ao sangue; diabetes juvenil, doença de Parkinson, cegueira e lesões na medula espinhal. Admite-se as preocupações éticas da terapia com células-tronco. As pesquisas com CTEs promovem esperanças de que será possível, em um futuro próximo, suprir a necessidade reposicional de tecidos, tornando as células imunocompatíveis com o receptor. Outras utilizações potenciais de CTEs incluem a investigação do desenvolvimento inicial de humanos, estudo de doenças genéticas e sistemas <em>in vitro</em> para testes toxicológicos.</p>", HtmlCompat.FROM_HTML_MODE_LEGACY));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            for (TextView textView : txtviews) {
                textView.setJustificationMode(android.text.Layout.JUSTIFICATION_MODE_INTER_WORD);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a_s_cs, container, false);
    }
}
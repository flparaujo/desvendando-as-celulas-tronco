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
        TextView[] txtviews = {view.findViewById(R.id.asc_p1), view.findViewById(R.id.asc_p2), view.findViewById(R.id.asc_p3)};
        txtviews[0].setText(HtmlCompat.fromHtml("<h5>CÉLULAS-TRONCO ADULTAS (CTA)</h5>\n" +
                "<p>As células-tronco adultas (CTA) são células indiferenciadas, encontradas em todo nosso corpo após o desenvolvimento. Multiplicam-se através de sucessivas mitoses com o intuito de repor as células que estão morrendo, assim como regenerar os tecidos danificados. Também denominadas células-tronco somáticas, elas podem ser encontradas tanto em animais jovens como adultos e humanos, ao contrário das CTEs presentes apenas no embrião. Os cientistas possuem interesse nas CTAs devido ao grande potencial de se dividirem ou se auto renovarem indefinidamente, gerando todos os tipos de células do órgão de onde são originárias, com a potencialidade de regenerar todo o órgão a partir de algumas células. Ao contrário das CTEs, o uso de CTAs em investigação e terapêutica não é considerado controverso, uma vez que são derivadas de amostras de tecidos adultos em vez de embriões humanos designados para investigação científica. Essas células têm sido estudadas principalmente em seres humanos e organismos modelo, como ratos e camundongos.</p>\n" +
                "<p>A história das CTAs inicia-se após a segunda guerra mundial com a liberação das bombas atômicas nas cidades japonesas de Hiroshima e Nagasaki, no ano de 1945. Tais bombardeios foram capitaneados pelos EUA e causaram um grande número de mortes precoces, dizimando grande parte da população existente naquelas cidades. Os estudos experimentais com CT iniciaram-se após a exposição de populações civis a doses letais de radiação produzidas por tais bombas. Para reproduzir os efeitos causados pela radiação, começaram a ser feitos experimentos com camundongos irradiados e, em 1956, alguns grupos mostraram que o transplante de medula óssea corrigia, nestes animais, os efeitos da radiação. Descobrindo-se assim a função no organismo das células tronco presentes na medula óssea. A figura 5 mostra a medula óssea repleta de células-tronco.</p>\n" +
                "<small><strong>Figura 5 - Células-tronco adultas presentes na medula-óssea</strong></small>", HtmlCompat.FROM_HTML_MODE_LEGACY));
        txtviews[1].setText(HtmlCompat.fromHtml("<small>Fonte: Depositphotos, modificado por ALMEIDA, 2020</small>\n" +
                "<p><strong><em>PROPRIEDADES</em></strong></p>\n" +
                "<p>Uma célula-tronco adulta possui duas propriedades:</p>\n" +
                "<p><em>Auto-renovação </em>- habilidade de passar por numerosos ciclos de divisão celular (mitose) enquanto ainda mantém seu estado indiferenciado.</p>\n" +
                "<p><em>Multipotência ou potencial multidiferenciativo</em> - capacidade de gerar progênie de vários tipos distintos de células (por exemplo, células gliais e neurônios) em oposição à unipotência, que é o termo para células que são restritas a produzir um único tipo celular.</p>\n" +
                "<p>No entanto, alguns pesquisadores não consideram a multipotência essencial e acreditam que células-tronco auto-renováveis e unipotentes podem existir. Estas propriedades podem ser ilustradas com relativa facilidade <em>in vitro</em>, utilizando métodos como o ensaio clonogênico, em que a progênie de uma única célula é caracterizada. As células estaminais (latim <em>stamen</em>, <em>staminis</em> = tronco, ordem, filo, fio) apresentam a capacidade de auto renovação em diversos grupos de células e tecidos específicos com funções especializadas.</p>\n" +
                "<p><strong><em>LINHAGEM DAS CÉLULAS-TRONCOADULTAS</em></strong></p>\n" +
                "<p>Para assegurar a auto renovação, as CTs sofrem dois tipos de divisão celular: Simétrica e Assimétrica. A divisão simétrica dá origem a duas células-filhas idênticas, ambas dotadas de propriedades de células estaminais, enquanto a divisão assimétrica produz apenas uma célula estaminal e uma célula progenitora com potencial de auto renovação limitado. Os progenitores podem passar por vários ciclos de divisão celular antes de finalmente se diferenciarem em uma célula madura. Acredita-se que a distinção molecular entre divisões simétricas e assimétricas esteja na segregação diferencial das proteínas da membrana celular (como os receptores) entre as células filhas.</p>\n" +
                "<p><strong><em>PLASTICIDADE</em></strong></p>\n" +
                "<p>As descobertas nos últimos anos sugeriram que as CTAs podem ter a capacidade de se diferenciar em tipos de células de diferentes camadas germinativas. Por exemplo, células-tronco neurais do cérebro; que são derivados do ectoderma, podem se diferenciar em ectoderme, mesoderme e endoderme. Este fenômeno é referido como transdiferenciação de CT ou plasticidade. Pode ser induzida pela modificação do meio de crescimento quando as CTs são cultivadas <em>in vitro</em> ou transplantadas para um órgão do corpo diferente daquele do qual foram originalmente isoladas. Ainda não há consenso entre os biólogos sobre a prevalência e relevância fisiológica e terapêutica da plasticidade das células-tronco. Descobertas mais recentes sugerem que células-tronco pluripotentes podem residir em tecidos sanguíneos e adultos em um estado dormente. Estas células são referenciadas como células estaminais do tipo <em>BlastomereLike</em> e células estaminais embrionárias muito pequenas, tipo VSEL (do inglês “VerySmallEmbryonic-Like”) e exibem pluripotência<em>in vitro</em>.</p>\n" +
                "<p><strong><em>TIPOS DE CÉLULAS-TRONCO ADULTAS (CTA)</em></strong></p>\n" +
                "<p><strong><em>Células Estaminais Hematopoiéticas </em></strong>- As células estaminais hematopoiéticas são encontradas na medula óssea e no sangue do cordão umbilical e dão origem a todos os tipos de células sanguíneas. De acordo com a literatura, pesquisas desenvolvidas após a segunda guerra mundial em relação as bombas de Hiroshima e Nagasaki, apontaram que boa parte das mortes foram proporcionadas por insuficiência medular. Em estudos posteriores, com camundongos, verificou-se que estes ao receberem certo grau de radiações apresentavam morte com características semelhantes ao acontecido com a população das cidades japonesas. Nestes mesmos experimentos verificaram-se que, quando ocorria a introdução do elemento químico chumbo (Pb) protegendo o baço destas cobaias, a atividade sanguínea não era prejudicada. A partir de tais observações foram injetadas células da medula óssea na medula das cobaias, obtendo resultados satisfatórios, chegando a conclusão de que tais células detinham a capacidade de regenerar todo o sistema medular.</p>\n" +
                "<p><strong><em>Células-tronco mamárias </em></strong>- as células-tronco mamárias fornecem a fonte de células para o crescimento da glândula mamária durante a puberdade e a gestação e desempenham um papel importante na carcinogênese da mama. Células-tronco mamárias foram isoladas da glândula mamária de tecidos humanos e de camundongos. Essas células são as únicas células que podem dar origem tanto às células luminais quanto as mioepiteliais do galão (responsáveis pela secreção do leite), bem como mostram ter a capacidade de regenerar o órgão inteiro em camundongos.</p>\n" +
                "<p><strong><em>Células-tronco intestinais</em></strong> - As células-tronco intestinais se dividem continuamente ao longo da vida e usam um programa genético complexo para produzir as células que revestem a superfície dos intestinos delgado e grosso. As células-tronco intestinais residem perto da base do nicho de células-tronco, chamadas de criptas de Lieberkuhn. Embora sejam importantes para a regeneração do revestimento do intestino, por outro lado, são provavelmente a fonte da maioria dos cânceres do intestino delgado e do cólon.</p>\n" +
                "<p><strong><em>Células-tronco mesenquimais</em></strong> - As células-tronco mesenquimais (CTM) são de origem estromal e podem se diferenciar em uma variedade de tecidos. A CTM foi isolada da placenta, tecido adiposo, pulmão, medula óssea, sangue, geléia de Wharton do cordão umbilical e do elemento dentário (nicho perivascular da polpa dentária e ligamento periodontal). A CTM é atraente para a terapia clínica devido à sua capacidade de se diferenciar em vários tipos de células, como osteoblastos, condroblastos, adipócitos, células neuroectodérmicas e hepatócitos, como demonstrado na figura abaixo:</p>\n" +
                "<small><strong>Figura 6 – Processo de diferenciação das CTM</strong></small>", HtmlCompat.FROM_HTML_MODE_LEGACY));
        txtviews[2].setText(HtmlCompat.fromHtml("<small>Fonte: Depositphotos, modificado por ALMEIDA, 2020</small>\n" +
                "<p><strong><em>Células-tronco endoteliais</em> -</strong> As células-tronco endoteliais são um dos três tipos de células-tronco multipotentes encontradas na medula óssea. Elas são um grupo raro e controverso, com a capacidade de se diferenciar em células endoteliais que revestem os vasos sanguíneos. A controvérsia está justamente sobre as suas capacidades de diferenciação em células de revestimento dos vasos.</p>\n" +
                "<p><strong><em>Células-tronco neurais</em></strong> - A existência de células-tronco no cérebro adulto foi postulada após a descoberta de que o processo de neurogênese, o nascimento de novos neurônios, continua na vida adulta em ratos. A presença de células-tronco no cérebro de primatas mais velhos foi relatada pela primeira vez em 1967. Desde então, foi demonstrado que novos neurônios são gerados em camundongos adultos, pássaros canoros e primatas, incluindo humanos. Normalmente, a neurogênese adulta é restrita a duas áreas do cérebro - a zona subventricular, que reveste os ventrículos laterais e o giro denteado do hipocampo, contudo, a presença de verdadeiras células-tronco auto-renováveis tem sido debatida. Sob certas circunstâncias, como após dano tecidual na isquemia, a neurogênese pode ser induzida nas outras regiões cerebrais, incluindo o neocórtex. Esses tipos de células-tronco são comumente cultivadas <em>in vitro</em> como as chamadas neuroesferas - agregados heterogêneos flutuantes de células, contendo uma grande proporção de células-tronco. Elas podem ser propagadas por longos períodos de tempo e diferenciadas em células neuronais e gliais e, portanto, comportam-se como células-tronco. Contudo, as células derivadas da neuroesfera não se comportam como células-tronco quando transplantadas de volta ao cérebro. As células estaminais neuronais partilham muitas propriedades com células estaminais hematopoiéticas (CTH). Notavelmente, quando injetadas no sangue, as células derivadas da neuroesfera se diferenciam em vários tipos de células do sistema imunológico.</p>\n" +
                "<p><strong><em>Células-tronco adultas olfativas</em></strong><strong> -</strong> são encontradas no revestimento do nariz e estão envolvidas no sentido do olfato. Se essas células estão em um ambiente propício, apresentam a mesma capacidade que as CTEs de se desenvolverem em muitos tipos celulares diferentes. As células-tronco olfativas possuem potencial para aplicações terapêuticas e, em contraste com as células-tronco neurais, podem ser colhidas com facilidade, sem causar danos ao paciente. Isso significa que elas podem ser facilmente obtidas de todos os indivíduos, incluindo pacientes mais velhos que poderiam se beneficiar muito com terapias baseadas em células-tronco.</p>\n" +
                "<p><strong><em>Células-tronco da crista neural</em></strong><strong> -</strong> Os folículos capilares contêm dois tipos de células-tronco, uma das quais parece representar um remanescente das células-tronco da crista neural embrionária. Células semelhantes foram encontradas no trato gastrointestinal, no nervo ciático, na via de saída cardíaca e nos gânglios espinhais e simpáticos. Essas células podem gerar neurônios, células de Schwann, miofibroblastos, condrócitos e melanócitos.</p>\n" +
                "<p><strong><em>Células testiculares </em></strong><strong>- </strong>Células-tronco multipotentes com uma equivalência reivindicada a células-tronco embrionárias foram derivadas de células progenitoras de espermatogônias encontradas nos testículos de camundongos por cientistas na Alemanha e nos Estados Unidos e, um ano depois, em células dos testículos de humanos. As células-tronco extraídas dos testículos são conhecidas como células-tronco germinativas humanas adultas (CTGA).</p>\n" +
                "<p>O potencial terapêutico das CTAs é o foco de muitas pesquisas científicas, devido à sua capacidade de serem colhidas do paciente. Em comum com as CTEs, as CTAs detêm a capacidade de se diferenciar em mais de um tipo celular, mas, diferentemente da primeira, elas geralmente são restritas a certos tipos ou linhagens celulares.</p>", HtmlCompat.FROM_HTML_MODE_LEGACY));

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
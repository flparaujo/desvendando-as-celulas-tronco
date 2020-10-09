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
 * Use the {@link IPSCsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class IPSCsFragment extends PageFragment {

    public IPSCsFragment() {
        // Required empty public constructor
    }

    public static IPSCsFragment newInstance(int page, String title) {
        IPSCsFragment fragment = new IPSCsFragment();
        Bundle args = new Bundle();
        args.putInt("page", page);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView[] txtviews = {view.findViewById(R.id.ipsc_p1), view.findViewById(R.id.ipsc_p2),};
        txtviews[0].setText(HtmlCompat.fromHtml("<h5>CÉLULAS-TRONCO PLURIPOTENTES INDUZIDAS (IPS)</h5>\n" +
                "<p>No ano de 1997, através de estudos realizados pelos biólogos Keith Campbell e Ian Wilmut, entre outros colegas, foi apresentado ao meio científico ovelha Dolly. Nascida em 5 de julho de 1996, 6LLS, mais conhecida por Dolly, é a ovelha mais famosa do mundo. A cordeira não se tratava de um animal qualquer, mas um organismo geneticamente idêntico a outro, ou seja, um clone. Tal organismo não havia sido originado a partir de um óvulo fertilizado por um espermatozóide e sim de uma célula glandular mamária de outra ovelha (já morta), uma Finn Dorset de seis anos de idade.</p>\n" +
                "<p>A apresentação de um organismo denominado clone, provocou incredulidade ao meio científico que buscava respostas para tão bela criatura ter sido originada. O fato de não ocorrer um aprofundamento de como se conseguiu formar um ser vivo sem a fecundação acontecer e como a partir de célula mamária de outro organismo, originaria um clone, foi tema de várias discussões no meio científico. Tal técnica utilizada na produção do clone foi denominada como reprogramação celular e consiste na retirada de um óvulo não fertilizado de um organismo e cromossomos de outro organismo que através de estímulos artificiais torna-se um ser vivo.</p>\n" +
                "<p>Uma década depois da apresentação de Dolly, no ano 2006, através de estudos do pesquisador japonês Shynia Yamanaka, células da cauda de um camundongo foram reprogramadas fazendo com que estas voltassem a se comportar como CTE. Tal estudo possibilitou o inícioda produção em laboratório de células-tronco. No ano seguinte, a equipe de Shynia Yamanaka, conseguiua partir da pele, produzir as primeiras células-tronco reprogramadas. A partir desta descoberta importantíssima para ciência médica, desde então, as células epidérmicas, tem sido a principal fonte de células para reprogramação, sabendo-se hoje, que qualquer tecido do corpo possui a capacidade de ser reprogramado.</p>\n" +
                "<p>O grupo de células que foram produzidas em laboratório a partir da reprogramação celular são chamadas de células-tronco de pluripotência induzida ou pela sigla iPS (do inglês <em>induced pluripotent stem cells</em>). Isto é, as iPS são derivadas de reprogramação celular, processo realizado em laboratório, onde células de organismos adultos são retiradas e induzidas a expressar fatores de transcrição, levando a este grupo celular a desdiferenciação celular e recuperando as características presente nas CTEs, a pluripotência. O processo de diferenciação das iPS está descrito na figura 7.</p>\n" +
                "<small><strong>Figura 7 – Processo de diferenciação das iPS</strong></small>", HtmlCompat.FROM_HTML_MODE_LEGACY));
        txtviews[1].setText(HtmlCompat.fromHtml("<small>Fonte: Depositphotos, modificado por ALMEIDA, 2020</small>\n" +
                "<p>Mesmo diante dos impasses éticos na utilização de células-tronco, a ciência e a medicina apostam muito no potencial benéfíco que as iPS podem nos trazer, principalmente por não esquentarem os embates entre ciência e religião, uma vez que são produzidas a partir da reprogramação de células vivas e possuem praticamente as mesmas propriedades das CTEs, tendo a grande vantagem de não serem obtidas de embriões.</p>\n" +
                "<p>No tocante a utilização terapêutica, a grande potencialidade que as iPS possuem vislumbram uma utilização futura no combate e prevenção de doenças. Por conta de tal capacidade, é esperado que as iPS revolucionem a medicina regenerativa num futuro próximo. De fato, já existem vários estudos promissores sobre sua utilização (leia a seção CURIOSIDADES), animando a comunidade científica para solucionar diversos problemas na saúde humana.</p>", HtmlCompat.FROM_HTML_MODE_LEGACY));

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
        return inflater.inflate(R.layout.fragment_i_p_s_cs, container, false);
    }
}
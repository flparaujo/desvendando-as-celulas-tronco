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
 * Use the {@link LegislationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LegislationFragment extends PageFragment {

    public LegislationFragment() {
        // Required empty public constructor
    }

    public static LegislationFragment newInstance(int page, String title) {
        LegislationFragment fragment = new LegislationFragment();
        Bundle args = new Bundle();
        args.putInt("page", page);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView text = view.findViewById(R.id.legislation_text);

        text.setText(HtmlCompat.fromHtml("<h5>LEGISLAÇÃO SOBRE O USO DE CÉLULAS-TRONCO (CT)</h5>\n" +
                "<p>LEI Nº 11.105, DE 24 DE MARÇO DE 2005. De acordo com o Art. 1º Esta Lei estabelece normas de segurança e mecanismos de fiscalização sobre a construção, o cultivo, a produção, a manipulação, o transporte, a transferência, a importação, a exportação, o armazenamento, a pesquisa, a comercialização, o consumo, a liberação no meio ambiente e o descarte de organismos geneticamente modificados – OGM e seus derivados, tendo como diretrizes o estímulo ao avanço científico na área de biossegurança e biotecnologia, a proteção à vida e à saúde humana, animal e vegetal, e a observância do princípio da precaução para a proteção do meio ambiente.  Que demonstra no Art. 5º É permitida, para fins de pesquisa e terapia, a utilização de células-tronco embrionárias obtidas de embriões humanos produzidos por fertilização in vitro e não utilizados no respectivo procedimento, atendidas as seguintes condições:</p>\n" +
                "<p>I – Sejam embriões inviáveis; ou</p>\n" +
                "<p>II – Sejam embriões congelados há 3 (três) anos ou mais, na data da publicação desta Lei, ou que, já congelados na data da publicação desta Lei, depois de completarem 3 (três) anos, contados a partir da data de congelamento.</p>\n" +
                "<ul>\n" +
                "<li>1º Em qualquer caso, é necessário o consentimento dos genitores.</li>\n" +
                "<li>2º Instituições de pesquisa e serviços de saúde que realizem pesquisa ou terapia com células-tronco embrionárias humanas deverão submeter seus projetos à apreciação e aprovação dos respectivos comitês de ética em pesquisa.</li>\n" +
                "<li>3º É vedada a comercialização do material biológico a que se refere este artigo e sua prática implica o crime tipificado no art. 15 da Lei nº 9.434, de 4 de fevereiro de 1997.</li>\n" +
                "</ul>\n" +
                "<p>A lei de Biossegurança, sancionada em 24 de março de 2005, representou um significativo avanço para o direito e para as ciências médicas em geral. O assunto foi amplamente debatido no Congresso Nacional e foi consensual que seria liberado, juntamente com o projeto de biossegurança, a pesquisa com células-tronco.</p>\n" +
                "<p>A ciência tem muito que contribuir para o tratamento de doenças. Os estudos com células-tronco têm oferecido resultados interessantes sendo que estas pesquisas podem salvar muitas vidas ou, pelo menos, melhorar a qualidade de vida de algumas pessoas. Apesar do debate, até o presente momento, a questão não logrou profundidade, amplitude e riqueza que o tema em estudo requer.</p>\n" +
                "<p>As células-tronco poderiam revolucionar a medicina, ao curar doenças fatais com tecidos e órgãos especialmente criados. Mas a ciência pode ceder à política o privilégio da decisão sobre quando essa esperança se realizará.</p>", HtmlCompat.FROM_HTML_MODE_LEGACY));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            text.setJustificationMode(android.text.Layout.JUSTIFICATION_MODE_INTER_WORD);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_legislation, container, false);
    }
}
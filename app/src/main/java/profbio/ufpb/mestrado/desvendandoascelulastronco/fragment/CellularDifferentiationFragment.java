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
 * Use the {@link CellularDifferentiationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CellularDifferentiationFragment extends PageFragment {

    public CellularDifferentiationFragment() {
        // Required empty public constructor
    }

    public static CellularDifferentiationFragment newInstance(int page, String title) {
        CellularDifferentiationFragment fragment = new CellularDifferentiationFragment();
        Bundle args = new Bundle();
        args.putInt("page", page);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView text = view.findViewById(R.id.cellular_differentiation_text);

        text.setText(HtmlCompat.fromHtml("<h5>DIFERENCIAÇÃO CELULAR</h5>\n" +
                "<p>Ainda é difícil de entender nos dias atuais como todos nós, formados aproximadamente por mais de três trilhões de células, já fomos uma única no momento da fecundação, o zigoto. Em adição, é difícil imaginar que antes mesmo desse zigoto, em um estágio superior a 100 células e antes da chegada ao útero materno para se implantar, aconteceram as primeiras divisões e processos de diferenciação celular. A diferenciação celular é o processo responsável pela estruturação do nosso corpo.</p>\n" +
                "<p>Mas o que é exatamente o processo de diferenciação celular? A biologia denomina de diferenciação, o processo em que células se especializam para originarem os diversos tipos celulares existentes nos organismos vivos, proporcionando a capacidade de desempenharem funções distintas. Trata-se de um processo biológico complexo e vital, uma vez que regula a expressão de um grande número de genes ligados a funções tecido-específicas e controla a proliferação celular. É um mecanismo de transformação celular, responsável por gerar uma grande diversidade de formas celulares com a capacidade de realizar diversas funções. Esta especialização acarreta não só alterações da função, mas também da estrutura das células. O processo de determinação de qual função uma célula exercerá quando adulta ainda é desconhecido, não sabendo ao certo de onde partem os comandos para sua especificidade, função e destino nos organismos vivos. Conhece-se somente que a determinação de funcionalidade acontece durante o desenvolvimento e crescimento do embrião na orientação para originar os diversos tecidos existentes no corpo (nervoso, sanguíneo, adiposo, muscular e ósseo). Em condições normais, a partir do momento em que ocorre tal diferenciação, não existirá possibilidade de reversão, pois uma vez diferenciada ela passará somente a dar origem às células do grupo ao qual pertence (p. ex: células hepáticas só originaram células do fígado), exceto se forem modificadas em laboratório. Todo o processo, inicia-se nos animais na fase denominada blástula, em que o embrião é constituído por aproximadamente 100 células, acontecendo de forma contínua e progressiva e é proporcionado por diversas divisões celulares (mitoses) que iniciam a formação do arcabouço humano, o embrião. Nesta fase, ocorrerá os primeiros estágios de especialização celular (clivagens) em que as células externas da blástula originarão os anexos embrionários enquanto as células internas originarão tecidos e órgãos do embrião que está em formação (as CTEs). Posteriormente, ocorrerá a formação dos primeiros grupos especializados de células (as CT multipotentes) que conduzirão a formatação dos diferentes grupos celulares existentes no organismo humano.</p>", HtmlCompat.FROM_HTML_MODE_LEGACY));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            text.setJustificationMode(android.text.Layout.JUSTIFICATION_MODE_INTER_WORD);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cellular_differentiation, container, false);
    }
}
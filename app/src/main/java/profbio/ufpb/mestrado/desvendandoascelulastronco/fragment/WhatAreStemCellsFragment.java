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

public class WhatAreStemCellsFragment extends PageFragment {

    public WhatAreStemCellsFragment() {
    }

    public static WhatAreStemCellsFragment newInstance(int page, String title) {
        WhatAreStemCellsFragment fragment = new WhatAreStemCellsFragment();
        Bundle args = new Bundle();
        args.putInt("page", page);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView[] txtviews = {view.findViewById(R.id.wasc_p1), view.findViewById(R.id.wasc_p2), view.findViewById(R.id.wasc_p3), view.findViewById(R.id.wasc_p4)};
        txtviews[0].setText(HtmlCompat.fromHtml("<h5>O QUE SÃO CÉLULAS-TRONCO?</h5>\n" +
                "<p>Você sabia que nosso organismo é constituído por centenas de tipos celulares diferentes que desempenham funções distintas e que são importantes para manutenção da nossa vida? Pois é pessoal, somos formados por trilhões de células, em que cada uma possui sua especificidade e função, fazendo cada parte do corpo funcionar da maneira correta. Mas como essa grande variedade celular se originou? A grande variedade de células existentes no organismo formou-se a partir de células precursoras denominadas de células-tronco (CT). Estas células possuem a capacidade de renovação celular mantendo o bom funcionamento do nosso organismo. Tais células iniciam seu processo de formação ainda na vida intrauterina, por volta do 5º dia após a concepção originando todo arcabouço celular do embrião (células-tronco embrionárias – CTE). Outro grupo, (células-tronco adultas – CTA) inicia sua produção a partir da 4º semana de gestação estendendo-se até a fase adulta, possuindo uma especificidade maior, originando as diversas existentes no organismo vivo. A figura 1, abaixo, demonstra as etapas de produção das célula-tronco existentes no nosso corpo.</p>\n" +
                "<small><strong>Figura 1 - processo de produção das células-tronco</strong></small>", HtmlCompat.FROM_HTML_MODE_LEGACY));
        txtviews[1].setText(HtmlCompat.fromHtml("<small>Fonte: Depositphotos, modificado por ALMEIDA, 2020.</small>\n" +
                "<p>As CTs possuem a função de produzir todos os tipos celulares existentes no corpo humano. Quando as CTs se dividem pode ocorrer a produção de células idênticas a elas ou originar diversos outros tipos celulares. Como exemplo, a diferenciação das CTs da epiderme que produzem o pigmento melanina. Tal grupo celular pode originar diversos tipos de células existentes no organismo humano, tudo isso dependendo da sua capacidade de diferenciação: Unipotentes, Oligopotentes, Pluripotentes, Multipotentes, Totipotentes. Sua plasticidade, refere-se à capacidade de diferenciação celular como podemos ver na Figura 2:</p>\n" +
                "<small><strong>Figura 2 - Plasticidade das células-tronco.</strong></small>", HtmlCompat.FROM_HTML_MODE_LEGACY));
        txtviews[2].setText(HtmlCompat.fromHtml("<small>Fonte: Depositphotos, modificado por ALMEIDA, 2020</small>\n" +
                "<p>As CTs <strong>UNIPOTENTES</strong> são aquelas que só possuem a capacidade de diferenciação em um único tipo celular (por exemplo, células que fazem parte do tecido sanguíneo). As <strong>OLIGOTENTES</strong> são aquelas CTs que possuem a capacidade de diferenciação em poucos tecidos (Oligo = pouco) (por exemplo, células linfoides e mielóides). CTs <strong>PLURIPOTENTES</strong> são células que podem dar origem a qualquer tipo de célula do feto em formação ou adulta, exceto placenta e anexos embrionários, e podem ser encontradas em vários tecidos, incluindo sangue do cordão umbilical. Outras células-tronco adultas (CTA) são <strong>MULTIPOTENTES</strong>, o que significa que são restritas nos tipos de células em que podem se tornar e geralmente são referidas por sua origem tecidual (como célula-tronco mesenquimal, célula-tronco derivada de tecido adiposo, célula-tronco endotelial, etc.). Por fim, as CTs <strong>TOTIPOTENTES</strong>, as quais geram tecidos extraembrionários originando organismos completos. Elas podem se diferenciar em todos os tecidos do corpo humano. A figura 3 ilustra a capacidade de diferenciação de cada tipo de células-tronco.</p>\n" +
                "<small><strong>Figura 3 – Capacidade de diferenciação das células-tronco - A) CT onipotentes, B) CT oligopotentes, C) CT pluripotentes, D) CT Multipotentes e E) CT Totipotentes.</strong></small>", HtmlCompat.FROM_HTML_MODE_LEGACY));
        txtviews[3].setText(HtmlCompat.fromHtml("<small>Fonte: Depositphotos, modificado por ALMEIDA, 2020</small>\n" +
                "<p>Atualmente, muitas pesquisas com células-tronco adultas se concentram em investigar sua capacidade de divisão ou de auto renovação indefinidamente e seu potencial de diferenciação. Estudos com camundongos, demonstraram que CTs pluripotentes podem ser geradas diretamente de culturas de fibroblastos de camundongos adultos.</p>\n" +
                "<p>Uma vez que, naturalmente, as CTs, através da sua capacidade de divisão, possuem a função de repor células doentes ou envelhecidas, e podem em um futuro não tão distante, serem utilizadas em terapias para algumas doenças, tais como: doenças genéticas, cânceres e distúrbios relacionados ao sistema imunológico e ao sangue, diabetes juvenil, doença de Parkinson, cegueira e lesões na medula espinhal, além de trazerem a promessa de tratar os principais males que as pessoas enfrentam, incluindo, esclerose múltipla, derrames cerebrais, Doença de Huntington, lesões de medula espinal e muitos mais.</p>\n" +
                "<p>A terapia consiste em aplicar as CTs no paciente (células tronco ou células diferenciadas obtidas de células tronco), e fazer uso da habilidade natural da célula tronco de se dividir e restaurar o tecido/órgão lesionado, na tentativa de recuperar a saúde do paciente. Tomamos por exemplo uma pessoa que sofreu um ataque cardíaco, sendo diagnosticada com um infarto do miocárdio: as CTs ao serem injetadas no corpo do paciente, poderão recuperar o tecido lesado a partir do potencial de diferenciação que essas células possuem.</p>\n" +
                "<p>Contudo, o uso de terapias com células-tronco ainda é um desafio, devido a questões técnicas como:segurança da terapia celular, expansão celular, entrega de células ao tecido-alvo, sobrevivência e funcionamento de longo prazo das células transplantadas. Outro ponto que ainda deve ser mais investigado é o destino das CT dadas para fins terapêuticos, já que poucos estudos tentaram rastrear as células ou demonstraram sua presença no tecido após o transplante. Outra questão, em relação ao uso de tais células, está associada à liberação para sua utilização, esbarrando em embates ideológicos por parte da ciência e religião, principalmente por não chegarem a uma conclusão do momento exato em que a vida se inicia.</p>\n" +
                "<p>Quanto à classificação, as células-tronco podem ser agrupadas em três categorias: Células-tronco embrionárias (CTE), Células-tronco adultas (CTA) e Células-tronco induzidas (iPS).</p>", HtmlCompat.FROM_HTML_MODE_LEGACY));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            for(TextView textView : txtviews) {
                textView.setJustificationMode(android.text.Layout.JUSTIFICATION_MODE_INTER_WORD);
            }
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_what_are_stem_cells, container, false);
    }
}
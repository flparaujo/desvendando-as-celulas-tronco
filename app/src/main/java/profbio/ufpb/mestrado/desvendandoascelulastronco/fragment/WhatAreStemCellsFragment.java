package profbio.ufpb.mestrado.desvendandoascelulastronco.fragment;

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

    public WhatAreStemCellsFragment() { }

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
        TextView pg1 = view.findViewById(R.id.wasc_p1);
        pg1.setText(HtmlCompat.fromHtml("<h5>O QUE SÃO CÉLULAS-TRONCO?</h5>\n" +
                "<p>Você sabia que nosso organismo é constituído por centenas de tipos celulares diferentes que desempenham funções distintas e que são importantes para manutenção da nossa vida? Pois é pessoal, somos formados por trilhões de células, em que cada uma possui sua especificidade e função, fazendo cada parte do corpo funcionar da maneira correta. Mas como essa grande variedade celular se originou? A grande variedade de células existentes no organismo formou-se a partir de células precursoras denominadas de células-tronco (CT). Estas células possuem a capacidade de renovação celular mantendo o bom funcionamento do nosso organismo.Tais células iniciam seu processo de formação ainda na vida intrauterina, por volta do 5º dia após a concepção originando todo arcabouço celular do embrião (células-tronco embrionárias – CTE). Outro grupo, (células-tronco adultas – CTA) inicia sua produção a partir da 4º semana de gestaçãoestendendo-se até a fase adulta, possuindo uma especificidade maior, originando as diversas existentes no organismo vivo. A figura 1, abaixo,demonstra as etapas de produção das célula-tronco existentes no nosso corpo.</p>\n" +
                "<small><strong>Figura 1- processo de produção das células-tronco</strong></small>", HtmlCompat.FROM_HTML_MODE_LEGACY));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_what_are_stem_cells, container, false);
    }
}
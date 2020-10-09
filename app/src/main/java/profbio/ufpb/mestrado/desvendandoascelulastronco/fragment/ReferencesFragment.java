package profbio.ufpb.mestrado.desvendandoascelulastronco.fragment;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.Fragment;

import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import profbio.ufpb.mestrado.desvendandoascelulastronco.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ReferencesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ReferencesFragment extends PageFragment {

    public ReferencesFragment() {
        // Required empty public constructor
    }

    public static ReferencesFragment newInstance(int page, String title) {
        ReferencesFragment fragment = new ReferencesFragment();
        Bundle args = new Bundle();
        args.putInt("page", page);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView text = view.findViewById(R.id.references_text);

        text.setText(HtmlCompat.fromHtml("<h5><u>REFERÊNCIAS</u></h5>\n" +
                "<p>ALBERTS, B.; JOHNSON, A.; LEWIS, J et al. <strong>Biologia Molecular da Célula. </strong>6ª Edição. Editora Artmed. 1428 páginas. 2017.</p>\n" +
                "<p>BARROS; S.V.G.; DEL CARLO, R.J.; VILORIA, M.I.Y. et al. Auto-enxerto percutâneo de medula óssea. I. coleta, preparo e aplicação. Ciência Rural, v.31, n.6, p.1013, 1018, 2001.</p>\n" +
                "<p>BIANCO, P.; ROBEY, P.O. <strong>Stem celI in tissue engineering</strong>. Nature, v.414, n.ll, p.118-121, 2001</p>\n" +
                "<p>BYDLOWSKI, S. P.; DEBES, A. A.; MASELLI, L.M. F.  et al. <strong>Características biológicas das células tronco mesenquimais</strong>. Ver. Brasil. Hematol. Hemot, mais 2009, vol 31, supp1, p 25 35</p>\n" +
                "<p>CARVALHO, A.C.S.R. <strong>Estudo da proliferação e diferenciação de células-tronco hematopoéticas provenientes de sangue de cordão umbilical na presença e ausência de mitógenos</strong> [tese]. São Paulo: Instituto de Ciências biomédicas da Universidade de São Paulo; 2008</p>\n" +
                "<p>DE LA MORENA M.T.; GATTI R.A. <strong>A history of bone marrow transplantation. </strong>Hematology/oncologyclinicsof North America. 2011; 25(1):1-15.</p>\n" +
                "<p>DESSEN, E. B. M.; MINGRONI-NETTO R. C. <strong>Desvendando as células-tronco: dos sonhos à realidade. </strong>São Paulo: Centro de Estudos do Genoma Humano da Universidade de São Paulo; 2007.</p>\n" +
                "<p>DOWNING G.J.; BATTEY J. R. J. F. <strong>Technical assessment of the first 20 years of research using mouse embryonic stem cell lines. </strong>Stem Cells Journals<strong>.</strong> 2004; 22:1168-1180.</p>\n" +
                "<p>KARPOWICZ, P.; COHEN, C.B.; KOOY, D. <strong>It is ethical to transplant human stem celIs into non human embryos</strong>. Nature Medicine, v.417, n.l0, p.331-335, 2004.</p>\n" +
                "<p>MACLAREN, A. <strong>Ethical and social considerations of stem cell research</strong>. Nature, v.414, n.U, p.129-131, 2-à o 1.</p>\n" +
                "<p>MARCHETTO, M. C.N. et al. <strong>A model for neural development and treatment of Rett Syndrome using human induced pluripotent stem cells</strong>. Science Direct Journals &amp; Book. Cell. v.143, n.4, p. 527–539, 2010.</p>\n" +
                "<p>NAVES, M.M.V<strong>. Beta-caroteno e vitamina A modulam a proliferação de células ovais e a expressão gênica para conexina 43 em modelo in vivo de diferenciação celular hepática</strong>. 1999. Tese (Doutorado) - Faculdade de Ciências Farmacêuticas, Universidade de São Paulo, São Paulo.</p>\n" +
                "<p>RIZZO, D.; DEL CARLO, R.J.; SILVA, A.S.A. et al. <strong>Matriz óssea desmineralizada associada à medula óssea autógena fresca na artrodese vertebral dorsolateral lombar em coelhos</strong>. Arquivo Brasileiro de Medicina Veterinária e Zootecnia, v.57, n.2, p.163-170, 2005.</p>\n" +
                "<p>TAKAHASHI K.; TANABE K.; OHNUKI M. et al. <strong>Induction of pluripotent stem cells from adult human fibroblasts by defined factors</strong>. Science Direct Journals &amp; Book. Cell, 2007</p>\n" +
                "<p>TAKAHASHI K.; YAMANAKA S. <strong>Induction of pluripotent stem cells from mouse embryonic and adult fibroblast cultures by defined factors</strong>. Science Direct Journals &amp; Book. Cell, 2006</p>\n" +
                "<p>THE NEWS AND EDITORIAL STAFFS. <strong>Capturing the promise of youth.</strong> <em>Science</em> 1999; 286:2238-2243. </p>\n" +
                "<p> </p>\n" +
                "<p>THOMSON J.A.; ITSKOVITZ-ELDOR J.; SHAPIRO S.S. et al. <strong>Embryonic stem cells lines derived from human blastocysts</strong>. Science, 1998</p>\n" +
                "<p> </p>\n" +
                "<p>ZHAO J., HAO H.N.; THOMAS R.L.; LYMAN W.D.<strong> An efficient method for the cryopreservation of fetal human liver hematopoeitic progenitor cells. </strong>Stem cells Journals<strong>. </strong>2001;19(3):212-8.</p>\n" +
                "<p> </p>\n" +
                "<p>ZATZ, M. <strong>“Células Tronco”.</strong> Disponível em: http://www.ghente.org/temas/celulas-tronco/. Acesso em 22/09/2019.</p>\n" +
                "<p>ZATZ, M. “<strong>Células tronco, o que são?”.</strong> Disponível em: http://www.lance-ufrj.org/ceacutelulas-tronco.html. Acesso em 30/09/2019.</p>\n" +
                "<p>ZATZ, M. <strong>Clonagem e células tronco</strong>. Ciência e Cultura, v.56, n.3, julho/setembro2004.</p>\n" +
                "<p>WAGERS A.J.; WEISSMAN I.L. <strong>Plasticity of Adult Stem Cells. </strong>Science Direct Journals &amp; Book. Cell, 2004; 116:639-684.</p>\n" +
                "<p>YAMANAKA S. <strong>A fresh look at iPS cells. </strong>Science Direct Journals &amp; Book. Cell, 2009; 137:13-17. </p>\n" +
                "<p>YU, J.; THOMSON, J.A. <strong>Pluripotent Stem Cell Lines. </strong>CSHPress. Genes &amp; Development, 2008. Disponível em: http://http://genesdev.cshlp.org/content/22/15/1987.short. Acesso em 02/10/2019.</p>", HtmlCompat.FROM_HTML_MODE_LEGACY));

        Linkify.addLinks(text, Linkify.ALL);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            text.setJustificationMode(android.text.Layout.JUSTIFICATION_MODE_INTER_WORD);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_references, container, false);
    }
}
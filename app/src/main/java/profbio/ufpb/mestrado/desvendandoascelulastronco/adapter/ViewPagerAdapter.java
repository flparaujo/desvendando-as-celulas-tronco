package profbio.ufpb.mestrado.desvendandoascelulastronco.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import profbio.ufpb.mestrado.desvendandoascelulastronco.fragment.ASCsFragment;
import profbio.ufpb.mestrado.desvendandoascelulastronco.fragment.CellularDifferentiationFragment;
import profbio.ufpb.mestrado.desvendandoascelulastronco.fragment.ESCsFragment;
import profbio.ufpb.mestrado.desvendandoascelulastronco.fragment.IPSCsFragment;
import profbio.ufpb.mestrado.desvendandoascelulastronco.fragment.LegislationFragment;
import profbio.ufpb.mestrado.desvendandoascelulastronco.fragment.WhatAreStemCellsFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"O QUE SÃO CÉLULAS-TRONCO?",
            "CÉLULAS-TRONCO EMBRIONÁRIAS (CTE)",
            "CÉLULAS-TRONCO ADULTAS (CTA)",
            "CÉLULAS-TRONCO PLURIPOTENTES INDUZIDAS (IPS)",
            "LEGISLAÇÃO SOBRE O USO DE CÉLULAS-TRONCO (CT)",
            "DIFERENCIAÇÃO CELULAR"};

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return WhatAreStemCellsFragment.newInstance(0, tabTitles[0]);
            case 1:
                return ESCsFragment.newInstance(1, tabTitles[1]);
            case 2:
                return ASCsFragment.newInstance(2, tabTitles[2]);
            case 3:
                return IPSCsFragment.newInstance(3, tabTitles[3]);
            case 4:
                return LegislationFragment.newInstance(4, tabTitles[4]);
            case 5:
                return CellularDifferentiationFragment.newInstance(5, tabTitles[5]);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}

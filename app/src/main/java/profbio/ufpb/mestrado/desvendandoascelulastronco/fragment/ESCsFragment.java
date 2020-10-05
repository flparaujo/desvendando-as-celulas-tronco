package profbio.ufpb.mestrado.desvendandoascelulastronco.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import profbio.ufpb.mestrado.desvendandoascelulastronco.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ESCsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ESCsFragment extends PageFragment {

    public ESCsFragment() {
        // Required empty public constructor
    }

    public static ESCsFragment newInstance(int page, String title) {
        ESCsFragment fragment = new ESCsFragment();
        Bundle args = new Bundle();
        args.putInt("page", page);
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_e_s_cs, container, false);
    }
}
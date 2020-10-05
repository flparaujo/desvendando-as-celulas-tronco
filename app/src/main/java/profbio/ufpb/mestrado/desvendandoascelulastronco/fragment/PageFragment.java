package profbio.ufpb.mestrado.desvendandoascelulastronco.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import profbio.ufpb.mestrado.desvendandoascelulastronco.R;

public class PageFragment extends Fragment {

    protected String title;
    protected int page;

    public PageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            page = getArguments().getInt("page", 0);
            title = getArguments().getString("title");
        }
    }

}
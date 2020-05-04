package profbio.ufpb.mestrado.desvendandoascelulastronco.activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import profbio.ufpb.mestrado.desvendandoascelulastronco.R;
import profbio.ufpb.mestrado.desvendandoascelulastronco.adapter.SectionAdapter;
import profbio.ufpb.mestrado.desvendandoascelulastronco.model.Section;
import profbio.ufpb.mestrado.desvendandoascelulastronco.model.SectionsData;

public class AboutStemCellsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SectionAdapter adapter;
    List<Section> sections;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_stem_cells);

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        sections = new ArrayList<>();

        insertSections();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void insertSections() {

        for(Section section : SectionsData.getSections()) {
            sections.add(section);
        }

        adapter = new SectionAdapter(sections);
        recyclerView.setAdapter(adapter);
    }
}

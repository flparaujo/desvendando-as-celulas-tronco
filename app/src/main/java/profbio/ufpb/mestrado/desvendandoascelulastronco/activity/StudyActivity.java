package profbio.ufpb.mestrado.desvendandoascelulastronco.activity;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import profbio.ufpb.mestrado.desvendandoascelulastronco.R;
import profbio.ufpb.mestrado.desvendandoascelulastronco.adapter.ViewPagerAdapter;

public class StudyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
        FragmentPagerAdapter sectionsPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        TextView appBarTitle = findViewById(R.id.title);
        appBarTitle.setText("Células-Tronco (1/"+sectionsPagerAdapter.getCount()+")");

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                appBarTitle.setText("Células-Tronco ("+(position + 1)+"/3)");
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
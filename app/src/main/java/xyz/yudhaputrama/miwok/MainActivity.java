package xyz.yudhaputrama.miwok;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import xyz.yudhaputrama.miwok.adapter.CategoryAdapter;
import xyz.yudhaputrama.miwok.fragment.ColorListFragment;
import xyz.yudhaputrama.miwok.fragment.FamilyListFragment;
import xyz.yudhaputrama.miwok.fragment.NumberListFragment;
import xyz.yudhaputrama.miwok.fragment.WordListFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);

        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());

        adapter.addFragment(new NumberListFragment(), "Number");
        adapter.addFragment(new FamilyListFragment(), "Family");
        adapter.addFragment(new ColorListFragment(), "Color");
        adapter.addFragment(new WordListFragment(), "Phrase");
        mViewPager.setAdapter(adapter);

        mTabLayout = (TabLayout) findViewById(R.id.tablayout);
        mTabLayout.setupWithViewPager(mViewPager);
    }


}

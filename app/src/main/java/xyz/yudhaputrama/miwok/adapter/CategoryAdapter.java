package xyz.yudhaputrama.miwok.adapter;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

import java.util.ArrayList;

import xyz.yudhaputrama.miwok.fragment.WordListFragment;
import xyz.yudhaputrama.miwok.model.Word;

/**
 * Created by Chevalier on 11/18/2016.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> mFragment =  new ArrayList<>();
    private ArrayList<String> mTitle = new ArrayList<>();

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment, String title){
        mFragment.add(fragment);
        mTitle.add(title);
    }

    public String getPageTitle(int position){
        return mTitle.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragment.get(position);
    }

    @Override
    public int getCount() {
        return mFragment.size();
    }
}

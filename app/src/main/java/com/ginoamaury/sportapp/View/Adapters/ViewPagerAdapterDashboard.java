package com.ginoamaury.sportapp.View.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.ginoamaury.sportapp.View.Fragments.TeamsFragment;

public class ViewPagerAdapterDashboard  extends FragmentStatePagerAdapter {
    private  String [] titlesTabs;
    public ViewPagerAdapterDashboard (FragmentManager fm, String [] titlesTabs) {
        super(fm);
        this.titlesTabs = titlesTabs;
    }



    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0: return new TeamsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 1;
    }

    public CharSequence getPageTitle ( int position){
        return titlesTabs[position];
    }
}

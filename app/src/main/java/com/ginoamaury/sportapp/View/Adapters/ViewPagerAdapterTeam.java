package com.ginoamaury.sportapp.View.Adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.ginoamaury.sportapp.Model.Object.Team;
import com.ginoamaury.sportapp.View.Fragments.ShowEventsFragment;
import com.ginoamaury.sportapp.View.Fragments.ShowInfoFragment;

public class ViewPagerAdapterTeam extends FragmentStatePagerAdapter {
    private  String [] tituloTabs;
    private Team team;
    private static final String TEAMARG = "team";

    public ViewPagerAdapterTeam(FragmentManager fm, String [] tituloTabs, Team team) {
        super(fm);
        this.tituloTabs = tituloTabs;
        this.team = team;
    }


    @NonNull
    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                ShowInfoFragment fragment = new ShowInfoFragment();
                Bundle args = new Bundle();
                args.putSerializable(TEAMARG, team);
                fragment.setArguments(args);
                return  fragment;
            case 1:
                ShowEventsFragment fragment2 = new ShowEventsFragment();
                Bundle args2 = new Bundle();
                args2.putSerializable(TEAMARG, team);
                fragment2.setArguments(args2);
                return  fragment2;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle ( int position){
        return tituloTabs[position];
    }
}

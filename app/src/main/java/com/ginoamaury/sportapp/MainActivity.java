package com.ginoamaury.sportapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.ginoamaury.sportapp.View.Adapters.ViewPagerAdapterDashboard;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {



    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.appBar)
    AppBarLayout appBarLayout;
    @BindView(R.id.tabs)
    TabLayout tabLayout;
    @BindView(R.id.pager)
    ViewPager viewPager;

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        showToolbarViewPager();
        view = findViewById(R.id.contentDash);
    }

    private void showToolbarViewPager (){
        String [] titleTabs = {getResources().getString(R.string.viewPagerTeams)};
        ViewPagerAdapterDashboard pagerAdapter = new ViewPagerAdapterDashboard(getSupportFragmentManager(),titleTabs);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
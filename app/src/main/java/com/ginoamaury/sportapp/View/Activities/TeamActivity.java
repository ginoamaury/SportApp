package com.ginoamaury.sportapp.View.Activities;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;


import com.ginoamaury.sportapp.Model.Object.Team;
import com.ginoamaury.sportapp.R;
import com.ginoamaury.sportapp.Util.Utility;
import com.ginoamaury.sportapp.View.Adapters.ViewPagerAdapterTeam;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;



import butterknife.BindView;
import butterknife.ButterKnife;

public class TeamActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.app_bar)
    AppBarLayout appBarLayout;
    @BindView(R.id.tabs)
    TabLayout tabLayout;
    @BindView(R.id.pager)
    ViewPager viewPager;
    @BindView(R.id.show_image)
    ImageView showImage;
    private Team team;

    private boolean favIsActive;
    private View focus;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        ButterKnife.bind(this);
        team = (Team) getIntent().getSerializableExtra("TEAM");
        addToolbar();
        showToolbarViewPager();
        setImage();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    private void setImage (){
        if(team != null){
            if(team.getStrTeamBadge()!= null){
                String urlImage = team.getStrTeamBadge();
                Utility.showImage(getApplicationContext(),showImage,urlImage);
            }else{
                Utility.showImage(getApplicationContext(),showImage,"noimage");
            }
        }
    }

    private void addToolbar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        int colorNavigationIcon = getResources().getColor(R.color.White);
        Drawable iconNavigation = getResources().getDrawable(R.drawable.ic_left_arrow);
        iconNavigation.setColorFilter(colorNavigationIcon, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(iconNavigation);
        onClickNavigation();
    }

    private void onClickNavigation (){
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }



    private void showToolbarViewPager (){
        String [] tituloTabs = {getResources().getString(R.string.viewPagerInfo),getResources().getString(R.string.viewPagerEvents)};
        ViewPagerAdapterTeam pagerAdapter = new ViewPagerAdapterTeam(getSupportFragmentManager(),tituloTabs,team);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }


}
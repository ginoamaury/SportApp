package com.ginoamaury.sportapp.View.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.ethanhua.skeleton.Skeleton;
import com.ginoamaury.sportapp.Interfaces.Team.ITeamView;
import com.ginoamaury.sportapp.Model.Object.Team;
import com.ginoamaury.sportapp.Presenter.TeamPresenter;
import com.ginoamaury.sportapp.R;
import com.ginoamaury.sportapp.Util.Utility;
import com.ginoamaury.sportapp.View.Activities.TeamActivity;
import com.ginoamaury.sportapp.View.Adapters.IOnTeamClick;
import com.ginoamaury.sportapp.View.Adapters.TeamsAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.ginoamaury.sportapp.Util.Utility.showSnackbar;


public class TeamsFragment  extends Fragment implements ITeamView, IOnTeamClick, View.OnClickListener {

    @BindView(R.id.recyclerShows)
    RecyclerView recyclerViewShows;
    @BindView(R.id.swipeToRefresh)
    SwipeRefreshLayout mSwipeRefreshLayout;

    private TeamsAdapter teamsAdapter;
    private TeamPresenter teamPresenter;

    @BindView(R.id.bottom_navigation)
    BottomNavigationView bottomNavigationView;

    public TeamsFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_teams, container, false);
        ButterKnife.bind(this,view);
        showFragmentsNavigation();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        showPreviewLoading();
        getTeams();
        refreshView();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


    private void getTeams(){
        teamPresenter = new TeamPresenter(this);
        teamPresenter.getTeams("Spanish La Liga");
    }

    private void refreshView (){
        mSwipeRefreshLayout.setColorSchemeResources(R.color.colorAccent);
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                showPreviewLoading();
                getTeams();
                mSwipeRefreshLayout.setRefreshing(false);
            }
        });
    }



    private void showPreviewLoading (){
        recyclerViewShows.setLayoutManager(new GridLayoutManager(getContext(),2));
        Skeleton.bind(recyclerViewShows)
                .adapter(teamsAdapter)
                .shimmer(true)      // whether show shimmer animation.                      default is true
                .count(12)          // the recycler view item count.                        default is 10
                .color(R.color.White)       // the shimmer color.                                   default is #a2878787
                .angle(20)          // the shimmer angle.                                   default is 20;
                .duration(900)     // the shimmer animation duration.                      default is 1000;
                .frozen(false)      // whether frozen recyclerView during skeleton showing  default is true;
                .load(R.layout.show_list_item_preview)
                .show();
    }

    @Override
    public void showResult(ArrayList<Team> teams) {
        if(teams != null){
            teamsAdapter = new TeamsAdapter(teams,this,0,getContext());
            recyclerViewShows.setItemAnimator(new DefaultItemAnimator());
            recyclerViewShows.setAdapter(teamsAdapter);
        }else{
            showSnackbar(getView(),getContext(),R.string.errTeams);
        }

    }


    private void showFragmentsNavigation (){
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_spanish:
                        showPreviewLoading();
                        teamPresenter.getTeams("Spanish La Liga");
                        return true;
                    case R.id.menu_premier_league:
                        showPreviewLoading();
                        teamPresenter.getTeams("English League Championship");
                        return true;
                    case R.id.menu_italian_seriea:
                        showPreviewLoading();
                        teamPresenter.getTeams("Italian Serie A");
                        return true;
                }
                return false;
            }
        });
    }




    @Override
    public void onClick(View v) {

    }

    @Override
    public void onTeamClick(int pos, String typeClick) {
        switch (typeClick){
            case Utility.CLICKCARD:
                Utility.goToNextActivityCleanStackTeam(getActivity(), TeamActivity.class,false,null,teamsAdapter.getTeam(pos));
                break;
            case Utility.CLICKADDFAV:

                break;
        }
    }
}
package com.ginoamaury.sportapp.View.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.ethanhua.skeleton.Skeleton;
import com.ginoamaury.sportapp.Interfaces.Events.IEventsView;
import com.ginoamaury.sportapp.Model.Object.Event;
import com.ginoamaury.sportapp.Model.Object.Team;
import com.ginoamaury.sportapp.Presenter.EventPresenter;
import com.ginoamaury.sportapp.R;
import com.ginoamaury.sportapp.View.Adapters.EventAdapter;
import com.google.android.material.chip.Chip;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ShowEventsFragment extends Fragment implements IEventsView {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String TEAMARG = "team";
    private Team team;

    @BindView(R.id.recyclerEvents)
    RecyclerView recyclerEvents;
    @BindView(R.id.swipeToRefresh)
    SwipeRefreshLayout mSwipeRefreshLayout;

    private EventAdapter eventAdapter;
    private EventPresenter eventPresenter;

    public ShowEventsFragment() {}


    public static ShowEventsFragment newInstance(Team team) {
        ShowEventsFragment fragment = new ShowEventsFragment();
        Bundle args = new Bundle();
        args.putSerializable(TEAMARG, team);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            team = (Team) getArguments().getSerializable(TEAMARG);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show_events, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        showPreviewLoading();
        getEvents(Integer.parseInt(team.getIdTeam()));
        refreshView();
    }


    private void getEvents(int show){
        eventPresenter = new EventPresenter(this);
        eventPresenter.getEvents(show);
    }

    @Override
    public void showResult(ArrayList<Event> events) {
        if(events != null){
            eventAdapter = new EventAdapter(events);
            recyclerEvents.setItemAnimator(new DefaultItemAnimator());
            recyclerEvents.setAdapter(eventAdapter);
        }
    }

    private void refreshView (){
        mSwipeRefreshLayout.setColorSchemeResources(R.color.colorAccent);
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                showPreviewLoading();
                getEvents(Integer.parseInt(team.getIdTeam()));
                mSwipeRefreshLayout.setRefreshing(false);
            }
        });
    }

    private void showPreviewLoading (){
        recyclerEvents.setLayoutManager(new GridLayoutManager(getContext(),2));
        Skeleton.bind(recyclerEvents)
                .adapter(eventAdapter)
                .shimmer(true)      // whether show shimmer animation.                      default is true
                .count(5)          // the recycler view item count.                        default is 10
                .color(R.color.White)       // the shimmer color.                                   default is #a2878787
                .angle(20)          // the shimmer angle.                                   default is 20;
                .duration(900)     // the shimmer animation duration.                      default is 1000;
                .frozen(false)      // whether frozen recyclerView during skeleton showing  default is true;
                .load(R.layout.show_event_item_preview)
                .show();
    }


}
package com.ginoamaury.sportapp.View.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.ginoamaury.sportapp.Model.Object.Team;
import com.ginoamaury.sportapp.R;
import com.ginoamaury.sportapp.Util.Utility;
import com.google.android.material.chip.Chip;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ShowInfoFragment extends Fragment {

    private Team team;
    private static final String TEAMARG = "team";

    @BindView(R.id.titleTeam)
    TextView titleTeam;
    @BindView(R.id.chip)
    Chip chipFoundation;
    @BindView(R.id.chipWebsite)
    Chip chipWebsite;
    @BindView(R.id.chipFacebook)
    Chip chipFacebook;
    @BindView(R.id.chipTwitter)
    Chip chipTwitter;
    @BindView(R.id.chipInstagram)
    Chip chipInstagram;
    @BindView(R.id.chipYoutube)
    Chip chipYoutube;
    @BindView(R.id.contentSummary)
    TextView summary;
    @BindView(R.id.img_jersey)
    ImageView jersey;
    @BindView(R.id.img_stadium)
    ImageView stadium;

    public ShowInfoFragment() {
    }

    public static ShowInfoFragment newInstance(Team team) {
        ShowInfoFragment fragment = new ShowInfoFragment();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_show_info, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if(team != null){
            if(team.getStrTeam() != null){
                titleTeam.setText(team.getStrTeam());
            }
            if(team.getStrDescriptionEN()!=null){
                summary.setVisibility(View.VISIBLE);
                summary.setText(Html.fromHtml(team.getStrDescriptionEN()));
            }

            if(team.getIntFormedYear()!=null){
                chipFoundation.setVisibility(View.VISIBLE);
                String formedYear = "Founded in "+team.getIntFormedYear();
                chipFoundation.setText(formedYear);
            }

            if(team.getStrWebsite()!=null){
                chipWebsite.setVisibility(View.VISIBLE);
                chipWebsite.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openWebURL(team.getStrWebsite());
                    }
                });
            }
            if(team.getStrFacebook()!=null){
                chipFacebook.setVisibility(View.VISIBLE);
                chipFacebook.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openWebURL(team.getStrFacebook());
                    }
                });
            }
            if(team.getStrTwitter()!=null){
                chipTwitter.setVisibility(View.VISIBLE);
                chipTwitter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openWebURL(team.getStrTwitter());
                    }
                });
            }
            if(team.getStrInstagram()!=null){
                chipInstagram.setVisibility(View.VISIBLE);
                chipInstagram.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openWebURL(team.getStrInstagram());
                    }
                });
            }
            if(team.getStrYoutube()!=null){
                chipYoutube.setVisibility(View.VISIBLE);
                chipYoutube.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openWebURL(team.getStrYoutube());
                    }
                });
            }
            Utility.showImage(getView(),jersey,team.getStrTeamJersey());
            Utility.showImage(getView(),stadium,team.getStrStadiumThumb());

        }
    }

    public void openWebURL( String inURL ) {
        String URL = "http://"+inURL;
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( URL ) );
        startActivity( browse );
    }

}
package com.ginoamaury.sportapp.Presenter;

import com.ginoamaury.sportapp.Interactors.TeamInteractor;
import com.ginoamaury.sportapp.Interfaces.Team.ITeamPresenter;
import com.ginoamaury.sportapp.Interfaces.Team.ITeamView;
import com.ginoamaury.sportapp.Model.Object.Team;

import java.util.ArrayList;

public class TeamPresenter implements ITeamPresenter {

    TeamInteractor teamInteractor;
    ITeamView teamView;

    public TeamPresenter(ITeamView teamView) {
        this.teamView = teamView;
        teamInteractor = new TeamInteractor(this);
    }

    @Override
    public void getTeams(String query) {
        teamInteractor.getTeams(query);
    }

    @Override
    public void showResult(ArrayList<Team> teams) {
        teamView.showResult(teams);
    }
}

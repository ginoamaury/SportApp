package com.ginoamaury.sportapp.Interactors;

import com.ginoamaury.sportapp.API.API;
import com.ginoamaury.sportapp.Interfaces.Team.ITeamInteractor;
import com.ginoamaury.sportapp.Model.Object.Team;
import com.ginoamaury.sportapp.Model.Object.Teams;
import com.ginoamaury.sportapp.Presenter.TeamPresenter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TeamInteractor implements ITeamInteractor, Callback<Teams> {

    TeamPresenter teamPresenter;

    public TeamInteractor(TeamPresenter teamPresenter) {
        this.teamPresenter = teamPresenter;
    }

    @Override
    public void getTeams(String query) {
        Call<Teams> api = API.getApi().getTeamsFromLeague(query);
        api.enqueue(this);
    }

    @Override
    public void onResponse(Call<Teams> call, Response<Teams> response) {
        try{
            if(response.isSuccessful()){
                Teams teams  =  response.body();
                if(teams != null){
                    ArrayList<Team> teamsQuery = (ArrayList<Team>) teams.getTeams();
                    teamPresenter.showResult(teamsQuery);
                }else{
                    teamPresenter.showResult(null);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            teamPresenter.showResult(null);
        }
    }

    @Override
    public void onFailure(Call<Teams> call, Throwable t) {
        teamPresenter.showResult(null);
    }
}

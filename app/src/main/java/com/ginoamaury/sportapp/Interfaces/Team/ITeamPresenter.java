package com.ginoamaury.sportapp.Interfaces.Team;

import com.ginoamaury.sportapp.Model.Object.Team;

import java.util.ArrayList;

public interface ITeamPresenter {
    void getTeams(String query);
    void showResult(ArrayList<Team> teams);
}

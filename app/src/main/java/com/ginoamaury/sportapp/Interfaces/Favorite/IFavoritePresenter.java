package com.ginoamaury.sportapp.Interfaces.Favorite;

import android.content.Context;

import com.ginoamaury.sportapp.Model.Object.Team;

import java.util.ArrayList;

public interface IFavoritePresenter {
    void addFav (Team team, Context c);
    void showResult (boolean result);
    void deleteFav(Team team, Context c);
    void showResultDelete(boolean result);
    void findFav(Team team,Context c);
    void showIfExist(boolean result);
    void getFavorites(Context c);
    void showResultFavorites (ArrayList<Team> teams);
}

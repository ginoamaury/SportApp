package com.ginoamaury.sportapp.Presenter;

import android.content.Context;


import com.ginoamaury.sportapp.Interactors.FavoriteInteractor;
import com.ginoamaury.sportapp.Interfaces.Favorite.IFavoritePresenter;
import com.ginoamaury.sportapp.Interfaces.Favorite.IFavoriteView;
import com.ginoamaury.sportapp.Model.Object.Team;

import java.util.ArrayList;

public class FavoritePresenter implements IFavoritePresenter {

    FavoriteInteractor favoriteInteractor;
    IFavoriteView favoriteView;

    public FavoritePresenter(IFavoriteView favoriteView) {
        this.favoriteView = favoriteView;
        favoriteInteractor = new FavoriteInteractor(this);
    }

    @Override
    public void addFav(Team team, Context c) {
        favoriteInteractor.addFav(team, c);
    }

    @Override
    public void showResult(boolean result) {
        favoriteView.showResult(result);
    }

    @Override
    public void deleteFav(Team team, Context c) {
        favoriteInteractor.deleteFav(team,c);
    }

    @Override
    public void showResultDelete(boolean result) {
        favoriteView.showResultDelete(result);
    }

    @Override
    public void findFav(Team team, Context c) {
        favoriteInteractor.findFav(team,c);
    }

    @Override
    public void showIfExist(boolean result) {
        favoriteView.showIfExist(result);
    }

    @Override
    public void getFavorites(Context c) {
        favoriteInteractor.getFavorites(c);
    }

    @Override
    public void showResultFavorites(ArrayList<Team> teams) {
        favoriteView.showResultFavorites(teams);
    }
}

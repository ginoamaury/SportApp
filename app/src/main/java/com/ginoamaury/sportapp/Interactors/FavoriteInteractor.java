package com.ginoamaury.sportapp.Interactors;

import android.content.Context;

import com.ginoamaury.sportapp.Interfaces.Favorite.IFavoriteInteractor;
import com.ginoamaury.sportapp.Model.DB.SQLConnection;
import com.ginoamaury.sportapp.Model.Object.Team;
import com.ginoamaury.sportapp.Presenter.FavoritePresenter;


public class FavoriteInteractor implements IFavoriteInteractor {

    FavoritePresenter favoritePresenter;

    public FavoriteInteractor(FavoritePresenter favoritePresenter) {
        this.favoritePresenter = favoritePresenter;
    }

    @Override
    public void addFav(Team team, Context c) {
        SQLConnection helper = SQLConnection.getInstance(c);
        favoritePresenter.showResult(helper.addFav(team));
    }

    @Override
    public void deleteFav(Team team, Context c) {
        SQLConnection helper = SQLConnection.getInstance(c);
        favoritePresenter.showResultDelete(helper.deleteFav(team));
    }

    @Override
    public void findFav(Team show, Context c) {
        SQLConnection helper = SQLConnection.getInstance(c);
        favoritePresenter.showIfExist(helper.ifExist(show));
    }

    @Override
    public void getFavorites(Context c) {
        SQLConnection helper = SQLConnection.getInstance(c);
        favoritePresenter.showResultFavorites(helper.getFavorites());
    }
}

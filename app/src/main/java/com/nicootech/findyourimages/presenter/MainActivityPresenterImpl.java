package com.nicootech.findyourimages.presenter;

import com.google.gson.JsonArray;
import com.nicootech.findyourimages.MainActivityView;
import com.nicootech.findyourimages.NetworkClass.MainActivityModel;

public class MainActivityPresenterImpl implements MainActivityModel.OnLoginFinishedListener{

    MainActivityView mView;
    MainActivityModel mainActivityModel;

    public MainActivityPresenterImpl(MainActivityView mainActivityView, MainActivityModel mainActivityModel){
        this.mView = mainActivityView;
        this.mainActivityModel = mainActivityModel;
    }


    public void searchImage(int page,String text) {
        mView.showProgress();
        mainActivityModel.search(page,text , this);

    }

    @Override
    public void onSuccess(JsonArray jsonArray) {
        mView.hideProgress();
        mView.onSearchSuccess(jsonArray);
    }

    @Override
    public void onFailure(String message) {

        mView.hideProgress();
        mView.onSearchFailure(message);

    }
}

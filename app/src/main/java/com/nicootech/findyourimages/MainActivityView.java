package com.nicootech.findyourimages;

import com.google.gson.JsonArray;

public interface MainActivityView {

    void onSearchSuccess(JsonArray jsonArray);
    void onSearchFailure(String message);
    void showProgress();
    void hideProgress();
}


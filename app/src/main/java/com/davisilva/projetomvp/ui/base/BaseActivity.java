package com.davisilva.projetomvp.ui.base;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by davi.silva on 1/7/16.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        selectScreenOrientation();
    }

    public final boolean isLandscape() {
        return (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE);
    }

    private void selectScreenOrientation() {
        if (isLandscape()) {
            onLandscapeScreen();
        } else {
            onPortraitScreen();
        }
    }

    protected void onPortraitScreen() {
    }

    protected void onLandscapeScreen() {
    }
}

package com.davisilva.projetomvp;

import android.os.Bundle;
import android.util.Log;

import com.davisilva.projetomvp.ui.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onLandscapeScreen() {
        super.onLandscapeScreen();
        Log.d("App", "Landscape");
    }

    @Override
    protected void onPortraitScreen() {
        super.onPortraitScreen();
        Log.d("App", "Portrait");
    }
}

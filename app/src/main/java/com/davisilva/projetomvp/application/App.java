package com.davisilva.projetomvp.application;

import android.app.Application;

import com.davisilva.projetomvp.parse.table.CredentialsTable;
import com.parse.Parse;
import com.parse.ParseObject;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        parseInit();
    }

    public void parseInit() {
        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(CredentialsTable.class);
        Parse.initialize(this, "8MlYlVEvNhgaNFzZZdMnnyT0GbmNcCyTI6ZmkyC2", "CfQutLba5T5vRrG436faOJBvIzQmvI2JmfSSe45Y");
    }
}

package com.davisilva.projetomvp.parse;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.davisilva.projetomvp.domain.model.Credentials;
import com.parse.FindCallback;
import com.parse.ParseClassName;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.SaveCallback;

import java.util.List;

@ParseClassName("Credentials")
public class CredentialsTable extends ParseTable<Credentials> {

    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL = "email";

    private static CredentialsTable instance;

    private CredentialsTable(){}

    // Singleton
    public static ParseTable instance() {
        if (instance == null) {
            instance = new CredentialsTable();
        }
        return instance;
    }

    private String getName() {
        return getString(KEY_NAME);
    }

    private String getEmail() {
        return getString(KEY_EMAIL);
    }

    private void setName(String name) {
        put(KEY_NAME, getEmail());
    }

    private void setEmail(String email) {
        put(KEY_EMAIL, email);
    }

    public void add(@NonNull Credentials credentials, @Nullable SaveCallback callback) {
        this.setEmail(credentials.getEmail());
        this.setName(credentials.getName());
        this.saveInBackground(callback);
    }

    @Override
    public void addAll(List<Credentials> object, SaveCallback callback) {
        //TODO
    }


}

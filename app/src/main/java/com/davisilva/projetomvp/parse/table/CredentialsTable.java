package com.davisilva.projetomvp.parse.table;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.davisilva.projetomvp.domain.model.Credentials;
import com.davisilva.projetomvp.parse.base.ParseTable;
import com.parse.ParseClassName;
import com.parse.SaveCallback;

import java.util.List;

@ParseClassName("Credentials")
public class CredentialsTable extends ParseTable<Credentials> {

    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL = "email";

    public CredentialsTable(){}

    public String getName() {
        return getString(KEY_NAME);
    }

    public String getEmail() {
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

package com.davisilva.projetomvp.parse.controller;


import com.davisilva.projetomvp.dagger.component.DaggerParseComponent;
import com.davisilva.projetomvp.domain.model.Credentials;
import com.davisilva.projetomvp.parse.table.CredentialsTable;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.SaveCallback;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

public class CredentialsController {

    @Inject
    CredentialsTable table;
    @Inject
    ParseQuery<CredentialsTable> query;

    public CredentialsController() {
        DaggerParseComponent.create().inject(this);
    }

    public void add(Credentials credentials, SaveCallback callback) {
        table.add(credentials, callback);
    }

    public void search(final String email, final SearchCallback<Credentials> callback) {
        query.whereEqualTo(CredentialsTable.KEY_EMAIL, email)
                .findInBackground(new FindCallback<CredentialsTable>() {
                    @Override
                    public void done(List<CredentialsTable> objects, ParseException e) {
                        if (e != null) {
                            callback.error(e);
                            return;
                        }

                        List<Credentials> credentialsList = new LinkedList<>();
                        for (CredentialsTable credentials : objects) {
                            Credentials c = new Credentials();
                            c.setEmail(credentials.getEmail());
                            c.setName(credentials.getName());
                            credentialsList.add(c);
                        }
                        callback.sucess(credentialsList);
                    }
                });
    }

    interface SearchCallback<T> {
        void sucess(List<T> objects);

        void error(ParseException e);
    }

}

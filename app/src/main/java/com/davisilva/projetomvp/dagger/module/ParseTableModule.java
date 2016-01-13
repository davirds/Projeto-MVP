package com.davisilva.projetomvp.dagger.module;

import com.davisilva.projetomvp.parse.table.CredentialsTable;
import com.parse.ParseQuery;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by davirodrigues on 12/01/16.
 */
@Module
public class ParseTableModule {

    @Provides
    CredentialsTable providesCredentialsTable(){
        return new CredentialsTable();
    }

    @Provides
    @Singleton
    ParseQuery<CredentialsTable> providesCredentialsQuery() {
        return ParseQuery.getQuery(CredentialsTable.class);
    }

}

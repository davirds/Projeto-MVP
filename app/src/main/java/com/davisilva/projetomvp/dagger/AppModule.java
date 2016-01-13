package com.davisilva.projetomvp.dagger;

import com.davisilva.projetomvp.application.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public App providesApp() {
        return app;
    }

}

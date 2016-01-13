package com.davisilva.projetomvp.dagger.component;

import com.davisilva.projetomvp.dagger.module.ParseTableModule;
import com.davisilva.projetomvp.parse.controller.CredentialsController;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by davirodrigues on 12/01/16.
 */
@Singleton
@Component(modules = ParseTableModule.class)
public interface ParseComponent {
    void inject(CredentialsController controller);
}

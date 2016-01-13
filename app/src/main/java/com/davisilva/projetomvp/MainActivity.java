package com.davisilva.projetomvp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.davisilva.projetomvp.domain.model.Credentials;
import com.davisilva.projetomvp.parse.controller.CredentialsController;
import com.davisilva.projetomvp.ui.base.BaseActivity;
import com.parse.ParseException;
import com.parse.SaveCallback;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Bind(R.id.name)
    EditText name;
    @Bind(R.id.email)
    EditText email;

    CredentialsController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller = new CredentialsController();
        ButterKnife.bind(this);
    }

    @OnClick(R.id.save)
    public void onClickSave(View v) {
        Credentials c = new Credentials();
        c.setEmail(email.getText().toString());
        c.setName(name.getText().toString());
        controller.add(c, new SaveCallback() {
            @Override
            public void done(ParseException e) {
                Toast.makeText(MainActivity.this,"Salvo",Toast.LENGTH_LONG).show();
            }
        });
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

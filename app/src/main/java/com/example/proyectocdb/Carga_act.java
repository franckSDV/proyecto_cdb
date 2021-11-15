package com.example.proyectocdb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.AsyncQueryHandler;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.text.BreakIterator;

import Objetos.Administrador;

public class Carga_act extends AppCompatActivity {

    private ProgressBar carga;
    private Administrador adm = new Administrador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carga);

        carga = findViewById(R.id.pbcarga);
        carga.setVisibility(View.VISIBLE);

    }
}
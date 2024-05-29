package com.example.cuidar.Fragments_and_menus.In_patient.Flujodrama;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuidar.R;

public class FujodramaInterior extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fujodrama_interior);

        Bundle bundle = getIntent().getExtras();
        FlujogramaFragment nuevoFlujoFragment = new FlujogramaFragment();
        nuevoFlujoFragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, nuevoFlujoFragment).commit();
        }
}
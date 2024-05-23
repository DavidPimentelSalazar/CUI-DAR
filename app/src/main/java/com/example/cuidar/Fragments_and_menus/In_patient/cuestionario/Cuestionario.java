package com.example.cuidar.Fragments_and_menus.In_patient.cuestionario;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuidar.Fragments_and_menus.In_patient.flujodrama.FlujogramaFragment;
import com.example.cuidar.R;

public class Cuestionario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionario);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CuestionarioFragment()).commit();
    }
}
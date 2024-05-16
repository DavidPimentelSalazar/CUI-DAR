package com.example.cuidar.Fragments_and_menus.In_patient.questionnaire;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuidar.Fragments_and_menus.GestionDePacientesFragment;
import com.example.cuidar.R;

public class Questionnaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new QuestionnaireFragment()).commit();
    }
}
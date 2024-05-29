package com.example.cuidar.Fragments_and_menus.In_patient;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuidar.Fragments_and_menus.In_patient.Cuestionario.Cuestionario;
import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;

import java.util.ArrayList;

public class DiagnosticoPaciente extends AppCompatActivity {

    ArrayList<Button> buttons = new ArrayList<>();
    PacienteDiagnostico pacienteDiagnostico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostico_paciente);

        Bundle bundle = getIntent().getExtras();
        pacienteDiagnostico = (PacienteDiagnostico) bundle.get("paciente");

        buttons.add(findViewById(R.id.iniciarDiagnostico));

        buttons.get(0).setOnClickListener(v -> {
            Intent intent = new Intent(this, Cuestionario.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}
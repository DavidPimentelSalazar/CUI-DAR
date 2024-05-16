package com.example.cuidar.Fragments_and_menus.In_patient;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.cuidar.Fragments_and_menus.In_patient.questionnaire.Questionnaire;
import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;

import java.util.ArrayList;

public class DiagnosticoPaciente extends AppCompatActivity implements View.OnClickListener {

    ArrayList<Button> buttons = new ArrayList<>();

    TextView texto;
    PacienteDiagnostico pacienteDiagnostico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostico_paciente);


        texto = findViewById(R.id.Diagnostico); ///// esto es para coger el titulo para ponerlo ahi luego se quitaria
        pacienteDiagnostico = new PacienteDiagnostico(); // el paciente.

        buttons.add(findViewById(R.id.iniciarDiagnostico));

        buttons.get(0).setOnClickListener(v -> {
            texto.setText(" "+pacienteDiagnostico.createDate());
            Intent intent = new Intent(this, Questionnaire.class);
            startActivity(intent);
        });
    }

    @Override
    public void onClick(View v) {

    }
}
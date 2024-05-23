package com.example.cuidar.Fragments_and_menus.In_patient.flujodrama;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuidar.Fragments_and_menus.In_patient.cuestionario.CuestionarioFragment;
import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;

public class FujodramaInterior extends AppCompatActivity {

    PacienteDiagnostico paciente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fujodrama_interior);

        TextView texto = findViewById(R.id.texto);

            paciente = (PacienteDiagnostico) getIntent().getSerializableExtra("paciente");
            try {
                if (paciente != null){
                    if (paciente.isDiagnostico())
                        texto.setText("SI");
                } else {
                    texto.setText("NO");
                }

            } catch (Exception e){
            }

        }

//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CuestionarioFragment()).commit();

}
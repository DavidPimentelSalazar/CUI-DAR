package com.example.cuidar.Fragments_and_menus.In_patient;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuidar.Fragments_and_menus.In_patient.flujodrama.FujodramaInterior;
import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;

import java.io.Serializable;
import java.util.ArrayList;

public class Flujodrama extends AppCompatActivity implements Serializable {

    ArrayList<Button> buttons;

    PacienteDiagnostico paciente = new PacienteDiagnostico();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flujodrama);

        paciente.setDiagnostico(true);

        buttons = new ArrayList<>();
        buttons.add(findViewById(R.id.button));

        buttons.get(0).setOnClickListener(v -> {
            Intent intent = new Intent(this, FujodramaInterior.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("paciente", paciente);
            intent.putExtras(bundle);
            startActivity(intent);
        });



    }
}
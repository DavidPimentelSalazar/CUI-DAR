package com.example.cuidar.Fragments_and_menus.In_patient.flujodrama;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;

import com.example.cuidar.R;

import java.util.ArrayList;


public class FlujogramaFragment extends Fragment {

    Switch reversible, ultimasHoras,especializada;
    Button siguiente;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_flujograma, container, false);

        reversible = view.findViewById(R.id.reversible);
        ultimasHoras = view.findViewById(R.id.ultimasHoras);
        especializada = view.findViewById(R.id.especialista);
        siguiente = view.findViewById(R.id.siguiente); // boton de abajo

        return view;
    }
}
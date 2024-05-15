package com.example.cuidar.users;


import java.text.SimpleDateFormat;
import java.util.Date;

public class PacienteDiagnostico {
    private int id;
    private String nombre, fecha;
    private boolean diagnostico;

    public PacienteDiagnostico() {

    }

    //______ SETTERS Y GETTERS ______//
    //////  ID  //////
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    //////  NOMBRE  //////
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    /////// DIAGNOSTICO ///////
    public void setDiagnostico(boolean diagnostico) {
        this.diagnostico = diagnostico;
    }

    public boolean isDiagnostico() {
        return diagnostico;
    }

    /////// FECHA ///////
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    //______ MODULOS ______//
    /////// GET FECHA ///////
    public String createDate() {
        // el formateo de la fecha
        SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        setFecha(fechaFormato.format(new Date()));
        return getFecha();
    }
}

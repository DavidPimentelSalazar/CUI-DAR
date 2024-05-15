package com.example.cuidar;


import java.util.Date;

public class PacienteDiagnostico {
    private int id;
    private String nombre;
    private boolean diagnostico;
    private Date fecha;

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
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }
}

package com.example.cuidar.users_data;


import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PacienteDiagnostico implements Serializable {

    private int id;
    private String nombre, fecha;
    private boolean diagnostico;

    // flujodrama //
    private boolean reversible, ultimasHoras, deviracionEspecialista;

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


    /////////////////////////
    ////// Flujodrama ///////

    /////// REVERSIBLE //////
    public boolean isReversible() {
        return reversible;
    }

    public void setReversible(boolean reversible) {
        this.reversible = reversible;
    }

    //////// Ultima hora ///////
    public boolean isUltimasHoras() {
        return ultimasHoras;
    }

    public void setUltimasHoras(boolean ultimasHoras) {
        this.ultimasHoras = ultimasHoras;
    }

    //////// Deviracion especialista /////////
    public boolean isDeviracionEspecialista() {
        return deviracionEspecialista;
    }

    public void setDeviracionEspecialista(boolean deviracionEspecialista) {
        this.deviracionEspecialista = deviracionEspecialista;
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

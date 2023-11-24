package Carrera;

import java.util.ArrayList;

public class Carrera {
    private String nombreCarrera;
    private String codigoCarrera;
    private String cantSemestre;
    private ArrayList <Alumno> alumnoCarrera;
    public Carrera(){
        this.nombreCarrera = nombreCarrera;
        this.codigoCarrera = codigoCarrera;
        this.cantSemestre = cantSemestre;
        this.alumnoCarrera = new ArrayList<Alumno>();
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getCantSemestre() {
        return cantSemestre;
    }

    public void setCantSemestre(String cantSemestre) {
        this.cantSemestre = cantSemestre;
    }

    public ArrayList<Alumno> getAlumnoCarrera() {
        return alumnoCarrera;
    }

    public void setAlumnoCarrera(ArrayList<Alumno> alumnoCarrera) {
        this.alumnoCarrera = alumnoCarrera;
    }
}

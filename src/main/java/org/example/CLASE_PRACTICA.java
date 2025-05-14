package org.example;

public class CLASE_PRACTICA {

    String ID;
    int huecos_disponibles;
    int profesores_disponibles;
    int clases_realizadas;

    public CLASE_PRACTICA(String ID, int huecos_disponibles, int profesores_disponibles, int clases_realizadas) {
        this.ID = ID;
        this.huecos_disponibles = huecos_disponibles;
        this.profesores_disponibles = profesores_disponibles;
        this.clases_realizadas = clases_realizadas;
    }

    public String getID() {
        return ID;
    }

    public int getHuecos_disponibles() {
        return huecos_disponibles;
    }

    public int getProfesores_disponibles() {
        return profesores_disponibles;
    }

    public int getClases_realizadas() {
        return clases_realizadas;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setHuecos_disponibles(int huecos_disponibles) {
        this.huecos_disponibles = huecos_disponibles;
    }

    public void setProfesores_disponibles(int profesores_disponibles) {
        this.profesores_disponibles = profesores_disponibles;
    }

    public void setClases_realizadas(int clases_realizadas) {
        this.clases_realizadas = clases_realizadas;
    }
}

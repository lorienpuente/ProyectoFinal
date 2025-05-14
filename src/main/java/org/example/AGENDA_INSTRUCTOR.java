package org.example;

public class AGENDA_INSTRUCTOR {

    String ID;
    Double horario_clases;
    String nivel_alumnos;
    Boolean preparados_examen;

    public AGENDA_INSTRUCTOR(String ID, Double horario_clases, String nivel_alumnos, Boolean preparados_examen) {
        this.ID = ID;
        this.horario_clases = horario_clases;
        this.nivel_alumnos = nivel_alumnos;
        this.preparados_examen = preparados_examen;
    }

    public String getID() {
        return ID;
    }

    public Double getHorario_clases() {
        return horario_clases;
    }

    public String getNivel_alumnos() {
        return nivel_alumnos;
    }

    public Boolean getPreparados_examen() {
        return preparados_examen;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setHorario_clases(Double horario_clases) {
        this.horario_clases = horario_clases;
    }

    public void setNivel_alumnos(String nivel_alumnos) {
        this.nivel_alumnos = nivel_alumnos;
    }

    public void setPreparados_examen(Boolean preparados_examen) {
        this.preparados_examen = preparados_examen;
    }
}

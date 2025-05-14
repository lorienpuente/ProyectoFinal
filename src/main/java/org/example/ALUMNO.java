package org.example;

import java.util.ArrayList;

public class ALUMNO extends PERSONA{

    String direccion;
    int fecha_inscripcion;
    ArrayList<ALUMNO> Alumno;

    public ALUMNO(String DNI, String nombre, String apellidos, String direccion, int fecha_inscripcion) {
        super(DNI, nombre, apellidos);
        this.direccion = direccion;
        this.fecha_inscripcion = fecha_inscripcion;

    }

    public String getDireccion() {
        return direccion;
    }

    public int getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public ArrayList<ALUMNO> getAlumno() {
        return Alumno;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFecha_inscripcion(int fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public void setAlumno(ArrayList<org.example.ALUMNO> alumno) {
        this.Alumno = Alumno;
    }
}

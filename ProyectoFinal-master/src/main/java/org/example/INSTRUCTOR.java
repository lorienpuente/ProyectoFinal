package org.example;

public class INSTRUCTOR extends PERSONA{

    Double sueldo;
    int anos_experiencia;

    public INSTRUCTOR(String DNI, String nombre, String apellidos, Double sueldo, int anos_experiencia) {
        super(DNI, nombre, apellidos);
        this.sueldo = sueldo;
        this.anos_experiencia = anos_experiencia;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public int getAnos_experiencia() {
        return anos_experiencia;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public void setAnos_experiencia(int anos_experiencia) {
        this.anos_experiencia = anos_experiencia;
    }
}

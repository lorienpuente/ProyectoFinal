package org.example;

public class TEST_TEORICOS {

    String ID;
    String tipo;
    int test_aprobados;
    int errores_totales;
    int aciertos;
    String preguntas;
    String opciones;
    String respuesta_correcta;

    public TEST_TEORICOS(String ID, String tipo, int test_aprobados, int errores_totales, int aciertos, String preguntas, String opciones, String respuesta_correcta) {
        this.ID = ID;
        this.tipo = tipo;
        this.test_aprobados = test_aprobados;
        this.errores_totales = errores_totales;
        this.aciertos = aciertos;
        this.preguntas = preguntas;
        this.opciones = opciones;
        this.respuesta_correcta = respuesta_correcta;
    }

    public String getID() {
        return ID;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTest_aprobados() {
        return test_aprobados;
    }

    public int getErrores_totales() {
        return errores_totales;
    }

    public int getAciertos() {
        return aciertos;
    }

    public String getPreguntas() {
        return preguntas;
    }

    public String getOpciones() {
        return opciones;
    }

    public String getRespuesta_correcta() {
        return respuesta_correcta;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTest_aprobados(int test_aprobados) {
        this.test_aprobados = test_aprobados;
    }

    public void setErrores_totales(int errores_totales) {
        this.errores_totales = errores_totales;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    public void setRespuesta_correcta(String respuesta_correcta) {
        this.respuesta_correcta = respuesta_correcta;
    }
}


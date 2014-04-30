/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.data;

/**
 *
 * @author Nocturno
 */
public class Barco {

    private String matricula;
    private float eslora;
    private short año;

    public Barco(String matricula, float eslora, short año) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.año = año;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public short getAño() {
        return año;
    }

    public void setAño(short año) {
        this.año = año;
    }

    public float calculaAlquiler() {
        return 10 * 2 * getEslora();
    }
}

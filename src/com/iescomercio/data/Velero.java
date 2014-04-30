/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.data;

/**
 *
 * @author Nocturno
 */
public class Velero extends Barco {

    private byte numMas;

    public Velero(String matricula, float eslora, short año, byte numMas) {
        super(matricula, eslora, año);
        this.numMas = numMas;
    }

    public byte getNumMas() {
        return numMas;
    }

    public void setNumMas(byte numMas) {
        this.numMas = numMas;
    }

    @Override
    public float calculaAlquiler() {
        return super.calculaAlquiler() + getNumMas() * 5;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.data;

/**
 *
 * @author Nocturno
 */
public class Yate extends Deportiva {

    private byte numCam;

    public Yate(String matricula, float eslora, short año, short potencia, byte numCam) {
        super(potencia, matricula, eslora, año);
        this.numCam = numCam;
    }

    public byte getNumCam() {
        return numCam;
    }

    public void setNumCam(byte numCam) {
        this.numCam = numCam;
    }

    @Override
    public float calculaAlquiler() {
        return super.calculaAlquiler() + getNumCam() * 20;
    }
}

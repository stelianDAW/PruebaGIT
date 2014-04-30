/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.data;

/**
 *
 * @author Nocturno
 */
public class Deportiva extends Barco {

    private short potencia;

    public Deportiva(short potencia, String matricula, float eslora, short año) {
        super(matricula, eslora, año);
        this.potencia = potencia;
    }

    public short getPotencia() {
        return potencia;
    }

    public void setPotencia(short potencia) {
        this.potencia = potencia;
    }

    @Override
    public float calculaAlquiler() {
        return super.calculaAlquiler() + getPotencia();
    }
}

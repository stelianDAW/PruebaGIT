/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.data;

import java.util.ArrayList;

/**
 *
 * @author Nocturno
 */
public class ListaClientes {

    // Propiedades
    private ArrayList<Cliente> clienteColeccion;

    // Constructores
    public ListaClientes() {
        clienteColeccion = new ArrayList();
    }

    // Geteres y Seters
    public ArrayList getClienteColeccion() {
        return clienteColeccion;
    }

    public void setClienteColeccion(ArrayList clienteColeccion) {
        this.clienteColeccion = clienteColeccion;
    }

    // Metodos
    public void addCliente(Cliente cliente) {
        this.clienteColeccion.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
        this.clienteColeccion.remove(cliente);
    }

    public Cliente recuperarPrimerCliente() {
        return this.clienteColeccion.get(0);
    }
    
    public Cliente recuperarUltimoCliente() {
        return this.clienteColeccion.get(this.clienteColeccion.size()-1);
    }
    
    public Cliente recuperarCliente (int indice){
        return this.clienteColeccion.get(indice);
    }
    
    public void borrarCliente (int indice){
        this.clienteColeccion.remove(indice);
    }
    
    public int recuperarLongitud (){
        return this.clienteColeccion.size();
    }

}

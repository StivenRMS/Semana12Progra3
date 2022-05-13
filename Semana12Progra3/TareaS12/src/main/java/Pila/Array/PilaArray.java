/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila.Array;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PilaArray {

    private static final int INICIAL = 19;
    private int cima;
    private ArrayList lisArray;

    public PilaArray() {
        cima = -1;
        lisArray = new ArrayList();}


    public void insertar(Object elemento) throws Exception {
        cima++;
        lisArray.add(elemento);
    }

    public Object quitar() throws Exception {
        Object aux;
        if (pilaVacia()) {
            throw new Exception("pila vacia");
        }
    aux = lisArray.get(cima);
    lisArray.remove(cima);
    cima --;
    return aux;
    
}

// metodo para acceso a la cima de la pila
    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("pila Vacia, no se puede");
        }

        return lisArray.get(cima);
    }

    //verifica estado de la pila
    public boolean pilaVacia() {
        return cima == -1;
    }

    public void limpiarPila() throws Exception {
        while (!pilaVacia()) {
            quitar();
        }
    }   
}

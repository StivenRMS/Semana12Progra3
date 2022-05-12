/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila.Vector;

import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class PilaVector {
    
private static final int INICIAL = 19;
private int cima;
private Vector listaPila;

public PilaVector(){
cima = -1;
listaPila = new Vector();

}


public void insertar(Object elemento) throws Exception {
cima++;
listaPila.addElement(elemento);
}

public Object quitar() throws Exception{
Object aux;
if (pilaVacia()){
throw new Exception ("pila vacia");
}
aux = listaPila.elementAt(cima);
listaPila.removeElementAt(cima);
cima --;
return aux;
}


// metodo para acceso a la cima de la pila
public Object cimaPila() throws Exception{
if (pilaVacia()){
throw new Exception ("pila Vacia, no se puede");
}

return listaPila.elementAt(cima);
}


//verifica estao de la pila
public boolean pilaVacia(){
return cima == -1;
}


public void limpiarPila() throws Exception {
while (!pilaVacia()){
quitar();
}
}




}
    


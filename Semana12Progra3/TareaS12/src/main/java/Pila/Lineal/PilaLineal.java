/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila.Lineal;

/**
 *
 * @author Usuario
 */
public class PilaLineal {

    private static final int TAMPILA = 40;
    private int cima;
    private Object[] listaPila;

    public PilaLineal() {
        cima = -1;
        listaPila = new Object[TAMPILA];
    }

    //Operaciones que modifican la Fila
    public void insertar(Object elemento) throws Exception {
        if (pilaLLena()) {
            throw new Exception("underflow la pila vacia esta");
        }

        cima++;
        listaPila[cima] = elemento;

    }

    //Desapilar, quitar POP elemtno de la fila
    public Object quitar() throws Exception {
        Integer aux;

        if (pilaVacia()) {
            throw new Exception("Pila vacia, no se puede sacar!");
        }

        //guadar el elemnto de la cima 
        aux = (Integer) listaPila[cima];

        //decrementar cima y retornar el elemento
        cima--;
        return aux;
    }
    
    //limpiar la pila
    public void limpiarPila() throws Exception{
        cima = -1;
    }

    
    
    
    //metodo pra acceso a la pila
    public Object cimaPila() throws Exception{
        if(pilaVacia()){
            throw new Exception ("pila Bavia, npo se puede");
        }
        
        return listaPila[cima];
    }
    
    //verificar estado de la pila
    public boolean pilaVacia(){
        return  cima == -1; 
    }
    
    //vericar asi esta llena
    public boolean pilaLLena(){
        return cima == TAMPILA -1;
    }
}

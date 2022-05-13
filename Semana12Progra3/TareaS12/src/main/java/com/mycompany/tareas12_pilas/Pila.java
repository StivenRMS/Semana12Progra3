/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareas12_pilas;

import Pila.Array.PilaArray;
import Pila.Lineal.PilaLineal;
import Pila.Vector.PilaVector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pila {

    static void ejemplo0() {

// Creating an empty Stack
        Stack<Integer> MiPila = new Stack<Integer>();

// Use add() method agrega elementos
        MiPila.push(10);
        MiPila.push(15);
        MiPila.push(30);
        MiPila.push(20);
        MiPila.push(5);

// Desplegando el stack
        System.out.println("Pila Inicial: " + MiPila);

// Quitando elements using pop() method
        System.out.println("Elemendo desapilado: "
                + MiPila.pop());
        System.out.println("Elemendo desapilado: "
                + MiPila.pop());

// Desplegando la pila despues de la operacion POP
        System.out.println("Stack after pop operation "
                + MiPila);
    }

    static void ejercicioPilas() throws IOException {
        PilaLineal pila;
        int x;
        final int CLAVE = -1;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Tecle los elmentos termina con -1");

        try {
            pila = new PilaLineal();
            do {

                x = Integer.parseInt(entrada.readLine());

            } while (x != CLAVE);

            System.out.println("Elementos en la pila: ");

            while (!pila.pilaVacia()) {
                x = (Integer) (pila.quitar());
                System.out.print(x + " ");
            }

        } catch (Exception ex) {
            System.out.println("Error ");

        }

    }

    //////en la parte del main
//static void vectores(){
//PilaVector pila = new PilaVector();
//int x;
//BufferedReader entrada = new BufferedReader(
//new InputStreamReader(System.in));
//System.out.println("Teclea número de elementos: ");
//try {
//x = Integer.parseInt(entrada.readLine());
//for (int j = 1; j <= x; j++)
//{
//Double d;
//d = Double.valueOf(entrada.readLine());
//pila.insertar(d);
//}
//// vaciado de la pila
//System.out.println("Elementos de la Pila: ");
//while (!pila.pilaVacia())
//{
//Double d;
//d = (Double)pila.quitar();
//if (d.doubleValue() > 0.0)
//System.out.print(d + " ");
//}
//}
//catch (Exception er)
//{
//System.err.println("Excepcion: " + er);
//}
//
//}

    static void pilasArray() {
        PilaArray pila = new PilaArray();
        int x;
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Teclea número de elementos: ");
        try {
            x = Integer.parseInt(entrada.readLine());
            for (int j = 1; j <= x; j++) {
                Double d;
                d = Double.valueOf(entrada.readLine());
                pila.insertar(d);
            }
            // vaciado de la pila
            System.out.println("Elementos de la Pila: ");
            while (!pila.pilaVacia()) {
                Double d;
                d = (Double) pila.quitar();
                if (d.doubleValue() > 0.0) {
                    System.out.print(d + " ");
                }
            }
        } catch (Exception er) {
            System.err.println("Excepcion: " + er);
        }

    }
    
    public static void main(String args[]) throws IOException {
       // ejercicioPilas();
      // vectores();
      pilasArray();

    }

}

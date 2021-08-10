package com.algoritmo.lista.simples;

public class Main {
    public static void main (String[] args) {
        Nodo nodo1 = new Nodo(4);
        Nodo nodo2 = new Nodo(13);
        Nodo nodo3 = new Nodo(25);

        System.out.println("nodo1: " + nodo1);
        System.out.println("nodo2: " + nodo2);

        nodo1.addNext(nodo2);
        System.out.println(nodo1);

    }
}

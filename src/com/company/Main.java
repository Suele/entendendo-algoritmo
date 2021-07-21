package com.company;

public class Main {

    public static void main (String[] args) {

        AlgoritmoDeBuscaNumerica binarySearch = new AlgoritmoDeBuscaNumerica();

        int[] listaElementos = {1, 3, 4, 6, 8, 11, 14, 17, 19, 21, 25, 33};

        System.out.println("Posição do elemento busca binaria: " + binarySearch.buscaBinaria(90, listaElementos));

        System.out.println(" ");

        System.out.println("Posição do elemento busca linear: " + binarySearch.buscaLinear(90, listaElementos));
    }
}

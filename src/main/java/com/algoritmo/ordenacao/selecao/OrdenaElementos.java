package com.algoritmo.ordenacao.selecao;

public class OrdenaElementos {

    public void ordenaElementosSelecao (int[] listaElementos) {
        if (listaElementos.length > 1) {
            for (int i = 0; i < listaElementos.length; i++) {
                int indiceMenor = i;
                for (int j = i + 1; j < listaElementos.length; j++) {
                    int indiceMaior = j;
                    if (listaElementos[indiceMenor] > listaElementos[indiceMaior]) {
                        indiceMaior = indiceMenor;
                    }
                    int aux = listaElementos[j];
                    listaElementos[j] = listaElementos[indiceMaior];
                    listaElementos[indiceMaior] = aux;
                }
            }
            for (int listaDeElemento : listaElementos) {
                System.out.print(listaDeElemento + " - ");
            }
        } else {
            System.err.println("O array está vazio ou contem apenas um elemento.");
        }
    }
}

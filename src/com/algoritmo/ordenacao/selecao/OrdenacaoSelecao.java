package com.algoritmo.ordenacao.selecao;

public class OrdenacaoSelecao {

    public void buscaMenorElemento (int[] listaElementos) {
        if (listaElementos.length > 1) {
            for (int i = 0; i < listaElementos.length; i++) {
                int indiceMenor = i;
                for (int j = i + 1; j < listaElementos.length; j++) {
                    if (listaElementos[j] < listaElementos[indiceMenor]) {
                        indiceMenor = j;
                    }
                    int aux = listaElementos[i];
                    listaElementos[i] = listaElementos[indiceMenor];
                    listaElementos[indiceMenor] = aux;
                }
            }
            for (int f = 0; f < listaElementos.length; f++) {
                System.out.print(listaElementos[f] + " - ");
            }
        } else {
            System.out.println("O array está vazio ou contem apenas um elemento.");
        }
    }
}

package com.algoritmo.ordenacao.selecao;

public class OrdenacaoSelecao {

    public void buscaMenorElemento (int[] listaElementos) {
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
        System.out.println(listaElementos[5]);
    }
}

package com.company;

class AlgoritmoDeBuscaNumerica {

    public int buscaBinaria (int numeroProcurado, int[] listaElementos) {
        int inicio = 0;
        int finalLista = (listaElementos.length - 1);
        int numeroDeInteracoes = 0;

        while (inicio <= finalLista) {
            numeroDeInteracoes++;
            int meioLista = ((inicio + finalLista) / 2);
            if (numeroProcurado == listaElementos[meioLista]) {
                System.out.println("numeroDeInteracoes: " + numeroDeInteracoes);
                return meioLista;
            } else if (numeroProcurado < listaElementos[meioLista]) {
                finalLista = (meioLista - 1);
            } else {
                inicio = (meioLista + 1);
            }
        }
        System.out.println("numeroDeInteracoes: " + numeroDeInteracoes);
        return -1;
    }

    public int buscaLinear (int numeroProcurar, int[] listaNumerica) {
        int numeroDeInteracoes = 0;
        for (int i = 0; i < listaNumerica.length; i++) {
            numeroDeInteracoes++;
            if (numeroProcurar == listaNumerica[i]) {
                System.out.println("numeroDeInteracoes: " + numeroDeInteracoes);
                return i;
            }
        }
        System.out.println("numeroDeInteracoes: " + numeroDeInteracoes);
        return -1;
    }
}

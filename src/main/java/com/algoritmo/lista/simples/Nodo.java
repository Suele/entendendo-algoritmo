package com.algoritmo.lista.simples;

public class Nodo {
    public Nodo next;
    public int item;

    public Nodo (int item) {
        this.item = item;
        this.next = null;
    }

    public Nodo addNext (Nodo nextNodo) {
            this.next = nextNodo;
            return this.next;
    }

    @Override
    public String toString () {
        return "Nodo{" +
                "next=" + this.next +
                ", item=" + this.item +
                '}';
    }

}

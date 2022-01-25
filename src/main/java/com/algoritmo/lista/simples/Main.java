package com.algoritmo.lista.simples;

public class Main {
	public static void main(String[] args) {
		Nodo n1 = new Nodo("NODO 1");
		Nodo n2 = new Nodo("NODO 2");
		Nodo n3 = new Nodo("NODO 3");
		Nodo n4 = new Nodo("NODO 4");

		n1.setNextNodo(n2);
		n2.setNextNodo(n3);
		n3.setNextNodo(n4);
		System.out.println(n1);
	}
}

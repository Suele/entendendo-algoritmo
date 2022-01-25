package com.algoritmo.lista.simples;

public class Main {
	public static void main(String[] args) {
		Nodo<String> n1 = new Nodo("NODO 1");
		Nodo<String> n2 = new Nodo("NODO 2");
		Nodo<String> n3 = new Nodo("NODO 3");
		Nodo<String> n4 = new Nodo("NODO 4");

		n1.setNextNodo(n2);
		n2.setNextNodo(n3);
		n3.setNextNodo(n4);
		System.out.println(n1);
	}
}

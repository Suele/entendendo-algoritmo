package com.algoritmo.lista.simples;

public class Nodo {
	private String value;
	private Nodo nextNodo;

	public Nodo(String value) {
		this.value = value;
		this.nextNodo = null;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Nodo getNextNodo() {
		return nextNodo;
	}

	public void setNextNodo(Nodo nextNodo) {
		this.nextNodo = nextNodo;
	}

	@Override
	public String toString() {
		return "Nodo{" +
				"valor: " + value +
				", proximo nodo: " + nextNodo +
				'}';
	}
}

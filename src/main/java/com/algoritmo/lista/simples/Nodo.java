package com.algoritmo.lista.simples;

public class Nodo<T> {
	private T value;
	private Nodo nextNodo;

	public Nodo(T value) {
		this.value = value;
		this.nextNodo = null;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Nodo getNextNodo() {
		return nextNodo;
	}

	public void setNextNodo(Nodo<T> nextNodo) {
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

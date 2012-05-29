package com.qacg.lists;

public class NodoLista <Elemento> {
	private Elemento elemento;
	private NodoLista<Elemento> siguiente;
	
	public NodoLista(Elemento element) {
		super();
		this.elemento = element;
		this.siguiente = null;
	}
	public NodoLista(Elemento element, NodoLista<Elemento> siguiente) {
		super();
		this.elemento = element;
		this.siguiente = siguiente;
	}
	public Elemento getElemento() {
		return elemento;
	}
	public void setElemento(Elemento element) {
		this.elemento = element;
	}
	public NodoLista<Elemento> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoLista<Elemento> siguiente) {
		this.siguiente = siguiente;
	}
	@Override
	public String toString() {
		return "[elemento=" + elemento + "]";
	}
	
	
	
}

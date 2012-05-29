package com.qacg.lists;

public class NodoListaDoble<Elemento> {
	private Elemento elemento;
	private NodoListaDoble<Elemento> siguiente;
	private NodoListaDoble<Elemento> anterior;
	
	public NodoListaDoble(Elemento elemento) {
		super();
		this.elemento = elemento;
		this.siguiente = null;
		this.anterior = null;
	}
	
	
	
	
	public NodoListaDoble(Elemento elemento, NodoListaDoble<Elemento> anterior) {
		super();
		this.elemento = elemento;
		this.anterior = anterior;
	}




	public NodoListaDoble(Elemento elemento,
			NodoListaDoble<Elemento> siguiente,
			NodoListaDoble<Elemento> anterior) {
		super();
		this.elemento = elemento;
		this.siguiente = siguiente;
		this.anterior = anterior;
	}
	public Elemento getElemento() {
		return elemento;
	}
	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}
	public NodoListaDoble<Elemento> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoListaDoble<Elemento> siguiente) {
		this.siguiente = siguiente;
	}
	public NodoListaDoble<Elemento> getAnterior() {
		return anterior;
	}
	public void setAnterior(NodoListaDoble<Elemento> anterior) {
		this.anterior = anterior;
	}
	@Override
	public String toString() {
		return "[elemento=" + elemento + "]";
	}
}

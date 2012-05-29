package com.qacg.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDoble<Elemento> {

	private NodoListaDoble<Elemento> primero;
	private NodoListaDoble<Elemento> ultimo;

	public void add(Elemento e) {
		if (exist(e) != null) {
			return;
		}
		if (primero == null) {
			primero = new NodoListaDoble<Elemento>(e);
			ultimo = primero;
		} else {
			NodoListaDoble<Elemento> elementoNuevo = new NodoListaDoble<Elemento>(e, ultimo);
			ultimo.setSiguiente(elementoNuevo);
			ultimo = elementoNuevo;
		}
	}

	public List<Elemento> asList() {
		List<Elemento> elementos = new ArrayList<Elemento>();
		crearLista(elementos, primero);
		Collections.reverse(elementos);
		return elementos;
	}

	private void crearLista(List<Elemento> elementos,
			NodoListaDoble<Elemento> elem) {
		if (elem.getSiguiente() == null) {
			elementos.add(elem.getElemento());
		} else {
			crearLista(elementos, elem.getSiguiente());
			elementos.add(elem.getElemento());
		}
	}

	public void remove(Elemento e) {
		if (primero == null) {
			return;
		}
		if ((primero.getElemento() == null && e == null)
				|| (primero.getElemento() != null && primero.getElemento()
						.equals(e))) {
			primero = primero.getSiguiente();
			primero.setAnterior(null);
		} else {
			remove(primero, e);
		}
	}

	private void remove(NodoListaDoble<Elemento> nodo, Elemento e) {
		if (nodo.getSiguiente() == null) {
			return;
		} else {
			if ((nodo.getSiguiente().getElemento() == null && e == null)
					|| (nodo.getSiguiente().getElemento() != null && nodo
							.getSiguiente().getElemento().equals(e))) {
		
				nodo.setSiguiente(nodo.getSiguiente().getSiguiente());
				if(nodo.getSiguiente()!=null){
					nodo.getSiguiente().setAnterior(nodo);
				}
			} else {
				remove(nodo.getSiguiente(), e);
			}
		}
	}

	public NodoListaDoble<Elemento> exist(Elemento e) {
		if (primero == null) {
			return null;
		}
		if ((primero.getElemento() == null && e == null)
				|| (primero.getElemento() != null && primero.getElemento()
						.equals(e))) {
			return primero;
		} else {
			return exist(primero.getSiguiente(), e);
		}
	}

	private NodoListaDoble<Elemento> exist(NodoListaDoble<Elemento> nodo, Elemento e) {
		if (nodo == null || nodo.getElemento() == null) {
			return null;
		} else {
			if ((nodo.getElemento() == null && e == null)
					|| (nodo.getElemento() != null && nodo.getElemento()
							.equals(e))) {
				return nodo;
			} else {
				return exist(nodo.getSiguiente(), e);
			}
		}
	}
	
	public int size(){
		int count = 0;
		NodoListaDoble<Elemento> nodo = primero;
		while(nodo!=null){
			count+=1;
			nodo=nodo.getSiguiente();
		}
		return count;
	}
	
	
	public Object[] toArray(){
		Object[] elementos = new Object[this.size()];
		
		if(elementos.length>0){
			int index = 0;
			NodoListaDoble<Elemento> nodo = primero;
			
			while(nodo!=null){
				elementos[index] = nodo;
				index++;
				nodo=nodo.getSiguiente();
			}
			
		}
		return elementos;
	}
}

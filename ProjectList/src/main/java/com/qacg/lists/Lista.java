package com.qacg.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Lista<Elemento> {
	private NodoLista<Elemento> primero;
	
	public void add(Elemento e){
		if (exist(e)!=null){
			return;
		}
		if(primero == null){
			primero = new NodoLista<Elemento>(e);
		}else{
			addFinal(primero, e);
		}
	}
	
	private void addFinal(NodoLista<Elemento> nodo, Elemento elemento){
		if (nodo.getSiguiente() == null){
			nodo.setSiguiente(new NodoLista<Elemento>(elemento));
		}else{
			addFinal( nodo.getSiguiente() , elemento);
		}
	}
	
	public Object[] toArray(){
		Object[] elementos = new Object[this.size()];
		
		if(elementos.length>0){
			int index = 0;
			NodoLista<Elemento> nodo = primero;
			
			while(nodo!=null){
				elementos[index] = nodo;
				index++;
				nodo=nodo.getSiguiente();
			}
			
		}
		return elementos;
	}
	
	public List<Elemento> asList(){
		List<Elemento> elementos = new ArrayList<Elemento>();
		crearLista(elementos, primero);
		Collections.reverse(elementos);
		return elementos;
	}
	
	private void crearLista(List<Elemento> elementos, NodoLista<Elemento> elem){
		if(elem.getSiguiente() == null){
			elementos.add(elem.getElemento());
		}else{
			crearLista(elementos, elem.getSiguiente());
			elementos.add(elem.getElemento());
		}
	}
	
	public void remove(Elemento e){
		if(primero==null){
			return;
		}
		if((primero.getElemento()==null && e==null)||
				(primero.getElemento()!=null && primero.getElemento().equals(e)) ){
			primero = primero.getSiguiente();
		}else{
			remove(primero, e);
		}
	}
	
	private void remove(NodoLista<Elemento> nodo, Elemento e){
		if ( nodo.getSiguiente() == null ){
			return;
		}else{
			if((nodo.getSiguiente().getElemento()==null && e==null)||
					(nodo.getSiguiente().getElemento()!=null && nodo.getSiguiente().getElemento().equals(e)) ){
				nodo.setSiguiente(nodo.getSiguiente().getSiguiente());
			}else{
				remove(nodo.getSiguiente(), e);
			}
		}
	}
	
	public NodoLista<Elemento> exist(Elemento e){
		if(primero==null){
			return null;
		}
		if((primero.getElemento()==null && e==null)||
				(primero.getElemento()!=null && primero.getElemento().equals(e)) ){
			return primero;
		}else{
			return exist(primero.getSiguiente(), e);
		}
	}
	
	private NodoLista<Elemento> exist(NodoLista<Elemento> nodo, Elemento e){
		if ( nodo==null || nodo.getElemento() == null ){
			return null;
		}else{
			if((nodo.getElemento()==null && e==null)||
					(nodo.getElemento()!=null && nodo.getElemento().equals(e)) ){
				return nodo;
			}else{
				return exist(nodo.getSiguiente(), e);
			}
		}
	}
	
	public int size(){
		int count = 0;
		NodoLista<Elemento> nodo = primero;
		while(nodo!=null){
			count+=1;
			nodo=nodo.getSiguiente();
		}
		return count;
	}
	
}

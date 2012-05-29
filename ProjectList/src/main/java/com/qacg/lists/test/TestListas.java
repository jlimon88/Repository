package com.qacg.lists.test;

import java.util.Arrays;

import com.qacg.lists.Lista;
import com.qacg.lists.ListaDoble;

public class TestListas {

	public static void main(String[] args) {
		
		if (args.length>0){
			
			if(args[0].equals("SIMPLE")){
				System.out.println("++++++LISTA SIMPLE+++++++");
				Lista<Integer> numeros = new Lista<Integer>();
				
				numeros.add(1);
				numeros.add(2);
				numeros.add(3);
				System.out.println("Agregados elementos"+Arrays.toString(numeros.toArray()));
				
				System.out.println("Tamano: "+numeros.size());
				
				
				numeros.remove(2);
				System.out.println("Removido: "+2);
				
				System.out.println("Elementos"+Arrays.toString(numeros.toArray()));
				
			}else{
				System.out.println("++++++LISTA DOBLE+++++++");
				ListaDoble<Integer> numeros = new ListaDoble<Integer>();
				
				numeros.add(1);
				numeros.add(2);
				numeros.add(3);
				System.out.println("Agregados elementos"+Arrays.toString(numeros.toArray()));
				
				System.out.println("Tamano: "+numeros.size());
				
				
				numeros.remove(2);
				System.out.println("Removido: "+2);
				
				System.out.println("Elementos"+Arrays.toString(numeros.toArray()));
				
			}
			
		}
			
		
		
	}

}

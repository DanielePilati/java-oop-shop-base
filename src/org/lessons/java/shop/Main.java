package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
	
		Prodotto libro = new Prodotto("nome Libro","descrizione a caso libro", 22.50 , 21.05);
		Prodotto mestolo = new Prodotto("nome Mestolo","descrizione a caso mestolo", 33.54 , 15.20);
		
		System.out.println("prezzo non ivato " + libro.getPrice());
		System.out.println("iva " + libro.getVat());
		System.out.println("prezzo ivato " + libro.getPriceWithVat());
		System.out.println("nome esteso " + libro.extendedName());
		
		System.out.println("prezzo non ivato " + mestolo.getPrice());
		System.out.println("iva " + mestolo.getVat());
		System.out.println("prezzo ivato " + mestolo.getPriceWithVat());
		System.out.println("nome esteso " + mestolo.extendedName());
	}

}

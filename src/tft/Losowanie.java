package tft;

import java.util.ArrayList;
import java.util.Random;

public class Losowanie {
	public ArrayList<String> lista = new ArrayList<String>();
	 ArrayList<String> lista1 = new ArrayList<String>();
	 ArrayList<String> lista2 = new ArrayList<String>();
	
	public Losowanie() {
		lista.add("Tomek");
		lista.add("Darek");
		lista.add("Asia");
		lista.add("Maria");
		lista.add("Mariusz");
		lista.add("Ania");
		lista.add("Jan");
		lista1.add("Tomek");
		lista1.add("Darek");
		lista1.add("Asia");
		lista1.add("Maria");
		lista1.add("Mariusz");
		lista1.add("Ania");
		lista1.add("Jan");
		
		int liczba = 0;
		
		while (!lista.isEmpty()) {
			Random r = new Random();
			int rand = r.nextInt(lista.size());
			if (lista.get(rand) == lista1.get(liczba)) {
				
			}
			else {
				lista2.add(lista.get(rand));
				lista.remove(rand);
				liczba++;
			}
		}
		
		for (int i = 0; i < 7; i++) {
			System.out.println(lista1.get(i) + " kupuje prezent dla " + lista2.get(i));
		}
	}
	
}

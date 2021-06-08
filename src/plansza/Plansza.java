package plansza;


import java.awt.Color;
import java.awt.GridLayout;

import java.util.ArrayList;

import javax.swing.*;

import tft.Hero;



@SuppressWarnings("serial")
public class Plansza extends JPanel {
	public static ArrayList<ArrayList<Pole>> pola = new ArrayList<>();
	public final static int polaSizeI = 8;
	public final static int polaSizeJ = 7;
	
	public static boolean choosedPole;
	
	public static int x, y;
	
	public Plansza() {
		super();
		choosedPole = false;
		for (int i = 0; i < polaSizeI; i++) {
			pola.add(new ArrayList<>());
			for (int j = 0; j < polaSizeJ; j++) {
				Pole p = new Pole(i, j);
				pola.get(i).add(p);
				add(p);
			}
		}
		setLayout(new GridLayout(polaSizeI,polaSizeJ));
		
	}
}

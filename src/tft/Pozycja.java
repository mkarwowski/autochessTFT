package tft;

import plansza.Plansza;

public class Pozycja {
	private int x;
	private int y;
	
	public Pozycja(int a, int b) {
		if (a >= 0 && a < Plansza.polaSizeI) {
			x = a;
		}
		else if (a < 0){
			x = 0;
		}
		else {
			x = Plansza.polaSizeI - 1;
		}
		
		if (b >= 0 && b < Plansza.polaSizeJ) {
			y = b;
		}
		else if (b < 0) {
			y = 0;
		}
		else {
			y = Plansza.polaSizeJ - 1;
		}
	}
	
	public Pozycja(Pozycja p, Pozycja q) {
		x = q.getX() - p.getX();
		y = q.getY() - p.getY();
	}
	
	public Pozycja(Pozycja p) {
		x = p.getX();
		y = p.getY();
	}
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	public void plusX() {
		x++;
		
	}
	
	public void plusY() {
		y++;
	}
	
	public void minusX() {
		x--;
	}
	
	public void minusY() {
		y--;
	}
	
	public boolean czyWPlanszy() {
		if(x < 0 || y < 0 || x > Plansza.polaSizeI || y > Plansza.polaSizeJ) {
			return false;
		}
		else return true;
	}
	
	public boolean czyDodatnia() {
		if (x >= 0 && y >= 0) return false;
		else return true;
	}
	
	public void piszPozycje() {
		System.out.println(x + ", " + y);
	}
	
	public boolean czyRowne(Pozycja p) {
		if (p.getX() == x && p.getY() == y) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean czyWZasiegu(Pozycja p, int zasieg) {
		int suma = Math.abs(p.getX() - x) +  Math.abs(p.getY() - y);
		
		if(suma > zasieg) {
			return false;
		}
		else return true;
	}
	
	public boolean czyZajeta() {
		if (Plansza.pola.get(x).get(y).hero == null) {
			return false;
		}
		else return true;
	}
	
	public Pozycja zwrocPustegoSasiada() {//DO POPRAWY!
		if (y-1 >= 0 && Plansza.pola.get(x).get(y-1).hero == null) {
			return new Pozycja(x, y-1);
		}
		else if (y+1 < Plansza.polaSizeJ && Plansza.pola.get(x).get(y+1).hero == null) {
			return new Pozycja(x, y+1);
		}
		else if (x+1 < Plansza.polaSizeI && Plansza.pola.get(x+1).get(y).hero == null) {
			return new Pozycja(x+1, y);
		}
		else if (x-1 >= 0 && Plansza.pola.get(x-1).get(y).hero == null) {
			return new Pozycja(x-1, y);
		}
		Pozycja p = new Pozycja(x, y-1);
		p = p.zwrocPustegoSasiada();
		return p;
	}
}

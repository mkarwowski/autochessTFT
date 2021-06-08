package tft;

import java.util.TimerTask;

import plansza.Plansza;


import java.awt.Color;
import java.util.ArrayList;
import java.util.Timer;

public class Spell {
	double castTime = 0.4;
	double wspAP = 1;
	int dodAP = 0;
	long colorDuration = 800;
	public Spell(Hero h) {
		h.effects.add(new Effect(h, "Nomana", castTime));
		if (h.nazwa == "Aatrox") {
			int dmg;
			if (h.lvl == 1) {
				dmg = (int) ((300+dodAP)*wspAP);
			}
			else if(h.lvl == 2) {
				dmg = (int) ((600+dodAP)*wspAP);
			}
			else {
				dmg = (int) ((1200+dodAP)*wspAP);
			}
			Plansza.pola.get(h.pozycja.getX()).get(h.pozycja.getY()).setBackground(h.spellColor);
			Timer t2 = new Timer();
			t2.schedule(h.new przywrocKolor(), colorDuration);
			h.action.cancel();
			h.action = new Timer();
			h.action.schedule(new TimerTask(){
				public void run() {
					ArrayList<Pozycja> field = new ArrayList<Pozycja>();
					field = createSqField(h.target.pozycja, 3);
					zadajDmgNaFieldzie(h, field, dmg);
				}}, (long)(castTime*1000));
		} 
		
		
		else if (h.nazwa == "Amumu") {
			int dmg;
			double duration;
			if (h.lvl == 1) {
				dmg = (int) ((100+dodAP)*wspAP);
				duration = 1.5;
			}
			else if(h.lvl == 2) {
				dmg = (int) ((200+dodAP)*wspAP);
				duration = 2;
			}
			else {
				dmg = (int) ((1337+dodAP)*wspAP);
				duration = 3;
			}
			Plansza.pola.get(h.pozycja.getX()).get(h.pozycja.getY()).setBackground(h.spellColor);
			Timer t2 = new Timer();
			t2.schedule(h.new przywrocKolor(), colorDuration);
			h.action.cancel();
			h.action = new Timer();
			h.action.schedule(new TimerTask(){
				public void run() {
					ArrayList<Pozycja> field = new ArrayList<Pozycja>();
					field = createNoCornerSqField(h.pozycja, 5);
					zadajDmgNaFieldzie(h, field, dmg);
					stunField(h, field, duration);
					Timer t = new Timer();
					t.schedule(h.new przywrocKolor(), colorDuration);
				}}, (long)(castTime*1000));
		}
		else if (h.nazwa == "Annie") {
			int dmg;
			if (h.lvl == 1) {
				dmg = (int) ((100+dodAP)*wspAP);
			}
			else if(h.lvl == 2) {
				dmg = (int) ((200+dodAP)*wspAP);
			}
			else {
				dmg = (int) ((300+dodAP)*wspAP);
			}
			Plansza.pola.get(h.pozycja.getX()).get(h.pozycja.getY()).setBackground(h.spellColor);
			Timer t2 = new Timer();
			t2.schedule(h.new przywrocKolor(), colorDuration);
			h.action.cancel();
			h.action = new Timer();
			h.action.schedule(new TimerTask(){
				public void run() {
					ArrayList<Pozycja> field = new ArrayList<Pozycja>();
					field = createNoCornerSqField(h.target.pozycja, 3);
					zadajDmgNaFieldzie(h, field, dmg);
					przywolaj(h, h.target.pozycja, new Hero("Tibbers", h.lvl));
					h.effects.add(new Effect(h, "Nomana", 2));
					Timer t = new Timer();
					t.schedule(h.new przywrocKolor(), colorDuration);
				}}, (long)(castTime*1000));
		}
		
		
		else if (h.nazwa == "Vladimir") {
			int dmg;
			if (h.lvl == 1) {
				dmg = (int) ((200+dodAP)*wspAP);
			}
			else if(h.lvl == 2) {
				dmg = (int) ((350+dodAP)*wspAP);
			}
			else {
				dmg = (int) ((500+dodAP)*wspAP);
			}
			Plansza.pola.get(h.pozycja.getX()).get(h.pozycja.getY()).setBackground(h.spellColor);
			Timer t = new Timer();
			t.schedule(h.new przywrocKolor(), colorDuration);
			h.action.cancel();
			h.action = new Timer();
			h.action.schedule(new TimerTask(){
				public void run() {
					h.target.takeAPDamage(dmg);
					h.heal((int)(dmg*h.target.getMagicResist()));
				}}, (long)(castTime*1000));
		} 
		if (h.getHP() > 0) {
			if(h.target != null && h.pozycja.czyWZasiegu(h.target.pozycja, h.zasieg)) {
    			h.uderzenie();
    		}
        	else {
        		h.wybierzTarget();
        		h.idzIAtakuj();
        	}
		}
		else {
			h.umieranie();
		}
		h.setMana(0);
	}
	
	void przywolaj(Hero h, Pozycja p, Hero nowy) {
		while (p.czyZajeta()) {
			p = p.zwrocPustegoSasiada();
		}
		nowy.czyPrzeciwnik = h.czyPrzeciwnik;
		Plansza.pola.get(p.getX()).get(p.getY()).addHero(nowy);
		nowy.idzIAtakuj();
	}
	
	void zadajDmgNaFieldzie(Hero h, ArrayList<Pozycja> field, int dmg) {
		for (int i = 0; i < field.size(); i++) {
			Plansza.pola.get(field.get(i).getX()).get(field.get(i).getY()).setBackground(h.spellColor);
			if (Plansza.pola.get(field.get(i).getX()).get(field.get(i).getY()).hero != null && 
			h.czyPrzeciwnik !=Plansza.pola.get(field.get(i).getX()).get(field.get(i).getY()).hero.czyPrzeciwnik) {
				Plansza.pola.get(field.get(i).getX()).get(field.get(i).getY()).hero.takeAPDamage(dmg);
			}
		}
		Timer t1 = new Timer();
		t1.schedule(new przywrocKolorNaFieldzie(field), colorDuration);
	}
	
	void stunField(Hero h, ArrayList<Pozycja> field, double duration) {
		for (int i = 0; i < field.size(); i++) {
			Hero temp = Plansza.pola.get(field.get(i).getX()).get(field.get(i).getY()).hero;
			if (temp != null && h.czyPrzeciwnik != temp.czyPrzeciwnik) {
				new Effect(temp, "Stun", duration);
			}
		}
	}
	
	class przywrocKolorNaFieldzie extends TimerTask {
		ArrayList<Pozycja> field;
		public przywrocKolorNaFieldzie(ArrayList<Pozycja> field) {
			super();
			this.field = field;
		}
        public void run() {
        	for (int i = 0; i < field.size(); i++) {
    			if (Plansza.pola.get(field.get(i).getX()).get(field.get(i).getY()).hero == null) {
    				Plansza.pola.get(field.get(i).getX()).get(field.get(i).getY()).setBackground(Color.white);
    			}
    			else {
    				if (!Plansza.pola.get(field.get(i).getX()).get(field.get(i).getY()).hero.czyPrzeciwnik)
    					Plansza.pola.get(field.get(i).getX()).get(field.get(i).getY()).setBackground(Plansza.pola.get(field.get(i).getX()).get(field.get(i).getY()).hero.color);
    				else 
    					Plansza.pola.get(field.get(i).getX()).get(field.get(i).getY()).setBackground(Color.red);
    			}
    		}
        }
    }
	
	ArrayList<Pozycja> createSqField(Pozycja p, int x) {//tworzy kwadratowy field x na x (x nieparzysty)
		ArrayList<Pozycja> field = new ArrayList<Pozycja>();
		int z = (x-1)/2;
		for (int i = -z; i <= z; i++) {
			for (int j = -z; j <= z; j++) {
				if (p.getX()+i >= 0 && p.getX()+i < Plansza.polaSizeI && p.getY()+j >= 0 && p.getY()+j < Plansza.polaSizeJ)
					field.add(new Pozycja(p.getX()+i, p.getY()+j));
			}
		}
		
		return field;
	}
	
	ArrayList<Pozycja> createNoCornerSqField(Pozycja p, int x) {//tworzy kwadratowy field x na x (x nieparzysty) z odcietymi rogami
		ArrayList<Pozycja> field = new ArrayList<Pozycja>();
		int z = (x-1)/2;
		for (int i = -z; i <= z; i++) {
			for (int j = -z; j <= z; j++) {
				if ((i == -z && j == -z) || (i==z && j == z) || (i == -z && j == z) || (i == z && j == -z)) {}
				else if (p.getX()+i >= 0 && p.getX()+i < Plansza.polaSizeI && p.getY()+j >= 0 && p.getY()+j < Plansza.polaSizeJ) {
						field.add(new Pozycja(p.getX()+i, p.getY()+j));
				}
			}
		}
		return field;
	}
}

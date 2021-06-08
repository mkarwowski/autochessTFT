package plansza;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import tft.Hero;
import tft.Okno;

@SuppressWarnings("serial")
public class Pole extends JButton {
	public Hero hero;
	int x;
	int y;
	
	
	public Pole(int i, int j) {
		super();
		setBackground(Color.white);
		x = i;
		y = j;
		addActionListener(new AL());
		if (i == 5 && j == 5) {
			setBackground(Color.red);
			hero = new Hero("Vladimir", 1);
			setText(hero.nazwa);
			hero.czyPrzeciwnik = true;
			hero.nowaPozycja(x, y);
		}
		else if (i == 6 && j == 1) {
			setBackground(Color.red);
			hero = new Hero("Amumu", 1);
			setText(hero.nazwa);
			hero.czyPrzeciwnik = true;
			hero.nowaPozycja(x, y);
		}
		else if (i == 4 && j == 3) {
			setBackground(Color.red);
			hero = new Hero("Nasus", 2);
			
			setText(hero.nazwa);
			hero.czyPrzeciwnik = true;
			hero.nowaPozycja(x, y);
		}
	}
	
	public void addHero(Hero h) {
		hero = h;
		setText(h.nazwa);
		setBackground(h.color);
		hero.nowaPozycja(x, y);
	}
	
	public void setToBegin(boolean czyBoard) {
		if (czyBoard) {
			Plansza.pola.get(Plansza.x).get(Plansza.y).setText("");
			Plansza.pola.get(Plansza.x).get(Plansza.y).setBackground(Color.white);
			Plansza.pola.get(Plansza.x).get(Plansza.y).hero = null;
		}
		else {
			Okno.jbLawka.get(Plansza.y).setBackground(null);
			Okno.jbLawka.get(Plansza.y).setText("");
			Okno.team.board.add(Okno.team.lawka.get(Plansza.y));
			Okno.team.lawka.remove(Plansza.y);
			
		}
	}
	
	public void setToBeginXY(int a, int b) {
		Plansza.pola.get(a).get(b).setText("");
		Plansza.pola.get(a).get(b).setBackground(Color.white);
		Plansza.pola.get(a).get(b).hero = null;
	}
	
	public void setXY() {
		Plansza.x = x;
		Plansza.y = y;
	}
	
	class AL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
			if (!Plansza.choosedPole && hero!=null) {
				setBackground(Color.yellow);
				Plansza.choosedPole = true;
			}
			else if (Plansza.x == x && Plansza.y == y) {
				Plansza.choosedPole = false;
				setBackground(Color.red);
			}
			else if (Plansza.choosedPole && hero==null && Plansza.x >= 0) {
				addHero(Plansza.pola.get(Plansza.x).get(Plansza.y).hero);
				setToBegin(true);
				Plansza.choosedPole = false;
			}
			else if (Plansza.choosedPole && hero==null && Plansza.x < 0 && Okno.team.boardSize > Okno.team.board.size()) {
				addHero(Okno.team.lawka.get(Plansza.y));				
				setToBegin(false);
				Plansza.choosedPole = false;
				Okno.aktualizacjaLawki();
				Okno.aktualizacjaOrigin(Okno.team);
			}
			else if (Plansza.choosedPole && hero!=null && Plansza.x >= 0) {
				Hero temp = Plansza.pola.get(Plansza.x).get(Plansza.y).hero;
				Plansza.pola.get(Plansza.x).get(Plansza.y).addHero(hero);
				addHero(temp);
				Plansza.choosedPole = false;
			}
			else if (Plansza.choosedPole && hero!=null && Plansza.x < 0) {
				Hero temp = Okno.team.lawka.get(Plansza.y);
				Okno.team.lawka.remove(Plansza.y);
				Okno.team.lawka.add(hero);
				Okno.team.board.remove(hero);
				addHero(temp);
				Okno.team.board.add(temp);
				Okno.aktualizacjaOrigin(Okno.team);
				
				Plansza.choosedPole = false;
				Okno.aktualizacjaLawki();
			}
			else if (Okno.team.boardSize <= Okno.team.board.size() && Plansza.x < 0) {
				Plansza.choosedPole = false;
			}
			setXY();
		}
	}
}

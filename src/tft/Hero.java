package tft;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;

import java.awt.Color;
import java.lang.Math;

import plansza.Plansza;

public class Hero {
	int AD;
	int base_AD;
	int AP;
	int base_AP;
	int HP;
	int base_HP;
	int maxHP;
	int mana;
	int maxMana;
	double armor;
	double base_armor;
	double magicResist;
	double base_magicResist;
	double wspMana;
	
	Effects effects = new Effects();
	
	Timer action;
	
	Spell spell;
	
	public Color color;
	public Color spellColor;
	
	public ArrayList<RelacjeCh> related = new ArrayList<RelacjeCh>();
	
	int lvl;
	int cost;
	int re;
	
	double attackSpeed;
	double base_attackSpeed;
	
	double lifeStealAtak;
	double lifeStealSpell;

	double base_lifeStealAtak;
	double base_lifeStealSpell;
	
	double crit;
	double critPower;
	
	double unik;
	
	public int startingX;
	public int startingY;
	
	public Pozycja pozycja;
	
	int base_zasieg;
	int zasieg;
	double base_szybkosc;
	double szybkosc;
	
	Hero target;
	public boolean czyPrzeciwnik;
	//ImageIcon img;
	
	Klasa klasa;
	public String nazwa;
	
	public int getAD() {
		return AD;
	}
	
	public void setAD(int aD) {
		if (aD > 0) AD = aD;
		else AD = 0;
	}

	public int getBase_AD() {
		return base_AD;
	}

	public void setBase_AD(int base_AD) {
		if (base_AD > 0) {
			this.base_AD = base_AD;
		}
		else this.base_AD = 0;
	}

	public int getAP() {
		return AP;
	}

	public void setAP(int aP) {
		if (aP > 0) AP = aP;
		else AP = 0;
	}

	public int getBase_AP() {
		return base_AP;
	}

	public void setBase_AP(int base_AP) {
		if (base_AP > 0) this.base_AP = base_AP;
		else this.base_AP = 0;
		
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		if (hP > 0 && hP <= maxHP) HP = hP;
		else if (hP > maxHP) HP = maxHP;
		else HP = 0;
		Plansza.pola.get(pozycja.getX()).get(pozycja.getY()).setText(nazwa + " " + HP + " " + mana);
	}

	public int getBase_HP() {
		return base_HP;
	}

	public void setBase_HP(int base_HP) {
		if (base_HP > 0) this.base_HP = base_HP;
		else this.base_HP = 0;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int maxHP) {
		if (maxHP > 0) this.maxHP = maxHP;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		if (mana > 0) this.mana = mana;
		else this.mana = 0;
		Plansza.pola.get(pozycja.getX()).get(pozycja.getY()).setText(nazwa + " " + HP + " " + mana);
	}

	public int getMaxMana() {
		return maxMana;
	}

	public double getArmor() {
		return armor;
	}

	public void setArmor(double armor) {
		if (armor > 0 && armor < 1) this.armor = armor;
		else if (armor <= 0) this.armor = 0;
		else this.armor = 0.9999;
	}

	public double getBase_armor() {
		return base_armor;
	}

	public void setBase_armor(double base_armor) {
		if (base_armor > 0 && base_armor < 1) this.base_armor = base_armor;
		else if (base_armor <= 0) this.base_armor = 0;
		else this.base_armor = 0.9999;
	}

	public double getMagicResist() {
		return magicResist;
	}

	public void setMagicResist(double magicResist) {
		if (magicResist > 0 && magicResist < 1) this.magicResist = magicResist;
		else if (magicResist <= 0) this.magicResist = 0;
		else this.magicResist = 0.9999;
	}

	public double getBase_magicResist() {
		return base_magicResist;
	}

	public void setBase_magicResist(double base_magicResist) {
		if (base_magicResist > 0 && base_magicResist < 1) this.base_magicResist = base_magicResist;
		else if (base_magicResist <= 0) this.base_magicResist = 0;
		else this.base_magicResist = 0.9999;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public double getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(double attackSpeed) {
		if (attackSpeed > 0 && attackSpeed < 5) this.attackSpeed = attackSpeed;
		else if (attackSpeed <= 0) this.attackSpeed = 0;
		else this.attackSpeed = 5;
	}

	public double getBase_attackSpeed() {
		return base_attackSpeed;
	}

	public void setBase_attackSpeed(double base_attackSpeed) {
		if (base_attackSpeed > 0 && base_attackSpeed < 5) this.base_attackSpeed = base_attackSpeed;
		else if (base_attackSpeed <= 0) this.base_attackSpeed = 0;
		else this.base_attackSpeed = 5;
	}

	public double getLifeStealAtak() {
		return lifeStealAtak;
	}

	public void setLifeStealAtak(double lifeStealAtak) {
		if (lifeStealAtak > 0) this.lifeStealAtak = lifeStealAtak;
		else this.lifeStealAtak = 0;
	}

	public double getLifeStealSpell() {
		return lifeStealSpell;
	}

	public void setLifeStealSpell(double lifeStealSpell) {
		if (lifeStealSpell > 0) this.lifeStealSpell = lifeStealSpell;
		else this.lifeStealSpell = 0;
	}

	public double getBase_lifeStealAtak() {
		return base_lifeStealAtak;
	}

	public void setBase_lifeStealAtak(double base_lifeStealAtak) {
		if (base_lifeStealAtak > 0) this.base_lifeStealAtak = base_lifeStealAtak;
		else this.base_lifeStealAtak = 0;
	}

	public double getBase_lifeStealSpell() {
		return base_lifeStealSpell;
	}

	public void setBase_lifeStealSpell(double base_lifeStealSpell) {
		if (base_lifeStealSpell > 0) this.base_lifeStealSpell = base_lifeStealSpell;
		else this.base_lifeStealSpell = 0;
	}

	public double getCrit() {
		return crit;
	}

	public void setCrit(double crit) {
		if (crit > 0 && crit < 1) this.crit = crit;
		else if (crit <= 0) this.crit = 0;
		else this.crit = 1;
	}

	public double getCritPower() {
		return critPower;
	}

	public void setCritPower(double critPower) {
		if (critPower > 1) this.critPower = critPower;
		else this.critPower = 1;
	}

	public double getUnik() {
		return unik;
	}

	public void setUnik(double unik) {
		if (unik > 0 && unik < 1) this.unik = unik;
		else if (unik <= 0) this.unik = 0;
		else this.unik = 1;
	}

	public int getBase_zasieg() {
		return base_zasieg;
	}

	public void setBase_zasieg(int base_zasieg) {
		if (base_zasieg > 0) this.base_zasieg = base_zasieg;
		else this.base_zasieg = 0;
	}

	public double getBase_szybkosc() {
		return base_szybkosc;
	}

	public void setBase_szybkosc(double base_szybkosc) {
		if (base_szybkosc > 0 && base_szybkosc < 3) this.base_szybkosc = base_szybkosc;
		else if (base_szybkosc <= 0) this.base_szybkosc = 0;
		else this.base_szybkosc = 3;
	}

	public double getSzybkosc() {
		return szybkosc;
	}

	public void setSzybkosc(double szybkosc) {
		if (szybkosc > 0 && szybkosc < 3) this.szybkosc = szybkosc;
		else if (szybkosc <= 0) this.szybkosc = 0;
		else this.szybkosc = 3;
	}

	public Hero getTarget() {
		return target;
	}

	public void setTarget(Hero target) {
		this.target = target;
	}

	public Klasa getKlasa() {
		return klasa;
	}

	public void setKlasa(Klasa klasa) {
		this.klasa = klasa;
	}

	public int getZasieg() {
		return zasieg;
	}
	
	public void setZasieg(int zasieg) {
		if (zasieg > 0) this.zasieg = zasieg;
		else this.zasieg = 0;
	}
	
	public void setWspMana(double i) {
		if (wspMana >= 0) this.wspMana = i;
		else wspMana = 0;
	}
	
	protected ImageIcon createImageIcon(String path, String description) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		}
		else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
	
	void setColor() {
		if (cost == 1) color = new Color(130,130,130);
		else if (cost == 2) color = new Color(52,200,52);
		else if (cost == 3) color = new Color(0,102,204);
		else if (cost == 4) color = new Color(154,51,255);
		else if (cost == 5) color = new Color(170,170,0);
		else if (cost == 7) color = new Color(174,245,255);
	}
	
	
	void takeADDamage(int dmg) {
		int zadane = dmg - (int)(dmg*armor);
		if (zadane < HP) {
			setHP(HP - zadane);
			Plansza.pola.get(pozycja.getX()).get(pozycja.getY()).setBackground(Color.black);
			przyznanieMany(dmg, zadane);
			Timer t = new Timer();
			t.schedule(new przywrocKolor(), 100);
		}
		else {
			umieranie();
		}
	}
	
	public void takeAPDamage(int dmg) {
		int zadane = dmg - (int)(dmg*magicResist);
		System.out.println(nazwa + " (" + HP + ") otrzyma³ obrazenia AP: " + zadane);
		if (zadane < HP) {
			setHP(HP - zadane);
			przyznanieMany(dmg, zadane);
		}
		else {
			umieranie();
		}
	}
	

	class przywrocKolor extends TimerTask {
        public void run() {
        	if (HP > 0) {
        		if (!czyPrzeciwnik) Plansza.pola.get(pozycja.getX()).get(pozycja.getY()).setBackground(color);
        		else Plansza.pola.get(pozycja.getX()).get(pozycja.getY()).setBackground(Color.red);
        	}
        	else Plansza.pola.get(pozycja.getX()).get(pozycja.getY()).setBackground(Color.white);
        	cancel();
        }
    }
	
	String opis() {
		String str = "<html>" + nazwa + " (" + lvl + ")<br/>HP: " + HP + "<br/>AD: " + AD + "<br/>AP: " + AP + "<br/>Nieuchronne AD: " + 
				"<br/>Armor: " + armor + "<br/>Magic resist: "
			+ magicResist + "<br/>Attack speed: " + attackSpeed + "/s<br/>Lifesteal attack: " + lifeStealAtak*100 + "%<br/>Lifesteal spell: " + lifeStealSpell*100 
			+"<br/>Crit chance: " + crit*100 + 
			"%<br/>Crit power: " + critPower*100 + "%<br/>Szansa na unik: " + unik*100 + "%</html>";
		return str;
	}
	
	
	public void nowaPozycja(int a, int b) {
		pozycja = new Pozycja(a,b);
	}
	
	
	public void wybierzTarget() {
		if (HP > 0 ) {
			target = null;
			Pozycja targ = new Pozycja(pozycja.getX(), pozycja.getY());
			ArrayList<Pozycja> array = new ArrayList<Pozycja>();
			array.add(targ);
			ArrayList<Pozycja> odwiedzone = new ArrayList<Pozycja>();
			odwiedzone.add(targ);
			int j = 0;
			while (target == null && !array.isEmpty()) {
				j++;
				szukanieTarget(array, odwiedzone);
			}
			
		}
	}
	
	
	void szukanieTarget(ArrayList<Pozycja> array, ArrayList<Pozycja> odwiedzone) {
		Pozycja targ = array.get(0);
		targ.plusX();
		if (targ.getX() < Plansza.polaSizeI) {
			if (Plansza.pola.get(targ.getX()).get(targ.getY()).hero != null &&
					czyPrzeciwnik != Plansza.pola.get(targ.getX()).get(targ.getY()).hero.czyPrzeciwnik) {
				target = Plansza.pola.get(targ.getX()).get(targ.getY()).hero;
				return;
			}
			else {
				boolean znalezione = false;
				for (int i = 0; i < odwiedzone.size() - 1; i++) {
					if (targ.czyRowne(odwiedzone.get(i))) {
						znalezione = true;
						break;
					}
				}
				if (!znalezione) {
					array.add(new Pozycja(targ.getX(), targ.getY()));
					odwiedzone.add(new Pozycja(targ.getX(), targ.getY()));
				}
			}
		}
		targ.minusX();
		targ.minusX();
		if (targ.getX() >= 0) {
			if (Plansza.pola.get(targ.getX()).get(targ.getY()).hero != null && 
					czyPrzeciwnik != Plansza.pola.get(targ.getX()).get(targ.getY()).hero.czyPrzeciwnik) {
				target = Plansza.pola.get(targ.getX()).get(targ.getY()).hero;
				return;
			}
			else {
				boolean znalezione = false;
				for (int i = 0; i < odwiedzone.size() - 1; i++) {
					if (targ.czyRowne(odwiedzone.get(i))) {
						znalezione = true;
						break;
					}
				}
				if (!znalezione) {
					array.add(new Pozycja(targ.getX(), targ.getY()));
					odwiedzone.add(new Pozycja(targ.getX(), targ.getY()));
				}
			}
		}
		targ.plusX();
		targ.minusY();
		if (targ.getY() >= 0) {
			if (Plansza.pola.get(targ.getX()).get(targ.getY()).hero != null && 
					czyPrzeciwnik != Plansza.pola.get(targ.getX()).get(targ.getY()).hero.czyPrzeciwnik) {
				target = Plansza.pola.get(targ.getX()).get(targ.getY()).hero;
				return;
			}
			else {
				boolean znalezione = false;
				for (int i = 0; i < odwiedzone.size() - 1; i++) {
					if (targ.czyRowne(odwiedzone.get(i))) {
						znalezione = true;
						break;
					}
				}
				if (!znalezione) {
					array.add(new Pozycja(targ.getX(), targ.getY()));
					odwiedzone.add(new Pozycja(targ.getX(), targ.getY()));
				}
			}
		}
		targ.plusY();
		targ.plusY();
		if (targ.getY() < Plansza.polaSizeJ) {
			if (Plansza.pola.get(targ.getX()).get(targ.getY()).hero != null &&
					czyPrzeciwnik != Plansza.pola.get(targ.getX()).get(targ.getY()).hero.czyPrzeciwnik) {
				target = Plansza.pola.get(targ.getX()).get(targ.getY()).hero;
				return;
			}
			else {
				boolean znalezione = false;
				for (int i = 0; i < odwiedzone.size() - 1; i++) {
					if (targ.czyRowne(odwiedzone.get(i))) {
						znalezione = true;
						break;
					}
				}
				if (!znalezione) {
					array.add(new Pozycja(targ.getX(), targ.getY()));
					odwiedzone.add(new Pozycja(targ.getX(), targ.getY()));
				}
			}
		}
		targ.minusY();
		array.remove(0);
	}
	
	public void idzIAtakuj() {
		if (mana < maxMana) ruszanie();
		else new Spell(this);
	}
	
	public void zmianaPozycji(Pozycja p) {
		if (Plansza.pola.get(p.getX()).get(p.getY()).hero == null && p.czyWPlanszy()) {
			nowaPozycja(p);
		}
		else {
			omin(p);
		}
	}
	
	public void nowaPozycja(Pozycja p) {
		Plansza.pola.get(pozycja.getX()).get(pozycja.getY()).setBackground(Color.white);
		Plansza.pola.get(pozycja.getX()).get(pozycja.getY()).setText("");
		Plansza.pola.get(pozycja.getX()).get(pozycja.getY()).hero = null;
		pozycja = new Pozycja(p);
		Plansza.pola.get(pozycja.getX()).get(pozycja.getY()).hero = this;
		if (!czyPrzeciwnik) Plansza.pola.get(pozycja.getX()).get(pozycja.getY()).setBackground(color);
		else Plansza.pola.get(pozycja.getX()).get(pozycja.getY()).setBackground(Color.red);
		Plansza.pola.get(pozycja.getX()).get(pozycja.getY()).setText(nazwa + " " + HP + " " + mana);
	}
	
	public void ruszanie() {
		if (target != null) {
			int targetX = target.pozycja.getX();
			int targetY = target.pozycja.getY();
			int roznicaX = targetX - pozycja.getX();
			int roznicaY = targetY - pozycja.getY();
			
			if (roznicaX > 0) {//w dol
				if (roznicaX > Math.abs(roznicaY)) {
					Pozycja p = new Pozycja(pozycja.getX() + 1, pozycja.getY());
					action = new Timer();
					action.schedule(new ruchTimerTask(p), (long) (szybkosc*1000));
				}
				else {
					if (roznicaY > 0) {
						Pozycja p = new Pozycja(pozycja.getX(), pozycja.getY() + 1);
						action = new Timer();
						action.schedule(new ruchTimerTask(p), (long) (szybkosc*1000));
					}
					else {
						Pozycja p = new Pozycja(pozycja.getX(), pozycja.getY() - 1);
						action = new Timer();
						action.schedule(new ruchTimerTask(p), (long) (szybkosc*1000));
					}
					
				}
			}
			else {
				if (Math.abs(roznicaX) > Math.abs(roznicaY)) {
					Pozycja p = new Pozycja(pozycja.getX()-1, pozycja.getY());
					action = new Timer();
					action.schedule(new ruchTimerTask(p), (long) (szybkosc*1000));
				}
				else {
					if (roznicaY > 0) {
						Pozycja p = new Pozycja(pozycja.getX(), pozycja.getY() + 1);
						action = new Timer();
						action.schedule(new ruchTimerTask(p), (long) (szybkosc*1000));
					}
					else {
						Pozycja p = new Pozycja(pozycja.getX(), pozycja.getY() - 1);
						action = new Timer();
						action.schedule(new ruchTimerTask(p), (long) (szybkosc*1000));
					}
				}
			}
		}
		else {
			wybierzTarget();
			if (target == null) Plansza.pola.get(0).get(0).setText(nazwa);
			ruszanie();
		}
	}
	
	class ruchTimerTask extends TimerTask {
		Pozycja poz;
		public ruchTimerTask(Pozycja p) {
			super();
			poz = new Pozycja(p);
		}
        public void run() {
        	if (Plansza.pola.get(poz.getX()).get(poz.getY()).hero == null) {
        		
        		if(pozycja.czyWZasiegu(target.pozycja, zasieg)) {
            		uderzenie();
            		cancel();
            	}
            	else {
            		zmianaPozycji(poz);
            		wybierzTarget();
            		ruszanie();
            		cancel();
            	}
        	}
        	else {
        		if(pozycja.czyWZasiegu(target.pozycja, zasieg)) {
            		uderzenie();
            		cancel();
            	}
            	else {
            		omin(poz);
            		wybierzTarget();
            		ruszanie();
            		cancel();
            	}
        		
        	}
        	
        }
    }
	
	void omin(Pozycja poz) {
		int gdzieSasiad = zKtorejStronySasiaduje(poz);
		int czyPlus = czyPlus(gdzieSasiad);
		if (czyPlus == 0) {//zwiekszamy X
			Pozycja temp = new Pozycja(pozycja);
			temp.plusX();
			zmianaPozycji(temp);
		}
		else if (czyPlus == 1) {//zmniejszamy X
			Pozycja temp = new Pozycja(pozycja);
			temp.minusX();
			zmianaPozycji(temp);
		}
		else if (czyPlus == 2) {//zwiêkszamy Y
			Pozycja temp = new Pozycja(pozycja);
			temp.plusY();
			zmianaPozycji(temp);
		}
		else if (czyPlus == 3) {//zmniejszamy Y
			Pozycja temp = new Pozycja(pozycja);
			temp.minusY();
			zmianaPozycji(temp);
		}
		else {
		}
	}
	
	int zKtorejStronySasiaduje(Pozycja poz) {
		Pozycja roznica = new Pozycja(pozycja, poz);
		
		if (roznica.getX() == 0) {
			if (roznica.getY() == 1) {
				return 0;//prawo
			}
			else if (roznica.getY() == -1){
				return 1;//lewo
			}
		}
		else if (roznica.getY() == 0) {
			if (roznica.getX() == 1) {
				return 2;//dol
			}
			else if (roznica.getX() == -1) {
				return 3;//gora
			}
		}
		return -1;//blad
	}
	
	int czyPlus(int gdzieSasiad) {
		Pozycja roznica = new Pozycja(pozycja, target.pozycja);
		if (gdzieSasiad == 0 || gdzieSasiad == 1) {
			if (roznica.getX() == 1) {
				return 0;//true, X
			}
			else {
				return 1;//false, X
			}
		}
		else if (gdzieSasiad == 2 || gdzieSasiad == 3) {
			if (roznica.getY() == 1) {
				return 2;//true Y
			}
			else {
				return 3;//false Y
			}
		}
		return -1;//blad
	}
	
	void uderzenie() {
		if (target != null) {
			action = new Timer();
			action.schedule(new uderzenieTimerTask(), (long) (1000*1.0/attackSpeed));
		}
		else {
			wybierzTarget();
    		idzIAtakuj();
		}
	}
	
	void przyznanieMany(int m) {
		setMana(mana + (int)(m*wspMana));
		if (mana >= maxMana) {
			action.cancel();
			new Spell(this);
			setMana(0);
		}
	}
	
	void przyznanieMany(int dmg, int dmg2) {
		int m = (int)(wspMana*((0.01*dmg) + (0.06*dmg2)));
		if (m > 42) {
			m = 42;
		}
		setMana(mana + m);
		if (mana >= maxMana) {
			action.cancel();
			new Spell(this);
			setMana(0);
		}
	}
	
	class uderzenieTimerTask extends TimerTask {
        public void run() {
        	if(target != null && target.HP > 0 && pozycja.czyWZasiegu(target.pozycja, zasieg)) {
    			target.takeADDamage(AD);
    			przyznanieMany(10);
    			uderzenie();
    			cancel();
    		}
        	else {
        		wybierzTarget();
        		idzIAtakuj();
        		cancel();
        	}
        }
    }
	
	public void heal(int heal) {
		setHP(HP + heal);
	}
	
	void umieranie() {
		HP = 0;
		Plansza.pola.get(pozycja.getX()).get(pozycja.getY()).setToBeginXY(pozycja.getX(), pozycja.getY());
		action.cancel();
		action.purge();
		target = null;
		if (spell != null) {

		}
	}
	
	void przypisanie() {
		base_lifeStealAtak = 0;
		base_lifeStealSpell = 0;
		crit = 0.1;
		critPower = 1.5;
		unik = 0;
		czyPrzeciwnik = false;
		base_zasieg = 1;
		base_szybkosc = 1;
		mana = 0;
		wspMana = 1;
	}	
	
	void baseToTemp() {
		HP = base_HP;
		maxHP = base_HP;
		AD = base_AD;
		AP = base_AP;
		attackSpeed = base_attackSpeed;
		lifeStealAtak = base_lifeStealAtak;
		lifeStealSpell = base_lifeStealSpell;
		szybkosc = base_szybkosc;
		zasieg = base_zasieg;
		armor = base_armor;
		magicResist = base_magicResist;
	}
	
	void relacje(String ch) {
		if(ch =="Aatrox") {
			related.add(new RelacjeCh("Yasuo", 1));
			related.add(new RelacjeCh("Master Yi", 1));
			related.add(new RelacjeCh("Sivir", 7));
			related.add(new RelacjeCh("Jax", 1));
			related.add(new RelacjeCh("Soraka", 4));
			related.add(new RelacjeCh("Yorick", 8));
		}
		else if(ch =="Amumu") {
			related.add(new RelacjeCh("Taric", 12));
			related.add(new RelacjeCh("Malphite", 1));
			related.add(new RelacjeCh("Brand", 1));
			related.add(new RelacjeCh("Annie", 1));
			related.add(new RelacjeCh("Master Yi",5));
			related.add(new RelacjeCh("Singed", 5));
			related.add(new RelacjeCh("Nami", 5));
		}
		else if(ch =="Annie") {
			related.add(new RelacjeCh("Brand", 4));
			related.add(new RelacjeCh("Zed", 8));
			related.add(new RelacjeCh("Kindred", 1));
			related.add(new RelacjeCh("Master Yi",2));
			related.add(new RelacjeCh("Azir", 1));
			related.add(new RelacjeCh("Yorick", 5));
			related.add(new RelacjeCh("Amumu", 8));
		}
		else if(ch =="Ashe") {
			related.add(new RelacjeCh("Taric", 7));
			related.add(new RelacjeCh("Twitch", 8));
			related.add(new RelacjeCh("Ezreal", 1));
			related.add(new RelacjeCh("Kindred", 1));
			related.add(new RelacjeCh("Skarner", 1));
		}
		else if(ch =="Azir") {
			related.add(new RelacjeCh("Khazix", 7));
			related.add(new RelacjeCh("Sivir", 7));
			related.add(new RelacjeCh("Annie", 7));
			related.add(new RelacjeCh("Malzahar", 1));
			related.add(new RelacjeCh("Zed",1));
			related.add(new RelacjeCh("Yorick", 7));
		}
		else if(ch =="Brand") {
			related.add(new RelacjeCh("Annie", 6));
			related.add(new RelacjeCh("Veigar", 1));
			related.add(new RelacjeCh("Kindred", 1));
			related.add(new RelacjeCh("Qiyana", 1));
			related.add(new RelacjeCh("Malphite", 2));
			related.add(new RelacjeCh("Amumu", 8));
			related.add(new RelacjeCh("Nautilius", 1));
		}
		else if(ch =="Braum") {
			related.add(new RelacjeCh("Ezreal", 7));
			related.add(new RelacjeCh("Nautilius", 7));
			related.add(new RelacjeCh("Thresh", 3));
			related.add(new RelacjeCh("Nasus", 1));
			related.add(new RelacjeCh("Leona", 1));
			related.add(new RelacjeCh("Orn", 1));
			related.add(new RelacjeCh("Malphite", 1));
			related.add(new RelacjeCh("Olaf", 1));
			related.add(new RelacjeCh("Volibear", 7));
		}
		else if(ch =="Diana") {
			related.add(new RelacjeCh("Nocturne", 1));
			related.add(new RelacjeCh("Qiyana", 1));
			related.add(new RelacjeCh("LeBlanc", 7));
			related.add(new RelacjeCh("Zyra", 2));
			related.add(new RelacjeCh("Varus", 7));
			related.add(new RelacjeCh("Kindred", 1));
		}
		else if(ch =="Ezreal") {
			related.add(new RelacjeCh("Ashe", 7));
			related.add(new RelacjeCh("Twitch", 7));
			related.add(new RelacjeCh("Braum", 1));
			related.add(new RelacjeCh("Olaf", 7));
			related.add(new RelacjeCh("Volibear", 1));
			related.add(new RelacjeCh("Kindred", 6));
			related.add(new RelacjeCh("Varus", 1));
		}
		else if(ch =="Ivern") {
			related.add(new RelacjeCh("Neeko", 7));
			related.add(new RelacjeCh("Maokai", 3));
			related.add(new RelacjeCh("LeBlanc", 7));
			related.add(new RelacjeCh("Syndra", 2));
			related.add(new RelacjeCh("Vladimir", 1));
			related.add(new RelacjeCh("Diana", 1));
			related.add(new RelacjeCh("Qiyana", 1));
		}
		else if(ch =="Janna") {
			related.add(new RelacjeCh("Yasuo", 1));
			related.add(new RelacjeCh("Karma", 1));
			related.add(new RelacjeCh("Qiyana", 4));
			related.add(new RelacjeCh("Master Yi", 9));
			related.add(new RelacjeCh("Nami", 8));
		}
		else if(ch =="Jax") {
			related.add(new RelacjeCh("Aatrox", 7));
			related.add(new RelacjeCh("Sion", 7));
			related.add(new RelacjeCh("Mundo", 7));
			related.add(new RelacjeCh("Olaf", 1));
			related.add(new RelacjeCh("Soraka", 7));
			related.add(new RelacjeCh("Renekton", 1));
			related.add(new RelacjeCh("Nasus", 1));
			related.add(new RelacjeCh("Vayne", 1));
		}
		else if(ch =="Karma") {
			related.add(new RelacjeCh("Leona", 1));
			related.add(new RelacjeCh("Janna", 9));
			related.add(new RelacjeCh("Master Yi", 1));
			related.add(new RelacjeCh("Nocturne", 2));
			related.add(new RelacjeCh("Qiyana", 3));
			related.add(new RelacjeCh("Soraka", 7));
			related.add(new RelacjeCh("Nami", 1));
		}
		else if(ch =="Khazix") {
			related.add(new RelacjeCh("Nocturne", 1));
			related.add(new RelacjeCh("Zed", 9));
			related.add(new RelacjeCh("Sivir", 1));
			related.add(new RelacjeCh("Azir", 1));
			related.add(new RelacjeCh("Qiyana", 1));
		}
		else if(ch =="Kindred") {
			related.add(new RelacjeCh("Ezreal", 4));
			related.add(new RelacjeCh("Ashe", 7));
			related.add(new RelacjeCh("Twitch", 7));
			related.add(new RelacjeCh("Varus", 1));
			related.add(new RelacjeCh("Brand", 7));
			related.add(new RelacjeCh("Annie", 7));
			related.add(new RelacjeCh("Malzahar", 1));
			related.add(new RelacjeCh("Veigar", 4));
			related.add(new RelacjeCh("Master Yi", 1));
			related.add(new RelacjeCh("Amumu", 1));
			related.add(new RelacjeCh("Sion", 4));
		}
		else if(ch =="Kogmaw") {
			related.add(new RelacjeCh("Reksai", 6));
			related.add(new RelacjeCh("Skarner", 6));
			related.add(new RelacjeCh("Warwick", 4));
			related.add(new RelacjeCh("Mundo", 1));
			related.add(new RelacjeCh("Ezreal", 1));
			related.add(new RelacjeCh("Nocturne", 1));
			related.add(new RelacjeCh("Braum", 1));
		}
		else if(ch =="LeBlanc") {
			related.add(new RelacjeCh("Neeko", 1));
			related.add(new RelacjeCh("Ivern", 1));
			related.add(new RelacjeCh("Maokai", 1));
			related.add(new RelacjeCh("Syndra", 3));
			related.add(new RelacjeCh("Vladimir", 1));
			related.add(new RelacjeCh("Diana", 1));
			related.add(new RelacjeCh("Qiyana", 3));
			related.add(new RelacjeCh("Nocturne", 6));
			related.add(new RelacjeCh("Khazix", 1));
			related.add(new RelacjeCh("Brand", 1));
			related.add(new RelacjeCh("Veigar", 6));
			related.add(new RelacjeCh("Taliyah", 1));
		}
		else if(ch =="Leona") {
			related.add(new RelacjeCh("Nasus", 2));
			related.add(new RelacjeCh("Orn", 2));
			related.add(new RelacjeCh("Karma", 2));
			related.add(new RelacjeCh("Braum", 6));
			related.add(new RelacjeCh("Thresh", 6));
			related.add(new RelacjeCh("Diana", 1));
			related.add(new RelacjeCh("Leblanc", 1));
			related.add(new RelacjeCh("Qiyana", 1));
			related.add(new RelacjeCh("Nautilius", 1));
		}
		else if(ch =="Malphite") {
			related.add(new RelacjeCh("Amumu", 9));
			related.add(new RelacjeCh("Qiyana", 2));
			related.add(new RelacjeCh("Nautilius", 1));
			related.add(new RelacjeCh("Brand", 2));
			related.add(new RelacjeCh("Taric", 9));
			related.add(new RelacjeCh("Taliyah", 1));
		}
		else if(ch =="Malzahar") {
			related.add(new RelacjeCh("Veigar", 6));
			related.add(new RelacjeCh("Kindred", 6));
			related.add(new RelacjeCh("Annie", 2));
			related.add(new RelacjeCh("Sion", 6));
			related.add(new RelacjeCh("Zyra", 1));
			related.add(new RelacjeCh("Azir", 6));
			related.add(new RelacjeCh("Yorick", 1));
		}
		else if(ch =="Maokai") {
			related.add(new RelacjeCh("Neeko", 5));
			related.add(new RelacjeCh("Ivern", 4));
			related.add(new RelacjeCh("LeBlanc", 6));
			related.add(new RelacjeCh("Syndra", 1));
			related.add(new RelacjeCh("Vladimir", 1));
			related.add(new RelacjeCh("Diana", 1));
			related.add(new RelacjeCh("Qiyana", 1));
		}
		else if(ch =="Master Yi") {
			related.add(new RelacjeCh("Taric", 5));
			related.add(new RelacjeCh("Aatrox", 1));
			related.add(new RelacjeCh("Kindred", 1));
			related.add(new RelacjeCh("Sion", 1));
			related.add(new RelacjeCh("Veigar", 1));
			related.add(new RelacjeCh("Amumu", 9));
			related.add(new RelacjeCh("Singed", 5));
			related.add(new RelacjeCh("Nami", 10));
			related.add(new RelacjeCh("Karma", 1));
			related.add(new RelacjeCh("Janna", 6));
		}
		else if(ch =="Mundo") {
			related.add(new RelacjeCh("Twitch", 7));
			related.add(new RelacjeCh("Olaf", 7));
			related.add(new RelacjeCh("Jax", 1));
			related.add(new RelacjeCh("Sion", 4));
			related.add(new RelacjeCh("Volibear", 1));
			related.add(new RelacjeCh("Singed", 1));
			related.add(new RelacjeCh("Renekton", 1));
			related.add(new RelacjeCh("Kogmaw", 1));
		}
		else if(ch =="Nami") {
			related.add(new RelacjeCh("Master Yi", 10));
			related.add(new RelacjeCh("Nautilius", 1));
			related.add(new RelacjeCh("Soraka", 1));
			related.add(new RelacjeCh("Amumu", 8));
			related.add(new RelacjeCh("Singed", 5));
			related.add(new RelacjeCh("Karma", 1));
			related.add(new RelacjeCh("Janna", 6));
		}
		else if(ch =="Nasus") {
			related.add(new RelacjeCh("Orn", 2));
			related.add(new RelacjeCh("Nautilius", 1));
			related.add(new RelacjeCh("Braum", 5));
			related.add(new RelacjeCh("Leona", 2));
			related.add(new RelacjeCh("Vayne", 2));
			related.add(new RelacjeCh("Soraka", 1));
			related.add(new RelacjeCh("Aatrox", 1));
			related.add(new RelacjeCh("Thresh", 5));
		}
		else if(ch =="Nautilius") {
			related.add(new RelacjeCh("Braum", 1));
			related.add(new RelacjeCh("Syndra", 2));
			related.add(new RelacjeCh("Nami", 1));
			related.add(new RelacjeCh("Taric", 1));
			related.add(new RelacjeCh("Thresh", 7));
			related.add(new RelacjeCh("Malphite", 7));
			related.add(new RelacjeCh("Amumu", 1));
			related.add(new RelacjeCh("Qiyana", 3));
		}
		else if(ch =="Neeko") {
			related.add(new RelacjeCh("Maokai", 1));
			related.add(new RelacjeCh("Ivern", 1));
			related.add(new RelacjeCh("LeBlanc", 8));
			related.add(new RelacjeCh("Syndra", 4));
			related.add(new RelacjeCh("Vladimir", 1));
			related.add(new RelacjeCh("Diana", 1));
			related.add(new RelacjeCh("Qiyana", 4));
			related.add(new RelacjeCh("Kindred", 3));
			related.add(new RelacjeCh("Malphite", 1));
		}
		else if(ch =="Nocturne") {
			related.add(new RelacjeCh("Reksai", 2));
			related.add(new RelacjeCh("Qiyana", 4));
			related.add(new RelacjeCh("Khazix", 9));
			related.add(new RelacjeCh("Zed", 1));
			related.add(new RelacjeCh("LeBlanc", 1));
		}
		else if(ch =="Olaf") {
			related.add(new RelacjeCh("Volibear", 3));
			related.add(new RelacjeCh("Ezreal", 1));
			related.add(new RelacjeCh("Mundo", 1));
			related.add(new RelacjeCh("Sion", 1));
			related.add(new RelacjeCh("Khazix", 2));
			related.add(new RelacjeCh("Zed", 2));
			related.add(new RelacjeCh("Taric", 2));
		}
		else if(ch =="Orn") {
			related.add(new RelacjeCh("Volibear", 8));
			related.add(new RelacjeCh("Braum", 6));
			related.add(new RelacjeCh("Leona", 2));
			related.add(new RelacjeCh("Nasus", 2));
			related.add(new RelacjeCh("Thresh", 6));
			related.add(new RelacjeCh("Nautilius", 1));
		}
		else if(ch =="Qiyana") {
			related.add(new RelacjeCh("Nocturne", 4));
			related.add(new RelacjeCh("LeBlanc", 1));
			related.add(new RelacjeCh("Khazix", 8));
			related.add(new RelacjeCh("Zed", 1));
			related.add(new RelacjeCh("Diana", 1));
			related.add(new RelacjeCh("Nautilius", 1));
			related.add(new RelacjeCh("Kindred", 2));
			related.add(new RelacjeCh("Malphite", 5));
			related.add(new RelacjeCh("Taliyah", 1));
			related.add(new RelacjeCh("Janna", 3));
		}
		else if(ch =="Reksai") {
			related.add(new RelacjeCh("Nocturne", 9));
			related.add(new RelacjeCh("Skarner", 6));
			related.add(new RelacjeCh("Warwick", 4));
			related.add(new RelacjeCh("Kogmaw", 4));
			related.add(new RelacjeCh("Khazix", 1));
		}
		else if(ch =="Renekton") {
			related.add(new RelacjeCh("Sion", 1));
			related.add(new RelacjeCh("Mundo", 1));
			related.add(new RelacjeCh("Sivir", 1));
			related.add(new RelacjeCh("Azir", 1));
			related.add(new RelacjeCh("Jax", 6));
			related.add(new RelacjeCh("Yasuo", 1));
			related.add(new RelacjeCh("Qiyana", 1));
		}
		else if(ch =="Singed") {
			related.add(new RelacjeCh("Twitch", 4));
			related.add(new RelacjeCh("Mundo", 1));
			related.add(new RelacjeCh("Master Yi", 5));
			related.add(new RelacjeCh("Amumu", 10));
			related.add(new RelacjeCh("Nami", 6));
			related.add(new RelacjeCh("Taric", 5));
			related.add(new RelacjeCh("Zed", 5));
		}
		else if(ch =="Sion") {
			related.add(new RelacjeCh("Kindred", 4));
			related.add(new RelacjeCh("Mundo", 4));
			related.add(new RelacjeCh("Master Yi", 1));
			related.add(new RelacjeCh("Veigar", 3));
			related.add(new RelacjeCh("Olaf", 8));
			related.add(new RelacjeCh("Jax", 1));
			related.add(new RelacjeCh("Malzahar", 1));
		}
		else if(ch =="Sivir") {
			related.add(new RelacjeCh("Azir", 5));
			related.add(new RelacjeCh("Yasuo", 3));
			related.add(new RelacjeCh("Master Yi", 1));
			related.add(new RelacjeCh("Aatrox", 5));
			related.add(new RelacjeCh("Renekton", 1));
			related.add(new RelacjeCh("Khazix", 8));
		}
		else if(ch =="Skarner") {
			related.add(new RelacjeCh("Ashe", 1));
			related.add(new RelacjeCh("Mundo", 1));
			related.add(new RelacjeCh("Reksai", 5));
			related.add(new RelacjeCh("Kogmaw", 2));
			related.add(new RelacjeCh("Warwick", 2));
			related.add(new RelacjeCh("Ezreal", 1));
			related.add(new RelacjeCh("Twitch", 1));
		}
		else if(ch =="Soraka") {
			related.add(new RelacjeCh("Jax", 1));
			related.add(new RelacjeCh("Aatrox", 4));
			related.add(new RelacjeCh("Karma", 4));
			related.add(new RelacjeCh("Nami", 1));
			related.add(new RelacjeCh("Janna", 9));
			related.add(new RelacjeCh("Master Yi", 1));
			related.add(new RelacjeCh("Yorick", 10));
		}
		else if(ch =="Syndra") {
			related.add(new RelacjeCh("Vladimir", 3));
			related.add(new RelacjeCh("Veigar", 6));
			related.add(new RelacjeCh("Thresh", 5));
			related.add(new RelacjeCh("Taliyah", 1));
			related.add(new RelacjeCh("Nautilius", 8));
			related.add(new RelacjeCh("Brand", 1));
			related.add(new RelacjeCh("LeBlanc", 3));
		}
		else if(ch =="Taliyah") {
			related.add(new RelacjeCh("Vladimir", 2));
			related.add(new RelacjeCh("Veigar", 1));
			related.add(new RelacjeCh("Qiyana", 1));
			related.add(new RelacjeCh("Syndra", 6));
			related.add(new RelacjeCh("LeBlanc", 6));
		}
		else if(ch =="Taric") {
			related.add(new RelacjeCh("Ashe", 4));
			related.add(new RelacjeCh("Malphite", 1));
			related.add(new RelacjeCh("Master Yi", 5));
			related.add(new RelacjeCh("Amumu", 12));
			related.add(new RelacjeCh("Nami", 5));
			related.add(new RelacjeCh("Zed", 5));
		}
		else if(ch =="Thresh") {
			related.add(new RelacjeCh("Syndra", 3));
			related.add(new RelacjeCh("Malphite", 2));
			related.add(new RelacjeCh("Vladimir", 1));
			related.add(new RelacjeCh("Braum", 3));
			related.add(new RelacjeCh("Leona", 1));
			related.add(new RelacjeCh("Orn", 1));
			related.add(new RelacjeCh("Nautilius", 8));
			related.add(new RelacjeCh("Nasus", 1));
		}
		else if(ch =="Twitch") {
			related.add(new RelacjeCh("Singed", 11));
			related.add(new RelacjeCh("Ashe", 6));
			related.add(new RelacjeCh("Ezreal", 1));
			related.add(new RelacjeCh("Mundo", 2));
			related.add(new RelacjeCh("Kindred", 1));
			related.add(new RelacjeCh("Amumu", 2));
			related.add(new RelacjeCh("Taric", 2));
		}
		else if(ch =="Varus") {
			related.add(new RelacjeCh("Diana", 1));
			related.add(new RelacjeCh("Zyra", 1));
			related.add(new RelacjeCh("Annie", 1));
			related.add(new RelacjeCh("Ezreal", 6));
			related.add(new RelacjeCh("Kindred", 9));
			related.add(new RelacjeCh("Brand", 1));
			related.add(new RelacjeCh("Qiyana", 1));
			related.add(new RelacjeCh("Ashe", 2));
			related.add(new RelacjeCh("Twitch", 2));
			related.add(new RelacjeCh("Vayne", 1));
		}
		else if(ch =="Vayne") {
			related.add(new RelacjeCh("Varus", 7));
			related.add(new RelacjeCh("Kindred",1));
			related.add(new RelacjeCh("Ezreal", 1));
			related.add(new RelacjeCh("Karma", 1));
			related.add(new RelacjeCh("Nasus", 1));
			related.add(new RelacjeCh("Jax", 6));
			related.add(new RelacjeCh("Soraka", 1));
			related.add(new RelacjeCh("Aatrox", 1));
			related.add(new RelacjeCh("Leona", 1));
		}
		else if(ch =="Veigar") {
			related.add(new RelacjeCh("Sion", 4));
			related.add(new RelacjeCh("Kindred", 4));
			related.add(new RelacjeCh("Malzahar", 1));
			related.add(new RelacjeCh("Master Yi", 2));
			related.add(new RelacjeCh("Syndra", 1));
			related.add(new RelacjeCh("Brand", 9));
			related.add(new RelacjeCh("LeBlanc", 1));
		}
		else if(ch =="Vladimir") {
			related.add(new RelacjeCh("Thresh", 6));
			related.add(new RelacjeCh("Nautilius", 1));
			related.add(new RelacjeCh("Veigar", 1));
			related.add(new RelacjeCh("Syndra", 8));
			related.add(new RelacjeCh("Taliyah", 2));
			related.add(new RelacjeCh("LeBlanc", 6));
		}
		else if(ch =="Volibear") {
			related.add(new RelacjeCh("Olaf", 2));
			related.add(new RelacjeCh("Orn", 3));
			related.add(new RelacjeCh("Jax", 3));
			related.add(new RelacjeCh("Renekton", 1));
			related.add(new RelacjeCh("Sion", 6));
			related.add(new RelacjeCh("Mundo", 6));
			related.add(new RelacjeCh("Ezreal", 6));
			related.add(new RelacjeCh("Warwick", 1));
			related.add(new RelacjeCh("Braum", 3));
		}
		else if(ch =="Warwick") {
			related.add(new RelacjeCh("Volibear", 5));
			related.add(new RelacjeCh("Kogmaw", 4));
			related.add(new RelacjeCh("Reksai", 5));
			related.add(new RelacjeCh("Skarner", 6));
			related.add(new RelacjeCh("Ezreal", 1));
			related.add(new RelacjeCh("Braum", 5));
		}
		else if(ch =="Yasuo") {
			related.add(new RelacjeCh("Janna", 2));
			related.add(new RelacjeCh("Aatrox", 9));
			related.add(new RelacjeCh("Sivir", 9));
			related.add(new RelacjeCh("Qiyana", 2));
			related.add(new RelacjeCh("Azir", 1));
		}
		else if(ch =="Yorick") {
			related.add(new RelacjeCh("Aatrox", 1));
			related.add(new RelacjeCh("Zed", 9));
			related.add(new RelacjeCh("Annie", 4));
			related.add(new RelacjeCh("Azir", 1));
			related.add(new RelacjeCh("Soraka", 1));
		}
		else if(ch =="Zed") {
			related.add(new RelacjeCh("Qiyana", 1));
			related.add(new RelacjeCh("Khazix", 1));
			related.add(new RelacjeCh("Annie", 1));
			related.add(new RelacjeCh("Yorick", 1));
			related.add(new RelacjeCh("Volibear", 1));
			related.add(new RelacjeCh("Singed", 5));
			related.add(new RelacjeCh("Master Yi", 5));
			related.add(new RelacjeCh("Amumu", 7));
			related.add(new RelacjeCh("Nami", 5));
			related.add(new RelacjeCh("Taric", 5));
		}
		else if(ch =="Zyra") {
			related.add(new RelacjeCh("Diana", 2));
			related.add(new RelacjeCh("Varus", 6));
			related.add(new RelacjeCh("Kindred", 1));
			related.add(new RelacjeCh("Azir", 1));
			related.add(new RelacjeCh("Malzahar", 6));
			related.add(new RelacjeCh("Annie", 1));
		}
	}
	
	public Hero(String n, int l) {
		relacje(n);
		if (n == "Aatrox") {
			klasa = new Klasa("Blademaster", "Œwiat³o");
			nazwa = n;
			przypisanie();
			spellColor = new Color(235, 231, 100);
			cost = 3;
			base_armor = 0.21;
			base_magicResist = 0.196;
			base_attackSpeed = 0.651;
			base_szybkosc = 1.02;
			maxMana = 70;
			if (l == 2) {
				base_AD = 130;
				base_AP = 500;
				base_HP = 1550;
				lvl = 2;
				re = 6;
			}
			else if (l == 3) {
				base_AD = 230;
				base_AP = 1000;
				base_HP = 2700;
				lvl = 3;
				re = 16;
			}
			else {
				base_AD = 75;
				base_AP = 250;
				base_HP = 800;
				lvl = 1;
				re = 3;
			}
		}
		
		else if (n == "Amumu") {
			klasa = new Klasa("Wartownik", "Piek³o");
			nazwa = n;
			cost = 5;
			przypisanie();
			spellColor = new Color(235, 125, 100);
			base_armor = 0.25;
			base_magicResist = 0.222;
			base_attackSpeed = 0.611;
			mana = 75;
			maxMana = 150;
			if (l == 2) {
				base_AD = 150;
				base_AP = 600;
				base_HP = 2100;
				lvl = 2;
				re = 12;
			}
			else if (l == 3) {
				base_AD = 240;
				base_AP = 1500;
				base_HP = 42000;
				lvl = 3;
				re = 34;
			}
			else {
				base_AD = 85;
				base_AP = 200;
				base_HP = 1000;
				lvl = 1;
				re = 5;
			}
		}
		
		else if (n == "Annie") {
			klasa = new Klasa("Czarnoksiê¿nik", "Piek³o");
			nazwa = n;
			przypisanie();
			cost = 4;
			base_armor = 0.18;
			base_magicResist = 0.17;
			base_zasieg = 5;
			base_attackSpeed = 0.59;
			base_szybkosc = 0.93;
			maxMana = 75;
			spellColor = new Color(235, 125, 100);
			if (l == 2) {
				base_AD = 110;
				base_AP = 1300;
				base_HP = 1450;
				lvl = 2;
				re = 9;
			}
			else if (l == 3) {
				base_AD = 170;
				base_AP = 2500;
				base_HP = 2700;
				lvl = 3;
				re = 24;
			}
			else {
				base_AD = 60;
				base_AP = 650;
				base_HP = 790;
				lvl = 1;
				re = 4;
			}
		}
		
		else if (n == "Ashe") {
			klasa = new Klasa("Zwiadowca", "Kryszta³");
			nazwa = n;
			przypisanie();
			cost = 4;
			base_armor = 0.172;
			base_zasieg = 7;
			base_magicResist = 0.173;
			base_szybkosc = 0.954;
			maxMana = 35;
			if (l == 2) {
				base_AD = 220;
				base_AP = 600;
				base_HP = 1200;
				base_attackSpeed = 0.8;
				lvl = 2;
				re = 9;
			}
			else if (l == 3) {
				base_AD = 350;
				base_AP = 1000;
				base_HP = 2000;
				base_attackSpeed = 0.875;
				lvl = 3;
				re = 24;
			}
			else {
				base_AD = 120;
				base_AP = 300;
				base_HP = 630;
				base_attackSpeed = 0.735;
				lvl = 1;
				re = 4;
			}
		}
		
		else if (n == "Azir") {
			klasa = new Klasa("Czarnoksiê¿nik", "Pustynia");
			nazwa = n;
			cost = 3;
			base_zasieg = 7;
			base_armor = 0.17;
			base_magicResist = 0.16;
			base_szybkosc = 0.91;
			mana = 50;
			maxMana = 100;
			przypisanie();
			if (l == 2) {
				base_AD = 200;
				base_AP = 200;
				base_HP = 1200;
				attackSpeed = 0.65;
				lvl = 2;
				re = 6;
			}
			else if (l == 3) {
				base_AD = 430;
				base_AP = 430;
				base_HP = 2000;
				base_attackSpeed = 0.7;
				lvl = 3;
				re = 16;
			}
			else {
				base_AD = 100;
				base_AP = 100;
				base_attackSpeed = 0.6;
				base_HP = 690;
				lvl = 1;
				re = 3;
			}
		}
		
		else if (n == "Brand") {
			klasa = new Klasa("Mag", "Piek³o");
			nazwa = n;
			przypisanie();
			cost = 4;
			base_armor = 0.18;
			base_magicResist = 0.17;
			base_zasieg = 5;
			base_attackSpeed = 0.539;
			crit = 0.05;
			critPower = 1.5;
			base_szybkosc = 0.908;
			maxMana = 80;
			if (l == 2) {
				base_AD = 90;
				base_AP = 950;
				base_HP = 1000;
				lvl = 2;
				re = 9;
			}
			else if (l == 3) {
				base_AD = 150;
				base_AP = 2100;
				base_HP = 1800;
				lvl = 3;
				re = 24;
			}
			else {
				base_AD = 50;
				base_AP = 450;
				base_HP = 550;
				lvl = 1;
				re = 4;
			}
		}
		
		else if (n == "Braum") {
			klasa = new Klasa("Wartownik", "Mrozny");
			nazwa = n;
			cost = 2;
			przypisanie();
			base_attackSpeed = 0.554;
			base_AP = 0;
			base_szybkosc = 0.893;
			maxMana = 65;
			if (l == 2) {
				base_AD = 100;
				base_HP = 1570;
				base_armor = 0.28;
				base_magicResist = 0.28;
				lvl = 2;
				re = 5;
			}
			else if (l == 3) {
				base_AD = 150;
				base_HP = 2600;
				base_armor = 0.33;
				base_magicResist = 0.33;
				lvl = 3;
				re = 13;
			}
			else {
				base_AD = 60;
				base_HP = 840;
				base_armor = 0.24;
				base_magicResist = 0.24;
				lvl = 1;
				re = 2;
			}
		}
		
		else if (n == "Diana") {
			klasa = new Klasa("Asasyn", "Piek³o");
			nazwa = n;
			cost = 1;
			przypisanie();
			base_armor = 0.18;
			base_magicResist = 0.16;
			base_attackSpeed = 0.612;
			base_szybkosc = 1.029;
			maxMana = 100;
			if (l == 2) {
				base_AD = 135;
				base_AP = 200;
				base_HP = 1000;
				lvl = 2;
				re = 3;
			}
			else if (l == 3) {
				base_AD = 190;
				base_AP = 400;
				base_HP = 1900;	
				lvl = 3;
				re = 7;
			}
			else {
				base_AD = 70;
				base_AP = 100;
				base_HP = 590;
				lvl = 1;
				re = 1;
			}
		}
		
		else if (n == "Ezreal") {
			klasa = new Klasa("Zwiadowca", "Mrozny");
			nazwa = n;
			cost = 3;
			przypisanie();
			base_zasieg = 5;
			base_armor = 0.16;
			base_magicResist = 0.16;
			base_attackSpeed = 0.622;
			base_szybkosc = 0.941;
			maxMana = 30;
			if (l == 2) {
				base_AD = 170;
				base_AP = 205;
				base_HP = 1250;
				lvl = 2;
				re = 6;
			}
			else if (l == 3) {
				base_AD = 320;
				base_AP = 425;
				base_HP = 2000;
				lvl = 3;
				re = 16;
			}
			else {
				base_AD = 90;
				base_AP = 110;
				base_HP = 700;
				lvl = 1;
				re = 3;
			}
		}
		
		else if (n == "Ivern") {
			klasa = new Klasa("Druid", "Las");
			przypisanie();
			nazwa = n;
			cost = 1;
			base_armor = 0.2;
			base_zasieg = 3;
			base_magicResist = 0.19;
			base_attackSpeed = 0.621;
			base_szybkosc = 0.89;
			mana = 50;
			maxMana = 100;
			if (l == 2) {
				base_AD = 105;
				base_AP = 0;
				base_HP = 1600;
				lvl = 2;
				re = 3;
			}
			else if (l == 3) {
				base_AD = 160;
				base_AP = 0;
				base_HP = 2800;
				lvl = 3;
				re = 7;
			}
			else {
				base_AD = 60;
				base_AP = 0;
				base_HP = 700;
				lvl = 1;
				re = 1;
			}
		}
		
		else if (n == "Janna") {
			klasa = new Klasa("Mistyk", "Chmury");
			nazwa = n;
			przypisanie();
			cost = 4;
			base_zasieg = 5;
			base_armor = 0.16;
			base_magicResist = 0.17;
			base_attackSpeed = 0.603;
			base_AP = 0;
			base_szybkosc = 0.864;
			mana = 50;
			maxMana = 125;
			if (l == 2) {
				base_AD = 100;
				base_HP = 1100;
				lvl = 2;
				re = 9;
			}
			else if (l == 3) {
				base_AD = 170;
				base_HP = 1800;
				lvl = 3;
				re = 24;
			}
			else {
				base_AD = 60;
				base_HP = 620;
				lvl = 1;
				re = 4;
			}
		}
		
		else if (n == "Jax") {
			klasa = new Klasa("Berserker", "Œwiat³o");
			nazwa = n;
			cost = 2;
			przypisanie();
			base_armor = 0.19;
			base_magicResist = 0.175;
			base_attackSpeed = 0.61;
			base_szybkosc = 1.1;
			mana = 50;
			maxMana = 125;
			if (l == 2) {
				base_AD = 145;
				base_AP = 190;
				base_HP = 1150;
				lvl = 2;
				re = 5;
				unik = 0.25;
			}
			else if (l == 3) {
				base_AD = 240;
				base_AP = 320;
				base_HP = 2000;
				lvl = 3;
				re = 13;
				unik = 0.325;
			}
			else {
				base_AD = 80;
				base_AP = 100;
				base_HP = 660;
				lvl = 1;
				re = 2;
				unik = 0.2;
			}
		}
		
		else if (n == "Karma") {
			klasa = new Klasa("Mistyk", "Lunear");
			przypisanie();
			nazwa = n;
			cost = 3;
			base_armor = 0.165;
			base_zasieg = 5;
			base_magicResist = 0.16;
			base_AP = 0;
			base_szybkosc = 0.965;
			maxMana = 60;
			if (l == 2) {
				base_AD = 105;
				base_attackSpeed = 0.851;
				base_HP = 1050;
				lvl = 2;
				re = 6;
			}
			else if (l == 3) {
				base_AD = 170;
				base_attackSpeed = 1.35;
				base_HP = 1800;
				lvl = 3;
				re = 16;
			}
			else {
				base_AD = 60;
				base_attackSpeed = 0.699;
				base_HP = 640;
				lvl = 1;
				re = 3;
			}
		}
		
		else if (n == "Khazix") {
			klasa = new Klasa("Asasyn", "Pustynia");
			nazwa = n;
			przypisanie();
			cost = 4;
			base_armor = 0.173;
			base_magicResist = 0.166;
			base_attackSpeed = 0.638;
			base_szybkosc = 1.102;
			maxMana = 40;
			if (l == 2) {
				base_AD = 230;
				base_AP = 230;
				base_HP = 1200;
				crit = 0.4;
				lvl = 2;
				re = 9;
			}
			else if (l == 3) {
				base_AD = 460;
				base_AP = 460;
				base_HP = 2200;
				crit = 0.555;
				lvl = 3;
				re = 24;
			}
			else {
				base_AD = 110;
				base_AP = 110;
				base_HP = 670;
				crit = 0.3;
				lvl = 1;
				re = 4;
			}
		}
		
		else if (n == "Kindred") {
			klasa = new Klasa("Zwiadowca", "Piek³o", "Cieñ");
			nazwa = n;
			cost = 3;
			przypisanie();
			base_armor = 0.154;
			base_zasieg = 5;
			base_magicResist = 0.145;
			base_attackSpeed = 0.638;
			base_szybkosc = 0.94;
			maxMana = 35;
			if (l == 2) {
				base_AD = 200;
				base_AP = 350;
				base_HP = 1200;
				lvl = 2;
				re = 6;
			}
			else if (l == 3) {
				base_AD = 450;
				base_AP = 500;
				base_HP = 2000;
				lvl = 3;
				re = 16;
			}
			else {
				base_AD = 95;
				base_AP = 200;
				base_HP = 610;
				lvl = 1;
				re = 3;
			}
		}
		
		else if(n == "Kogmaw") {
			klasa = new Klasa("Drapie¿nik", "Trucizna");
			nazwa = n;
			cost = 1;
			przypisanie();
			base_armor = 0.2;
			base_zasieg = 5;
			base_magicResist = 0.171;
			base_attackSpeed = 0.614;
			base_szybkosc = 0.897;
			maxMana = 40;
			if (l == 2) {
				base_AD = 130;
				base_AP = 300;
				base_HP = 950;
				lvl = 2;
				re = 3;
			}
			else if (l == 3) {
				base_AD = 270;
				base_AP = 550;
				base_HP = 1850;
				lvl = 3;
				re = 7;
			}
			else {
				base_AD = 65;
				base_AP = 120;
				base_HP = 490;
				lvl = 1;
				re = 1;
			}
		}
		
		else if (n == "LeBlanc") {
			klasa = new Klasa("Mag", "Las", "Asasyn");
			nazwa = n;
			cost = 2;
			przypisanie();
			base_armor = 0.2;
			base_zasieg = 5;
			base_magicResist = 0.15;
			base_attackSpeed = 0.6;
			base_szybkosc = 0.98;
			mana = 50;
			maxMana = 80;
			if (l == 2) {
				base_AD = 150;
				base_AP = 400;
				base_HP = 970;
				lvl = 2;
				re = 5;
			}
			else if (l == 3) {
				base_AD = 320;
				base_AP = 800;
				base_HP = 1700;
				lvl = 3;
				re = 13;
			}
			else {
				base_AD = 70;
				base_AP = 200;
				base_HP = 500;
				lvl = 1;
				re = 2;
			}
		}
		
		else if (n == "Leona") {
			klasa = new Klasa("Wartownik", "Lunear");
			nazwa = n;
			cost = 1;
			przypisanie();
			base_attackSpeed = 0.589;
			base_szybkosc = 0.882;
			base_AP = 0;
			mana = 50;
			maxMana = 100;
			if (l == 2) {
				base_AD = 115;
				base_HP = 1500;
				base_armor = 0.26;
				base_magicResist = 0.26;
				lvl = 2;
				re = 3;
			}
			else if (l == 3) {
				base_AD = 180;
				base_HP = 2400;	
				base_armor = 0.34;
				base_magicResist = 0.34;
				lvl = 3;
				re = 7;
			}
			else {
				base_AD = 60;
				base_HP = 790;
				base_armor = 0.2;
				base_magicResist = 0.2;
				lvl = 1;
				re = 1;
			}
		}
		
		else if (n == "Lux") {
			if (!(Okno.team.czyJestAvatar)) {
				klasa = new Klasa("Avatar", GeneratorH.losAvatar, GeneratorH.losAvatar);
			}
			else {
				klasa = new Klasa("Avatar", Okno.team.jakiAvatar, Okno.team.jakiAvatar);
			}
			nazwa = n;
			cost = 7;
			przypisanie();
			base_zasieg = 7;
			base_armor = 0.17;
			base_magicResist = 0.17;
			base_attackSpeed = 0.615;
			base_szybkosc = 0.932;
			maxMana = 80;
			if (l == 2) {
				base_AD = 130;
				base_AP = 3000;
				base_HP = 1300;
				lvl = 2;
				re = 17;
			}
			else if (l == 3) {
				base_AD = 230;
				base_AP = 99999;
				base_HP = 3000;
				lvl = 3;
				re = 48;
			}
			else {
				base_AD = 70;
				base_AP = 1000;
				base_HP = 700;
				lvl = 1;
				re = 7;
			}
		}
		
		else if (n == "Malphite") {
			klasa = new Klasa("Wartownik", "Góry");
			nazwa = n;
			przypisanie();
			cost = 4;
			base_armor = 0.26;
			base_magicResist = 0.20;
			base_attackSpeed = 0.579;
			base_szybkosc = 0.916;
			mana = 50;
			maxMana = 150;
			if (l == 2) {
				base_AD = 112;
				base_AP = 650;
				base_HP = 1700;
				lvl = 2;
				re = 9;
			}
			else if (l == 3) {
				base_AD = 190;
				base_AP = 1200;
				base_HP = 3500;
				lvl = 3;
				re = 24;
			}
			else {
				base_AD = 58;
				base_AP = 300;
				base_HP = 830;
				lvl = 1;
				re = 4;
			}
		}
		
		else if (n== "Malzahar") {
			klasa = new Klasa("Czarnoksiê¿nik", "Cieñ");
			nazwa = n;
			cost = 2;
			base_armor = 0.16;
			base_magicResist = 0.17;
			przypisanie();
			base_zasieg = 5;
			base_attackSpeed = 0.596;
			base_szybkosc = 0.943;
			mana = 75;
			maxMana = 125;
			if (l == 2) {
				base_AD = 85;
				base_AP = 260;
				base_HP = 1200;
				lvl = 2;
				re = 5;
			}
		
			else if (l == 3) {
				base_AD = 130;
				base_AP = 550;
				base_HP = 2000;
				lvl = 3;
				re = 13;
			}
			else {
				base_AD = 45;
				base_AP = 140;
				base_HP = 600;
				lvl = 1;
				re = 2;
			}
		}
		
		else if (n=="Maokai") {
			klasa = new Klasa("Druid", "Las");
			nazwa = n;
			cost = 1;
			przypisanie();
			base_armor = 0.243;
			base_magicResist = 0.2;
			base_attackSpeed = 0.52;
			base_szybkosc = 0.926;
			wspMana = 0;
			maxMana = 1;
			if (l == 2) {
				base_AD = 120;
				base_AP = 0;
				base_HP = 1800;
				base_lifeStealAtak = 0.25;
				lvl = 2;
				re = 3;
			}
			else if (l == 3) {
				base_AD = 200;
				base_AP = 0;
				base_HP = 3500;
				base_lifeStealAtak = 0.3;
				lvl = 3;
				re = 7;
			}
			else {
				base_AD = 60;
				base_AP = 0;
				base_HP = 830;
				base_lifeStealAtak = 0.2;
				lvl = 1;
				re = 1;
			}
		}
		
		else if (n == "Master Yi") {
			klasa = new Klasa("Blademaster", "Mistyk", "Cieñ");
			nazwa = n;
			cost = 5;
			przypisanie();
			base_armor = 0.2;
			base_magicResist = 0.2;
			base_szybkosc = 1.16;
			mana = 100;
			maxMana = 150;
			base_attackSpeed = 1.1;
			if (l == 2) {
				base_AD = 126;
				base_AP = 450;
				base_HP = 1530;
				lvl = 2;
				re = 12;
			}
			else if (l == 3) {
				base_AD = 227;
				base_AP = 1250;
				base_HP = 2754;
				lvl = 3;
				re = 34;
			}
			else {
				base_AD = 70;
				base_AP = 200;
				base_HP = 850;
				lvl = 1;
				re = 5;
				
			}
		}
		
		else if (n == "Mundo") {
			klasa = new Klasa("Berserker", "Trucizna");
			nazwa = n;
			cost = 3;
			base_armor = 0.203;
			base_magicResist = 0.17;
			przypisanie();
			base_attackSpeed = 0.609;
			base_szybkosc = 0.975;
			mana = 75;
			maxMana = 125;
			if (l == 2) {
				base_AD = 108;
				base_AP = 220;
				base_HP = 1440;
				lvl = 2;
				re = 6;
			}
			else if (l == 3) {
				base_AD = 195;
				base_AP = 500;
				base_HP = 2592;
				lvl = 3;
				re = 16;
			}
			else {
				base_AD = 60;
				base_AP = 100;
				base_HP = 800;
				lvl = 1;
				re = 3;
			}
		}
		
		else if (n == "Nami") {
			klasa = new Klasa("Mistyk", "Ocean");
			nazwa = n;
			cost = 5;
			przypisanie();
			base_armor = 0.17;
			base_zasieg =  6;
			base_magicResist = 0.215;
			base_attackSpeed = 0.742;
			base_szybkosc = 0.904;
			mana = 50;
			maxMana = 125;
			if (l == 2) {
				base_AD = 90;
				base_AP = 550;
				base_HP = 1350;
				lvl = 2;
				re = 12;
			}
			else if (l == 3) {
				base_AD = 162;
				base_AP = 2000;
				base_HP = 2430;
				lvl = 3;
				re = 34;
			}
			else {
				base_AD = 50;
				base_AP = 200;
				base_HP = 750;
				lvl = 1;
				re = 5;
			}
		}
		
		else if (n =="Nasus") {
			klasa = new Klasa("Wartownik", "Œwiat³o");
			nazwa = n;
			cost = 1;
			base_armor = 0.21;
			przypisanie();
			base_magicResist = 0.193;
			base_attackSpeed = 0.643;
			base_szybkosc = 0.977;
			maxMana = 100;
			if (l == 2) {
				base_AD = 81;
				base_AP = 90;
				base_HP = 1170;
				lvl = 2;
				re = 3;
			}
			else if (l == 3) {
				base_AD = 146;
				base_AP = 190;
				base_HP = 2106;
				lvl = 3;
				re = 7;
			}
			else {
				base_AD = 45;
				base_AP = 40;
				base_HP = 650;
				lvl = 1;
				re = 1;
			}
		}
		
		else if (n == "Nautilius") {
			klasa = new Klasa("Wartownik", "Ocean");
			nazwa = n;
			cost = 3;
			base_armor = 0.23;
			base_magicResist = 0.2;
			przypisanie();
			base_attackSpeed = 0.598;
			base_szybkosc = 0.934;
			mana = 50;
			maxMana = 125;
			if (l == 2) {
				base_AD = 99;
				base_HP = 1530;
				base_AP = 200;
				lvl = 2;
				re = 6;
			}
			else if (l == 3) {
				base_AD = 178;
				base_HP = 2754;
				base_AP = 400;
				lvl = 3;
				re = 16;
			}
			else {
				base_AD = 55;
				base_HP = 850;
				base_AP = 100;
				lvl = 1;
				re = 3;
			}
		}
		
		else if (n== "Neeko") {
			klasa = new Klasa("Druid", "Las");
			nazwa = n;
			cost = 2;
			base_armor = 0.16;
			base_magicResist = 0.165;
			przypisanie();
			base_zasieg = 4;
			base_attackSpeed = 0.703;
			base_szybkosc = 0.964;
			maxMana = 60;
			if (l == 2) {
				base_AD = 81;
				base_AP = 450;
				base_HP = 900;
				lvl = 2;
				re = 5;
			}
		
			else if (l == 3) {
				base_AD = 146;
				base_AP = 950;
				base_HP = 1620;
				lvl = 3;
				re = 13;
			}
			else {
				base_AD = 45;
				base_AP = 200;
				base_HP = 500;
				lvl = 1;
				re = 2;
			}
		}
		
		else if (n == "Nocturne") {
			klasa = new Klasa("Asasyn", "Stal");
			nazwa = n;
			cost = 3;
			base_armor = 0.185;
			base_magicResist = 0.167;
			przypisanie();
			base_attackSpeed = 0.8;
			base_AP = 0;
			base_szybkosc = 1.052;
			maxMana = 0;
			if (l == 2) {
				base_AD = 108;
				base_HP = 1170;
				lvl = 2;
				re = 6;
			}
			else if (l == 3) {
				base_AD = 195;
				base_HP = 2106;
				lvl = 3;
				re = 16;
			}
			else {
				base_AD = 60;
				base_HP = 650;
				lvl = 1;
				re = 3;
			}
		}
		
		else if (n == "Olaf") {
			klasa = new Klasa("Berserker", "Mrozny");
			nazwa = n;
			przypisanie();
			cost = 4;
			base_armor = 0.191;
			base_magicResist = 0.166;
			base_AP = 0;
			base_szybkosc = 1.23;
			base_attackSpeed = 0.81;
			maxMana = 90;
			if (l == 2) {
				base_AD = 126;
				base_HP = 1530;
				lvl = 2;
				re = 9;
			}
			else if (l == 3) {
				base_AD = 227;
				base_HP = 2754;
				lvl = 3;
				re = 24;
			}
			else {
				base_AD = 70;
				base_HP = 850;
				lvl = 1;
				re = 4;
			}
		}
		
		else if (n == "Orn") {
			klasa = new Klasa("Wartownik", "Elektryczny");
			nazwa = n;
			przypisanie();
			cost = 1;
			base_armor = 0.23;
			base_magicResist = 0.21;
			base_attackSpeed = 0.551;
			base_szybkosc = 0.906;
			maxMana = 75;
			if (l == 2) {
				base_AD = 90;
				base_AP = 110;
				base_HP = 1170;
				lvl = 2;
				re = 3;
			}
			else if (l == 3) {
				base_AD = 162;
				base_AP = 300;
				base_HP = 2106;
				lvl = 3;
				re = 7;
			}
			else {
				base_AD = 50;
				base_AP = 60;
				base_HP = 650;
				lvl = 1;
				re = 1;
			}
		}
		
		else if (n == "Qiyana") {
			klasa = new Klasa("Asasyn", Main.zywiol);
			nazwa = n;
			cost = 3;
			przypisanie();
			base_armor = 0.17;
			base_magicResist = 0.16;
			base_attackSpeed = 0.698;
			base_szybkosc = 1.141;
			mana = 50;
			maxMana = 100;
			if (l == 2) {
				base_AD = 117;
				base_AP = 450;
				base_HP = 1170;
				lvl = 2;
				re = 6;
			}
			else if (l == 3) {
				base_AD = 211;
				base_AP = 1000;
				base_HP = 2106;
				lvl = 3;
				re = 16;
			}
			else {
				base_AD = 65;
				base_AP = 200;
				base_HP = 650;
				lvl = 1;
				re = 3;
			}
		}
		
		else if (n== "Reksai") {
			klasa = new Klasa("Drapie¿nik", "Stal");
			nazwa = n;
			cost = 2;
			base_armor = 0.2;
			base_magicResist = 0.172;
			przypisanie();
			base_attackSpeed = 0.7;
			base_AP = 0;
			base_szybkosc = 1.203;
			maxMana = 75;
			if (l == 2) {
				base_AD = 108;
				base_HP = 1170;
				lvl = 2;
				re = 5;
			}
		
			else if (l == 3) {
				base_AD = 195;
				base_HP = 2106;
				lvl = 3;
				re = 13;
			}
			else {
				base_AD = 60;
				base_HP = 650;
				lvl = 1;
				re = 2;
			}
		}
		
		else if(n == "Renekton") {
			klasa = new Klasa("Berserker", "Pustynia");
			nazwa = n;
			cost = 1;
			przypisanie();
			base_attackSpeed = 0.61;
			base_armor = 0.2;
			base_magicResist = 0.17;
			base_szybkosc = 1.023;
			maxMana = 100;
			if (l == 2) {
				base_AD = 108;
				base_AP = 250;
				base_HP = 1080;
				lvl = 2;
				re = 3;
			}
			else if (l == 3) {
				base_AD = 195;
				base_AP = 500;
				base_HP = 1944;
				lvl = 3;
				re = 7;
			}
			else {
				base_AD = 60;
				base_AP = 100;
				base_HP = 600;
				lvl = 1;
				re = 1;
			}
		}
		
		else if (n == "Singed") {
			klasa = new Klasa("Alchemik", "Trucizna");
			nazwa = n;
			cost = 5;
			przypisanie();
			base_armor = 0.20;
			base_magicResist = 0.215;
			base_attackSpeed = 0.53;
			base_szybkosc = 1.209;
			maxMana = 1;
			wspMana = 0;
			if (l == 2) {
				base_AD = 120;
				base_AP = 800;
				base_HP = 1710;
				lvl = 2;
				re = 12;
			}
			else if (l == 3) {
				base_AD = 220;
				base_AP = 2000;
				base_HP = 3078;
				lvl = 3;
				re = 34;
			}
			else {
				base_AD = 65;
				base_AP = 400;
				base_HP = 950;
				lvl = 1;
				re = 5;
			}
		}
		
		else if (n == "Sion") {
			klasa = new Klasa("Berserker", "Cieñ");
			nazwa = n;
			cost = 3;
			base_armor = 0.2;
			base_magicResist = 0.183;
			przypisanie();
			base_attackSpeed = 0.657;
			base_szybkosc = 0.969;
			mana = 75;
			maxMana = 125;
			if (l == 2) {
				base_AD = 117;
				base_AP = 400;
				base_HP = 1530;
				lvl = 2;
				re = 6;
			}
			else if (l == 3) {
				base_AD = 211;
				base_AP = 777;
				base_HP = 2754;
				lvl = 3;
				re = 16;
			}
			else {
				base_AD = 65;
				base_AP = 200;
				base_HP = 850;
				lvl = 1;
				re = 3;
			}
		}
		
		else if (n == "Sivir") {
			klasa = new Klasa("Blademaster", "Pustynia");
			nazwa = n;
			cost = 3;
			base_armor = 0.19;
			base_magicResist = 0.173;
			przypisanie();
			base_zasieg = 4;
			base_attackSpeed = 0.702;
			base_szybkosc = 0.9452;
			maxMana = 65;
			if (l == 2) {
				base_AD = 99;
				base_AP = 320;
				base_HP = 1080;
				lvl = 2;
				re = 6;
			}
			else if (l == 3) {
				base_AD = 178;
				base_AP = 520;
				base_HP = 1944;
				lvl = 3;
				re = 16;
			}
			else {
				base_AD = 55;
				base_AP = 190;
				base_HP = 600;
				lvl = 1;
				re = 3;
			}
		}
		
		else if (n == "Skarner") {
			klasa = new Klasa("Drapie¿nik", "Kryszta³");
			nazwa = n;
			cost = 2;
			przypisanie();
			base_armor = 0.21;
			base_magicResist = 0.17;
			base_AP = 0;
			base_szybkosc = 1.107;
			base_attackSpeed = 0.651;
			maxMana = 65;
			if (l == 2) {
				base_AD = 108;
				base_HP = 1170;
				lvl = 2;
				re = 5;
			}
			else if (l == 3) {
				base_AD = 195;
				base_HP = 2106;
				lvl = 3;
				re = 13;
			}
			else {
				base_AD = 60;
				base_HP = 650;
				lvl = 1;
				re = 2;
			}
		}
		
		else if (n == "Soraka") {
			klasa = new Klasa("Mistyk", "Œwiat³o");
			nazwa = n;
			cost = 3;
			base_armor = 0.17;
			base_magicResist = 0.165;
			przypisanie();
			base_zasieg = 4;
			base_attackSpeed = 0.696;
			base_szybkosc = 0.94;
			maxMana = 60;
			if (l == 2) {
				base_AD = 720;
				base_AP = 350;
				base_HP = 1080;
				lvl = 2;
				re = 6;
			}
			else if (l == 3) {
				base_AD = 130;
				base_AP = 750;
				base_HP = 1944;
				lvl = 3;
				re = 16;
			}
			else {
				base_AD = 40;
				base_AP = 150;
				base_HP = 600;
				lvl = 1;
				re = 3;
			}
		}
		
		else if (n == "Syndra") {
			klasa = new Klasa("Mag", "Ocean");
			nazwa = n;
			cost = 2;
			przypisanie();
			base_zasieg = 4;
			base_armor = 0.16;
			base_magicResist = 0.14;
			base_attackSpeed = 0.7;
			base_szybkosc = 0.928;
			maxMana = 65;
			if (l == 2) {
				base_AD = 72;
				base_AP = 400;
				base_HP = 900;
				lvl = 2;
				re = 5;
			}
			else if (l == 3) {
				base_AD = 130;
				base_AP = 1000;
				base_HP = 1620;
				
				lvl = 3;
				re = 13;
			}
			else {
				base_AD = 40;
				base_AP = 200;
				base_HP = 500;
				lvl = 1;
				re = 2;
			}
		}
		
		else if (n == "Taliyah") {
			klasa = new Klasa("Mag", "Góry");
			nazwa = n;
			cost = 1;
			przypisanie();
			base_zasieg = 4;
			base_armor = 0.15;
			base_magicResist = 0.13;
			base_attackSpeed = 0.644;
			mana = 30;
			maxMana = 80;
			base_szybkosc = 0.899;
			if (l == 2) {
				base_AD = 72;
				base_AP = 300;
				base_HP = 900;
				lvl = 2;
				re = 3;
			}
			else if (l == 3) {
				base_AD = 130;
				base_AP = 500;
				base_HP = 1620;
				lvl = 3;
				re = 7;
			}
			else {
				base_AD = 40;
				base_AP = 150;
				base_HP = 500;
				lvl = 1;
				re = 1;
			}
		}
		
		else if (n == "Taric") {
			klasa = new Klasa("Wartownik", "Kryszta³");
			nazwa = n;
			cost = 5;
			przypisanie();
			armor = 0.25;
			magicResist = 0.17;
			attackSpeed = 0.66;
			szybkosc = 0.984;
			mana = 50;
			maxMana = 125;
			if (l == 2) {
				base_AD = 108;
				base_AP = 300;
				base_HP = 1620;
				lvl = 2;
				re = 12;
			}
			else if (l == 3) {
				base_AD = 195;
				base_AP = 600;
				base_HP = 2916;
				lvl = 3;
				re = 34;
			}
			else {
				base_AD = 60;
				base_AP = 100;
				base_HP = 900;
				lvl = 1;
				re = 5;
			}
		}
		
		else if (n== "Thresh") {
			klasa = new Klasa("Wartownik", "Ocean");
			nazwa = n;
			cost = 2;
			base_armor = 0.2;
			base_magicResist = 0.17;
			przypisanie();
			base_zasieg = 2;
			base_attackSpeed = 0.56;
			base_szybkosc = 0.957;
			base_AP = 0;	
			mana = 50;
			maxMana = 125;
			if (l == 2) {
				base_AD = 99;
				base_HP = 1260;
				lvl = 2;
				re = 5;
			}
			else if (l == 3) {
				base_AD = 178;
				base_HP = 2268;
				lvl = 3;
				re = 13;
			}
			else {
				base_AD = 55;
				base_HP = 700;
				lvl = 1;
				re = 2;
			}
		}
		
		else if (n == "Twitch") {
			klasa = new Klasa("Zwiadowca", "Trucizna");
			nazwa = n;
			przypisanie();
			base_zasieg = 6;
			cost = 4;
			base_armor = 0.172;
			base_magicResist = 0.172;
			base_attackSpeed = 0.751;
			base_AP = 0;
			szybkosc = 0.937;
			maxMana = 70;
			if (l == 2) {
				base_AD = 126;
				base_HP = 1170;
				lvl = 2;
				re = 9;
			}
			else if (l == 3) {
				base_AD = 227;
				base_HP = 2106;
				lvl = 3;
				re = 24;
			}
			else {
				base_AD = 70;
				base_HP = 650;
				lvl = 1;
				re = 4;
			}
		}
		
		else if (n == "Varus") {
			klasa = new Klasa("Zwiadowca", "Piek³o");
			nazwa = n;
			cost = 2;
			przypisanie();
			base_zasieg = 6;
			base_armor = 0.15;
			base_magicResist = 0.12;
			base_attackSpeed = 0.748;
			base_szybkosc = 0.92;
			mana = 50;
			maxMana = 100;
			if (l == 2) {
				base_AD = 108;
				base_AP = 450;
				base_HP = 990;
				lvl = 2;
				re = 5;
			}
			else if (l == 3) {
				base_AD = 195;
				base_AP = 650;
				base_HP = 1782;
				lvl = 3;
				re = 13;
			}
			else {
				base_AD = 60;
				base_AP = 250;
				base_HP = 550;
				lvl = 1;
				re = 2;
			}
		}
		
		else if (n=="Vayne") {
			klasa = new Klasa("Zwiadowca", "Œwiat³o");
			nazwa = "Vayne";
			cost = 1;
			przypisanie();
			base_zasieg = 5;
			base_armor = 0.18;
			base_magicResist = 0.16;
			base_attackSpeed = 0.695;
			base_szybkosc = 0.971;
			maxMana = 1;
			wspMana = 0;
			if (l == 2) {
				base_AD = 72;
				base_AP = 0;
				base_HP = 990;
				lvl = 2;
				re = 3;
			}
			else if (l == 3) {
				base_AD = 130;
				base_AP = 0;
				base_HP = 1782;
				lvl = 3;
				re = 7;
			}
			else {
				base_AD = 40;
				base_AP = 0;
				base_HP = 550;
				lvl = 1;
				re = 1;
			}
		}
		
		else if (n == "Veigar") {
			klasa = new Klasa("Mag", "Cieñ");
			nazwa = n;
			cost = 3;
			base_armor = 0.17;
			base_magicResist = 0.17;
			przypisanie();
			base_zasieg = 4;
			base_attackSpeed = 0.599;
			base_szybkosc = 0.897;
			maxMana = 60;
			if (l == 2) {
				base_AD = 90;
				base_AP = 650;
				base_HP = 1080;
				lvl = 2;
				re = 6;
			}
			else if (l == 3) {
				base_AD = 162;
				base_AP = 1400;
				base_HP = 1944;
				lvl = 3;
				re = 16;
			}
			else {
				base_AD = 50;
				base_AP = 300;
				base_HP = 600;
				lvl = 1;
				re = 3;
			}
		}
		
		else if (n== "Vladimir") {
			klasa = new Klasa("Mag", "Ocean");
			nazwa = "Vladimir";
			cost = 1;
			przypisanie();
			spellColor = new Color(125, 208, 244);
			base_zasieg = 3;
			base_armor = 0.19;
			base_magicResist = 0.17;
			base_attackSpeed = 0.65;
			base_szybkosc = 0.963;
			mana = 0;
			maxMana = 75;
			if (l == 2) {
				base_AD = 72;
				base_AP = 230;
				base_HP = 990;
				lvl = 2;
				re = 3;
			}
			else if (l == 3) {
				base_AD = 130;
				base_AP = 500;
				base_HP = 1782;
				lvl = 3;
				re = 7;
			}
			else {
				base_AD = 40;
				base_AP = 120;
				base_HP = 550;
				lvl = 1;
				re = 1;
			}
		}
		
		else if (n == "Volibear") {
			klasa = new Klasa("Berserker", "Mrozny", "Elektryczny");
			nazwa = n;
			cost = 2;
			przypisanie();
			base_armor = 0.205;
			base_magicResist = 0.17;
			base_attackSpeed = 0.71;
			base_szybkosc = 1.064;
			maxMana = 70;
			if (l == 2) {
				base_AD = 108;
				base_AP = 333;
				base_HP = 1170;
				lvl = 2;
				re = 5;
			}
			else if (l == 3) {
				base_AD = 195;
				base_AP = 700;
				base_HP = 2106;
				lvl = 3;
				re = 13;
			}
			else {
				base_AD = 60;
				base_AP = 150;
				base_HP = 650;
				lvl = 1;
				re = 2;
			}
		}
		
		else if (n== "Warwick") {
			
			klasa = new Klasa("Drapie¿nik", "Mrozny");
			nazwa = "Warwick";
			cost = 1;
			przypisanie();
			base_armor = 0.185;
			base_magicResist = 0.17;
			base_attackSpeed = 0.599;
			base_szybkosc = 1.111;
			mana = 50;
			maxMana = 125;
			if (l == 2) {
				base_AD = 90;
				base_AP = 220;
				base_HP = 1170;
				lvl = 2;
				re = 3;
			}
			else if (l == 3) {
				base_AD = 162;
				base_AP = 450;
				base_HP = 2106;
				lvl = 3;
				re = 7;
			}
			else {
				base_AD = 50;
				base_AP = 100;
				base_HP = 650;
				lvl = 1;
				re = 1;
			}
			}
		
		else if (n == "Yasuo") {
			klasa = new Klasa("Blademaster", "Chmury");
			nazwa = n;
			cost = 2;
			przypisanie();
			base_armor = 0.19;
			base_magicResist = 0.167;
			base_attackSpeed = 0.712;
			maxMana = 90;
			base_szybkosc = 1.147;
			if (l == 2) {
				base_AD = 108;
				base_AP = 310;
				base_HP = 1080;
				lvl = 2;
				re = 5;
			}
			else if (l == 3) {
				base_AD = 195;
				base_AP = 560;
				base_HP = 1944;
				lvl = 3;
				re = 13;
			}
			else {
				base_AD = 60;
				base_AP = 170;
				base_HP = 600;
				lvl = 1;
				re = 2;
			}
		}
			
		else if (n == "Yorick") {
			klasa = new Klasa("Czarnoksiê¿nik", "Œwiat³o");
			nazwa = n;
			przypisanie();
			cost = 4;
			base_armor = 0.21;
			base_magicResist = 0.17;
			base_attackSpeed = 0.71;
			base_szybkosc = 1.113;
			maxMana = 85;
			if (l == 2) {
				base_AD = 117;
				base_HP = 1530;
				base_AP = 100;
				lvl = 2;
				re = 9;
			}
			else if (l == 3) {
				base_AD = 211;
				base_HP = 2754;
				base_AP = 100;
				lvl = 3;
				re = 24;
			}
			else {
				base_AD = 65;
				base_AP = 100;
				base_HP = 850;
				lvl = 1;
				re = 4;
			}
		}
		
		else if (n == "Zed") {
			klasa = new Klasa("Asasyn", "Czarnoksiê¿nik", "Elektryczny");
			nazwa = n;
			cost = 5;
			przypisanie();
			base_armor = 0.18;
			base_magicResist = 0.17;
			base_attackSpeed = 1.1;
			base_szybkosc = 1.152;
			mana = 75;
			maxMana = 150;
			if (l == 2) {
				base_AD = 126;
				base_AP = 380;
				base_HP = 1530;
				lvl = 2;
				re = 12;
			}
			else if (l == 3) {
				base_AD = 255;
				base_AP = 1500;
				base_HP = 2754;
				lvl = 3;
				re = 34;
			}
			else {
				AD = 70;
				AP = 175;
				HP = 850;
				lvl = 1;
				re = 5;
			}
		}
		
		else if (n== "Zyra") {
			klasa = new Klasa("Czarnoksiê¿nik", "Piek³o");
			nazwa = n;
			cost = 1;
			przypisanie();
			base_zasieg = 4;
			base_armor = 0.16;
			base_magicResist = 0.16;
			base_attackSpeed = 0.65;
			base_szybkosc = 0.933;
			maxMana = 65;
			if (l == 2) {
				base_AD = 72;
				base_AP = 200;
				base_HP = 900;
				lvl = 2;
				re = 3;
			}
			else if (l == 3) {
				base_AD = 130;
				base_AP = 500;
				base_HP = 1620;
				lvl = 3;
				re = 7;
			}
			else {
				base_AD = 40;
				base_AP = 100;
				base_HP = 500;
				lvl = 1;
				re = 1;
			}
		}
		
		
		else if(n == "Tibbers") {
			przypisanie();
			nazwa = n;
			base_zasieg = 1;
			base_armor = 0.17;
			base_magicResist = 0.16;
			base_attackSpeed = 0.651;
			base_szybkosc = 1.25;
			maxMana = 1;
			wspMana = 0;
			color = new Color(235, 125, 100);
			if (l == 2) {
				base_AD = 72;
				base_AP = 350;
				base_HP = 2200;
				lvl = 2;
				re = 3;
			}
			else if (l == 3) {
				base_AD = 130;
				base_AP = 1500;
				base_HP = 3000;
				lvl = 3;
				re = 7;
			}
			else {
				base_AD = 40;
				base_AP = 125;
				base_HP = 1600;
				lvl = 1;
				re = 1;
			}
		}
			
		else if (n == "Minion") {
			klasa = new Klasa("Minion", "Minion");
			nazwa = n;
			lifeStealAtak = 0;
			armor = 0;
			magicResist = 0;
			zasieg = 1;
			crit = 0;
			critPower = 1;
			szybkosc = 0.846;
			lifeStealSpell = 0.05;
			lvl = l;
			if (l == 1) {
				AD = 20;
				AP = 0;
				HP = 300;
				attackSpeed = 0.61;
			}
			else if (l == 2) {
				AD = 35;
				AP = 0;
				HP = 400;
				attackSpeed = 0.611;
			}
		}
		setColor();
		baseToTemp();
	}

	
}

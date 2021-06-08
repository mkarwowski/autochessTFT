package tft;

import java.util.ArrayList;
import java.util.Random;

public class Team {
	String name;
	
	int HP;
	int money;
	int lvl;
	public int boardSize;
	int lawkaSize;
	int exp;
	int lawkaIlosc;
	int boardIlosc;
	
	int seriaP;
	int seriaW;
	
	int AD;
	int AP;
	int teamHP;
	double armor;
	double magicResist;
	double burnAtak;
	double burnSpell;
	double lifeStealAtak;
	double lifeStealSpell;
	double unik;
	int heal;
	int nieuchronneSpell;
	int nieuchronneAtak;
	int maxHP;
	
	double spellSpeed;
	double attackSpeed;
	double slowSpell;
	double slowAttack;
	double crit;
	double critPower;
	
	String last;
	
	public boolean czyJestAvatar = false;
	public String jakiAvatar;
	boolean checkAvatar = false;
	boolean czyBot;
	
	public ArrayList<Hero> board = new ArrayList<Hero>();
	public ArrayList<Hero> lawka = new ArrayList<Hero>();
	public ArrayList<Origins> origin = new ArrayList<Origins>();
	
	public ArrayList<String> star3 = new ArrayList<String>();
	
	public ArrayList<RelacjeCh> related = new ArrayList<RelacjeCh>();
	
	public Team(String n) {
		name = n;
		HP = 100;
		money = 3333;
		lvl = 2;
		boardSize = lvl;
		lawkaSize = 10;
		boardIlosc = 0;
		lawkaIlosc = 0;
		exp = 0;
		seriaP = 0;
		seriaW = 0;
		
		AD = 0;
		AP = 0;
		teamHP = 0;
		maxHP = 0;
		armor = 0;
		magicResist = 0;
		burnAtak = 0;
		burnSpell = 0;
		lifeStealAtak = 0;
		lifeStealSpell = 0;
		heal = 0;
		nieuchronneSpell = 0;
		nieuchronneAtak = 0;
		unik = 0;
		
		spellSpeed = 0;
		attackSpeed = 0;
		slowSpell = 0;
		slowAttack = 0;
		crit = 0;
		critPower = 0;
	}
	
	void okreslCzyBot(boolean b) {
		czyBot = b;
	}
	
	
	
	public Team (int i) {
		name = "Miniony";
		HP = 1;
		money = 0;
		lvl = i;
		boardSize = 3;
		lawkaSize = 0;
		boardIlosc = 0;
		lawkaIlosc = 0;
		exp = 0;
		
		AD = 0;
		AP = 0;
		teamHP = 0;
		armor = 0;
		magicResist = 0;
		burnAtak = 0;
		burnSpell = 0;
		lifeStealAtak = 0;
		lifeStealSpell = 0;
		heal = 0;
		nieuchronneSpell = 0;
		nieuchronneAtak = 0;
		
		spellSpeed = 0;
		attackSpeed = 0;
		slowSpell = 0;
		slowAttack = 0;
		crit = 0;
		critPower = 0;
		if (i == 1) {
			board.add(new Hero("Minion",1));
			board.add(new Hero("Minion",1));
		}
		else if (i == 2) {
			board.add(new Hero("Minion",1));
			board.add(new Hero("Minion",1));
			board.add(new Hero("Minion",1));
		}
		else if (i == 3) {
			board.add(new Hero("Minion",2));
			board.add(new Hero("Minion",1));
			board.add(new Hero("Minion",1));
		}
		else if (i == 4) {
			board.add(new Hero("Renekton",3));
			board.add(new Hero("Orn",1));
			board.add(new Hero("Ivern",1));
		}
		
	}
	
	String boardToString() {
		String str = "<html>";
		
		for (int i = 0; i < board.size(); i++) {
			str += board.get(i).nazwa + " (" + board.get(i).lvl + ")<br/>";
		}
		str += "</html>";
		return str;
	}
	
	String originToString() {
		String str = "<html>";
		
		for (int i = 0; i < origin.size(); i++) {
			str += origin.get(i).nazwa + " (" + origin.get(i).liczba + ")<br/>";
		}
		str += "</html>";
		return str;
	}
	
	void copy(Team t) {
		name = t.name;
		HP = t.HP;
		money = t.money;
		lvl = t.lvl;
		boardSize = t.boardSize;
		lawkaSize = t.lawkaSize;
		boardIlosc = t.boardIlosc;
		lawkaIlosc = t.lawkaIlosc;
		exp = t.exp;
		
		AD = t.AD;
		AP = t.AP;
		teamHP = t.teamHP;
		armor = t.armor;
		magicResist = t.magicResist;
		burnAtak = t.burnAtak;
		burnSpell = t.burnSpell;
		lifeStealAtak = t.lifeStealAtak;
		lifeStealSpell = t.lifeStealSpell;
		heal = t.heal;
		nieuchronneSpell = t.nieuchronneSpell;
		nieuchronneAtak = t.nieuchronneAtak;
		
		spellSpeed = t.spellSpeed;
		attackSpeed = t.attackSpeed;
		slowSpell = t.slowSpell;
		slowAttack = t.slowAttack;
		crit = t.crit;
		critPower = t.critPower;
		
		for (int i = 0; i < t.board.size(); i++) {
			board.add(t.board.get(i));
		}
		for (int i = 0; i < t.lawka.size(); i++) {
			lawka.add(t.lawka.get(i));
		}
		for (int i = 0; i < t.origin.size(); i++) {
			origin.add(t.origin.get(i));
		}
	}
 	
	int obliczAD(String kogo) {
		int a = 0;
		for(int i = 0; i < board.size(); i++) {
			if (kogo == board.get(i).klasa.klasa ||kogo == board.get(i).klasa.origin || kogo == board.get(i).klasa.origin2) {
				a += board.get(i).AD;
			}
		}
		return a;
	}
	
	int obliczAP(String kogo) {
		int a = 0;
		for(int i = 0; i < board.size(); i++) {
			
			if (kogo == board.get(i).klasa.klasa || kogo == board.get(i).klasa.origin || kogo == board.get(i).klasa.origin2) {
				a += board.get(i).AP;
			}
		}
		return a;
	}
	
	int obliczHP(String kogo) {
		int a = 0;
		for(int i = 0; i < board.size(); i++) {
			
			if (kogo == board.get(i).klasa.klasa || kogo == board.get(i).klasa.origin || kogo == board.get(i).klasa.origin2) {
				a += board.get(i).HP;
			}
		}
		return a;
	}
	
	
	
	double obliczArmor(String kogo) {
		double a = 0;
		int ile = 0;
		for(int i = 0; i < board.size(); i++) {
			
			if (kogo == board.get(i).klasa.klasa || kogo == board.get(i).klasa.origin || kogo == board.get(i).klasa.origin2) {
				a += board.get(i).armor;
				ile++;
			}
		}
		a = a / (double) ile;
		return a;
	}
	
	
	double obliczCrit(String kogo) {
		double a = 0;
		int ile = 0;
		for(int i = 0; i < board.size(); i++) {
			
			if (kogo == board.get(i).klasa.klasa || kogo == board.get(i).klasa.origin || kogo == board.get(i).klasa.origin2) {
				a += board.get(i).crit;
				ile++;
			}
		}
		a = a / (double) ile;
		return a;
	}
	
	
	double obliczCritPower(String kogo) {
		double a = 0;
		int ile = 0;
		for(int i = 0; i < board.size(); i++) {
			
			if (kogo == board.get(i).klasa.klasa || kogo == board.get(i).klasa.origin || kogo == board.get(i).klasa.origin2) {
				a += board.get(i).critPower;
				ile++;
			}
		}
		a = a / (double) ile;
		return a;
	}	
	
	
	double obliczAttackSpeed(String kogo) {
		double a = 0;
		int ile = 0;
		for(int i = 0; i < board.size(); i++) {
			
			if (kogo == board.get(i).klasa.klasa || kogo == board.get(i).klasa.origin || kogo == board.get(i).klasa.origin2) {
				a += board.get(i).attackSpeed;
				ile++;
			}
		}
		a = a / (double) ile;
		return a;
	}	
	
	
	int iloscChamp(String n) {
		int a = 0;
		for (int i = 0; i < board.size(); i++) {
			if (board.get(i).klasa.klasa == n || board.get(i).klasa.origin == n || board.get(i).klasa.origin2 == n) {
				a++;
			}
		}
		return a;
	}
	
	
	void wyczyscBoard() {
		while(!board.isEmpty()) {
			board.remove(0);
		}
	}
	
	
	void wyczyscOrigin() {
		while(!origin.isEmpty()) {
			origin.remove(0);
		}
	}
	
	
	boolean czyJestChamp(ArrayList<Hero> ah, Hero h) {
		for (int i = 0; i < ah.size(); i++) {
			if (h.nazwa == ah.get(i).nazwa) {
				return true;
			}
		}
		return false;
	}
	
	
	int czyJestOrigin(String or) {//return index, if there is not then -1
		for (int i = 0; i < origin.size(); i++) {
			if (or == origin.get(i).nazwa) {
				return i;
			}
		}
		return -1;
	}
	
	
	public void aktualizujOrigin() {
		wyczyscOrigin();
		ArrayList<Hero> h = new ArrayList<Hero>();
		for (int i = 0; i < board.size(); i++) {
			if (!czyJestChamp(h, board.get(i))) {
				h.add(board.get(i));
			}
		}
		
		for (int i = 0; i < h.size(); i++) {
			int check = czyJestOrigin(h.get(i).klasa.klasa);
			if (check >= 0) {
				int l = origin.get(check).liczba + 1;
				origin.remove(check);
				origin.add(new Origins(h.get(i).klasa.klasa, l, this));
			}
			else {
				origin.add(new Origins(h.get(i).klasa.klasa, 1, this));
			}
			check = czyJestOrigin(h.get(i).klasa.origin);
			if (check >= 0) {
				int l = origin.get(check).liczba + 1;
				origin.remove(check);
				origin.add(new Origins(h.get(i).klasa.origin, l, this));
			}
			else {
				origin.add(new Origins(h.get(i).klasa.origin, 1, this));
			}
			check = czyJestOrigin(h.get(i).klasa.origin2);
			if(h.get(i).klasa.origin2 == "") {}
			else if (check >= 0) {
				int l = origin.get(check).liczba + 1;
				origin.remove(check);
				origin.add(new Origins(h.get(i).klasa.origin2, l, this));
			}
			else {
				origin.add(new Origins(h.get(i).klasa.origin2, 1, this));
			}
		}
		origin.sort(new LiczbaSorter());
	}
	
	
	int zwrocIndexChampa(String n, int lvl) {
		Hero h;
		for(int i=0; i < board.size(); i++) {
			h = board.get(i);
			if(h.nazwa==n && h.lvl == lvl) {
				return i;
			}
		}
		return 0;
	}
	
	
	void losujPoczatek() {
		Random r = new Random();
		int liczba = 25;
		int rand = r.nextInt(liczba);
		if(rand == 0) {
			lvl = 3;
			board.add(new Hero("Maokai", 1));
			board.add(new Hero("Ivern", 1));
			board.add(new Hero("LeBlanc", 1));
			Main.liczbaMaokai.liczba--;
			Main.liczbaIvern.liczba--;
			Main.liczbaLeBlanc.liczba--;
		}
		else if(rand == 1) {
			lvl = 3;
			board.add(new Hero("Maokai", 1));
			board.add(new Hero("Ivern", 1));
			board.add(new Hero("Neeko", 1));
			Main.liczbaMaokai.liczba--;
			Main.liczbaIvern.liczba--;
			Main.liczbaNeeko.liczba--;
		}
		else if(rand == 2) {
			lvl = 3;
			board.add(new Hero("Vladimir", 1));
			board.add(new Hero("Syndra", 1));
			board.add(new Hero("Taliyah", 1));
			Main.liczbaVladimir.liczba--;
			Main.liczbaSyndra.liczba--;
			Main.liczbaTaliyah.liczba--;
		}
		else if(rand == 3) {
			lvl = 3;
			board.add(new Hero("Renekton", 1));
			board.add(new Hero("Jax", 1));
			board.add(new Hero("Volibear", 1));
			Main.liczbaRenekton.liczba--;
			Main.liczbaJax.liczba--;
			Main.liczbaVolibear.liczba--;
		}
		else if(rand == 4) {
			lvl = 3;
			board.add(new Hero("Diana", 1));
			board.add(new Hero("Zyra", 1));
			board.add(new Hero("Varus", 1));
			Main.liczbaDiana.liczba--;
			Main.liczbaZyra.liczba--;
			Main.liczbaVarus.liczba--;
		}
		else if(rand == 5) {
			lvl = 3;
			board.add(new Hero("Vayne", 1));
			board.add(new Hero("Nasus", 1));
			board.add(new Hero("Jax", 1));
			Main.liczbaVayne.liczba--;
			Main.liczbaJax.liczba--;
			Main.liczbaNasus.liczba--;
		}
		else if(rand == 6) {
			lvl = 3;
			board.add(new Hero("Kogmaw", 1));
			board.add(new Hero("Warwick", 1));
			board.add(new Hero("Reksai", 1));
			Main.liczbaKogmaw.liczba--;
			Main.liczbaWarwick.liczba--;
			Main.liczbaReksai.liczba--;
		}
		else if(rand == 7) {
			lvl = 3;
			board.add(new Hero("Orn", 1));
			board.add(new Hero("Braum", 1));
			board.add(new Hero("Volibear", 1));
			Main.liczbaOrn.liczba--;
			Main.liczbaBraum.liczba--;
			Main.liczbaRenekton.liczba--;
		}
		else if(rand == 8) {
			lvl = 3;
			board.add(new Hero("Renekton", 1));
			board.add(new Hero("Azir", 1));
			board.add(new Hero("Zyra", 1));
			Main.liczbaRenekton.liczba--;
			Main.liczbaAzir.liczba--;
			Main.liczbaZyra.liczba--;
		}
		else if(rand == 9) {
			lvl = 3;
			board.add(new Hero("Leona", 1));
			board.add(new Hero("Orn", 1));
			board.add(new Hero("Nasus", 1));
			Main.liczbaOrn.liczba--;
			Main.liczbaNasus.liczba--;
			Main.liczbaLeona.liczba--;
		}
		else if(rand == 10) {
			lvl = 3;
			board.add(new Hero("Malzahar", 1));
			board.add(new Hero("Kindred", 1));
			board.add(new Hero("Zyra", 1));
			Main.liczbaMalzahar.liczba--;
			Main.liczbaKindred.liczba--;
			Main.liczbaZyra.liczba--;
		}
		else if(rand == 11) {
			lvl = 3;
			board.add(new Hero("Leona", 1));
			board.add(new Hero("Nasus", 1));
			board.add(new Hero("Karma", 1));
			Main.liczbaLeona.liczba--;
			Main.liczbaNasus.liczba--;
			Main.liczbaKarma.liczba--;
		}
		else if(rand == 12) {
			lvl = 3;
			board.add(new Hero("Vladimir", 1));
			board.add(new Hero("Syndra", 1));
			board.add(new Hero("Thresh", 1));
			Main.liczbaVladimir.liczba--;
			Main.liczbaSyndra.liczba--;
			Main.liczbaThresh.liczba--;
		}
		else if(rand == 13) {
			lvl = 3;
			board.add(new Hero("Vladimir", 1));
			board.add(new Hero("Taliyah", 1));
			board.add(new Hero("Syndra", 1));
			Main.liczbaVladimir.liczba--;
			Main.liczbaSyndra.liczba--;
			Main.liczbaTaliyah.liczba--;
		}
		else if(rand == 14) {
			lvl = 3;
			board.add(new Hero("Diana", 1));
			board.add(new Hero("LeBlanc", 1));
			board.add(new Hero("Qiyana", 1));
			Main.liczbaDiana.liczba--;
			Main.liczbaLeBlanc.liczba--;
			Main.liczbaQiyana.liczba--;
		}
		else if(rand == 15) {
			lvl = 3;
			board.add(new Hero("Warwick", 1));
			board.add(new Hero("Braum", 1));
			board.add(new Hero("Orn", 1));
			Main.liczbaWarwick.liczba--;
			Main.liczbaBraum.liczba--;
			Main.liczbaOrn.liczba--;
		}
		else if(rand == 16) {
			lvl = 3;
			board.add(new Hero("Vayne", 1));
			board.add(new Hero("Varus", 1));
			board.add(new Hero("Nasus", 1));
			Main.liczbaVayne.liczba--;
			Main.liczbaVarus.liczba--;
			Main.liczbaNasus.liczba--;
		}
		else if(rand == 17) {
			lvl = 3;
			board.add(new Hero("Renekton", 1));
			board.add(new Hero("Yasuo", 1));
			board.add(new Hero("Sivir", 1));
			Main.liczbaYasuo.liczba--;
			Main.liczbaSivir.liczba--;
			Main.liczbaRenekton.liczba--;
		}
		else if(rand == 18) {
			lvl = 3;
			board.add(new Hero("Qiyana", 1));
			board.add(new Hero("Yasuo", 1));
			board.add(new Hero("Diana", 1));
			Main.liczbaDiana.liczba--;
			Main.liczbaYasuo.liczba--;
			Main.liczbaQiyana.liczba--;
		}
		else if(rand == 19) {
			lvl = 3;
			board.add(new Hero("Aatrox", 1));
			board.add(new Hero("Yasuo", 1));
			board.add(new Hero("Renekton", 1));
			Main.liczbaAatrox.liczba--;
			Main.liczbaYasuo.liczba--;
			Main.liczbaRenekton.liczba--;
		}
		else if(rand == 20) {
			lvl = 3;
			board.add(new Hero("Kindred", 1));
			board.add(new Hero("Varus", 1));
			board.add(new Hero("Zyra", 1));
			Main.liczbaKindred.liczba--;
			Main.liczbaVarus.liczba--;
			Main.liczbaZyra.liczba--;
		}
		else if(rand == 21) {
			lvl = 3;
			board.add(new Hero("Sion", 1));
			board.add(new Hero("Renekton", 1));
			board.add(new Hero("Jax", 1));
			Main.liczbaRenekton.liczba--;
			Main.liczbaJax.liczba--;
			Main.liczbaSion.liczba--;
		}
		else if(rand == 22) {
			lvl = 3;
			board.add(new Hero("Braum", 1));
			board.add(new Hero("Warwick", 1));
			board.add(new Hero("Volibear", 1));
			Main.liczbaBraum.liczba--;
			Main.liczbaWarwick.liczba--;
			Main.liczbaVolibear.liczba--;
		}
		else if(rand == 23) {
			lvl = 3;
			board.add(new Hero("Zyra", 1));
			board.add(new Hero("Malzahar", 1));
			board.add(new Hero("Azir", 1));
			Main.liczbaZyra.liczba--;
			Main.liczbaMalzahar.liczba--;
			Main.liczbaAzir.liczba--;
		}
		else if(rand == 24) {
			lvl = 3;
			board.add(new Hero("Nocturne", 1));
			board.add(new Hero("Reksai", 1));
			board.add(new Hero("Diana", 1));
			Main.liczbaDiana.liczba--;
			Main.liczbaReksai.liczba--;
			Main.liczbaNocturne.liczba--;
		}
	}
	
	void boardLvlUp(int nrRundy) {
		Random r = new Random();
		int dodatek = nrRundy/5;
		if (dodatek > 4) dodatek = 4;
		if(r.nextInt(100 + dodatek) > 62) {
			int rand = r.nextInt(board.size());
			String chName = board.get(rand).nazwa;
			int chLVL = board.get(rand).lvl;
			if (chLVL == 1) {
				if (board.get(rand).cost > 2 && lvl < 5);
				else if (board.get(rand).cost == 4 && lvl < 6);
				else if (board.get(rand).cost == 5 && lvl < 7);
				else {
					if (czyIloscChampDostepna(2, chName)) {
						board.remove(rand);
						board.add(new Hero(chName, 2));
						for (int i = 0; i < Okno.liczebnosc.size(); i++) {
							Liczebnosc a = Okno.liczebnosc.get(i);
							if(a.nazwa == chName) {
								a.liczba = a.liczba - 2;
							}	
						}
					}
				}
			}
			else if (chLVL == 2) {
				if (r.nextInt(100 + dodatek) > 79) {
					if (board.get(rand).cost > 1 && lvl < 6);
					else if (board.get(rand).cost > 2 && lvl < 7);
					else if (board.get(rand).cost > 3 && lvl < 8);
					else if (board.get(rand).cost > 4 && lvl < 9);
					else {
						if (czyIloscChampDostepna(6, chName)) {
							board.remove(rand);
							board.add(new Hero(chName, 3));
							for (int i = 0; i < Okno.liczebnosc.size(); i++) { 
								Liczebnosc a = Okno.liczebnosc.get(i);
								if(a.nazwa == chName) {
									a.liczba = a.liczba - 6;
								}
							}
						}
					}
				}
			}
		}
	}
	
	Hero wybierzCh() {
		Random r = new Random();
		int sz = 0;
		for(int i = 0; i < related.size(); i++) {
			sz += related.get(i).szansa;
		}
		int rand = r.nextInt(sz);
		sz = 0;
		for(int i = 0; i < related.size(); i++) {
			sz += related.get(i).szansa;
			if (rand < sz) {
				return new Hero(related.get(i).name, 1);
			}
		}
		return null;
	}
	
	boolean czyIloscChampDostepna(int il, String ch) {
		for (int i = 0; i < Okno.liczebnosc.size(); i++) {
			if (Okno.liczebnosc.get(i).nazwa == ch) {
				if (il > Okno.liczebnosc.get(i).liczba) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		return false;
	}
	
	void aktualizacjaRelated() {
		related.clear();
		boolean czyZnalazlo;
		for(int i = 0; i < board.size(); i++) {
			for (int j = 0; j < board.get(i).related.size(); j++) {
				if (!related.isEmpty()) {
					czyZnalazlo = false;
					for (int k = 0; k < related.size() && czyZnalazlo == false; k++) {
						if(related.get(k).name == board.get(i).related.get(j).name) {
							related.get(k).szansa += board.get(i).related.get(j).szansa;
							czyZnalazlo = true;
						}
					}
					if (!czyZnalazlo) {
						related.add(board.get(i).related.get(j));
					}
				}
				else {
					related.add(board.get(0).related.get(0));
				}
			}
		}
	}
	
	void aktualizujBota(int nrRundy) {
		if (HP > 0) {
			if (nrRundy <= 2 && board.isEmpty()) {
				losujPoczatek();
				aktualizacjaRelated();
			}
			else if (nrRundy == 5 && lvl == 3) {
				lvl++;
				rozwojBot();
				boardLvlUp(nrRundy);
				aktualizacjaRelated();
			}
			else if (nrRundy == 9 && lvl == 4) {
				lvl++;
				rozwojBot();
				boardLvlUp(nrRundy);
				aktualizacjaRelated();
			}
			else if (nrRundy == 14 && lvl == 5) {
				lvl++;
				rozwojBot();
				boardLvlUp(nrRundy);
				aktualizacjaRelated();
			}
			else if (nrRundy == 20 && lvl == 6) {
				lvl++;
				rozwojBot();
				boardLvlUp(nrRundy);
				aktualizacjaRelated();
			}
			else if (nrRundy == 28 && lvl == 7) {
				lvl++;
				rozwojBot();
				boardLvlUp(nrRundy);
				aktualizacjaRelated();
			}
			else if (nrRundy == 39 && lvl == 8) {
				lvl++;
				rozwojBot();
				boardLvlUp(nrRundy);
				aktualizacjaRelated();
			}
			else {
				boardLvlUp(nrRundy);
			}
			
		}
	}
	
	void deadBot() {
		while(!board.isEmpty()) {
			String n = board.get(0).nazwa;
			for (int i = 0; i < Okno.liczebnosc.size(); i++) {
				if (Okno.liczebnosc.get(i).nazwa == n) {
					if(board.get(0).lvl == 1) {
						Okno.liczebnosc.get(i).liczba++;
						board.remove(0);
					}
					else if(board.get(0).lvl == 2) {
						Okno.liczebnosc.get(i).liczba += 3;
						board.remove(0);
					}
					else if(board.get(0).lvl == 3) {
						Okno.liczebnosc.get(i).liczba += 9;
						board.remove(0);
					}
				}
			}
		}
	}
	
	void rozwojBot() {
		Hero h = wybierzCh();
		boolean czyZnalazlo = false;
		for(int i = 0; i < board.size(); i++) {
			if (h.nazwa == board.get(i).nazwa) {
				czyZnalazlo = true;
				break;
			}
		}
		if(!czyZnalazlo) {
			board.add(h);
		}
		else {
			rozwojBot();
		}
	}
}

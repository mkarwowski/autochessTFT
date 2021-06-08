package tft;

import java.awt.Color;

public class Origins {
	String nazwa;
	String opis;
	
	int AD;
	int AP;
	int HP;
	double armor;
	double magicResist;
	double burnAtak;
	double burnSpell;
	double lifeStealAtak;
	double lifeStealSpell;
	int heal;
	int nieuchronneSpell;
	int nieuchronneAtak;
	
	double spellSpeed;
	double attackSpeed;
	double slowSpell;
	double slowAttack;
	double crit;
	double critPower;
	double unik;
	
	int liczba;
	int next;
	Color color;

	
	void przypisanie(String n) {
		nazwa = n;
		opis = "opis " + n;
		AD = 0;
		AP = 0;
		HP = 0;
		heal = 0;
		armor = 0;
		magicResist = 0;
		burnAtak = 0;
		burnSpell = 0;
		crit = 0;
		critPower = 0;
		nieuchronneSpell = 0;
		nieuchronneAtak = 0;
		spellSpeed = 0;
		attackSpeed = 0;
		slowAttack = 0;
		slowSpell = 0;
		lifeStealAtak = 0;
		lifeStealSpell = 0;
		unik = 0;
	}
	
	public Origins(String n, int l, Team t) {
		
		if (n == "Alchemik") {
			przypisanie(n);
			opis = "(1) Zwiêksza AP o iloœæ 20% wszystkich champów Trucizna";
			if (l >= 1) {
				liczba = l;
				AP = (int) (t.obliczAP("Trucizna")*0.2);
				next = 1;
				color = new Color(255, 163, 26);
			}
			else {
				liczba = l;
				next = 1;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n== "Asasyn") {
			przypisanie(n);
			opis = "(2/4/6) Zwiêksza szanse na trafienie krytyczne o 10%/15%/20% i si³ê obra¿eñ krytycznych o 40%/100%/210%";
			if (l >= 6) {
				liczba = l;
				critPower = 2.1;
				crit = 0.2;
				next = 6;
				color = new Color(255, 163, 26);
			}
			else if (l >= 4) {
				liczba = l;
				critPower = 1;
				crit = 0.15;
				next = 6;
				color = new Color(225, 225, 234);
			}
			else if (l >= 2) {
				liczba = l;
				critPower = 0.4;
				crit = 0.1;
				next = 4;
				color = new Color(153, 77, 0);
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Avatar") {
			przypisanie(n);
			opis = "(1) Dostaje x2 drugiego origina";
			if (l >= 1) {
				liczba = l;
				next = 1;
				color = new Color(255, 163, 26);
			}
			else {
				liczba = l;
				next = 1;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Berserker") {
			przypisanie(n);
			opis = "(3/6) Zwiêksza AD o 50%/100% ³¹cznego AD berserkerów";
			if (l >= 6) {
				liczba = l;
				AD = t.obliczAD(n);
				next = 6;
				color = new Color(255, 163, 26);
			}
			else if (l >= 3) {
				liczba = l;
				AD = (int) ((double)t.obliczAD(n)*0.5);	
				next = 6;
				color = new Color(153, 77, 0);
			}
			else {
				liczba = l;
				AD = 0;
				next = 3;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Blademaster") {
			przypisanie(n);
			opis = "(2/4/6) Zwiêksza prêdkoœæ ataku mistrzów miecza o 50%/100%/200%";
			if (l >= 6) {
				liczba = l;
				attackSpeed = t.obliczAttackSpeed(n)*2;
				next = 6;
				color = new Color(255, 163, 26);
			}
			else if (l >= 4) {
				liczba = l;	
				attackSpeed = t.obliczAttackSpeed(n);
				next = 6;
				color = new Color(225, 225, 234);
			}
			else if (l >= 2) {
				liczba = l;		
				attackSpeed = t.obliczAttackSpeed(n)*0.5;
				next = 4;
				color = new Color(153, 77, 0);
				
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Chmury") {
			przypisanie(n);
			opis = "(2/3/4) Zwiêksza szansê na unik o 20%/25%/35%";
			if (l >= 4) {
				liczba = l;
				unik = 0.35;
				next = 4;
				color = new Color(255, 163, 26);
			}
			else if (l >= 3) {
				liczba = l;	
				unik = 0.25;
				next = 4;
				color = new Color(225, 225, 234);
			}
			else if (l >= 2) {
				liczba = l;		
				unik = 0.2;
				next = 3;
				color = new Color(153, 77, 0);
				
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Cieñ") {
			przypisanie(n);
			opis = "(2/4/6) Zwiêksza AP i AD champów Cieñ o 20%/40%/70%";
			if (l >= 6) {
				liczba = l;
				AD = (int) (t.obliczAD(n)*0.7);
				AP = (int) (t.obliczAP(n)*0.7);
				next = 6;
				color = new Color(255, 163, 26);
			}
			else if (l >= 4) {
				liczba = l;
				AD = (int) (t.obliczAD(n)*0.4);
				AP = (int) (t.obliczAP(n)*0.4);
				next = 6;
				color = new Color(225, 225, 234);
			}
			else if (l >= 2) {
				liczba = l;
				AD = (int) (t.obliczAD(n)*0.2);
				AP = (int) (t.obliczAP(n)*0.2);
				next = 4;
				color = new Color(153, 77, 0);
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Czarnoksiê¿nik") {
			przypisanie(n);
			opis = "(2/4/6) Zwiêksza burnSpell i burnAtak o 25%/55%/90% oraz slowAttack o 0.1s/0.15s/0.25s";
			if (l >= 6) {
				liczba = l;
				burnSpell = 0.9;
				burnAtak = 0.9;
				slowAttack = 0.25;
				next = 6;
				color = new Color(255, 163, 26);
			}
			else if (l >= 4) {
				liczba = l;
				burnSpell = 0.55;
				burnAtak = 0.55;
				slowAttack = 0.15;
				next = 6;
				color = new Color(225, 225, 234);
			}
			else if (l >= 2) {
				liczba = l;
				burnSpell = 0.25;
				burnAtak = 0.25;
				slowAttack = 0.1;
				next = 4;
				color = new Color(153, 77, 0);
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Drapie¿nik") {
			przypisanie(n);
			opis = "(3) Zwiêksza nieuchronneSpell i nieuchronneAtak o 50% AD i AP drapie¿ników";
			if (l >= 3) {
				nieuchronneSpell = (int) ((double)t.obliczAP(n)*0.5);
				nieuchronneAtak = (int) ((double)(t.obliczAD(n))*0.5);
				liczba = l;
				next = 3;
				color = new Color(255, 163, 26);
			}
			else {
				liczba = l;
				next = 3;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Druid") {
			przypisanie(n);
			opis = "(2) Zwiêksza lifeStealAtak o 5% i heal o 35 za ka¿dego druida";
			if (l >= 2) {
				lifeStealAtak = t.iloscChamp(n)*0.05;
				heal = t.iloscChamp(n)*35;
				liczba = l;
				next = 2;
				color = new Color(255, 163, 26);
			}
			else {
				liczba = l;
				lifeStealAtak = 0;
				heal = 0;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Elektryczny") {
			przypisanie(n);
			opis = "(2/3/4) Zwiêksza nieuchronneAtak o 35/150/400 za ka¿dego elektrycznego champa";
			if (l >= 4) {
				liczba = l;
				nieuchronneAtak = 400*t.iloscChamp(n);
				next = 4;
				color = new Color(255, 163, 26);
			}
			else if (l >= 3) {
				liczba = l;	
				nieuchronneAtak = 150*t.iloscChamp(n);
				next = 4;
				color = new Color(225, 225, 234);
			}
			else if (l >= 2) {
				liczba = l;		
				nieuchronneAtak = 35*t.iloscChamp(n);
				next = 3;
				color = new Color(153, 77, 0);
				
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Góry") {
			przypisanie(n);
			opis = "(2) Zwiêksza HP o 1200";
			if (l >= 2) {
				HP = 1200;
				liczba = l;
				next = 2;
				color = new Color(255, 163, 26);
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		
		else if (n == "Kryszta³") {
			przypisanie(n);
			opis = "(2/4) Zwiêksza armor i magic resist o 12%/35%";
			if (l >= 2) {
				liczba = l;
				armor = 0.12;
				magicResist = 0.12;
				next = 4;
				color = new Color(153, 77, 0);
			}
			else if (l >= 4) {
				liczba = l;
				armor = 0.35;
				magicResist = 0.35;
				next = 4;
				color = new Color(255, 163, 26);
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Las") {
			przypisanie(n);
			opis = "Zwiêksza o 60%/150% AD, AP i HP o sumê champów las podzielon¹ na iloœæ champów las";
			if (l >= 3) {
				AD = (int) (t.obliczAD(n) / t.iloscChamp(n) *0.6);
				AP = (int) (t.obliczAP(n) / t.iloscChamp(n) *0.6);
				HP = (int) (t.obliczHP(n) / t.iloscChamp(n) *0.6);
				liczba = l;
				next = 6;
				color = new Color(225, 225, 234);
			}
			else if (l >= 6) {
				AD = (int) (t.obliczAD(n) / t.iloscChamp(n) *1.5);
				AP = (int) (t.obliczAP(n) / t.iloscChamp(n) *1.5);
				HP = (int) (t.obliczHP(n) / t.iloscChamp(n) *1.5);
				liczba = l;
				next = 6;
				color = new Color(255, 163, 26);
			}
			else {
				liczba = l;
				next = 3;
				color = new Color(255, 255, 255);
			}
		}
		
		else if(n == "Lunear") {
			przypisanie(n);
			opis = "(2) Zwiêksza szanse i si³ê trafienia krytycznego o 15% i liczbê AP o 10%";
			if (l >= 2) {
				crit = 0.15;
				critPower = 0.15;
				AP = (int) (t.AP*0.1);
				liczba = l;
				next = 2;
				color = new Color(255, 163, 26);
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Mag") {
			przypisanie(n);
			opis = "(3/6) Zwieksza o 50%/100% AP i healing magów oraz dodaje 0/20 AP za ka¿dego maga";
			if (l >= 6) {
				liczba = l;
				AP = t.obliczAP(n) + t.iloscChamp(n)*20;
				next = 6;
				color = new Color(255, 163, 26);
			}
			else if (l >= 3) {
				liczba = l;
				AP = (int) ((double)t.obliczAP(n)*0.5);	
				next = 6;
				color = new Color(153, 77, 0);
			}
			else {
				liczba = l;
				next = 3;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Mistyk") {
			przypisanie(n);
			opis = "(2/4) Dodaje 20%/50% magicResist";
			if (l >= 4) {
				liczba = l;
				magicResist = 0.5;
				next = 4;
				color = new Color(255, 163, 26);
			}
			else if (l >= 2) {
				liczba = l;
				magicResist = 0.2;		
				next = 4;
				color = new Color(153, 77, 0);
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Mrozny") {
			przypisanie(n);
			opis = "(2/4/6) Zwiêksza slowSpell o 0.15s/0.24s/0.35s i slowAttack o 0.23s/0.35s/0.58s oraz dodaje 50/100/200 AP za ka¿dego mroznego champa";
			if (l >= 6) {
				liczba = l;
				slowSpell = 0.35;
				slowAttack = 0.58;
				AP = 200*t.iloscChamp(n);
				next = 6;
				color = new Color(255, 163, 26);
			}
			else if (l >= 4) {
				liczba = l;		
				slowSpell = 0.24;
				slowAttack = 0.35;
				AP = 100*t.iloscChamp(n);
				next = 6;
				color = new Color(225, 225, 234);
			}
			else if (l >= 2) {
				liczba = l;		
				slowSpell = 0.15;
				slowAttack = 0.23;
				AP = 50*t.iloscChamp(n);
				next = 4;
				color = new Color(153, 77, 0);
				
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Ocean") {
			przypisanie(n);
			opis = "(3/6) Zwiêksza spellSpeed o 0.12s/0.3s";
			if (l >= 6) {
				liczba = l;
				spellSpeed = 0.3;
				next = 6;
				color = new Color(255, 163, 26);
			}
			else if (l >= 3) {
				liczba = l;				
				spellSpeed = 0.12;
				next = 6;
				color = new Color(153, 77, 0);
				
			}
			else {
				liczba = l;
				next = 3;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Piek³o") {
			przypisanie(n);
			opis = "(3/6/9) Zwiêksza AP o 25%/45%/85% AD i o 10%/25%/60% AP champów piekielnych";
			if (l >= 9) {
				liczba = l;
				AP = (int) (t.obliczAD(n)*0.85) + (int)(t.obliczAP(n)*0.6);
				next = 9;
				color = new Color(255, 163, 26);
			}
			else if (l >= 6) {
				liczba = l;
				AP = (int) (t.obliczAD(n)*0.45) + (int)(t.obliczAP(n)*0.25);		
				next = 9;
				color = new Color(225, 225, 234);
			}
			else if (l >= 3) {
				AP = (int) (t.obliczAD(n)*0.25) + (int)(t.obliczAP(n)*0.1);
				liczba = l;				
				next = 6;
				color = new Color(153, 77, 0);
			}
			else {
				liczba = l;
				next = 3;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Pustynia") {
			przypisanie(n);
			opis = "(2/4) Zwiêksza lifeStealAtak o 20%/45%";
			if (l >= 4) {
				liczba = l;
				lifeStealAtak = 0.45;
				next = 4;
				color = new Color(255, 163, 26);
			}
			else if (l >= 2) {
				liczba = l;
				lifeStealAtak = 0.2;
				next = 4;
				color = new Color(153, 77, 0);
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Stal") {
			przypisanie(n);
			opis = "(2/3/4) Zamienia 30%/65%/100% zadawanych obra¿eñ AP i AD na nieuchronne";
			if (l >= 4) {
				liczba = l;
				nieuchronneAtak = t.AD;
				nieuchronneSpell = t.AP;
				AD = -t.AD;
				AP = -t.AP;
				next = 4;
				color = new Color(255, 163, 26);
			}
			else if (l >= 3) {
				liczba = l;	
				nieuchronneAtak = (int) (t.AD*0.65);
				nieuchronneSpell = (int) (t.AP*0.65);
				AD = -(int) (t.AD*0.65);
				AP = -(int) (t.AP*0.65);
				next = 4;
				color = new Color(225, 225, 234);
			}
			else if (l >= 2) {
				liczba = l;		
				nieuchronneAtak = (int) (t.AD*0.3);
				nieuchronneSpell = (int) (t.AP*0.3);
				AD = -(int) (t.AD*0.3);
				AP = -(int) (t.AP*0.3);
				next = 3;
				color = new Color(153, 77, 0);
				
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Œwiat³o") {
			przypisanie(n);
			opis = "(3/6/9) Zwiêksza heal o 20%/40%/100% maksymalnego HP bohaterów œwietlnych i attackSpeed o 0.12s/0.3s/0.5s";
			if (l >= 9) {
				liczba = l;
				heal = t.obliczHP(n);
				attackSpeed = 0.5;
				next = 9;
				color = new Color(255, 163, 26);
			}
			else if (l >= 6) {
				liczba = l;
				heal = (int) (t.obliczHP(n)*0.4);
				attackSpeed = 0.3;		
				next = 9;
				color = new Color(225, 225, 234);
			}
			else if (l >= 3) {
				liczba = l;				
				heal = (int) (t.obliczHP(n)*0.2);
				attackSpeed = 0.12;
				next = 6;
				color = new Color(153, 77, 0);
				
			}
			else {
				liczba = l;
				heal = 0;
				attackSpeed = 0;
				next = 3;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Trucizna") {
			przypisanie(n);
			opis = "(3) Dodaje 30% burnAtak i burnSpell oraz 0.6s slowSpell";
			if (l >= 3) {
				burnSpell = 0.3;
				burnAtak = 0.3;
				slowSpell = 0.6;
				liczba = l;
				next = 3;
				color = new Color(255, 163, 26);
			}
			else {
				liczba = l;
				next = 3;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Wartownik") {
			przypisanie(n);
			opis = "(2/4/6) Zwiêksza armor wartowników o 60%/150%/350%";
			if (l >= 6) {
				liczba = l;
				armor = t.obliczArmor(n)*3.5;
				next = 6;
				color = new Color(255, 163, 26);
			}
			else if (l >= 4) {
				liczba = l;
				armor = t.obliczArmor(n)*1.5;			
				next = 6;
				color = new Color(225, 225, 234);
			}
			else if (l >= 2) {
				liczba = l;				
				armor = t.obliczArmor(n)*0.6;
				next = 4;
				color = new Color(153, 77, 0);
				
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else if (n == "Zwiadowca") {
			przypisanie(n);
			opis = "(2/4/6) Zwiêksza attackSpeed zwiadowców o 35%/80%/150%";
			if (l >= 6) {
				liczba = l;
				attackSpeed = t.obliczAttackSpeed(n)*1.5;
				next = 6;
				color = new Color(255, 163, 26);
			}
			else if (l >= 4) {
				liczba = l;
				attackSpeed = t.obliczAttackSpeed(n)*0.8;		
				next = 6;
				color = new Color(225, 225, 234);
			}
			else if (l >= 2) {
				liczba = l;				
				attackSpeed = t.obliczAttackSpeed(n)*0.35;
				next = 4;
				color = new Color(153, 77, 0);
				
			}
			else {
				liczba = l;
				next = 2;
				color = new Color(255, 255, 255);
			}
		}
		
		else {
			if (l >= 6) {
				liczba = l;
				nazwa = n;
				opis = "opis " + n;
				AD = 200;
				AP = 0;
				HP = 0;
				heal = 0;
				armor = 0;
				magicResist = 0;
				burnAtak = 0;
				burnSpell = 0;
				crit = 0;
				critPower = 0;
				nieuchronneSpell = 0;
				nieuchronneAtak = 0;
				spellSpeed = 0;
				attackSpeed = 0;
				slowSpell = 0;
				slowAttack = 0;
				next = 6;
				color = new Color(255, 163, 26);
			}
			else if (l >= 4) {
				liczba = l;
				nazwa = n;
				opis = "opis " + n;
				AD = 400;
				AP = 0;
				HP = 0;
				heal = 0;
				armor = 0;
				magicResist = 0;
				burnAtak = 0;
				burnSpell = 0;
				crit = 0;
				critPower = 0;
				nieuchronneSpell = 0;
				nieuchronneAtak = 0;
				spellSpeed = 0;
				attackSpeed = 0;
				slowSpell = 0;
				slowAttack = 0;
				next = 15;
				color = new Color(153, 77, 0);
			}
			else {
				liczba = l;
				nazwa = n;
				opis = "opis "+ n;
				AD = 0;
				AP = 0;
				HP = 0;
				heal = 0;
				armor = 0;
				magicResist = 0;
				burnAtak = 0;
				burnSpell = 0;
				crit = 0;
				critPower = 0;
				nieuchronneSpell = 0;
				nieuchronneAtak = 0;
				spellSpeed = 0;
				attackSpeed = 0;
				slowSpell = 0;
				slowAttack = 0;
				next = 4;
				color = new Color(255, 255, 255);
			}
		}
	}
	
}

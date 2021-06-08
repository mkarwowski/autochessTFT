package tft;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

import plansza.Plansza;

import java.util.Timer;
import java.util.TimerTask;
@SuppressWarnings("serial")
public class Okno extends JFrame {
	public static ArrayList<Liczebnosc> liczebnosc = new ArrayList<Liczebnosc>();
	public static ArrayList<JButton> jbLawka = new ArrayList<JButton>();
	ArrayList<JButton> jbBoard = new ArrayList<JButton>();
	static ArrayList<JButton> jbOrigin = new ArrayList<JButton>();
	ArrayList<JLabel> jlInfoWalkaAD = new ArrayList<JLabel>();
	ArrayList<JLabel> jlInfoWalkaAP = new ArrayList<JLabel>();
	ArrayList<JLabel> jlInfoWalkaEnemyAD = new ArrayList<JLabel>();
	ArrayList<JLabel> jlInfoWalkaEnemyAP = new ArrayList<JLabel>();
	ArrayList<Team> teams = new ArrayList<Team>();
	
	boolean czyRanked;
	
	public static Team team;
	
	Team min1 = new Team(1);
	
	Timer timer1 = new Timer();
	Timer timer2 = new Timer();
	Timer timer3 = new Timer();
	Timer timer4 = new Timer();
	Timer check = new Timer();
	
	int liczbaZakonczonych = 0;
	int liczbaWalk = 0;
	int liczbaDostepnych = 2;
	int nrInfoAD = 0;
	int nrInfoAP = 0;
	int nrInfoEnemyAD = 0;
	int nrInfoEnemyAP = 0;
	
	boolean czyZadaneHP;
	
	Team a;
	Team b;
	
	boolean czyTrwaWalka;
	
	int nrRundy = 1;

	JButton ex = new JButton("EXIT");
	JButton showTeams = new JButton("Poka¿ dru¿yny");
	JPanel przyciski = new JPanel();
	
	JProgressBar healthBarPlayer;
	JProgressBar healthBarPlayerTeam;
	JProgressBar healthBarEnemy;
	JProgressBar healthBarEnemyTeam;
	
	int ktoryGracz = 0;
	int liczbaGraczy = 0;
	
	JLabel hpTeamL = new JLabel();
	JLabel lvlL = new JLabel();
	JLabel moneyL = new JLabel();
	JButton roll = new JButton("Roll (2c)");
	JButton lvlUp = new JButton("Kup exp (4c)");
	JButton walka = new JButton("Walcz");
	JButton onBoard = new JButton("Chuj");
	JButton sell = new JButton ("Sprzedaj");
	JButton infoH = new JButton ("Info");
	
	GeneratorH g1;
	GeneratorH g2;
	GeneratorH g3;
	GeneratorH g4;
	GeneratorH g5;
	
	JPanel jpBoard = new JPanel();
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();
    JButton b5 = new JButton();
    JButton b6 = new JButton();
    JButton b7 = new JButton();
    JButton b8 = new JButton();
    JButton b9 = new JButton();
    JButton b10 = new JButton();
    
    JPanel jpLawka = new JPanel();
    JButton l1 = new JButton();
    JButton l2 = new JButton();
    JButton l3 = new JButton();
    JButton l4 = new JButton();
    JButton l5 = new JButton();
    JButton l6 = new JButton();
    JButton l7 = new JButton();
    JButton l8 = new JButton();
    JButton l9 = new JButton();
    JButton l10 = new JButton();
    
    JButton o1 = new JButton();
    JButton o2 = new JButton();
    JButton o3 = new JButton();
    JButton o4 = new JButton();
    JButton o5 = new JButton();
    JButton o6 = new JButton();
    JButton o7 = new JButton();
    JButton o8 = new JButton();
    JButton o9 = new JButton();
    JButton o10 = new JButton();
	
    JLabel HPL = new JLabel();
    JLabel ADL = new JLabel();
    JLabel APL = new JLabel();
    JLabel nieuchronneAtakL = new JLabel();
    JLabel nieuchronneSpellL = new JLabel();
    JLabel armorL = new JLabel();
    JLabel magicResistL = new JLabel();
    JLabel attackSpeedL = new JLabel();
    JLabel spellSpeedL = new JLabel();
    JLabel critL = new JLabel();
    JLabel critPowerL = new JLabel();
    JLabel lifeStealAtakL = new JLabel();
    JLabel lifeStealSpellL = new JLabel();
    JLabel healL = new JLabel();
    JLabel slowAttackL = new JLabel();
    JLabel slowSpellL = new JLabel();
    JLabel burnAtakL = new JLabel();
    JLabel burnSpellL = new JLabel();
    JLabel unikJL = new JLabel();
    
    JButton koniecWalki = new JButton("Koniec walki");
    
	JButton h1 = new JButton();
	JButton h2 = new JButton();
	JButton h3 = new JButton();
	JButton h4 = new JButton();
	JButton h5 = new JButton();
	
	int heroChoose;
	boolean czyBoard;
	
	JLabel infoPrzeciwnik = new JLabel(min1.boardToString());
	JLabel infoPrzeciwnikOrigin = new JLabel (min1.originToString());
	JLabel infoTyHP = new JLabel();
	JLabel infoTyTeam = new JLabel();
	JLabel infoEnHP = new JLabel(min1.name+ "'s HP: "+min1.HP);
	JLabel infoEnTeam = new JLabel(min1.name+ "'s team HP: " +min1.teamHP);
	JLabel infoWalkaEnemyAD0 = new JLabel("AD zadane przez wroga:");
	JLabel infoWalkaEnemyAD1 = new JLabel("");
	JLabel infoWalkaEnemyAD2 = new JLabel("");
	JLabel infoWalkaEnemyAD3 = new JLabel("");
	JLabel infoWalkaEnemyAD4 = new JLabel("");
	JLabel infoWalkaEnemyAD5 = new JLabel("");
	JLabel infoWalkaEnemyAD6 = new JLabel("");
	JLabel infoWalkaEnemyAD7 = new JLabel("");
	JLabel infoWalkaEnemyAD8 = new JLabel("");
	JLabel infoWalkaEnemyAD9 = new JLabel("");
	JLabel infoWalkaEnemyAD10 = new JLabel("");
	JLabel infoWalkaEnemyAD11 = new JLabel("");
	JLabel infoWalkaEnemyAD12 = new JLabel("");
	JLabel infoWalkaEnemyAD13 = new JLabel("");
	JLabel infoWalkaEnemyAD14 = new JLabel("");
	JLabel infoWalkaEnemyAP0 = new JLabel("AP zadane przez wroga:");
	JLabel infoWalkaEnemyAP1 = new JLabel("");
	JLabel infoWalkaEnemyAP2 = new JLabel("");
	JLabel infoWalkaEnemyAP3 = new JLabel("");
	JLabel infoWalkaEnemyAP4 = new JLabel("");
	JLabel infoWalkaEnemyAP5 = new JLabel("");
	JLabel infoWalkaEnemyAP6 = new JLabel("");
	JLabel infoWalkaEnemyAP7 = new JLabel("");
	JLabel infoWalkaEnemyAP8 = new JLabel("");
	JLabel infoWalkaEnemyAP9 = new JLabel("");
	JLabel infoWalkaEnemyAP10 = new JLabel("");
	JLabel infoWalkaEnemyAP11 = new JLabel("");
	JLabel infoWalkaEnemyAP12 = new JLabel("");
	JLabel infoWalkaEnemyAP13 = new JLabel("");
	JLabel infoWalkaEnemyAP14 = new JLabel("");
	JLabel infoWalkaAD0 = new JLabel("AD zadane przez ciebie:");
	JLabel infoWalkaAD1 = new JLabel("");
	JLabel infoWalkaAD2 = new JLabel("");
	JLabel infoWalkaAD3 = new JLabel("");
	JLabel infoWalkaAD4 = new JLabel("");
	JLabel infoWalkaAD5 = new JLabel("");
	JLabel infoWalkaAD6 = new JLabel("");
	JLabel infoWalkaAD7 = new JLabel("");
	JLabel infoWalkaAD8 = new JLabel("");
	JLabel infoWalkaAD9 = new JLabel("");
	JLabel infoWalkaAD10 = new JLabel("");
	JLabel infoWalkaAD11 = new JLabel("");
	JLabel infoWalkaAD12 = new JLabel("");
	JLabel infoWalkaAD13 = new JLabel("");
	JLabel infoWalkaAD14 = new JLabel("");
	JLabel infoWalkaAP0 = new JLabel("AP zadane przez ciebie:");
	JLabel infoWalkaAP1 = new JLabel("");
	JLabel infoWalkaAP2 = new JLabel("");
	JLabel infoWalkaAP3 = new JLabel("");
	JLabel infoWalkaAP4 = new JLabel("");
	JLabel infoWalkaAP5 = new JLabel("");
	JLabel infoWalkaAP6 = new JLabel("");
	JLabel infoWalkaAP7 = new JLabel("");
	JLabel infoWalkaAP8 = new JLabel("");
	JLabel infoWalkaAP9 = new JLabel("");
	JLabel infoWalkaAP10 = new JLabel("");
	JLabel infoWalkaAP11 = new JLabel("");
	JLabel infoWalkaAP12 = new JLabel("");
	JLabel infoWalkaAP13 = new JLabel("");
	JLabel infoWalkaAP14 = new JLabel("");
	
	Plansza plansza;
	
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
	
	public Okno(boolean czyR, ArrayList<String> teamNames) {
		czyRanked = czyR;
		setTeams(teamNames);
		team = teams.get(0);
		HPL.setText("HP: " + team.teamHP);
		ADL.setText("AD: " + team.AD);
		APL.setText("AP: " + team.AP);
		nieuchronneAtakL.setText("Nieuchronne atak: " + team.nieuchronneAtak);
		nieuchronneSpellL.setText("Nieuchronne spell: " + team.nieuchronneSpell);
		armorL.setText("Armor: " + team.armor);
		magicResistL.setText("Magic resist: " + team.magicResist);
		attackSpeedL.setText("Attack speed: " + team.attackSpeed);
		spellSpeedL.setText("Spell speed: " + team.spellSpeed);
		critL.setText("Crit chance: " + team.crit);
		critPowerL.setText("Crit power: " + team.critPower);
		lifeStealAtakL.setText("Lifesteal atak: " + team.lifeStealAtak);
		lifeStealSpellL.setText("Lifesteal spell: " + team.lifeStealSpell);
		healL.setText("Heal: " + team.heal);
		burnAtakL.setText("Burn atak: " + team.burnAtak);
		burnSpellL.setText("Burn spell: " + team.burnSpell);
		slowAttackL.setText("Attack slow: " + team.slowAttack);
		slowSpellL.setText("Spell slow: " + team.slowSpell);
		unikJL.setText("Unik: " + team.unik);
		
		
		
		infoTyTeam.setText(team.name+ "'s team HP: " +team.teamHP);
		g1 = new GeneratorH(team);
		g2 = new GeneratorH(team);
		g3 = new GeneratorH(team);
		g4 = new GeneratorH(team);
		g5 = new GeneratorH(team);
		setGButtons();
		Main.generowanieZywiolu();
		l1.setName("0");
		l2.setName("1");
		l3.setName("2");
		l4.setName("3");
		l5.setName("4");
		l6.setName("5");
		l7.setName("6");
		l8.setName("7");
		l9.setName("8");
		l10.setName("9");
		
		b1.setName("0");
		b2.setName("1");
		b3.setName("2");
		b4.setName("3");
		b5.setName("4");
		b6.setName("5");
		b7.setName("6");
		b8.setName("7");
		b9.setName("8");
		b10.setName("9");
		
		o1.setName("0");
		o2.setName("1");
		o3.setName("2");
		o4.setName("3");
		o5.setName("4");
		o6.setName("5");
		o7.setName("6");
		o8.setName("7");
		o9.setName("8");
		o10.setName("9");
		
		
		liczebnosc.add(Main.liczbaRenekton);
		liczebnosc.add(Main.liczbaVladimir);
		liczebnosc.add(Main.liczbaDiana);
		liczebnosc.add(Main.liczbaIvern);
		liczebnosc.add(Main.liczbaKogmaw);
		liczebnosc.add(Main.liczbaMaokai);
		liczebnosc.add(Main.liczbaNasus);
		liczebnosc.add(Main.liczbaOrn);
		liczebnosc.add(Main.liczbaTaliyah);
		liczebnosc.add(Main.liczbaVayne);
		liczebnosc.add(Main.liczbaWarwick);
		liczebnosc.add(Main.liczbaSyndra);
		liczebnosc.add(Main.liczbaVarus);
		liczebnosc.add(Main.liczbaLeBlanc);
		liczebnosc.add(Main.liczbaKindred);
		liczebnosc.add(Main.liczbaBrand);
		liczebnosc.add(Main.liczbaTaric);
		liczebnosc.add(Main.liczbaLeona);
		liczebnosc.add(Main.liczbaNami);
		liczebnosc.add(Main.liczbaOlaf);
		liczebnosc.add(Main.liczbaMundo);
		liczebnosc.add(Main.liczbaVolibear);
		liczebnosc.add(Main.liczbaNeeko);
		liczebnosc.add(Main.liczbaSinged);
		liczebnosc.add(Main.liczbaMalphite);
		liczebnosc.add(Main.liczbaVeigar);
		liczebnosc.add(Main.liczbaReksai);
		liczebnosc.add(Main.liczbaSion);
		liczebnosc.add(Main.liczbaYorick);
		liczebnosc.add(Main.liczbaZed);
		liczebnosc.add(Main.liczbaZyra);
		liczebnosc.add(Main.liczbaSkarner);
		liczebnosc.add(Main.liczbaNocturne);
		liczebnosc.add(Main.liczbaMalzahar);
		liczebnosc.add(Main.liczbaKhazix);
		liczebnosc.add(Main.liczbaAzir);
		liczebnosc.add(Main.liczbaSivir);
		liczebnosc.add(Main.liczbaYasuo);
		liczebnosc.add(Main.liczbaAatrox);
		liczebnosc.add(Main.liczbaJanna);
		liczebnosc.add(Main.liczbaSoraka);
		liczebnosc.add(Main.liczbaMasterYi);
		liczebnosc.add(Main.liczbaKarma);
		liczebnosc.add(Main.liczbaAnnie);
		liczebnosc.add(Main.liczbaNautilius);
		liczebnosc.add(Main.liczbaThresh);
		liczebnosc.add(Main.liczbaAmumu);
		liczebnosc.add(Main.liczbaBraum);
		liczebnosc.add(Main.liczbaEzreal);
		liczebnosc.add(Main.liczbaAshe);
		liczebnosc.add(Main.liczbaTwitch);
		liczebnosc.add(Main.liczbaJax);
		liczebnosc.add(Main.liczbaQiyana);
		
		jbLawka.add(l1);
		jbLawka.add(l2);
		jbLawka.add(l3);
		jbLawka.add(l4);
		jbLawka.add(l5);
		jbLawka.add(l6);
		jbLawka.add(l7);
		jbLawka.add(l8);
		jbLawka.add(l9);
		jbLawka.add(l10);
		jbBoard.add(b1);
		jbBoard.add(b2);
		jbBoard.add(b3);
		jbBoard.add(b4);
		jbBoard.add(b5);
		jbBoard.add(b6);
		jbBoard.add(b7);
		jbBoard.add(b8);
		jbBoard.add(b9);
		jbBoard.add(b10);
		jbOrigin.add(o1);
		jbOrigin.add(o2);
		jbOrigin.add(o3);
		jbOrigin.add(o4);
		jbOrigin.add(o5);
		jbOrigin.add(o6);
		jbOrigin.add(o7);
		jbOrigin.add(o8);
		jbOrigin.add(o9);
		jbOrigin.add(o10);
		jlInfoWalkaAD.add(infoWalkaAD1);
		jlInfoWalkaAD.add(infoWalkaAD2);
		jlInfoWalkaAD.add(infoWalkaAD3);
		jlInfoWalkaAD.add(infoWalkaAD4);
		jlInfoWalkaAD.add(infoWalkaAD5);
		jlInfoWalkaAD.add(infoWalkaAD6);
		jlInfoWalkaAD.add(infoWalkaAD7);
		jlInfoWalkaAD.add(infoWalkaAD8);
		jlInfoWalkaAD.add(infoWalkaAD9);
		jlInfoWalkaAD.add(infoWalkaAD10);
		jlInfoWalkaAD.add(infoWalkaAD11);
		jlInfoWalkaAD.add(infoWalkaAD12);
		jlInfoWalkaAD.add(infoWalkaAD13);
		jlInfoWalkaAD.add(infoWalkaAD14);
		
		jlInfoWalkaAP.add(infoWalkaAP1);
		jlInfoWalkaAP.add(infoWalkaAP2);
		jlInfoWalkaAP.add(infoWalkaAP3);
		jlInfoWalkaAP.add(infoWalkaAP4);
		jlInfoWalkaAP.add(infoWalkaAP5);
		jlInfoWalkaAP.add(infoWalkaAP6);
		jlInfoWalkaAP.add(infoWalkaAP7);
		jlInfoWalkaAP.add(infoWalkaAP8);
		jlInfoWalkaAP.add(infoWalkaAP9);
		jlInfoWalkaAP.add(infoWalkaAP10);
		jlInfoWalkaAP.add(infoWalkaAP11);
		jlInfoWalkaAP.add(infoWalkaAP12);
		jlInfoWalkaAP.add(infoWalkaAP13);
		jlInfoWalkaAP.add(infoWalkaAP14);
		
		jlInfoWalkaEnemyAP.add(infoWalkaEnemyAP1);
		jlInfoWalkaEnemyAP.add(infoWalkaEnemyAP2);
		jlInfoWalkaEnemyAP.add(infoWalkaEnemyAP3);
		jlInfoWalkaEnemyAP.add(infoWalkaEnemyAP4);
		jlInfoWalkaEnemyAP.add(infoWalkaEnemyAP5);
		jlInfoWalkaEnemyAP.add(infoWalkaEnemyAP6);
		jlInfoWalkaEnemyAP.add(infoWalkaEnemyAP7);
		jlInfoWalkaEnemyAP.add(infoWalkaEnemyAP8);
		jlInfoWalkaEnemyAP.add(infoWalkaEnemyAP9);
		jlInfoWalkaEnemyAP.add(infoWalkaEnemyAP10);
		jlInfoWalkaEnemyAP.add(infoWalkaEnemyAP11);
		jlInfoWalkaEnemyAP.add(infoWalkaEnemyAP12);
		jlInfoWalkaEnemyAP.add(infoWalkaEnemyAP13);
		jlInfoWalkaEnemyAP.add(infoWalkaEnemyAP14);
	
		jlInfoWalkaEnemyAD.add(infoWalkaEnemyAD1);
		jlInfoWalkaEnemyAD.add(infoWalkaEnemyAD2);
		jlInfoWalkaEnemyAD.add(infoWalkaEnemyAD3);
		jlInfoWalkaEnemyAD.add(infoWalkaEnemyAD4);
		jlInfoWalkaEnemyAD.add(infoWalkaEnemyAD5);
		jlInfoWalkaEnemyAD.add(infoWalkaEnemyAD6);
		jlInfoWalkaEnemyAD.add(infoWalkaEnemyAD7);
		jlInfoWalkaEnemyAD.add(infoWalkaEnemyAD8);
		jlInfoWalkaEnemyAD.add(infoWalkaEnemyAD9);
		jlInfoWalkaEnemyAD.add(infoWalkaEnemyAD10);
		jlInfoWalkaEnemyAD.add(infoWalkaEnemyAD11);
		jlInfoWalkaEnemyAD.add(infoWalkaEnemyAD12);
		jlInfoWalkaEnemyAD.add(infoWalkaEnemyAD13);
		jlInfoWalkaEnemyAD.add(infoWalkaEnemyAD14);
		
		h1.setBackground(g1.color);
		h2.setBackground(g2.color);
		h3.setBackground(g3.color);
		h4.setBackground(g4.color);
		h5.setBackground(g5.color);
		setTitle("TFT");
		JPanel staty = new JPanel();
		staty.setLayout(new GridLayout(1,4));
		przyciski.setLayout(new GridLayout(1,3));
		JLabel a = new JLabel();
		staty.add(a);
		staty.add(hpTeamL);
		staty.add(lvlL);
		staty.add(moneyL);
		
		JPanel sklep = new JPanel();
		sklep.setLayout(new GridLayout(1,5));
		sklep.add(h1);
		sklep.add(h2);
		sklep.add(h3);
		sklep.add(h4);
		sklep.add(h5);
		
		JPanel expRoll = new JPanel();
		expRoll.setLayout(new GridLayout(1,3));
		expRoll.add(roll);
		expRoll.add(lvlUp);
		expRoll.add(walka);
		
		przyciski.add(showTeams);
		przyciski.add(ex);
		
        setSize(1900, 1050);
        setLocation(0, 0);  
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(4,1));
        
        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(2,1));
        JPanel sterowanieH = new JPanel();
        sterowanieH.setLayout(new GridLayout(1,3));
        sterowanieH.add(onBoard);
        sterowanieH.add(sell);
        sterowanieH.add(infoH);
        JPanel jp3 = new JPanel();
        jp3.setLayout(new GridLayout(3,1));
        JPanel jp4 = new JPanel();
        jp4.setLayout(new GridLayout(1,3));
        JPanel originy = new JPanel();
        JPanel stats = new JPanel();
        stats.setLayout(new GridLayout(19,1));
        stats.add(HPL);
        stats.add(ADL);
        stats.add(APL);
        stats.add(nieuchronneAtakL);
        stats.add(nieuchronneSpellL);
        stats.add(armorL);
        stats.add(magicResistL);
        stats.add(attackSpeedL);
        stats.add(spellSpeedL);
        stats.add(critL);
        stats.add(critPowerL);
        stats.add(lifeStealAtakL);
        stats.add(lifeStealSpellL);
        stats.add(healL);
        stats.add(slowAttackL);
        stats.add(slowSpellL);
        stats.add(burnAtakL);
        stats.add(burnSpellL);
        stats.add(unikJL);
        
        originy.setLayout(new GridLayout(10,1));
        originy.add(o1);
        originy.add(o2);
        originy.add(o3);
        originy.add(o4);
        originy.add(o5);
        originy.add(o6);
        originy.add(o7);
        originy.add(o8);
        originy.add(o9);
        originy.add(o10);
        
        JPanel j = new JPanel();
        j.setLayout(new GridLayout(2,1));
        
        jpBoard.setLayout(new GridLayout(2,5));
        jpBoard.add(b1);
        jpBoard.add(b2);
        jpBoard.add(b3);
        jpBoard.add(b4);
        jpBoard.add(b5);
        jpBoard.add(b6);
        jpBoard.add(b7);
        jpBoard.add(b8);
        jpBoard.add(b9);
        jpBoard.add(b10);
        
        jpLawka.setLayout(new GridLayout(2,5));
        jpLawka.add(l1);
        jpLawka.add(l2);
        jpLawka.add(l3);
        jpLawka.add(l4);
        jpLawka.add(l5);
        jpLawka.add(l6);
        jpLawka.add(l7);
        jpLawka.add(l8);
        jpLawka.add(l9);
        jpLawka.add(l10);
        
        JPanel prawyDolny = new JPanel();
        prawyDolny.setLayout(new GridLayout(1,2));
        JPanel HPinfo = new JPanel();
        
       healthBarPlayer = new JProgressBar(0,100);
       healthBarPlayerTeam = new JProgressBar(0,10);
       healthBarEnemy  = new JProgressBar(0,min1.HP);
       healthBarEnemyTeam = new JProgressBar(0,min1.teamHP);
       healthBarPlayer.setValue(team.HP);
       healthBarPlayerTeam.setValue(0);
       healthBarEnemy.setValue(min1.HP);
       healthBarEnemyTeam.setValue(min1.teamHP);
       healthBarPlayer.setBackground(Color.red);
       healthBarPlayerTeam.setBackground(Color.red);
       healthBarEnemy.setBackground(Color.red);
       healthBarEnemyTeam.setBackground(Color.red);
       healthBarPlayer.setForeground(Color.green);
       healthBarPlayerTeam.setForeground(Color.green);
       healthBarEnemy.setForeground(Color.green);
       healthBarEnemyTeam.setForeground(Color.green);
       
        
        HPinfo.setLayout(new GridLayout(8,1));
        HPinfo.add(infoTyHP);
        HPinfo.add(healthBarPlayer);
        HPinfo.add(infoTyTeam);
        HPinfo.add(healthBarPlayerTeam);
        HPinfo.add(infoEnTeam);
        HPinfo.add(healthBarEnemyTeam);
        HPinfo.add(infoEnHP);
        HPinfo.add(healthBarEnemy);
        
        
        JPanel infoWalkaAD = new JPanel();
        JPanel infoWalkaAP = new JPanel();
        JPanel infoWalkaEnemyAD = new JPanel();
        JPanel infoWalkaEnemyAP = new JPanel();
        
        infoWalkaAD.setLayout(new GridLayout(15,1));
        infoWalkaAD.add(infoWalkaAD0);
        infoWalkaAD.add(infoWalkaAD1);
        infoWalkaAD.add(infoWalkaAD2);
        infoWalkaAD.add(infoWalkaAD3);
        infoWalkaAD.add(infoWalkaAD4);
        infoWalkaAD.add(infoWalkaAD5);
        infoWalkaAD.add(infoWalkaAD6);
        infoWalkaAD.add(infoWalkaAD7);
        infoWalkaAD.add(infoWalkaAD8);
        infoWalkaAD.add(infoWalkaAD9);
        infoWalkaAD.add(infoWalkaAD10);
        infoWalkaAD.add(infoWalkaAD11);
        infoWalkaAD.add(infoWalkaAD12);
        infoWalkaAD.add(infoWalkaAD13);
        infoWalkaAD.add(infoWalkaAD14);
        
        infoWalkaAP.setLayout(new GridLayout(15,1));
        infoWalkaAP.add(infoWalkaAP0);
        infoWalkaAP.add(infoWalkaAP1);
        infoWalkaAP.add(infoWalkaAP2);
        infoWalkaAP.add(infoWalkaAP3);
        infoWalkaAP.add(infoWalkaAP4);
        infoWalkaAP.add(infoWalkaAP5);
        infoWalkaAP.add(infoWalkaAP6);
        infoWalkaAP.add(infoWalkaAP7);
        infoWalkaAP.add(infoWalkaAP8);
        infoWalkaAP.add(infoWalkaAP9);
        infoWalkaAP.add(infoWalkaAP10);
        infoWalkaAP.add(infoWalkaAP11);
        infoWalkaAP.add(infoWalkaAP12);
        infoWalkaAP.add(infoWalkaAP13);
        infoWalkaAP.add(infoWalkaAP14);
        
        infoWalkaEnemyAP.setLayout(new GridLayout(15,1));
        infoWalkaEnemyAP.add(infoWalkaEnemyAP0);
        infoWalkaEnemyAP.add(infoWalkaEnemyAP1);
        infoWalkaEnemyAP.add(infoWalkaEnemyAP2);
        infoWalkaEnemyAP.add(infoWalkaEnemyAP3);
        infoWalkaEnemyAP.add(infoWalkaEnemyAP4);
        infoWalkaEnemyAP.add(infoWalkaEnemyAP5);
        infoWalkaEnemyAP.add(infoWalkaEnemyAP6);
        infoWalkaEnemyAP.add(infoWalkaEnemyAP7);
        infoWalkaEnemyAP.add(infoWalkaEnemyAP8);
        infoWalkaEnemyAP.add(infoWalkaEnemyAP9);
        infoWalkaEnemyAP.add(infoWalkaEnemyAP10);
        infoWalkaEnemyAP.add(infoWalkaEnemyAP11);
        infoWalkaEnemyAP.add(infoWalkaEnemyAP12);
        infoWalkaEnemyAP.add(infoWalkaEnemyAP13);
        infoWalkaEnemyAP.add(infoWalkaEnemyAP14);
        
        infoWalkaEnemyAD.setLayout(new GridLayout(15,1));
        infoWalkaEnemyAD.add(infoWalkaEnemyAD0);
        infoWalkaEnemyAD.add(infoWalkaEnemyAD1);
        infoWalkaEnemyAD.add(infoWalkaEnemyAD2);
        infoWalkaEnemyAD.add(infoWalkaEnemyAD3);
        infoWalkaEnemyAD.add(infoWalkaEnemyAD4);
        infoWalkaEnemyAD.add(infoWalkaEnemyAD5);
        infoWalkaEnemyAD.add(infoWalkaEnemyAD6);
        infoWalkaEnemyAD.add(infoWalkaEnemyAD7);
        infoWalkaEnemyAD.add(infoWalkaEnemyAD8);
        infoWalkaEnemyAD.add(infoWalkaEnemyAD9);
        infoWalkaEnemyAD.add(infoWalkaEnemyAD10);
        infoWalkaEnemyAD.add(infoWalkaEnemyAD11);
        infoWalkaEnemyAD.add(infoWalkaEnemyAD12);
        infoWalkaEnemyAD.add(infoWalkaEnemyAD13);
        infoWalkaEnemyAD.add(infoWalkaEnemyAD14);
        prawyDolny.add(HPinfo);
        JPanel infoPrzeciwnikCale = new JPanel();
        infoPrzeciwnikCale.setLayout(new GridLayout(2,1));
        infoPrzeciwnikCale.add(infoPrzeciwnik);
        infoPrzeciwnikCale.add(infoPrzeciwnikOrigin);
        prawyDolny.add(infoPrzeciwnikCale);
        prawyDolny.add(infoWalkaAD);
        prawyDolny.add(infoWalkaAP);
        prawyDolny.add(infoWalkaEnemyAD);
        prawyDolny.add(infoWalkaEnemyAP);
        
        ex.addActionListener(new exAL());
        lvlUp.addActionListener(new lvlUpAL());
        h1.addActionListener(new h1AL());
        h2.addActionListener(new h2AL());
        h3.addActionListener(new h3AL());
        h4.addActionListener(new h4AL());
        h5.addActionListener(new h5AL());
        roll.addActionListener(new rollAL());
        l1.addActionListener(new lAL());
        l2.addActionListener(new lAL());
        l3.addActionListener(new lAL());
        l4.addActionListener(new lAL());
        l5.addActionListener(new lAL());
        l6.addActionListener(new lAL());
        l7.addActionListener(new lAL());
        l8.addActionListener(new lAL());
        l9.addActionListener(new lAL());
        l10.addActionListener(new lAL());
        b1.addActionListener(new bAL());
        b2.addActionListener(new bAL());
        b3.addActionListener(new bAL());
        b4.addActionListener(new bAL());
        b5.addActionListener(new bAL());
        b6.addActionListener(new bAL());
        b7.addActionListener(new bAL());
        b8.addActionListener(new bAL());
        b9.addActionListener(new bAL());
        b10.addActionListener(new bAL());
        o1.addActionListener(new oAL());
        o2.addActionListener(new oAL());
        o3.addActionListener(new oAL());
        o4.addActionListener(new oAL());
        o5.addActionListener(new oAL());
        o6.addActionListener(new oAL());
        o7.addActionListener(new oAL());
        o8.addActionListener(new oAL());
        o9.addActionListener(new oAL());
        o10.addActionListener(new oAL());
        
        onBoard.addActionListener(new onBoardAL());
        sell.addActionListener(new sellAL());
        infoH.addActionListener(new infoHAL());
        walka.addActionListener(new walczAL());
        koniecWalki.addActionListener(new koniecWalkiAL());
        showTeams.addActionListener(new showTeamsAL());
        
        add(j);
        add(jp2);
        jp.add(staty);
        jp.add(sklep);
        jp.add(expRoll);
        jp.add(przyciski);
        j.add(jp3);
        j.add(jp);
        jp3.add(jpBoard);
        jp3.add(sterowanieH);
        jp3.add(jpLawka);
        jp4.add(originy);
        jp4.add(stats);
        jp4.add(koniecWalki);
        jp2.add(jp4);
        plansza = new Plansza();
        jp2.add(plansza);//prawyDolny
       
        setLayout(new GridLayout(1,2));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setIMGproperties(h1);
        //setIMGproperties(h2);
        //setIMGproperties(h3);
        //setIMGproperties(h4);
        //setIMGproperties(h5);
        team.lawka.add(new Hero("Aatrox", 1));
        team.lawka.add(new Hero("Amumu", 2));
        team.lawka.add(new Hero("Annie", 2));
        aktualizacjaBoard();
        aktualizacjaLawki();
        koniecWalki.setVisible(false);
	}
	
	void setIMGproperties(JButton jb) {
		jb.setHorizontalTextPosition(JButton.CENTER);
		jb.setVerticalTextPosition(JButton.CENTER);
		jb.setIcon(createImageIcon("img/renekton.jpg", "renek"));
		jb.setForeground(Color.WHITE);
	}
	
	void setTeams(ArrayList<String> teamNames) {
		for (int i = 0; i < teamNames.size(); i++) {
			teams.add(new Team(teamNames.get(i)));
			teams.get(i).okreslCzyBot(false);
			liczbaGraczy++;
		}
		for (int i = teamNames.size(); i < 8; i++) {
			teams.add(new Team("Bot " + i));
			teams.get(i).okreslCzyBot(true);
		}
	}
	
	void chooseTeam() {
		ktoryGracz++;
		if (ktoryGracz == liczbaGraczy) {
			ktoryGracz = 0;
			aktualizujBoty();
			nrRundy++;
		}
		team = teams.get(ktoryGracz);
	}
	
	public static void aktualizacjaLawki() {
		int i;
		Color c1 = new Color(130,130,130);
		Color c2 = new Color(52,200,52);
		Color c3 = new Color(0,102,204);
		Color c4 = new Color(154,51,255);
		Color c5 = new Color(170,170,0);
		Color c7 = new Color(174,245,255);
		
		for (i = 0; i < 10; i++) {
			jbLawka.get(i).setBackground(null);
			jbLawka.get(i).setText("");
		}
		for (i = 0; i < team.lawka.size(); i++) {
			jbLawka.get(i).setText(team.lawka.get(i).nazwa + " (" + team.lawka.get(i).lvl + ")");
			if (team.lawka.get(i).cost == 1) jbLawka.get(i).setBackground(c1);
			else if (team.lawka.get(i).cost == 2) jbLawka.get(i).setBackground(c2);
			else if (team.lawka.get(i).cost == 3) jbLawka.get(i).setBackground(c3);
			else if (team.lawka.get(i).cost == 4) jbLawka.get(i).setBackground(c4);
			else if (team.lawka.get(i).cost == 5) jbLawka.get(i).setBackground(c5);
			else if (team.lawka.get(i).cost == 7) jbLawka.get(i).setBackground(c7);
		}
	}
	
	void aktualizacjaBoard() {
		int i;
		Color c1 = new Color(130,130,130);
		Color c2 = new Color(52,200,52);
		Color c3 = new Color(0,102,204);
		Color c4 = new Color(154,51,255);
		Color c5 = new Color(170,170,0);
		Color c7 = new Color(174,245,255);
		
		for (i = 0; i < team.boardSize; i++) {
			jbBoard.get(i).setBackground(null);
			jbBoard.get(i).setText("");
		}
		for (i = team.boardSize; i < 10; i++) {
			jbBoard.get(i).setBackground(Color.black);
			jbBoard.get(i).setText("");
		}
		
		for (i = 0; i < team.board.size(); i++) {
			jbBoard.get(i).setText(team.board.get(i).nazwa + " (" + team.board.get(i).lvl + ")");
			if (team.board.get(i).cost == 1) jbBoard.get(i).setBackground(c1);
			else if (team.board.get(i).cost == 2) jbBoard.get(i).setBackground(c2);
			else if (team.board.get(i).cost == 3) jbBoard.get(i).setBackground(c3);
			else if (team.board.get(i).cost == 4) jbBoard.get(i).setBackground(c4);
			else if (team.board.get(i).cost == 5) jbBoard.get(i).setBackground(c5);
			else if (team.board.get(i).cost == 7) jbBoard.get(i).setBackground(c7);
		}
	}
	
	public static void aktualizacjaOrigin(Team t) {
		team.aktualizujOrigin();
		aktualizacjaButtonsOrigin(t);
	}
	
	static void aktualizacjaButtonsOrigin(Team t) {
		for (int i = 0; i < 10; i++) {
			jbOrigin.get(i).setBackground(null);
			jbOrigin.get(i).setText("");
		}
		
		for (int j = 0; j < t.origin.size() && j < 10; j++) {
			jbOrigin.get(j).setText(t.origin.get(j).nazwa + " (" + t.origin.get(j).liczba + "/" + t.origin.get(j).next + ")");
			jbOrigin.get(j).setBackground(t.origin.get(j).color);
			jbOrigin.get(j).setForeground(Color.black);
		}
	}
	
	static boolean szukajOrigin(String s, Hero h, boolean czyDodac, Team t) {
		boolean czy = false;
		int counter = 0;
		for (int i = 0; i < t.board.size(); i++) {
			if (h.nazwa == t.board.get(i).nazwa) {
				counter++;
				if (counter > 1) {
					return true;
				}
			}
		}
		for (int j = 0; j < t.origin.size(); j++) {
			if(t.origin.get(j).nazwa == s && s!="" && czyDodac) {
				int l = t.origin.get(j).liczba;
				l++;
				t.origin.remove(j);
				Origins o = new Origins(s, l, t);
				t.origin.add(0,o);
				czy = true;
			}
			else if (t.origin.get(j).nazwa == s && s!="" && !czyDodac) {
				int l = t.origin.get(j).liczba;
				l--;
				t.origin.remove(j);
				if (l != 0) {
					Origins o = new Origins(s, l, t);
					t.origin.add(0,o);
				}
				czy = true;
			}
		}
		return czy;
	}
	
	static void originSet(Hero h, boolean czyDodac, Team t) {
		boolean czy = szukajOrigin(h.klasa.klasa, h, czyDodac, t);
		if (!czy) {
			Origins o = new Origins(h.klasa.klasa, 1, t);
			t.origin.add(o);
		}
		czy = szukajOrigin(h.klasa.origin, h, czyDodac,t);
		if (!czy) {
			Origins o = new Origins(h.klasa.origin, 1, t);
			t.origin.add(o);
		}
		czy = szukajOrigin(h.klasa.origin2, h, czyDodac, t);
		if (!czy && h.klasa.origin2!="") {
			Origins o = new Origins(h.klasa.origin2, 1, t);
			t.origin.add(o);
		}
	}
	
	void aktualizacjaStat() {
		HPL.setText("HP: " + team.teamHP);
		ADL.setText("AD: " + team.AD);
		APL.setText("AP: " + team.AP);
		nieuchronneAtakL.setText("Nieuchronne atak: " + team.nieuchronneAtak);
		nieuchronneSpellL.setText("Nieuchronne spell: " + team.nieuchronneSpell);
		armorL.setText("Armor: " + team.armor);
		magicResistL.setText("Magic resist: " + team.magicResist);
		attackSpeedL.setText("Attack speed: " + team.attackSpeed);
		spellSpeedL.setText("Spell speed: " + team.spellSpeed);
		critL.setText("Crit chance: " + team.crit);
		critPowerL.setText("Crit power: " + team.critPower);
		lifeStealAtakL.setText("Lifesteal atak: " + team.lifeStealAtak);
		lifeStealSpellL.setText("Lifesteal spell: " + team.lifeStealSpell);
		healL.setText("Heal: " + team.heal);
		burnAtakL.setText("Burn atak: " + team.burnAtak);
		burnSpellL.setText("Burn spell: " + team.burnSpell);
		slowAttackL.setText("Attack slow: " + team.slowAttack);
		slowSpellL.setText("Spell slow: " + team.slowSpell);
		unikJL.setText("Unik: " + team.unik);
		
		healthBarPlayerTeam.setMaximum(team.teamHP);
		healthBarPlayerTeam.setValue(team.teamHP);
		infoTyTeam.setText(team.name+ "'s team HP: " +team.teamHP);
	}
	
	void aktualizacjaSterowania() {
		onBoard.setText("Wybierz bohatera");
		sell.setText("Wybierz bohatera");
		infoH.setText("Wybierz bohatera");
	}
	
	
	void wlaczSterowanie(boolean t) {
		onBoard.setEnabled(t);
		sell.setEnabled(t);
		//infoH.setEnabled(t);
		h1.setEnabled(t);
		h2.setEnabled(t);
		h3.setEnabled(t);
		h4.setEnabled(t);
		h5.setEnabled(t);
		roll.setEnabled(t);
		walka.setEnabled(t);
		if (team.lvl < 9) {
			lvlUp.setEnabled(t);
		}
	}
	
	
	void aktualizacjaHP() {
		if (a.teamHP > 0 && b.teamHP > 0) {
		infoTyTeam.setText(a.name+ "'s team HP: " +a.teamHP);
		infoEnTeam.setText(b.name+ "'s team HP: " +b.teamHP);
		healthBarPlayerTeam.setValue(a.teamHP);
		healthBarEnemyTeam.setValue(b.teamHP);
		}
		else if (a.teamHP > 0) {
			infoTyTeam.setText(a.name+ "'s team HP: " + a.teamHP);
			infoEnTeam.setText(b.name+ "'s team HP: 0");
			healthBarPlayerTeam.setValue(a.teamHP);
			healthBarEnemyTeam.setValue(0);
		}
		else if (b.teamHP > 0) {
			infoTyTeam.setText(a.name+ "'s team HP: 0");
			infoEnTeam.setText(b.name+ "'s team HP: "+ b.teamHP);
			healthBarPlayerTeam.setValue(0);
			healthBarEnemyTeam.setValue(b.teamHP);
		}
		else {
			infoTyTeam.setText(a.name+ "'s team HP: 0");
			infoEnTeam.setText(b.name+ "'s team HP: 0");
			healthBarPlayerTeam.setValue(0);
			healthBarEnemyTeam.setValue(0);
		}
	}
	
	void aktualizacjaBota(Team bot) {
		bot.aktualizujBota(nrRundy);
		bot.origin.clear();
		for (int i = 0; i < bot.board.size(); i++) {
			originSet(bot.board.get(i), true, bot);
		}
		//bot.aktualizacja();
	}
	
	void aktualizujBoty() {
		System.out.println(liczbaGraczy);
		for (int i = liczbaGraczy; i < teams.size(); i++) {
			aktualizacjaBota(teams.get(i));
		}
	}
	
	void losujTeam() {
		Random r = new Random();
		int rand = r.nextInt(teams.size());
		
		if (rand == ktoryGracz) losujTeam();
		else {
			boolean c = false;
			for (int i = 0; i < teams.size(); i++) {
				if (i == ktoryGracz);
				else if (teams.get(i).HP > 0) {
					c = true;
					break;
				}
			}
			if (teams.get(rand).HP > 0 && team.last != teams.get(rand).name) {
				b = teams.get(rand);
			}
			else if (c) losujTeam();
			else b = null;
		}
	}
	
	void aktualizacjaHPteam() {
		if (a.HP > 0 && b.HP > 0) {
			infoTyHP.setText(a.name+ "'s HP: "+a.HP);
			infoEnHP.setText(b.name+ "'s HP: "+b.HP);
			healthBarPlayer.setValue(a.HP);
			healthBarEnemy.setValue(b.HP);
		}
		else if (a.HP > 0) {
			infoTyHP.setText(a.name+ "'s HP: "+a.HP);
			infoEnHP.setText(b.name+ "'s HP: 0");
			healthBarPlayer.setValue(a.HP);
			healthBarEnemy.setValue(b.HP);
			if (nrRundy > 3) {
				teams.get(teams.indexOf(b)).deadBot();
				teams.remove(teams.indexOf(b));
			}
		}
		else if (b.HP > 0) {
			infoTyHP.setText(a.name+ "'s HP: 0");
			infoEnHP.setText(b.name+ "'s HP: "+b.HP);
			healthBarPlayer.setValue(a.HP);
			healthBarEnemy.setValue(b.HP);
			new Koniec("Zajales " + teams.size() + " miejsce", teams.size(), czyRanked);
		}
		else {
			infoTyHP.setText(a.name+ "'s HP: 0");
			infoEnHP.setText(b.name+ "'s HP: 0");
			healthBarPlayer.setValue(a.HP);
			healthBarEnemy.setValue(b.HP);
			new Koniec("Zajales " + teams.size() + " miejsce", teams.size(), czyRanked);
		}
	}
	
	void sellanie() {
		if (Plansza.choosedPole && Plansza.x >= 0) {
			if (team.board.get(heroChoose).nazwa == "Lux") {
				int licznik = 0;
				for (int i = 0; i < team.board.size(); i++) {
					if (team.board.get(heroChoose).nazwa == "Lux") {
						licznik++;
					}
				}
				for (int i = 0; i < team.lawka.size(); i++) {
					if (team.lawka.get(heroChoose).nazwa == "Lux") {
						licznik++;
					}
				}
				if (licznik < 2) {
					team.czyJestAvatar = false;
					team.checkAvatar = true;
				}
			}
			int l = team.board.get(heroChoose).lvl;
			for (int i = 0; i < liczebnosc.size(); i++) {
				Liczebnosc a = liczebnosc.get(i);
				if(a.nazwa == team.board.get(heroChoose).nazwa) {
					if(l == 1) {
						a.liczba++;
					}
					else if (l == 2) {
						a.liczba+=3;
					}
					else if (l == 3){
						a.liczba+=9;
						for (int j = 0; j < team.star3.size(); j++) {
							if(team.star3.get(j) == a.nazwa) {
								team.star3.remove(j);
							}
						}
					}
					break;
				}
			}
			team.money = team.money + team.board.get(heroChoose).re;
			aktualizacjaOrigin(team);
			Plansza.pola.get(team.board.get(heroChoose).pozycja.getX()).get(team.board.get(heroChoose).pozycja.getY()).setToBegin(true);
			team.board.remove(heroChoose);
			moneyL.setText("Zloto: " + Integer.toString(team.money));
			
			aktualizacjaBoard();
			aktualizacjaSterowania();
			aktualizacjaStat();
			
		}
		else if (Plansza.choosedPole && Plansza.x < 0) {
			if (team.lawka.get(heroChoose).nazwa == "Lux") {
				int licznik = 0;
				for (int i = 0; i < team.board.size(); i++) {
					if (team.board.get(heroChoose).nazwa == "Lux") {
						licznik++;
					}
				}
				for (int i = 0; i < team.board.size(); i++) {
					if (team.lawka.get(heroChoose).nazwa == "Lux") {
						licznik++;
					}
				}
				if (licznik < 2) {
					team.czyJestAvatar = false;
				}
			}
			int l = team.lawka.get(heroChoose).lvl;
			for (int i = 0; i < liczebnosc.size(); i++) {
				Liczebnosc a = liczebnosc.get(i);
				if(a.nazwa == team.lawka.get(heroChoose).nazwa) {
					if(l == 1) {
						a.liczba++;
					}
					else if (l == 2) {
						a.liczba+=3;
					}
					else if (l == 3){
						a.liczba+=9;
					}
					break;
				}
			}
			team.money = team.money + team.lawka.get(heroChoose).re;
			team.lawka.remove(heroChoose);
			moneyL.setText("Zloto: " + Integer.toString(team.money));
			aktualizacjaLawki();
			aktualizacjaSterowania();
		}
		Plansza.choosedPole = false;
		
	}
	
	void generowanieH(GeneratorH g, JButton h) {
		if (team.money >= g.hero.cost && team.lawkaSize != team.lawka.size()) {
			team.lawka.add(g.hero);
			team.money -= g.hero.cost;
			if (g.hero.nazwa == "Lux") {
				team.czyJestAvatar = true;
				team.jakiAvatar = g.hero.klasa.origin;
			}
			moneyL.setText("Zloto: " + Integer.toString(team.money));
			h.setEnabled(false);
			h.setText("");
			h.setVisible(false);
			boolean czy = false;
			
			for (int i = 0; i < liczebnosc.size(); i++) {
				Liczebnosc a = liczebnosc.get(i);
				if(a.nazwa == g.hero.nazwa) {
					a.liczba--;
				}
			}
			int counter = 0;
			int c = 0;
			for (int i = 0; i < team.lawka.size(); i++) {
				if (g.hero.nazwa == team.lawka.get(i).nazwa) {
					counter++;
					if (team.lawka.get(i).lvl == 2) {
						c++;
					}
				}
			}
			for (int i = 0; i < team.board.size(); i++) {
				if (g.hero.nazwa == team.board.get(i).nazwa) {
					counter++;
					czy = true;
					if (team.board.get(i).lvl == 2) {
						c++;
					}
				}
			}
			
			if (counter == 5) {
				for (int i = team.lawka.size()-1; i >= 0; i--) {
					if (g.hero.nazwa == team.lawka.get(i).nazwa) {
						team.lawka.remove(i);
					}
				}
				for (int i = team.board.size()-1; i >= 0; i--) {
					if (g.hero.nazwa == team.board.get(i).nazwa) {
						Plansza.pola.get(team.board.get(i).pozycja.getX()).get(team.board.get(i).pozycja.getY()).setToBeginXY(team.board.get(i).pozycja.getX(), team.board.get(i).pozycja.getY());
						team.board.remove(i);
					}
				}
				String name = g.hero.nazwa;
				Hero hero = new Hero(name, 3);
				team.star3.add(name);
				team.lawka.add(hero);
				if (czy) {
					aktualizacjaOrigin(team);
				}
			}
			
			else if (counter == 3 && c == 0) {
				for (int i = team.lawka.size()-1; i >= 0; i--) {
					if (g.hero.nazwa == team.lawka.get(i).nazwa) {
						team.lawka.remove(i);
					}
				}
				for (int i = team.board.size()-1; i >= 0; i--) {
					if (g.hero.nazwa == team.board.get(i).nazwa) {
						Plansza.pola.get(team.board.get(i).pozycja.getX()).get(team.board.get(i).pozycja.getY()).setToBeginXY(team.board.get(i).pozycja.getX(), team.board.get(i).pozycja.getY());
						team.board.remove(i);
					}
				}
				String name = g.hero.nazwa;
				Hero hero = new Hero(name, 2);
				team.lawka.add(hero);
				if (czy) {
					aktualizacjaOrigin(team);
				}
			}
			else if (counter == 4 && c == 1) {
				for (int i = team.lawka.size()-1; i >= 0; i--) {
					if (g.hero.nazwa == team.lawka.get(i).nazwa && team.lawka.get(i).lvl == 1) {
						team.lawka.remove(i);
						
					}
				}
				for (int i = team.board.size()-1; i >= 0; i--) {
					if (g.hero.nazwa == team.board.get(i).nazwa && team.board.get(i).lvl == 1) {
						Plansza.pola.get(team.board.get(i).pozycja.getX()).get(team.board.get(i).pozycja.getY()).setToBeginXY(team.board.get(i).pozycja.getX(), team.board.get(i).pozycja.getY());
						team.board.remove(i);
					}
					else if(team.board.get(i).lvl == 2) {
						czy = false;
						
					}
				}
				String name = g.hero.nazwa;
				Hero hero = new Hero(name, 2);
				team.lawka.add(hero);
				if (czy) {
					aktualizacjaOrigin(team);
				}
			}
			aktualizacjaLawki();
			aktualizacjaBoard();
			aktualizacjaStat();
		}
		else if(team.money >= g.hero.cost && team.lawkaSize == team.lawka.size()) {
			int counter = 0;
			int c = 0;
			boolean czyB = false;
			boolean czyL = false;
			for (int i = 0; i < team.lawka.size(); i++) {
				if (g.hero.nazwa == team.lawka.get(i).nazwa) {
					counter++;
					czyL = true;
					if (team.lawka.get(i).lvl == 2) {
						c++;
					}
				}
			}
			for (int i = 0; i < team.board.size(); i++) {
				if (g.hero.nazwa == team.board.get(i).nazwa) {
					counter++;
					czyB = true;
					if (team.board.get(i).lvl == 2) {
						c++;
					}
				}
			}
			if (counter == 4) {
				for (int i = team.lawka.size()-1; i >= 0; i--) {
					if (g.hero.nazwa == team.lawka.get(i).nazwa) {
						team.lawka.remove(i);
					}
				}
				for (int i = team.board.size()-1; i >= 0; i--) {
					if (g.hero.nazwa == team.board.get(i).nazwa) {
						Plansza.pola.get(team.board.get(i).pozycja.getX()).get(team.board.get(i).pozycja.getY()).setToBeginXY(team.board.get(i).pozycja.getX(), team.board.get(i).pozycja.getY());
						team.board.remove(i);
					}
				}
				String name = g.hero.nazwa;
				Hero hero = new Hero(name, 3);
				team.star3.add(name);
				if (czyL) {
					team.lawka.add(hero);
				}
				else {
					team.board.add(hero);
					aktualizacjaOrigin(team);
				}
				if (czyB) {
					aktualizacjaOrigin(team);
				}
				team.money -= g.hero.cost;
				moneyL.setText("Zloto: " + Integer.toString(team.money));
				h.setEnabled(false);
				h.setText("");
				h.setVisible(false);
				aktualizacjaLawki();
				aktualizacjaBoard();
				aktualizacjaStat();
			}
			else if (counter == 2 && c == 0) {
				for (int i = team.lawka.size()-1; i >= 0; i--) {
					if (g.hero.nazwa == team.lawka.get(i).nazwa) {
						team.lawka.remove(i);
					}
				}
				for (int i = team.board.size()-1; i >= 0; i--) {
					if (g.hero.nazwa == team.board.get(i).nazwa) {
						Plansza.pola.get(team.board.get(i).pozycja.getX()).get(team.board.get(i).pozycja.getY()).setToBeginXY(team.board.get(i).pozycja.getX(), team.board.get(i).pozycja.getY());
						team.board.remove(i);
					}
				}
				String name = g.hero.nazwa;
				Hero hero = new Hero(name, 2);
				if (czyL) {
					team.lawka.add(hero);
				}
				else {
					team.board.add(hero);
					aktualizacjaOrigin(team);
				}
				if (czyB) {
					aktualizacjaOrigin(team);
				}
				team.money -= g.hero.cost;
				moneyL.setText("Zloto: " + Integer.toString(team.money));
				h.setEnabled(false);
				h.setText("");
				h.setVisible(false);
				aktualizacjaLawki();
				aktualizacjaBoard();
				aktualizacjaStat();
			}
			else if (counter == 3 && c == 1) {
				for (int i = team.lawka.size()-1; i >= 0; i--) {
					if (g.hero.nazwa == team.lawka.get(i).nazwa && team.lawka.get(i).lvl == 1) {
						team.lawka.remove(i);
						
					}
				}
				for (int i = team.board.size()-1; i >= 0; i--) {
					if (g.hero.nazwa == team.board.get(i).nazwa && team.board.get(i).lvl == 1) {
						Plansza.pola.get(team.board.get(i).pozycja.getX()).get(team.board.get(i).pozycja.getY()).setToBeginXY(team.board.get(i).pozycja.getX(), team.board.get(i).pozycja.getY());
						team.board.remove(i);
					}
				}
				String name = g.hero.nazwa;
				Hero hero = new Hero(name, 2);
				if (czyL) {
					team.lawka.add(hero);
				}
				else {
					team.board.add(hero);
					aktualizacjaOrigin(team);
				}
				boolean czyJestLVL2 = false;
				if (czyB) {
					for (int i = 0; i < team.board.size(); i++) {
						if(name == team.board.get(i).nazwa)  czyJestLVL2 = true;
					}
					if(!czyJestLVL2) {
					aktualizacjaOrigin(team);
					}
				}
				team.money -= g.hero.cost;
				moneyL.setText("Zloto: " + Integer.toString(team.money));
				h.setEnabled(false);
				h.setText("");
				h.setVisible(false);
				aktualizacjaLawki();
				aktualizacjaBoard();
				aktualizacjaStat();
			}
		}
	}
	
	boolean czyZmienicIloscCzarych() {
		if (liczbaDostepnych < team.boardSize) return true;
		else return false;
	}
	
	void levelingLabelUpdate() {
		moneyL.setText("Zloto: " + Integer.toString(team.money));
		lvlL.setText("<html>LVL: " + Integer.toString(team.lvl) + "<br/>exp: " + Integer.toString(team.exp) + "<br/>2|8|18|38|70|120|168</html>");
		if (czyZmienicIloscCzarych()) {
			liczbaDostepnych = team.boardSize;
			aktualizacjaBoard();
		}
		if (team.exp >= 186 && team.lvl == 8) {
			lvlUp.setEnabled(false);
			lvlUp.setText("MAX LEVEL");
		}
		else {
			lvlUp.setText("Kup exp (4c)");
		}
	}
	
	void lvlUpButtonUpdate() {
		if (team.lvl > 8) {
			lvlUp.setEnabled(false);
			lvlUp.setText("MAX LEVEL");
		}
		else {
			lvlUp.setEnabled(true);
			lvlUp.setText("Kup exp (4c)");
		}
	}
	
	void leveling(int ile, int koszt) {
		if (team.money >= koszt) {
			team.exp += ile;
			team.money -= koszt;
			
			if (team.exp >= 2 && team.lvl == 2) {
				team.lvl++;
				team.boardSize++;
				
			}
			else if (team.exp >= 8 && team.lvl == 3) {
				team.lvl++;
				team.boardSize++;
				
			}
			else if (team.exp >= 18 && team.lvl == 4) {
				team.lvl++;
				team.boardSize++;
			}
			else if (team.exp >= 38 && team.lvl == 5) {
				team.lvl++;
				team.boardSize++;
			}
			else if (team.exp >= 70 && team.lvl == 6) {
				team.lvl++;
				team.boardSize++;
			}
			else if (team.exp >= 120 && team.lvl == 7) {
				team.lvl++;
				team.boardSize++;
			}
			else if (team.exp >= 186 && team.lvl == 8) {
				team.lvl++;
				team.boardSize++;
				lvlUp.setEnabled(false);
			}
		}
	}
	
	void originLabelsUpdate() {
		
	}
	
	
	void walka(Team a1, Team b1) {
		wlaczSterowanie(false);
		a1.maxHP = a1.teamHP;
		b1.maxHP = b1.teamHP;
		timer1 = new Timer();
		timer2 = new Timer();
		timer3 = new Timer();
		timer4 = new Timer();
		check = new Timer();
		
		a = a1;
		b = b1;
		czyTrwaWalka = true;
		
		nrInfoAD = 0;
		nrInfoAP = 0;
		nrInfoEnemyAD = 0;
		nrInfoEnemyAP = 0;
		
		if(a.spellSpeed > 0) {
			if(b.spellSpeed > 0) {
				timer1.schedule(new AttackA(), (long) ((((1.0/(a.attackSpeed))+b.slowAttack)*1000)));
				timer2.schedule(new AttackB(), (long) ((((1.0/(b.attackSpeed))+a.slowAttack)*1000)));
				timer3.schedule(new SpellAttackA(), (long) ((((1.0/(a.spellSpeed))+b.slowSpell)*1000)));
				timer4.schedule(new SpellAttackB(), (long) ((((1.0/(b.spellSpeed))+a.slowSpell)*1000)));
				check.schedule(new sprawdzanie(), 5000);
			}
			else {
				timer3.schedule(new SpellAttackA(), (long) ((((1.0/(a.spellSpeed))+b.slowSpell)*1000)));
				timer1.schedule(new AttackA(), (long) ((((1.0/(a.attackSpeed))+b.slowAttack)*1000)));
				timer2.schedule(new AttackB(), (long) ((((1.0/(b.attackSpeed))+a.slowAttack)*1000)));
				check.schedule(new sprawdzanie(), 5000);
			}
		}
		else {
			if(b.spellSpeed > 0) {
				timer4.schedule(new SpellAttackB(), (long) ((((1.0/(b.spellSpeed))+a.slowSpell)*1000)));
				timer1.schedule(new AttackA(), (long) ((((1.0/(a.attackSpeed))+b.slowAttack)*1000)));
				timer2.schedule(new AttackB(), (long) ((((1.0/(b.attackSpeed))+a.slowAttack)*1000)));
				check.schedule(new sprawdzanie(), 5000);
				
			}
			else {
				timer1.schedule(new AttackA(), (long) ((((1.0/(a.attackSpeed))+b.slowAttack)*1000)));
				timer2.schedule(new AttackB(), (long) ((((1.0/(b.attackSpeed))+a.slowAttack)*1000)));
				check.schedule(new sprawdzanie(), 15000);
			}
		}
		
	}
	
	class sprawdzanie extends TimerTask {
        public void run() {
        	if(a.teamHP <= 0 || b.teamHP <= 0) {
        		if (czyTrwaWalka) {
        			timer1.cancel();
        			timer2.cancel();
        			timer3.cancel();
        			timer4.cancel();
        			check.cancel();
        			timer1.purge();
        			timer2.purge();
        			timer3.purge();
        			timer4.purge();
        			check.purge();
        			cancel();
        			czyTrwaWalka = false;
        			koniecWalki.setVisible(true);
        			zadaneHP();
        			return;
        		}
        	}
        	else {
        		check.schedule(new sprawdzanie(), 15000);
        		cancel();
        	}
        }
    }
	
	void ktoreInfoZwiekszyc(int id, int i) {
		if(id == 0) {
			nrInfoAD = i;
		}
		else if(id == 1) {
			nrInfoAP = i;
		}
		else if(id == 2) {
			nrInfoEnemyAD = i;
		}
		else if(id == 3) {
			nrInfoEnemyAP = i;
		}
	}
	
	void walkaPisz(ArrayList<JLabel> AL, int i, int zadane, int wyleczone, Color back, Color fore, int id) {
		aktualizacjaHP();
		if (i < 13) {
			AL.get(i).setText(zadane + "(Wyleczono " + wyleczone + "HP)");
			AL.get(i).setOpaque(true);
			AL.get(i).setBackground(back);
			AL.get(i).setForeground(fore);
			i++;
			ktoreInfoZwiekszyc(id, i);
			AL.get(i).setText("----------------------------------------");
		}
		else {
			AL.get(13).setText(zadane + "(Wyleczono " + wyleczone + "HP)");
			AL.get(13).setOpaque(true);
			AL.get(13).setBackground(back);
			AL.get(13).setForeground(fore);
			i = 0;
			ktoreInfoZwiekszyc(id, i);
			AL.get(i).setText("----------------------------------------");
		}
	}
	
	void critAttack(boolean AD, boolean czyPlayer) {
		int zadane, wyleczone;
		if(czyPlayer) {
			if (AD) {
				zadane = (int) (a.AD*a.critPower - (a.AD*a.critPower*b.armor) + a.nieuchronneAtak*a.critPower);
				wyleczone = (int) ((a.AD*a.critPower - (a.AD*a.critPower*b.armor))*a.lifeStealAtak - ((a.AD*a.critPower - (a.AD*a.critPower*b.armor))*a.lifeStealAtak)*b.burnAtak);
			}
			else {
				zadane = (int) (a.AP*a.critPower - (a.AP*a.critPower*b.magicResist) + a.nieuchronneSpell*a.critPower);
				wyleczone = (int) ((a.AP*a.critPower - (a.AP*a.critPower*b.magicResist))*a.lifeStealSpell+a.heal - ((a.AP*a.critPower - (a.AP*a.critPower*b.magicResist))*a.lifeStealSpell+a.heal)*b.burnSpell);
			}
			b.teamHP -= zadane;
			a.teamHP += wyleczone;
		}
		else {
			if (AD) {
				zadane = (int) (b.AD*b.critPower - (b.AD*b.critPower*a.armor) + b.nieuchronneAtak*b.critPower);
				wyleczone = (int) ((b.AD*b.critPower - (b.AD*b.critPower*a.armor))*b.lifeStealAtak - ((b.AD*b.critPower - (b.AD*b.critPower*a.armor))*b.lifeStealAtak)*a.burnAtak);
			}
			else {
				zadane = (int) (b.AP*b.critPower - (b.AP*b.critPower*b.magicResist) + b.nieuchronneSpell*b.critPower);
				wyleczone = (int) ((b.AP*b.critPower - (b.AP*b.critPower*a.magicResist))*b.lifeStealSpell+b.heal - ((b.AP*b.critPower - (b.AP*b.critPower*a.magicResist))*b.lifeStealSpell+b.heal)*a.burnSpell);
			}
			a.teamHP -= zadane;
			b.teamHP += wyleczone;
		}
		
		sprawdzenieHP(a);
		sprawdzenieHP(b);
		aktualizacjaHP();
		
		if(AD) {
			if(czyPlayer) {
				walkaPisz(jlInfoWalkaAD, nrInfoAD, zadane, wyleczone, new Color(120, 123, 255), Color.white, 0);
			}
			else {
				walkaPisz(jlInfoWalkaEnemyAD, nrInfoEnemyAD, zadane, wyleczone, new Color(255, 131, 100), Color.white, 2);
			}
		}
		else {
			if(czyPlayer) {
				walkaPisz(jlInfoWalkaAP, nrInfoAP, zadane, wyleczone, new Color(120, 123, 255), Color.white, 1);
			}
			else {
				walkaPisz(jlInfoWalkaEnemyAP, nrInfoEnemyAP, zadane, wyleczone, new Color(255, 131, 100), Color.white, 3);
			}
		}
	}
	
	void normalAttack(boolean AD, boolean czyPlayer) {
		int zadane, wyleczone;
		if (czyPlayer) {
			if (AD) {
				zadane = (int) (a.AD - (a.AD*b.armor) + a.nieuchronneAtak);
				wyleczone = (int) ((a.AD - (a.AD*b.armor))*a.lifeStealAtak - ((a.AD - (a.AD*b.armor))*a.lifeStealAtak)*b.burnAtak);
			}
			else {
				zadane = (int) (a.AP - a.AP*b.magicResist+ a.nieuchronneSpell);
				wyleczone = (int) ((a.AP - a.AP*b.magicResist)*a.lifeStealSpell + a.heal - ((a.AP - a.AP*b.magicResist)*a.lifeStealSpell + a.heal)*b.burnSpell);
			}
			b.teamHP -= zadane;
			a.teamHP += wyleczone;
		}
		else {
			if (AD) {
				zadane = (int) (b.AD - (b.AD*a.armor) + b.nieuchronneAtak);
				wyleczone = (int) ((b.AD - (b.AD*a.armor))*b.lifeStealAtak - ((b.AD - (b.AD*a.armor))*b.lifeStealAtak)*a.burnAtak);
			}
			else {
				zadane = (int) (b.AP - b.AP*a.magicResist+ b.nieuchronneSpell);
				wyleczone = (int) ((b.AP - b.AP*a.magicResist)*b.lifeStealSpell + b.heal - ((b.AP - b.AP*a.magicResist)*b.lifeStealSpell + b.heal)*a.burnSpell);
			}
			a.teamHP -= zadane;
			b.teamHP += wyleczone;
		}
		
		sprawdzenieHP(a);
		sprawdzenieHP(b);
		aktualizacjaHP();
		
		if(AD) {
			if(czyPlayer) {
				walkaPisz(jlInfoWalkaAD, nrInfoAD, zadane, wyleczone, new Color(120, 123, 255), new Color(117, 0, 0), 0);
			}
			else {
				walkaPisz(jlInfoWalkaEnemyAD, nrInfoEnemyAD, zadane, wyleczone, new Color(255, 131, 100), new Color(117, 0, 0), 2);
			}
		}
		else {
			if(czyPlayer) {
				walkaPisz(jlInfoWalkaAP, nrInfoAP, zadane, wyleczone, new Color(120, 123, 255), new Color(2, 3, 94), 1);
			}
			else {
				walkaPisz(jlInfoWalkaEnemyAP, nrInfoEnemyAP, zadane, wyleczone, new Color(255, 131, 100), new Color(2, 3, 94), 3);
			}
		}
	}
	
	class AttackA extends TimerTask {
        public void run() {
        	if(a.teamHP <= 0 || b.teamHP <= 0) {
        		if (czyTrwaWalka) {
        			timer1.cancel();
        			timer2.cancel();
        			timer3.cancel();
        			timer4.cancel();
        			check.cancel();
        			timer1.purge();
        			timer2.purge();
        			timer3.purge();
        			timer4.purge();
        			check.purge();
        			cancel();
        			czyTrwaWalka = false;
        			koniecWalki.setVisible(true);
        			zadaneHP();
        			return;
        		}
            }
        	else {
        		Random r = new Random();
        		double rand = r.nextDouble();
        		Random r2 = new Random();
        		double rand2 = r2.nextDouble();
        		
        		if (!(rand2<b.unik)) {
        			if (rand < a.crit) {
        				critAttack(true, true);
        			}
        			else {
        				normalAttack(true, true);
        		}
        			
        		timer1.schedule(new AttackA(), (long) ((((1.0/(a.attackSpeed))+b.slowAttack)*1000)));
        		cancel();
        		}
        		else {
        			if (nrInfoAD < 13) {
        				jlInfoWalkaAD.get(nrInfoAD).setText("UNIK!");
        				jlInfoWalkaAD.get(nrInfoAD).setOpaque(true);
        				jlInfoWalkaAD.get(nrInfoAD).setBackground(new Color(120, 123, 255));
        				jlInfoWalkaAD.get(nrInfoAD).setForeground(Color.white);
        				nrInfoAD++;
        				jlInfoWalkaAD.get(nrInfoAD).setText("----------------------------------------");
        			}
        			else {
        				jlInfoWalkaAD.get(13).setText("UNIK!");
        				jlInfoWalkaAD.get(13).setOpaque(true);
        				jlInfoWalkaAD.get(13).setBackground(new Color(120, 123, 255));
        				jlInfoWalkaAD.get(13).setForeground(Color.white);
        				nrInfoAD = 0;
        				jlInfoWalkaAD.get(nrInfoAD).setText("----------------------------------------");
        			}
        			timer1.schedule(new AttackA(), (long) ((((1.0/(a.attackSpeed))+b.slowAttack)*1000)));
            		cancel();
        		}
        	}
        }
    }
	class AttackB extends TimerTask {
        public void run() {
        	if(a.teamHP <= 0 || b.teamHP <= 0) {
        		if (czyTrwaWalka) {
        			timer1.cancel();
        			timer2.cancel();
        			timer3.cancel();
        			timer4.cancel();
        			check.cancel();
        			timer1.purge();
        			timer2.purge();
        			timer3.purge();
        			timer4.purge();
        			check.purge();
        			cancel();
        			czyTrwaWalka = false;
        			koniecWalki.setVisible(true);
        			zadaneHP();
        			return;
        		}
            }
        	else {
        		Random r = new Random();
        		double rand = r.nextDouble();
        		Random r2 = new Random();
        		double rand2 = r2.nextDouble();
        		
        		if (!(rand2<a.unik)) {
        			if (rand < b.crit) {
        				critAttack(true, false);
        			}
        			else {
        				normalAttack(true, false);
        			}
        			timer2.schedule(new AttackB(), (long) ((((1.0/(b.attackSpeed))+a.slowAttack)*1000)));
        			cancel();
        		}
        		else {
        			if (nrInfoEnemyAD < 13) {
        				jlInfoWalkaEnemyAD.get(nrInfoEnemyAD).setText("UNIK!");
        				jlInfoWalkaEnemyAD.get(nrInfoEnemyAD).setOpaque(true);
        				jlInfoWalkaEnemyAD.get(nrInfoEnemyAD).setBackground(new Color(120, 123, 255));
        				jlInfoWalkaEnemyAD.get(nrInfoEnemyAD).setForeground(Color.white);
        				nrInfoEnemyAD++;
        				jlInfoWalkaEnemyAD.get(nrInfoEnemyAD).setText("----------------------------------------");
        			}
        			else {
        				jlInfoWalkaEnemyAD.get(13).setText("UNIK!");
        				jlInfoWalkaEnemyAD.get(13).setOpaque(true);
        				jlInfoWalkaEnemyAD.get(13).setBackground(new Color(120, 123, 255));
        				jlInfoWalkaEnemyAD.get(13).setForeground(Color.white);
        				nrInfoEnemyAD = 0;
        				jlInfoWalkaEnemyAD.get(nrInfoEnemyAD).setText("----------------------------------------");
        			}
        			timer2.schedule(new AttackB(), (long) ((((1.0/(b.attackSpeed))+a.slowAttack)*1000)));
            		cancel();
        		}
        	}
        }
    }
	
	
	class SpellAttackA extends TimerTask {
        public void run() {
        	if(a.teamHP <= 0 || b.teamHP <= 0) {
        		if (czyTrwaWalka) {
        			timer1.cancel();
        			timer2.cancel();
        			timer3.cancel();
        			timer4.cancel();
        			check.cancel();
        			timer1.purge();
        			timer2.purge();
        			timer3.purge();
        			timer4.purge();
        			check.purge();
        			cancel();
        			czyTrwaWalka = false;
        			koniecWalki.setVisible(true);
        			zadaneHP();
        			return;
        		}
            }
        	else {
        		normalAttack(false, true);
        		timer3.schedule(new SpellAttackA(), (long) ((((1.0/(a.spellSpeed))+b.slowSpell)*1000)));
        		cancel();
        	}
        }
    }
	class SpellAttackB extends TimerTask {
        public void run() {
        	if(a.teamHP <= 0 || b.teamHP <= 0)  {
        		if (czyTrwaWalka) {
        			timer1.cancel();
        			timer2.cancel();
        			timer3.cancel();
        			timer4.cancel();
        			check.cancel();
        			timer1.purge();
        			timer2.purge();
        			timer3.purge();
        			timer4.purge();
        			check.purge();
        			cancel();
        			czyTrwaWalka = false;
        			koniecWalki.setVisible(true);
        			zadaneHP();
        			return;
        		}
            }
        	else {
        		normalAttack(false, false);
        		timer4.schedule(new SpellAttackB(), (long) ((((1.0/(b.spellSpeed))+a.slowSpell)*1000)));
        		cancel();
        	}
        }
    }
	
	void sprawdzenieHP(Team te) {
		if (te.teamHP > te.maxHP) {
			te.teamHP = te.maxHP;
		}
	}
	
	void aktualizacjaSerii() {
		if (a.teamHP <= 0) {
    		a.seriaW = 0;
    		a.seriaP++;
    		b.seriaW++;
    		b.seriaP = 0;
    	}
    	else {
    		a.seriaW++;
    		a.seriaP = 0;
    		b.seriaW = 0;
    		b.seriaP++;
    	}
	}
	
	void zadaneHP() {
		int zad = 0, temp = nrRundy;
		while(temp > 0) {
			temp -= 2;
			zad++;
		}
		if (a.teamHP <= 0 && b.teamHP <= 0) {
			a.HP -= zad;
			b.HP -= zad;
		}
		else if (a.teamHP <= 0) {
			int ileRazy = 0, tempHP = a.teamHP;
			tempHP -= 1500;
			while (tempHP > 0) {
				tempHP -= 1000;
				ileRazy++;
			}
			a.HP -= ileRazy + zad;
		}
		else {
			int ileRazy = 0, tempHP = b.teamHP;
			tempHP -= 1000;
			while (tempHP > 0) {
				tempHP -= 1500;
				ileRazy++;
			}
			b.HP -= ileRazy + 2*zad;
		}
		czyZadaneHP = true;
		aktualizacjaHPteam();
	}
	
	void przyznawanieKasy(Team t) {
		int m, plus = 0;
		for (m = t.money; m > 0; m -= 10) {
			plus++;
		}
		if (plus > 5) {
			plus = 5;
		}
		if (t.seriaW > 0) {
			plus++;
		}
		if (t.seriaW < 3 && t.seriaP < 3) {
			
			t.money += 4 + plus;
		}
		else if (t.seriaW < 5 && t.seriaP < 5) {
			t.money += 5 + plus;
		}
		else if (t.seriaW < 7 && t.seriaP < 7) {
			t.money += 6 + plus;
		}
		else {
			t.money += 7 + plus;
		}
		
	}
	
	
	
	void zerowanieWiadomosci() {
		for (int i = 0; i < 14; i++) {
			jlInfoWalkaAD.get(i).setText("");
			jlInfoWalkaAD.get(i).setBackground(null);
			jlInfoWalkaAP.get(i).setText("");
			jlInfoWalkaAP.get(i).setBackground(null);
			jlInfoWalkaEnemyAD.get(i).setText("");
			jlInfoWalkaEnemyAD.get(i).setBackground(null);
			jlInfoWalkaEnemyAP.get(i).setText("");
			jlInfoWalkaEnemyAP.get(i).setBackground(null);
		}
		koniecWalki.setVisible(false);
	}
	
	void setGButtons() {
		h1.setBackground(g1.color);
		h2.setBackground(g2.color);
		h3.setBackground(g3.color);
		h4.setBackground(g4.color);
		h5.setBackground(g5.color);
		h1.setText("<html>"+g1.hero.nazwa + " (" + g1.hero.cost + "c)<br/>" + g1.hero.klasa.klasa + "<br/>" + g1.hero.klasa.origin  + "<br/>" + g1.hero.klasa.origin2  +"</html>");
		h2.setText("<html>"+g2.hero.nazwa + " (" + g2.hero.cost + "c)<br/>" + g2.hero.klasa.klasa + "<br/>" + g2.hero.klasa.origin  + "<br/>" + g2.hero.klasa.origin2  +"</html>");
		h3.setText("<html>"+g3.hero.nazwa + " (" + g3.hero.cost + "c)<br/>" + g3.hero.klasa.klasa + "<br/>" + g3.hero.klasa.origin  + "<br/>" + g3.hero.klasa.origin2  +"</html>");
		h4.setText("<html>"+g4.hero.nazwa + " (" + g4.hero.cost + "c)<br/>" + g4.hero.klasa.klasa + "<br/>" + g4.hero.klasa.origin  + "<br/>" + g4.hero.klasa.origin2  +"</html>");
		h5.setText("<html>"+g5.hero.nazwa + " (" + g5.hero.cost + "c)<br/>" + g5.hero.klasa.klasa + "<br/>" + g5.hero.klasa.origin  + "<br/>" + g5.hero.klasa.origin2  +"</html>");
	}
	
	void rolling(int koszt) {
		if (team.money >= koszt) {
			g1 = new GeneratorH(team);
			g2 = new GeneratorH(team);
			g3 = new GeneratorH(team);
			g4 = new GeneratorH(team);
			g5 = new GeneratorH(team);
			h1.setEnabled(true);
			h2.setEnabled(true);
			h3.setEnabled(true);
			h4.setEnabled(true);
			h5.setEnabled(true);
			h1.setVisible(true);
			h2.setVisible(true);
			h3.setVisible(true);
			h4.setVisible(true);
			h5.setVisible(true);
			setGButtons();
			team.money -= koszt;
			moneyL.setText("Zloto: " + Integer.toString(team.money));
		}
	}

	
	class showTeamsAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			ArrayList<Team> t = new ArrayList<Team>();
			for (int i = 0; i < teams.size(); i++) {
				if (i == ktoryGracz);
				else {
					t.add(teams.get(i));
				}
			}
			new PokazTeamy(t);
		}
	}
	
	class h1AL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			generowanieH(g1,h1);
		}
	}
	class h2AL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			generowanieH(g2,h2);
		}
	}
	class h3AL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			generowanieH(g3,h3);
		}
	}
	
	class h4AL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			generowanieH(g4,h4);
		}
	}
	
	class h5AL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			generowanieH(g5, h5);
		}
	}
	
	
	class lvlUpAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			leveling(4, 4);
			levelingLabelUpdate();
		}
	}
	
	
	
	class rollAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			rolling(2);
		}
	}
	
	class lAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			heroChoose = Integer.parseInt(((JButton) arg0.getSource()).getName());
			czyBoard = false;
			if (!Plansza.choosedPole && team.lawka.size() > heroChoose) {
				jbLawka.get(heroChoose).setBackground(Color.yellow);
				Plansza.x = -1;
				Plansza.y = heroChoose;
				Plansza.choosedPole = true;
			}
			else if (Plansza.choosedPole && (jbLawka.get(heroChoose).getText() == "")) {
				
				team.board.remove(Plansza.pola.get(Plansza.x).get(Plansza.y).hero);
				team.lawka.add(Plansza.pola.get(Plansza.x).get(Plansza.y).hero);
				Plansza.pola.get(Plansza.x).get(Plansza.y).setToBegin(true);
				aktualizacjaOrigin(team);
				aktualizacjaLawki();
				aktualizacjaBoard();
				Plansza.choosedPole = false;
			}
			else if (Plansza.choosedPole && (jbLawka.get(heroChoose).getText() != "" && Plansza.x >= 0)) {
				Hero temp = Plansza.pola.get(Plansza.x).get(Plansza.y).hero;
				team.board.remove(Plansza.pola.get(Plansza.x).get(Plansza.y).hero);
				team.board.add(team.lawka.get(heroChoose));
				Plansza.pola.get(Plansza.x).get(Plansza.y).addHero(team.lawka.get(heroChoose));
				
				
				team.lawka.remove(heroChoose);
				team.lawka.add(temp);
				aktualizacjaOrigin(team);
				aktualizacjaLawki();
				aktualizacjaBoard();
				Plansza.choosedPole = false;
			}
		}
	}
	
	class oAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			int choose = Integer.parseInt(((JButton) arg0.getSource()).getName());
			Origins o = team.origin.get(choose);
			new OriginInfo(o);
		}
	}
	
	class bAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			heroChoose = Integer.parseInt(((JButton) arg0.getSource()).getName());
			czyBoard = true;
			try {
				onBoard.setText("Zdejmij " + team.board.get(heroChoose).nazwa);
				sell.setText("Sprzedaj " + team.board.get(heroChoose).nazwa+ " za " + team.board.get(heroChoose).re+"c");
				infoH.setText("Info o " + team.board.get(heroChoose).nazwa);
			}
			catch (IndexOutOfBoundsException ex) {
				System.out.println(ex);
			}
		}
	}
	
	class onBoardAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if ((team.board.size() < team.boardSize) && !czyBoard) {
				team.board.add(team.lawka.get(heroChoose));
				team.lawka.remove(heroChoose);
				aktualizacjaOrigin(team);
				aktualizacjaLawki();
				aktualizacjaBoard();
				aktualizacjaSterowania();
				aktualizacjaStat();
				
			}
			else if ((team.lawka.size() < team.lawkaSize) && czyBoard) {
				team.lawka.add(team.board.get(heroChoose));
				team.board.remove(heroChoose);
				aktualizacjaOrigin(team);
				aktualizacjaLawki();
				aktualizacjaBoard();
				aktualizacjaSterowania();
				aktualizacjaStat();
			}
			
		}
	}
	
	class sellAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			sellanie();
		}
	}
	
	class infoHAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (czyBoard) {
				new HeroInfo(team.board.get(heroChoose));
			}
			else {
				new HeroInfo(team.lawka.get(heroChoose));
			}
		}
	}
	
	class walczAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(team.board.isEmpty()) {
				new Komunikat("Nie masz wystawionego ¿adnego bohatera!");
			}
			else if (!team.board.isEmpty()) {
				for (int i = 0; i < team.board.size(); i++) {
					team.board.get(i).wybierzTarget();
					team.board.get(i).idzIAtakuj();
				}
				Plansza.pola.get(5).get(5).hero.wybierzTarget();
				Plansza.pola.get(5).get(5).hero.idzIAtakuj();
				Plansza.pola.get(6).get(1).hero.wybierzTarget();
				Plansza.pola.get(6).get(1).hero.idzIAtakuj();
				Plansza.pola.get(4).get(3).hero.wybierzTarget();
				Plansza.pola.get(4).get(3).hero.idzIAtakuj();
			}
			else {
				if (nrRundy==1) {
					walka(team, min1);
				}
				else if (nrRundy==2) {
					walka(team, min1);
				}
				else if (nrRundy==3) {
					walka(team, min1);
				}
				else if (nrRundy>3) {
					walka(team, b);
				}
			}
		}
	}

	
	class koniecWalkiAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			timer1.cancel();
			timer2.cancel();
			timer3.cancel(); 
			timer4.cancel();
			check.cancel();
			timer1.purge();
			timer2.purge();
			timer3.purge();
			timer4.purge();
			check.purge();
			czyTrwaWalka = false;
			a.last = b.name;
			b.last = a.name;
			wlaczSterowanie(true);
			przyznawanieKasy(team);
			leveling(2,0);
			chooseTeam();
			hpTeamL.setText(team.name);
			levelingLabelUpdate();
			aktualizacjaLawki();
			aktualizacjaBoard();
			aktualizacjaStat();
			aktualizacjaButtonsOrigin(team);
			rolling(0);
			zerowanieWiadomosci();
			czyZadaneHP = false;
			
			liczbaZakonczonych = 0;
			liczbaWalk = 0;
			if (nrRundy == 1) {
				a = team;
				min1 = new Team(1);
				b = min1;
				healthBarEnemyTeam.setMaximum(b.teamHP);
				healthBarEnemy.setMaximum(b.HP);
				aktualizacjaHP();
				aktualizacjaHPteam();
				infoPrzeciwnik.setText(min1.boardToString());
				infoPrzeciwnikOrigin.setText(min1.originToString());
			}
			else if (nrRundy == 2) {
				a = team;
				min1 = new Team(2);
				b = min1;
				healthBarEnemyTeam.setMaximum(b.teamHP);
				healthBarEnemy.setMaximum(b.HP);
				aktualizacjaHP();
				aktualizacjaHPteam();
				infoPrzeciwnik.setText(min1.boardToString());
				infoPrzeciwnikOrigin.setText(min1.originToString());
			}
			else if (nrRundy == 3) {
				a = team;
				min1 = new Team(3);
				b = min1;
				healthBarEnemyTeam.setMaximum(b.teamHP);
				healthBarEnemy.setMaximum(b.HP);
				aktualizacjaHP();
				aktualizacjaHPteam();
				infoPrzeciwnik.setText(min1.boardToString());
				infoPrzeciwnikOrigin.setText(min1.originToString());
			}
			else if (nrRundy > 3) {
				a = team;
				losujTeam();
				if(b == null) new Koniec("Wygrales", 1, czyRanked);
				else {
					healthBarPlayer.setMaximum(100);
					healthBarPlayerTeam.setMaximum(a.teamHP);
					healthBarEnemy.setMaximum(100);
					healthBarEnemyTeam.setMaximum(b.teamHP);
					aktualizacjaHP();
					aktualizacjaHPteam();
					infoPrzeciwnik.setText(b.boardToString());
					infoPrzeciwnikOrigin.setText(b.originToString());
				}
			}
			lvlUpButtonUpdate();
		}
	}
	
	class exAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			new Wyjscie();
		}
	}
}

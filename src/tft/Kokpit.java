package tft;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

@SuppressWarnings("serial")
public class Kokpit extends JFrame {
	
	JButton grajR = new JButton("Graj Ranked");
	JButton grajM = new JButton("Graj Multiplayer");
	JButton grajU = new JButton("Graj Singleplayer Unranked");
	JButton exit = new JButton("Wyjœcie");
	JPanel userJP = new JPanel();
	JButton wyloguj = new JButton("Wyloguj");
	JButton userInfo = new JButton("Szczegó³y konta");
	JLabel userNazwa = new JLabel();
	JLabel userRanga = new JLabel();
	static User user;
	static String teamName;
	
	public Kokpit() {
		setTitle("TFT");
		setSize(1900, 1050);
        setLocation(0, 0); 
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(5,1));
		
		userJP.add(userNazwa);
		userJP.add(userRanga);
		userJP.add(userInfo);
		userJP.add(wyloguj);
		userJP.setLayout(new GridLayout(1,4));
		
		exit.addActionListener(new exAL());
		grajR.addActionListener(new grajRAL());
		grajU.addActionListener(new grajUAL());
		grajM.addActionListener(new grajMPAL());
		
		add(userJP);
		add(grajR);
		add(grajU);
		add(grajM);
		add(exit);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
		setResizable(false);
		wczytajUser();
	}
	
	public void wczytajUser() {
		Scanner x;
		String str;
		try {
			x = new Scanner(new File("src/data/users/MainAcc.txt"));
			str = x.nextLine().trim();
			x.close();
		}
		catch(Exception e) {
			System.out.println("NIE ZNALAZLO pliku MainAcc.txt");
			str = null;
		}
		user = new User(str);
		teamName = user.name;
		setLabels();
	}
	
	public void setLabels() {
		userNazwa.setText(user.name);
		userRanga.setText(user.ranga.toString());
	}
	
	class exAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			new Wyjscie();
		}
	}
	
	class grajRAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			ArrayList<String> teams = new ArrayList<String>();
			teams.add(user.name);
			
			Okno o = new Okno(true, teams);
			o.setVisible(true);
			setVisible(false);
		}
	}
	
	class grajUAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			ArrayList<String> teams = new ArrayList<String>();
			teams.add(user.name);
			
			Okno o = new Okno(false, teams);
			o.setVisible(true);
			setVisible(false);
		}
	}
	
	class grajMPAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
			new Multiplayer();
		}
	}
}

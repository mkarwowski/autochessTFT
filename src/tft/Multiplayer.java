package tft;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Multiplayer extends JFrame {
	JButton ok = new JButton("Ok");
	JButton back = new JButton("Powrót");
	JPanel jp = new JPanel();

	int countPlayers = 0;
	ArrayList<JButton> users = new ArrayList<JButton>();
	ArrayList<JButton> players = new ArrayList<JButton>();
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	
	public Multiplayer() {
		wczytajUser();
		
		for (int i = 0; i < countPlayers; i++) {
			jp1.add(players.get(i));
		}
		for (int i = 0; i < countPlayers; i++) {
			jp2.add(users.get(i));
		}
		jp3.add(ok);
		jp3.add(back);
		if (countPlayers > 8) {
			jp1.setLayout(new GridLayout(1,8));
		}
		else {
			jp1.setLayout(new GridLayout(1,countPlayers));
		}
		jp2.setLayout(new GridLayout(1,countPlayers));
		jp3.setLayout(new GridLayout(1,2));
		add(jp1);
		add(jp2);
		add(jp3);
		
		ok.addActionListener(new okAL());
		back.addActionListener(new backAL());
		
		setLayout(new GridLayout(3,1));
		setSize(countPlayers*120,200);
        setLocation(450,400);
        setResizable(false);
		setVisible(true);
	}
	
	public void wczytajUser() {
		Scanner x;
		try {
			x = new Scanner(new File("src/data/users/MainAcc.txt"));
			while (x.hasNext()) {
				String str = x.nextLine();
				users.add(new JButton(str));
				players.add(new JButton(str));
				players.get(countPlayers).setVisible(false);
				players.get(countPlayers).addActionListener(new offAL(countPlayers));
				users.get(countPlayers).addActionListener(new onAL(countPlayers));
				users.get(countPlayers).setName(String.valueOf(countPlayers));
				countPlayers++;
			}
			x.close();
		}
		catch(Exception e) {
			System.out.println("NIE ZNALAZLO pliku MainAcc.txt");
		}
		
	}
	class onAL implements ActionListener {
		int ktory;
		public onAL(int k) {
			ktory = k;
			
		}
		public void actionPerformed(ActionEvent arg0) {
			players.get(ktory).setVisible(true);
			users.get(ktory).setVisible(false);
		}
	}
	class offAL implements ActionListener {
		int ktory;
		public offAL(int k) {
			ktory = k;
		}
		public void actionPerformed(ActionEvent arg0) {
			users.get(ktory).setVisible(true);
			players.get(ktory).setVisible(false);
		}
	}
	class okAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			ArrayList<String> teams = new ArrayList<String>();
			for(int i = 0; i < players.size(); i++) {
				if(players.get(i).isVisible()) {
					teams.add(players.get(i).getText());
				}
			}
			
			Okno o = new Okno(true, teams);
			o.setVisible(true);
			setVisible(false);
		}
	}
	class backAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
			new Kokpit();
		}
	}
}

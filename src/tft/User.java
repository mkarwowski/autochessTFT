package tft;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class User {
	String name;
	int pkt;
	int gry[] = new int[8];
	Ranga ranga;
	
	public User(String str) {
		wczytanie(str);
		ranga = new Ranga(pkt);
	}
	

	public void wczytanie(String str) {
		Scanner x;
		try {
				x = new Scanner(new File("src/data/users/" + str + ".txt"));
				name = x.nextLine();
				pkt = Integer.parseInt(x.nextLine());
				for (int i = 0; i < 8; i++) {
					gry[i] = Integer.parseInt(x.nextLine());
				}
				x.close();
			}
			catch(Exception e) {
				System.out.println("NIE ZNALAZLO pliku " + str + ".txt " + e);
			}
	}
	
	public void zapis() {
		try {
			PrintWriter x = new PrintWriter("src/data/users/" + name + ".txt");
			x.println(name);
			x.println(pkt);
			for (int i = 0; i < 8; i++) {
				x.println(gry[i]);
			}
			x.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("NIE ZNALAZLO pliku " + name + ".txt " + e);
		}
	}
}

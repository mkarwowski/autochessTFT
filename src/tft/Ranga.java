package tft;

public class Ranga {
	String dywizja;
	int nr;
	int lp;
	
	public Ranga(int pkt) {
		if (pkt < -350) {
			dywizja = "¯elazo";
			nr = 4;
			lp = pkt + 450;
			if (lp < 0) lp = 0;
		}
		else if (pkt >= -350 && pkt < -250) {
			dywizja = "¯elazo";
			nr = 3;
			lp = pkt + 350;
		}
		else if (pkt >= -250 && pkt < -150) {
			dywizja = "¯elazo";
			nr = 2;
			lp = pkt + 250;
		}
		else if (pkt >= -150 && pkt < -50) {
			dywizja = "¯elazo";
			nr = 1;
			lp = pkt + 150;
		}
		else if (pkt >= -50 && pkt < 50) {
			dywizja = "Br¹z";
			nr = 4;
			lp = pkt + 50;
		}
		else if (pkt >= 50 && pkt < 150) {
			dywizja = "Br¹z";
			nr = 3;
			lp = pkt - 50;
		}
		else if (pkt >= 150 && pkt < 250) {
			dywizja = "Br¹z";
			nr = 2;
			lp = pkt - 150;
		}
		else if (pkt >= 250 && pkt < 350) {
			dywizja = "Br¹z";
			nr = 1;
			lp = pkt - 250;
		}
		else if (pkt >= 350 && pkt < 450) {
			dywizja = "Srebro";
			nr = 4;
			lp = pkt - 350;
		}
		else if (pkt >= 450 && pkt < 550) {
			dywizja = "Srebro";
			nr = 3;
			lp = pkt - 450;
		}
		else if (pkt >= 550 && pkt < 650) {
			dywizja = "Srebro";
			nr = 2;
			lp = pkt - 550;
		}
		else if (pkt >= 650 && pkt < 750) {
			dywizja = "Srebro";
			nr = 1;
			lp = pkt - 650;
		}
		else if (pkt >= 750 && pkt < 850) {
			dywizja = "Z³oto";
			nr = 4;
			lp = pkt - 750;
		}
		else if (pkt >= 850 && pkt < 950) {
			dywizja = "Z³oto";
			nr = 3;
			lp = pkt - 850;
		}
		else if (pkt >= 950 && pkt < 1050) {
			dywizja = "Z³oto";
			nr = 2;
			lp = pkt - 950;
		}
		else if (pkt >= 1050 && pkt < 1150) {
			dywizja = "Z³oto";
			nr = 1;
			lp = pkt - 1050;
		}
		else if (pkt >= 1150 && pkt < 1250) {
			dywizja = "Platyna";
			nr = 4;
			lp = pkt - 1150;
		}
		else if (pkt >= 1250 && pkt < 1350) {
			dywizja = "Platyna";
			nr = 3;
			lp = pkt - 1250;
		}
		else if (pkt >= 1350 && pkt < 1450) {
			dywizja = "Platyna";
			nr = 2;
			lp = pkt - 1350;
		}
		else if (pkt >= 1450 && pkt < 1550) {
			dywizja = "Platyna";
			nr = 1;
			lp = pkt - 1450;
		}
		else {
			dywizja = "Master";
			nr = 1;
			lp = pkt - 1550;
		}
	}
	
	public String toString() {
		return dywizja + " " + nr + " " + lp + "LP";
	}
}

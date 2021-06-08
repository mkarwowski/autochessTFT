package tft;

import java.awt.Color;
import java.util.Random;

public class GeneratorH {
	Hero hero;
	Color color;
	public static String losAvatar;
	Color c1 = new Color(130,130,130);
	Color c2 = new Color(52,200,52);
	Color c3 = new Color(0,102,204);
	Color c4 = new Color(154,51,255);
	Color c5 = new Color(170,170,0);
	Color c7 = new Color(174,245,255);
	
	void przyznajKolor() {
		if (hero.cost == 1) color = c1;
		else if (hero.cost == 2) color = c2;
		else if (hero.cost == 3) color = c3;
		else if (hero.cost == 4) color = c4;
		else if (hero.cost == 5) color = c5;
		else if (hero.cost == 7) color = c7;
	}
	
	void wybor1() {
		Random r = new Random();
		int ilosc;
		int wybor;
		ilosc = Main.liczbaRenekton.liczba + Main.liczbaVladimir.liczba + Main.liczbaDiana.liczba + Main.liczbaIvern.liczba + 
				Main.liczbaKogmaw.liczba + Main.liczbaMaokai.liczba + Main.liczbaNasus.liczba + Main.liczbaOrn.liczba +
				Main.liczbaTaliyah.liczba + Main.liczbaVayne.liczba + Main.liczbaWarwick.liczba+Main.liczbaLeona.liczba+
				Main.liczbaZyra.liczba;
		wybor = r.nextInt(ilosc) + 1;
		if (wybor <= Main.liczbaRenekton.liczba) {
			hero = new Hero("Renekton",1);
		}
		else if (wybor <= (Main.liczbaRenekton.liczba+Main.liczbaVladimir.liczba)) {
			hero = new Hero("Vladimir",1);
		}
		else if (wybor <= (Main.liczbaRenekton.liczba+Main.liczbaVladimir.liczba+Main.liczbaDiana.liczba)) {
			hero = new Hero("Diana",1);
		}
		else if (wybor <= (Main.liczbaRenekton.liczba+Main.liczbaVladimir.liczba+Main.liczbaDiana.liczba+Main.liczbaIvern.liczba)) {
			hero = new Hero("Ivern",1);
		}
		else if (wybor <= (Main.liczbaRenekton.liczba+Main.liczbaVladimir.liczba+Main.liczbaDiana.liczba+Main.liczbaIvern.liczba+
				Main.liczbaKogmaw.liczba)) {
			hero = new Hero("Kogmaw",1);
		}
		else if (wybor <= (Main.liczbaRenekton.liczba+Main.liczbaVladimir.liczba+Main.liczbaDiana.liczba+Main.liczbaIvern.liczba+ 
				Main.liczbaKogmaw.liczba+ Main.liczbaMaokai.liczba)) {
			hero = new Hero("Maokai",1);
		}
		else if (wybor <= (Main.liczbaRenekton.liczba+Main.liczbaVladimir.liczba+Main.liczbaDiana.liczba+Main.liczbaIvern.liczba+ 
				Main.liczbaKogmaw.liczba+ Main.liczbaMaokai.liczba+ Main.liczbaNasus.liczba)) {
			hero = new Hero("Nasus",1);
		}
		else if (wybor <= (Main.liczbaRenekton.liczba+Main.liczbaVladimir.liczba+Main.liczbaDiana.liczba+Main.liczbaIvern.liczba+
				Main.liczbaKogmaw.liczba+ Main.liczbaMaokai.liczba+ Main.liczbaNasus.liczba+ Main.liczbaOrn.liczba)) {
			hero = new Hero("Orn",1);
		}
		else if (wybor <= (Main.liczbaRenekton.liczba+Main.liczbaVladimir.liczba+Main.liczbaDiana.liczba+Main.liczbaIvern.liczba+ 
				Main.liczbaKogmaw.liczba+ Main.liczbaMaokai.liczba+ Main.liczbaNasus.liczba+ Main.liczbaOrn.liczba+
				Main.liczbaTaliyah.liczba)) {
			hero = new Hero("Taliyah",1);
		}
		else if (wybor <= (Main.liczbaRenekton.liczba+Main.liczbaVladimir.liczba+Main.liczbaDiana.liczba+Main.liczbaIvern.liczba+ 
				Main.liczbaKogmaw.liczba+ Main.liczbaMaokai.liczba+ Main.liczbaNasus.liczba+ Main.liczbaOrn.liczba+ 
				Main.liczbaTaliyah.liczba+ Main.liczbaVayne.liczba)) {
			hero = new Hero("Vayne",1);
		}
		else if (wybor <= (Main.liczbaRenekton.liczba+Main.liczbaVladimir.liczba+Main.liczbaDiana.liczba+Main.liczbaIvern.liczba+ 
				Main.liczbaKogmaw.liczba+ Main.liczbaMaokai.liczba+ Main.liczbaNasus.liczba+ Main.liczbaOrn.liczba+ 
				Main.liczbaTaliyah.liczba+ Main.liczbaVayne.liczba+Main.liczbaLeona.liczba)) {
			hero = new Hero("Leona",1);
		}
		else if (wybor <= (Main.liczbaRenekton.liczba+Main.liczbaVladimir.liczba+Main.liczbaDiana.liczba+Main.liczbaIvern.liczba+ 
				Main.liczbaKogmaw.liczba+ Main.liczbaMaokai.liczba+ Main.liczbaNasus.liczba+ Main.liczbaOrn.liczba+ 
				Main.liczbaTaliyah.liczba+ Main.liczbaVayne.liczba+Main.liczbaLeona.liczba+Main.liczbaZyra.liczba)) {
			hero = new Hero("Zyra",1);
		}
		else {
			hero = new Hero("Warwick",1);
		}
	}
	
	void wybor2() {
		Random r = new Random();
		int ilosc = Main.liczbaSyndra.liczba+Main.liczbaVarus.liczba + Main.liczbaLeBlanc.liczba + Main.liczbaNeeko.liczba + 
				Main.liczbaVolibear.liczba+Main.liczbaReksai.liczba + Main.liczbaSkarner.liczba+Main.liczbaMalzahar.liczba +
				Main.liczbaYasuo.liczba + Main.liczbaThresh.liczba + Main.liczbaBraum.liczba + Main.liczbaJax.liczba;
		int wybor = r.nextInt(ilosc) + 1;
		if (wybor <=Main.liczbaSyndra.liczba) {
			hero = new Hero("Syndra", 1);
		}
		else if (wybor <=Main.liczbaSyndra.liczba+Main.liczbaVarus.liczba) {
			hero = new Hero("Varus", 1);
		}
		else if (wybor <=Main.liczbaSyndra.liczba+Main.liczbaVarus.liczba+Main.liczbaLeBlanc.liczba) {
			hero = new Hero("LeBlanc", 1);
		}
		else if (wybor <=Main.liczbaSyndra.liczba+Main.liczbaVarus.liczba+Main.liczbaLeBlanc.liczba+Main.liczbaNeeko.liczba) {
			hero = new Hero("Neeko", 1);
		}
		else if (wybor <=Main.liczbaSyndra.liczba+Main.liczbaVarus.liczba+Main.liczbaLeBlanc.liczba+Main.liczbaNeeko.liczba+
				Main.liczbaReksai.liczba) {
			hero = new Hero("Reksai", 1);
		}
		else if (wybor <=Main.liczbaSyndra.liczba+Main.liczbaVarus.liczba+Main.liczbaLeBlanc.liczba+Main.liczbaNeeko.liczba+
				Main.liczbaReksai.liczba+Main.liczbaSkarner.liczba) {
			hero = new Hero("Skarner", 1);
		}
		else if (wybor <=Main.liczbaSyndra.liczba+Main.liczbaVarus.liczba+Main.liczbaLeBlanc.liczba+Main.liczbaNeeko.liczba+
				Main.liczbaReksai.liczba+Main.liczbaSkarner.liczba +Main.liczbaMalzahar.liczba) {
			hero = new Hero("Malzahar", 1);
		}
		else if (wybor <=Main.liczbaSyndra.liczba+Main.liczbaVarus.liczba+Main.liczbaLeBlanc.liczba+Main.liczbaNeeko.liczba+
				Main.liczbaReksai.liczba+Main.liczbaSkarner.liczba +Main.liczbaMalzahar.liczba+Main.liczbaYasuo.liczba) {
			hero = new Hero("Yasuo", 1);
		}
		else if (wybor <=Main.liczbaSyndra.liczba+Main.liczbaVarus.liczba+Main.liczbaLeBlanc.liczba+Main.liczbaNeeko.liczba+
				Main.liczbaReksai.liczba+Main.liczbaSkarner.liczba +Main.liczbaMalzahar.liczba+Main.liczbaYasuo.liczba +
				Main.liczbaThresh.liczba) {
			hero = new Hero("Thresh", 1);
		}
		else if (wybor <=Main.liczbaSyndra.liczba+Main.liczbaVarus.liczba+Main.liczbaLeBlanc.liczba+Main.liczbaNeeko.liczba+
				Main.liczbaReksai.liczba+Main.liczbaSkarner.liczba +Main.liczbaMalzahar.liczba+Main.liczbaYasuo.liczba +
				Main.liczbaThresh.liczba + Main.liczbaBraum.liczba) {
			hero = new Hero("Braum", 1);
		}
		else if (wybor <=Main.liczbaSyndra.liczba+Main.liczbaVarus.liczba+Main.liczbaLeBlanc.liczba+Main.liczbaNeeko.liczba+
				Main.liczbaReksai.liczba+Main.liczbaSkarner.liczba +Main.liczbaMalzahar.liczba+Main.liczbaYasuo.liczba +
				Main.liczbaThresh.liczba + Main.liczbaBraum.liczba + Main.liczbaJax.liczba) {
			hero = new Hero("Jax", 1);
		}
		else {
			hero = new Hero("Volibear", 1);
		}
	}
	
	void wybor3() {
		Random r = new Random();
		int ilosc = Main.liczbaKindred.liczba + Main.liczbaMundo.liczba + Main.liczbaVeigar.liczba+Main.liczbaSion.liczba+
				Main.liczbaNocturne.liczba+Main.liczbaAzir.liczba +Main.liczbaSivir.liczba+Main.liczbaAatrox.liczba+Main.liczbaSoraka.liczba+
				+Main.liczbaKarma.liczba+Main.liczbaNautilius.liczba + Main.liczbaEzreal.liczba + Main.liczbaQiyana.liczba;
		int wybor = r.nextInt(ilosc) + 1;
		
		if (wybor <= Main.liczbaKindred.liczba) {
			hero = new Hero("Kindred", 1);
		}
		else if (wybor <= Main.liczbaKindred.liczba + Main.liczbaMundo.liczba) {
			hero = new Hero("Mundo", 1);
		}
		else if (wybor <= Main.liczbaKindred.liczba + Main.liczbaMundo.liczba+Main.liczbaSion.liczba) {
			hero = new Hero("Sion", 1);
		}
		else if (wybor <= Main.liczbaKindred.liczba + Main.liczbaMundo.liczba+Main.liczbaSion.liczba+Main.liczbaNocturne.liczba) {
			hero = new Hero("Nocturne", 1);
		}
		else if (wybor <= Main.liczbaKindred.liczba + Main.liczbaMundo.liczba+Main.liczbaSion.liczba+Main.liczbaNocturne.liczba +
				Main.liczbaAzir.liczba) {
			hero = new Hero("Azir", 1);
		}
		else if (wybor <= Main.liczbaKindred.liczba + Main.liczbaMundo.liczba+Main.liczbaSion.liczba+Main.liczbaNocturne.liczba +
				Main.liczbaAzir.liczba+Main.liczbaSivir.liczba) {
			hero = new Hero("Sivir", 1);
		}
		else if (wybor <= Main.liczbaKindred.liczba + Main.liczbaMundo.liczba+Main.liczbaSion.liczba+Main.liczbaNocturne.liczba +
				Main.liczbaAzir.liczba+Main.liczbaSivir.liczba+Main.liczbaAatrox.liczba) {
			hero = new Hero("Aatrox", 1);
		}
		else if (wybor <= Main.liczbaKindred.liczba + Main.liczbaMundo.liczba+Main.liczbaSion.liczba+Main.liczbaNocturne.liczba +
				Main.liczbaAzir.liczba+Main.liczbaSivir.liczba+Main.liczbaAatrox.liczba+Main.liczbaSoraka.liczba) {
			hero = new Hero("Soraka", 1);
		}
		else if (wybor <= Main.liczbaKindred.liczba + Main.liczbaMundo.liczba+Main.liczbaSion.liczba+Main.liczbaNocturne.liczba +
				Main.liczbaAzir.liczba+Main.liczbaSivir.liczba+Main.liczbaAatrox.liczba+Main.liczbaSoraka.liczba+Main.liczbaKarma.liczba) {
			hero = new Hero("Karma", 1);
		}
		else if (wybor <= Main.liczbaKindred.liczba + Main.liczbaMundo.liczba+Main.liczbaSion.liczba+Main.liczbaNocturne.liczba +
				Main.liczbaAzir.liczba+Main.liczbaSivir.liczba+Main.liczbaAatrox.liczba+Main.liczbaSoraka.liczba+Main.liczbaKarma.liczba+
				Main.liczbaNautilius.liczba) {
			hero = new Hero("Nautilius", 1);
		}
		else if (wybor <= Main.liczbaKindred.liczba + Main.liczbaMundo.liczba+Main.liczbaSion.liczba+Main.liczbaNocturne.liczba +
				Main.liczbaAzir.liczba+Main.liczbaSivir.liczba+Main.liczbaAatrox.liczba+Main.liczbaSoraka.liczba+Main.liczbaKarma.liczba+
				Main.liczbaNautilius.liczba+ Main.liczbaEzreal.liczba) {
			hero = new Hero("Ezreal", 1);
		}
		else if (wybor <= Main.liczbaKindred.liczba + Main.liczbaMundo.liczba+Main.liczbaSion.liczba+Main.liczbaNocturne.liczba +
				Main.liczbaAzir.liczba+Main.liczbaSivir.liczba+Main.liczbaAatrox.liczba+Main.liczbaSoraka.liczba+Main.liczbaKarma.liczba+
				Main.liczbaNautilius.liczba+ Main.liczbaEzreal.liczba + Main.liczbaQiyana.liczba) {
			hero = new Hero("Qiyana", 1);
		}
		else {
			hero = new Hero("Veigar", 1);
		}
	}
	
	void wybor4() {
		Random r = new Random();
		int ilosc = Main.liczbaBrand.liczba + Main.liczbaMalphite.liczba+Main.liczbaOlaf.liczba+Main.liczbaYorick.liczba+
				Main.liczbaKhazix.liczba+Main.liczbaJanna.liczba+Main.liczbaAnnie.liczba+Main.liczbaAshe.liczba + Main.liczbaTwitch.liczba;
		int wybor = r.nextInt(ilosc) + 1;
		if (wybor <= Main.liczbaBrand.liczba) {
			hero = new Hero("Brand", 1);
		}
		else if (wybor <= Main.liczbaBrand.liczba + Main.liczbaMalphite.liczba) {
			hero = new Hero("Malphite", 1);
		}
		else if (wybor <= Main.liczbaBrand.liczba + Main.liczbaMalphite.liczba+Main.liczbaYorick.liczba) {
			hero = new Hero("Yorick", 1);
		}
		else if (wybor <= Main.liczbaBrand.liczba + Main.liczbaMalphite.liczba+Main.liczbaYorick.liczba+Main.liczbaKhazix.liczba) {
			hero = new Hero("Khazix", 1);
		}
		else if (wybor <= Main.liczbaBrand.liczba + Main.liczbaMalphite.liczba+Main.liczbaYorick.liczba+Main.liczbaKhazix.liczba +
				Main.liczbaJanna.liczba) {
			hero = new Hero("Janna", 1);
		}
		else if (wybor <= Main.liczbaBrand.liczba + Main.liczbaMalphite.liczba+Main.liczbaYorick.liczba+Main.liczbaKhazix.liczba +
				Main.liczbaJanna.liczba+Main.liczbaAnnie.liczba) {
			hero = new Hero("Annie", 1);
		}
		else if (wybor <= Main.liczbaBrand.liczba + Main.liczbaMalphite.liczba+Main.liczbaYorick.liczba+Main.liczbaKhazix.liczba +
				Main.liczbaJanna.liczba+Main.liczbaAnnie.liczba+Main.liczbaAshe.liczba) {
			hero = new Hero("Ashe", 1);
		}
		else if (wybor <= Main.liczbaBrand.liczba + Main.liczbaMalphite.liczba+Main.liczbaYorick.liczba+Main.liczbaKhazix.liczba +
				Main.liczbaJanna.liczba+Main.liczbaAnnie.liczba+Main.liczbaAshe.liczba + Main.liczbaTwitch.liczba) {
			hero = new Hero("Twitch", 1);
		}
		else {
			hero = new Hero("Olaf", 1);
		}
	}
	
	void wybor5() {
		Random r = new Random();
		int ilosc = Main.liczbaTaric.liczba + Main.liczbaSinged.liczba+Main.liczbaNami.liczba + Main.liczbaZed.liczba + 
				Main.liczbaMasterYi.liczba + Main.liczbaAmumu.liczba;
		int wybor = r.nextInt(ilosc) + 1;
		
		if (wybor <= Main.liczbaTaric.liczba) {
			hero = new Hero("Taric", 1);
		}
		else if (wybor <= Main.liczbaTaric.liczba + Main.liczbaSinged.liczba) {
			hero = new Hero("Singed", 1);
		}
		else if (wybor <= Main.liczbaTaric.liczba + Main.liczbaSinged.liczba +Main.liczbaZed.liczba) {
			hero = new Hero("Zed", 1);
		}
		else if (wybor <= Main.liczbaTaric.liczba + Main.liczbaSinged.liczba +Main.liczbaZed.liczba + Main.liczbaMasterYi.liczba) {
			hero = new Hero("Master Yi", 1);
		}
		else if (wybor <= Main.liczbaTaric.liczba + Main.liczbaSinged.liczba +Main.liczbaZed.liczba + Main.liczbaMasterYi.liczba +
				Main.liczbaAmumu.liczba) {
			hero = new Hero("Amumu", 1);
		}
		else if (wybor <= Main.liczbaTaric.liczba + Main.liczbaSinged.liczba +Main.liczbaZed.liczba + Main.liczbaMasterYi.liczba +
				Main.liczbaAmumu.liczba + Main.liczbaLux.liczba) {
			Random ran = new Random();
			wybor = ran.nextInt(10);
			if (wybor == 0) {
				losAvatar = "Cieñ";
			}
			else if (wybor == 1) {
				losAvatar = "Las";
			}
			else if (wybor == 2) {
				losAvatar = "Ocean";
			}
			else if (wybor == 3) {
				losAvatar = "Œwiat³o";
			}
			else if (wybor == 4) {
				losAvatar = "Piek³o";
			}
			else if (wybor == 5) {
				losAvatar = "Chmury";
			}
			else if (wybor == 6) {
				losAvatar = "Elektryczny";
			}
			else if (wybor == 7) {
				losAvatar = "Stal";
			}
			else if (wybor == 8) {
				losAvatar = "Kryszta³";
			}
			else if (wybor == 9) {
				losAvatar = "Mrozny";
			}
			hero = new Hero("Lux", 1);
		}
		else {
			hero = new Hero("Nami", 1);
		}
	}
	
	GeneratorH(Team t) {
		int wybor;
		Random r = new Random();
		if (t.lvl == 1 || t.lvl == 2) {
			wybor1();
			for(int i = 0; i < t.star3.size(); i++) {
				if (hero.nazwa == t.star3.get(i)) {
					hero = new GeneratorH(t).hero;
				}
			}
			przyznajKolor();
		}
		else if (t.lvl == 3) {
			wybor = r.nextInt(100) + 1;
			if (wybor <= 75) {
				wybor1();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else {
				wybor2();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
				
			}
		}
		else if (t.lvl == 4) {
			wybor = r.nextInt(100) + 1;
			if (wybor <= 55) {
				wybor1();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else if (wybor <= 85) {
				wybor2();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else {
				wybor3();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
		}
		else if (t.lvl == 5) {
			wybor = r.nextInt(100) + 1;
			if (wybor <= 40) {
				wybor1();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else if (wybor <= 75) {
				wybor2();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else if (wybor <= 95){
				wybor3();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else {
				wybor4();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			//1 - 40%, 2 - 35%, 3 -20%, 4 - 5%
		}
		else if (t.lvl == 6) {
			wybor = r.nextInt(100) + 1;
			if (wybor <= 25) {
				wybor1();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else if (wybor <= 60) {
				wybor2();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else if (wybor <= 90){
				wybor3();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else {
				wybor4();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			//1 - 25%, 2 - 35%, 3 - 30%, 4 - 10%
		}
		else if (t.lvl == 7) {
			wybor = r.nextInt(100) + 1;
			if (wybor <= 19) {
				wybor1();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else if (wybor <= 49) {
				wybor2();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else if (wybor <= 84){
				wybor3();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else if (wybor <= 99){
				wybor4();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else {
				wybor5();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			//1 - 19%, 2 - 30%, 3 - 35%, 4 - 15%, 5 - 1%
		}
		else if (t.lvl == 8) {
			wybor = r.nextInt(100) + 1;
			if (wybor <= 14) {
				wybor1();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else if (wybor <= 34) {
				wybor2();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else if (wybor <= 69){
				wybor3();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else if (wybor <= 94){
				wybor4();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else {
				wybor5();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			//1 - 14%, 2 - 20%, 3 - 35%, 4 - 25%, 5 - 6%
		}
		else if (t.lvl == 9) {
			wybor = r.nextInt(100) + 1;
			if (wybor <= 10) {
				wybor1();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else if (wybor <= 25) {
				wybor2();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else if (wybor <= 55){
				wybor3();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else if (wybor <= 85){
				wybor4();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			else {
				wybor5();
				for(int i = 0; i < t.star3.size(); i++) {
					if (hero.nazwa == t.star3.get(i)) {
						hero = new GeneratorH(t).hero;
					}
				}
				przyznajKolor();
			}
			//1 - 10%, 2 - 15%, 3 - 30%, 4 - 30%, 5 - 15%
		}
		else {
			wybor5();
			for(int i = 0; i < t.star3.size(); i++) {
				if (hero.nazwa == t.star3.get(i)) {
					hero = new GeneratorH(t).hero;
				}
			}
			przyznajKolor();
		}
	}
}

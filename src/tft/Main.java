package tft;

import java.util.Random;

public class Main {
	public static String zywiol;

	public static Liczebnosc liczbaRenekton = new Liczebnosc(39, "Renekton");
	public static Liczebnosc liczbaVladimir = new Liczebnosc(39, "Vladimir");
	public static Liczebnosc liczbaDiana = new Liczebnosc(39, "Diana");
	public static Liczebnosc liczbaIvern = new Liczebnosc(39, "Ivern");
	public static Liczebnosc liczbaKogmaw = new Liczebnosc(39, "Kogmaw");
	public static Liczebnosc liczbaMaokai = new Liczebnosc(39, "Maoikai");
	public static Liczebnosc liczbaNasus = new Liczebnosc(39, "Nasus");
	public static Liczebnosc liczbaOrn = new Liczebnosc(39, "Orn");
	public static Liczebnosc liczbaTaliyah = new Liczebnosc(39, "Taliyah");
	public static Liczebnosc liczbaVayne = new Liczebnosc(39, "Vayne");
	public static Liczebnosc liczbaWarwick = new Liczebnosc(39, "Warwick");
	public static Liczebnosc liczbaLeona = new Liczebnosc(39, "Leona");
	public static Liczebnosc liczbaZyra = new Liczebnosc(39, "Zyra");
	
	public static Liczebnosc liczbaSyndra = new Liczebnosc(26, "Syndra");
	public static Liczebnosc liczbaVarus = new Liczebnosc(26, "Varus");
	public static Liczebnosc liczbaLeBlanc = new Liczebnosc(26, "LeBlanc");
	public static Liczebnosc liczbaNeeko = new Liczebnosc(26, "Neeko");
	public static Liczebnosc liczbaVolibear = new Liczebnosc(26, "Volibear");
	public static Liczebnosc liczbaReksai = new Liczebnosc(26, "Reksai");
	public static Liczebnosc liczbaSkarner = new Liczebnosc(26, "Skarner");
	public static Liczebnosc liczbaMalzahar = new Liczebnosc(26, "Malzahar");
	public static Liczebnosc liczbaYasuo = new Liczebnosc(26, "Yasuo");
	public static Liczebnosc liczbaThresh = new Liczebnosc(26, "Thresh");
	public static Liczebnosc liczbaBraum = new Liczebnosc(26, "Braum");
	public static Liczebnosc liczbaJax = new Liczebnosc(26, "Jax");
	
	public static Liczebnosc liczbaKindred = new Liczebnosc(21, "Kindred");
	public static Liczebnosc liczbaMundo = new Liczebnosc(21, "Mundo");
	public static Liczebnosc liczbaVeigar = new Liczebnosc(21, "Veigar");
	public static Liczebnosc liczbaSion = new Liczebnosc(21, "Sion");
	public static Liczebnosc liczbaNocturne = new Liczebnosc(21, "Nocturne");
	public static Liczebnosc liczbaAzir = new Liczebnosc(21, "Azir");
	public static Liczebnosc liczbaSivir = new Liczebnosc(21, "Sivir");
	public static Liczebnosc liczbaAatrox = new Liczebnosc(21, "Aatrox");
	public static Liczebnosc liczbaSoraka = new Liczebnosc(21, "Soraka");
	public static Liczebnosc liczbaKarma = new Liczebnosc(21, "Karma");
	public static Liczebnosc liczbaNautilius = new Liczebnosc(21, "Nautilius");
	public static Liczebnosc liczbaEzreal = new Liczebnosc(21, "Ezreal");
	public static Liczebnosc liczbaQiyana = new Liczebnosc(21, "Qyiana");
	
	public static Liczebnosc liczbaBrand = new Liczebnosc(13, "Brand");
	public static Liczebnosc liczbaMalphite = new Liczebnosc(13, "Malphite");
	public static Liczebnosc liczbaOlaf = new Liczebnosc(13, "Olaf");
	public static Liczebnosc liczbaYorick = new Liczebnosc(13, "Yorick");
	public static Liczebnosc liczbaKhazix = new Liczebnosc(13, "Khazix");
	public static Liczebnosc liczbaJanna = new Liczebnosc(13, "Janna");
	public static Liczebnosc liczbaAnnie = new Liczebnosc(13, "Annie");
	public static Liczebnosc liczbaAshe = new Liczebnosc(13, "Ashe");
	public static Liczebnosc liczbaTwitch = new Liczebnosc(13, "Twitch");
	
	public static Liczebnosc liczbaTaric = new Liczebnosc(10, "Taric");
	public static Liczebnosc liczbaSinged = new Liczebnosc(10, "Singed");
	public static Liczebnosc liczbaNami = new Liczebnosc(10, "Nami");
	public static Liczebnosc liczbaZed = new Liczebnosc(10, "Zed");
	public static Liczebnosc liczbaMasterYi = new Liczebnosc(10, "Master Yi");
	public static Liczebnosc liczbaAmumu = new Liczebnosc(10, "Amumu");
	
	public static Liczebnosc liczbaLux = new Liczebnosc(9, "Lux");
	
	
	public static void main(String[] args) {
			new Kokpit();

	}
	
	static void generowanieZywiolu() {
		Random r = new Random();
		int wybor = r.nextInt(4);
		if (wybor == 0) {
			zywiol = "Ocean";
		}
		else if (wybor == 1) {
			zywiol = "Góry";
		}
		else if (wybor == 2) {
			zywiol = "Piek³o";
		}
		else if (wybor == 3) {
			zywiol = "Chmury";
		}
	}

}

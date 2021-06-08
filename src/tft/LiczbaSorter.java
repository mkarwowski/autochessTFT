package tft;

import java.util.Comparator;

public class LiczbaSorter implements Comparator<Origins>{

	@Override
	public int compare(Origins a, Origins b) {
		
		return b.liczba - a.liczba;
	}
	
}

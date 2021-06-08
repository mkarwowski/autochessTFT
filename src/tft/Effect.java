package tft;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

public class Effect {
	String nazwa;
	double duration;
	Color originalColor;
	double originalWspMana;
	
	public Effect(Hero h, String n, double d) {
		getOriginalTraits(h);
		nazwa = n;
		duration = d;
		if (nazwa == "Stun") {
			h.effects.add(this);
			h.action.cancel();
			h.target = null;
			h.color = new Color(207, 203, 137);
			h.action = new Timer();
			h.action.schedule(new TimerTask() {
				@SuppressWarnings("unlikely-arg-type")
				public void run() {
					h.effects.remove(this);
					h.wybierzTarget();
					h.idzIAtakuj();
					h.color = originalColor;
					cancel();
				}}, (long) (duration*1000));
		}
		else if (nazwa == "Nomana") {
			h.effects.add(this);
			h.color = new Color(0, 4, 50);
			double tempWsp = h.wspMana;
			h.setWspMana(0);
			Timer t = new Timer();
			t.schedule(new TimerTask() {
				@SuppressWarnings("unlikely-arg-type")
				public void run() {
					h.effects.remove(this);
					h.color = originalColor;
					h.setWspMana(tempWsp);
					cancel();
				}}, (long) (duration*1000));
		}
	}
	
	public Effect(Hero h, String n) {
		if (nazwa == "Nomana") {
			h.effects.add(this);
			h.color = new Color(0, 4, 50);
			h.setWspMana(0);
		}
	}
	
	
	void getOriginalTraits(Hero h) {
		originalColor = new Color(h.color.getRed(), h.color.getGreen(), h.color.getBlue());
		originalWspMana = h.wspMana;
	}
}

package tft;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Koniec extends JFrame {
	JButton ok = new JButton("Ok");
	JPanel jp = new JPanel();
	JLabel jl;
	
	public Koniec(String k, int miejsce, boolean b) {
		setSize(300,200);
        setLocation(650,500);
        jl = new JLabel(k);
        jp.add(jl);
        jp.add(ok);
        jp.setLayout(new GridLayout(2,1));
        setVisible(true);
        setResizable(false);
        ok.addActionListener(new exAL());
        add(jp);
        if (b) {
        	aktualizacjaUser(miejsce);
        }
        
	}
	
	void aktualizacjaUser(int miejsce) {
		Kokpit.user.gry[miejsce-1]++;
		przyznaniePkt(miejsce);
	}
	
	void przyznaniePkt(int miejsce) {
		int p = 0;
		if (miejsce == 1) p = 45;
		else if (miejsce == 2) p = 30;
		else if (miejsce == 3) p = 18;
		else if (miejsce == 4) p = 9;
		else if (miejsce == 5) p = -9;
		else if (miejsce == 6) p = -18;
		else if (miejsce == 7) p = -30;
		else if (miejsce == 8) p = -45;
		Kokpit.user.pkt += p;
	}
	
	class exAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Kokpit.user.zapis();
			setVisible(false);
			new Kokpit();
		}
	}
	
}

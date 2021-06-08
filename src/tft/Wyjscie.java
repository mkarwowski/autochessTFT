package tft;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Wyjscie extends JFrame {
	JButton ok = new JButton("Tak");
	JButton no = new JButton("Nie");
	JPanel jp = new JPanel();
	JPanel jp2 = new JPanel();
	JLabel jl = new JLabel("Czy na pewno chcesz wyjœæ?");
	
	public Wyjscie() {
		setTitle("Exit");
		setSize(300,200);
        setLocation(650,500);
        jp.add(jl);
        jp2.add(ok);
        jp2.add(no);
        jp.add(jp2);
        jp.setLayout(new GridLayout(2,1));
        jp2.setLayout(new GridLayout(1,2));
        setVisible(true);
        setResizable(false);
        ok.addActionListener(new exAL());
        no.addActionListener(new noAL());
        add(jp);
        
        
	}
	class exAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Kokpit.user.zapis();
			System.exit(0);
		}
	}
	class noAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
		}
	}
	
}

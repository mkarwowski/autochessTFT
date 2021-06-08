package tft;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Komunikat extends JFrame {
	JButton ok = new JButton("Ok");
	JPanel jp = new JPanel();
	JLabel jl;
	
	public Komunikat(String k) {
		setTitle("TFT");
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
        
	}
	class exAL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
		}
	}
	
}
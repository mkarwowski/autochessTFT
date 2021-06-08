package tft;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class HeroInfo extends JFrame implements ActionListener {
	JButton ok = new JButton("Zamknij");
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	
	public HeroInfo(Hero hero) {
		setTitle(hero.nazwa);
		jl.setText(hero.opis());
		setSize(600,400);
        setLocation(650,500);
        jp.add(jl);
        jp.add(ok);
        ok.addActionListener(this);
        setVisible(true);
        setResizable(false);
        
        add(jp);

	}
	
	 @Override
	    public void actionPerformed(ActionEvent e) {
	        setVisible(false);
	        
	    }
}

package tft;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class OriginInfo extends JFrame implements ActionListener {
	JButton ok = new JButton("Zamknij");
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	
	public OriginInfo(Origins o) {
		setTitle(o.nazwa);
		jl.setText(o.opis);
		setSize(1000,200);
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
package tft;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PokazTeamy extends JFrame implements ActionListener {
	
	JButton ok = new JButton("Zamknij");
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	ArrayList<JLabel> team1 = new ArrayList<JLabel>();
	ArrayList<JLabel> team2 = new ArrayList<JLabel>();
	
	public PokazTeamy(ArrayList<Team> t) {
		setSize(800,800);
        setLocation(200,100);
        
        for (int i = 0; i < t.size(); i++) {
        	JLabel jl = new JLabel("<html>" + t.get(i).name + "<br/>HP: " + t.get(i).HP + "</html>");
        	team1.add(jl);
        	team2.add(new JLabel(t.get(i).boardToString()));
        	jp1.add(team1.get(i));
        	jp2.add(team2.get(i));
        }
        
        
        jp1.setLayout(new GridLayout(1,t.size()));
        jp2.setLayout(new GridLayout(1,t.size()));
        
        ok.addActionListener(this);
        setVisible(true);
        setResizable(false);
        
        setLayout(new GridLayout(3,1));
        add(jp1);
        add(jp2);
        add(ok);
	}

	public void actionPerformed(ActionEvent arg0) {
		setVisible(false);
	}
}

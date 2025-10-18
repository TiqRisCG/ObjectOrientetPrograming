package ObjectOrientetPrograming;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MerhabaDegisken {
	JFrame f;
	public MerhabaDegisken() {
		f = new JFrame("Component Test: ");
		f.setSize(300,300);
		f.getContentPane().setBackground(Color.black);
		JPanel p = new JPanel();
		p.setOpaque(false);
		JButton b = new JButton("Merhaba Bileşenler");
		p.add(b);
		f.add(p);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new MerhabaDegisken();

	}

}

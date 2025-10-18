package ObjectOrientetPrograming;
import java.awt.BorderLayout;
import javax.swing.*;

public class BorderLayoutdemo extends JFrame {

	public  BorderLayoutdemo() {
		super("BorderLayoutdemo");
		setSize(300,300);
		setLayout(new BorderLayout());
		
		 add(new JButton("Üst Buton"), BorderLayout.NORTH);
		 add(new JButton("Alt Buton"), BorderLayout.SOUTH);
		 add(new JButton("Sol Buton"), BorderLayout.WEST);
		 add(new JButton("Sağ Buton"), BorderLayout.EAST);
		 add(new JButton("Merkez Buton"), BorderLayout.CENTER);
		 
		 setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new BorderLayoutdemo();
		
	}

}

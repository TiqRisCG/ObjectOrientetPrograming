package ObjectOrientetPrograming;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {
	static String etiketler[]= {"Kısa", "Kısa", "Uzun Etiket", "Fazla Uzun Etiket","Çok Fazla Uzun Etiket"};
	public FlowLayoutDemo() {
		setSize(400,300);
		setLayout(new FlowLayout());
		for (int i = 0;i<etiketler.length;i++) {
			JButton temp = (JButton) add(new JButton(etiketler[i]));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutDemo().setVisible(true);

	}

}

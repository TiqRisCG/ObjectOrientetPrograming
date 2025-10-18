package ObjectOrientetPrograming;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginSayfasi extends JFrame {
	
	public LoginSayfasi() {
		setSize(500,500);
		
		JLabel baslik = new JLabel("Lütfen giriş yapınız:");
		JLabel isimEtiket = new JLabel(" Kullanıcı Adı: ");
		JLabel sifreEtiket = new JLabel("Şifre: ");
		
		JTextField isimInput = new JTextField(10);
		JTextField sifreInput = new JTextField(10);
		
		JPanel disPanel = new JPanel();
		JPanel icPanel = new JPanel();
		
		icPanel.setLayout(new GridLayout(2,2));
		icPanel.add(isimEtiket);
		icPanel.add(isimInput);
		icPanel.add(sifreEtiket);
		icPanel.add(sifreInput);
		disPanel.setLayout(new BorderLayout());
		disPanel.add(baslik, BorderLayout.NORTH);
		disPanel.add(icPanel,BorderLayout.CENTER);
		add(disPanel);
	}
		public JPanel panelEkle(JComponent bilesen) {
			JPanel pnl = new JPanel();
			pnl.setLayout(new FlowLayout());
			pnl.add(bilesen);
			return pnl;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginSayfasi().setVisible(true);

	}

}

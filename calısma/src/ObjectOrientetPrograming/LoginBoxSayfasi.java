package ObjectOrientetPrograming;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class LoginBoxSayfasi extends JFrame {
	 public LoginBoxSayfasi() {
		 setSize(500, 200);
		 // Step 1: Bilesenleri Olustur
		 JLabel baslik = new JLabel("Lütfen Giriş Yapınız");
		 JLabel isimEtiket = new JLabel("Kullanıcı Adı: ");
		 JLabel sifreEtiket = new JLabel("Şifre: ");
		 JTextField isimInput = new JTextField(10);
		 JTextField sifreInput = new JTextField(10);
		 // Step 2: Konteyner
		 JPanel disPanel = new JPanel();
		 // Step 3: Duzen Yonetimi
		
		 disPanel.setLayout(new BoxLayout(disPanel, BoxLayout.Y_AXIS));
		 disPanel.add(Box.createVerticalGlue());
		 disPanel.add(baslik);
		 disPanel.add(panelIkilisi(isimEtiket, isimInput));
		 disPanel.add(panelIkilisi(sifreEtiket, sifreInput));
		 disPanel.add(Box.createVerticalGlue());
		 add(disPanel);
		 }
	 public JPanel panelIkilisi(JComponent birinci,JComponent ikinci) {
		 JPanel pnl = new JPanel();
		 pnl.setLayout(new BoxLayout(pnl, BoxLayout.PAGE_AXIS));
		 pnl.add(Box.createHorizontalGlue());
		 pnl.add(birinci);
		 pnl.add(ikinci);
		 pnl.add(Box.createHorizontalGlue());
		 JPanel cerceve = new JPanel();
		 cerceve.setLayout(new FlowLayout());
		 cerceve.add(pnl);
		return cerceve;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginSayfasi().setVisible(true);

	}

}

package prolab2_proje3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;

public class anaSayfa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anaSayfa ana = new anaSayfa();
					ana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public anaSayfa() {
		setTitle("Muzik Dosyam");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 496);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JTextPane txtpnGirisYapiniz = new JTextPane();
		txtpnGirisYapiniz.setBackground(Color.LIGHT_GRAY);
		txtpnGirisYapiniz.setText("Giris yapiniz...");
		txtpnGirisYapiniz.setBounds(366, 124, 84, 20);
		contentPane.add(txtpnGirisYapiniz);
		
		JButton btnNewButton_1 = new JButton("Kullanici");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kullanici kc = new Kullanici();
				kc.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(463, 211, 133, 58);
		contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton = new JButton("Admin");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    Admin admin = new Admin();	
			admin.setVisible(true);
			}
		});
		btnNewButton.setBounds(229, 211, 124, 58);
		contentPane.add(btnNewButton);
	}
}

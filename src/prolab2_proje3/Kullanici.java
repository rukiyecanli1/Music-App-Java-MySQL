package prolab2_proje3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kullanici extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kullanici frame = new Kullanici();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Kullanici() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Normal Kullanici");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Normall nrm = new Normall();
				nrm.setVisible(true);
			}
		});
		btnNewButton.setBounds(205, 193, 155, 57);
		contentPane.add(btnNewButton);
		
		JButton btnPremiumKullanici = new JButton("Premium Kullanici");
		btnPremiumKullanici.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Premiumm pm = new Premiumm();
				pm.setVisible(true);
				
			}
		});
		btnPremiumKullanici.setBounds(446, 193, 147, 57);
		contentPane.add(btnPremiumKullanici);
		
		
	}
}

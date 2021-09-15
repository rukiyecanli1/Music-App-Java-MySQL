package prolab2_proje3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Premiumm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Premiumm frame = new Premiumm();
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
	public Premiumm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSarkiAdi = new JLabel("Kullan\u0131c\u0131 Ad\u0131:");
		lblSarkiAdi.setBounds(38, 94, 63, 17);
		contentPane.add(lblSarkiAdi);
		
		
		
		JLabel lblNewLabel = new JLabel("\u015Eifre:");
		lblNewLabel.setBounds(40, 134, 61, 14);
		contentPane.add(lblNewLabel);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(321, 46, 1, 331);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("GIRIS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Giris pnl = new Giris();
				pnl.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(72, 202, 77, 23);
		contentPane.add(btnNewButton);
		
		JButton btnGuncelle = new JButton("KAYIT OL");
		btnGuncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuncelle.setBounds(194, 202, 77, 23);
		contentPane.add(btnGuncelle);
		
		
		JButton btnNewButton_1 = new JButton("ANA SAYFA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        anaSayfa as = new anaSayfa();
	        as.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(248, 386, 232, 29);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(117, 92, 142, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 131, 98, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
	}
}

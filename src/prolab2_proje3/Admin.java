package prolab2_proje3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField sarkiAdi;
	private JTextField sanatciID;
	private JTextField albumID;
	private JTextField turID;
	private JTextField sure;
	private JTable table;
	
	DefaultTableModel model = new DefaultTableModel();
	
	Object[] sutunlar = {"sarkiAdi","sanatciID","albumID","turID","sure"};
    Object[] satirlar = new Object[45];
    Object yeniSatir[] = new Object[5];
    
    
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 936, 495);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSarkiAdi = new JLabel("Sarki Adi:");
		lblSarkiAdi.setBounds(38, 94, 63, 17);
		contentPane.add(lblSarkiAdi);
		
		sarkiAdi = new JTextField();
		sarkiAdi.setBounds(111, 92, 148, 20);
		contentPane.add(sarkiAdi);
		sarkiAdi.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sanatci Adi:");
		lblNewLabel.setBounds(40, 134, 61, 14);
		contentPane.add(lblNewLabel);
		
		sanatciID = new JTextField();
		sanatciID.setBounds(110, 131, 149, 20);
		contentPane.add(sanatciID);
		sanatciID.setColumns(10);
		
		JLabel lblAlbum = new JLabel("Album:");
		lblAlbum.setBounds(40, 184, 46, 14);
		contentPane.add(lblAlbum);
		
		albumID = new JTextField();
		albumID.setBounds(111, 181, 148, 20);
		contentPane.add(albumID);
		albumID.setColumns(10);
		
		JLabel lblTur = new JLabel("Tur:");
		lblTur.setBounds(40, 227, 46, 14);
		contentPane.add(lblTur);
		
		turID = new JTextField();
		turID.setBounds(111, 224, 77, 20);
		contentPane.add(turID);
		turID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Sure:");
		lblNewLabel_1.setBounds(38, 279, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		sure = new JTextField();
		sure.setBounds(111, 276, 77, 20);
		contentPane.add(sure);
		sure.setColumns(10);
		
		String sarki, sanatci, album, tur,sure_;
		sarki = sarkiAdi.getText();
		sanatci = sanatciID.getText();
		album = albumID.getText();
		tur = turID.getText();
		sure_ = sure.getText();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(339, 54, 552, 323);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(model);
		model.setColumnIdentifiers(sutunlar);
		
		table.setBounds(671, 254, 195, 123);
		scrollPane_1.setViewportView(table);
		//contentPane.add(table);
		
		JButton btnNewButton = new JButton("EKLE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setBounds(41, 329, 77, 23);
		contentPane.add(btnNewButton);
		
		JButton btnGuncelle = new JButton("GUNCELLE");
		btnGuncelle.setBounds(128, 329, 77, 23);
		contentPane.add(btnGuncelle);
		
		JButton btnSl = new JButton("SIL");
		btnSl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
			}
		});
		btnSl.setBounds(215, 329, 77, 23);
		contentPane.add(btnSl);
		
		JButton btnNewButton_1 = new JButton("LISTELE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ResultSet rs = vbBaglanti.baglantiYap();
		
		            try {
						while(rs.next()) {
					
							satirlar[0] = rs.getString("sarkiAdi");
						    satirlar[1] = rs.getString("sanatciID");
							satirlar[2] = rs.getString("albumID");
							satirlar[3] = rs.getString("turID");
							satirlar[4] = rs.getString("sure");
							model.addRow(satirlar);
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
		            table.setModel(model);
			}
		});
		btnNewButton_1.setBounds(79, 393, 168, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnAnaSayfa = new JButton("Ana Sayfa");
		
		btnAnaSayfa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				anaSayfa as = new anaSayfa();
				as.setVisible(true);
			}
		});
	
		btnAnaSayfa.setBounds(731, 408, 148, 23);
		contentPane.add(btnAnaSayfa);
		
	    
		
		
	
	}
}

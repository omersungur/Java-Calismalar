import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class HesapMakinesi extends JFrame {

	private int say = 0;
	private JPanel contentPane;
	private JTextField BirinciSayi;
	private JTextField ÝkinciSayi;
	private JTextField Sonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMakinesi frame = new HesapMakinesi();
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
	public HesapMakinesi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Toplama = new JButton("+");
		Toplama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int birinci_sayi = Integer.valueOf(BirinciSayi.getText());
				int ikinci_sayi = Integer.valueOf(ÝkinciSayi.getText());
				
				Sonuc.setText(String.valueOf(birinci_sayi+ikinci_sayi));
			}
		});
		Toplama.setBounds(190, 228, 89, 23);
		contentPane.add(Toplama);
		
		JButton Cikarma = new JButton("-");
		Cikarma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int birinci_sayi = Integer.valueOf(BirinciSayi.getText());
				int ikinci_sayi = Integer.valueOf(ÝkinciSayi.getText());
				
				Sonuc.setText(String.valueOf(birinci_sayi-ikinci_sayi));
				
			}
		});
		Cikarma.setBounds(338, 228, 89, 23);
		contentPane.add(Cikarma);
		
		JButton Carpma = new JButton("x");
		Carpma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int birinci_sayi = Integer.valueOf(BirinciSayi.getText());
				int ikinci_sayi = Integer.valueOf(ÝkinciSayi.getText());
				
				Sonuc.setText(String.valueOf(birinci_sayi*ikinci_sayi));
				
			}
		});
		Carpma.setBounds(190, 298, 89, 23);
		contentPane.add(Carpma);
		
		JButton Bolme = new JButton("/");
		Bolme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int birinci_sayi = Integer.valueOf(BirinciSayi.getText());
				int ikinci_sayi = Integer.valueOf(ÝkinciSayi.getText());
				
				Sonuc.setText(String.valueOf(birinci_sayi/ikinci_sayi));
			}
		});
		Bolme.setBounds(338, 298, 89, 23);
		contentPane.add(Bolme);
		
		JLabel lblNewLabel = new JLabel("Birinci Sayi:");
		lblNewLabel.setBounds(156, 108, 68, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0130kinci Sayi:");
		lblNewLabel_1.setBounds(156, 148, 68, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sonu\u00E7:");
		lblNewLabel_2.setBounds(156, 190, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		BirinciSayi = new JTextField();
		BirinciSayi.setBounds(249, 105, 86, 20);
		contentPane.add(BirinciSayi);
		BirinciSayi.setColumns(10);
		
		ÝkinciSayi = new JTextField();
		ÝkinciSayi.setBounds(249, 145, 86, 20);
		contentPane.add(ÝkinciSayi);
		ÝkinciSayi.setColumns(10);
		
		Sonuc = new JTextField();
		Sonuc.setEditable(false);
		Sonuc.setBounds(249, 187, 86, 20);
		contentPane.add(Sonuc);
		Sonuc.setColumns(10);
	}
}

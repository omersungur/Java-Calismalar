import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KullaniciGirisi extends JFrame {

	private JPanel contentPane;
	private JPasswordField parola_alani;
	private JTextField kullanici_adi_alani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KullaniciGirisi frame = new KullaniciGirisi();
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
	public KullaniciGirisi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Giri\u015F Yap");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String kullanici_adi = kullanici_adi_alani.getText();
				String parola = new String (parola_alani.getPassword());
				String message;
				
				if (kullanici_adi.equals("Omer Sungur") && parola.equals("123456")) {
					message = "Sisteme Hoþgeldiniz " + kullanici_adi;
					try {
						Thread.sleep(750);
						message = "Sisteme Hoþgeldiniz " + kullanici_adi;
						JOptionPane.showMessageDialog(null, message);
						Thread.sleep(200);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.exit(0);
				}
				
				else {
					message = "Giriþ Baþarsýz";
					JOptionPane.showMessageDialog(null, message);
				}
				
				kullanici_adi_alani.setText("");
				parola_alani.setText("");
				
			}
		});
		btnNewButton.setBounds(201, 255, 129, 23);
		contentPane.add(btnNewButton);
		
		parola_alani = new JPasswordField();
		parola_alani.setBounds(201, 170, 141, 20);
		contentPane.add(parola_alani);
		
		kullanici_adi_alani = new JTextField();
		kullanici_adi_alani.setBounds(201, 139, 141, 20);
		contentPane.add(kullanici_adi_alani);
		kullanici_adi_alani.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Kullan\u0131c\u0131 Ad\u0131:");
		lblNewLabel.setBounds(107, 142, 84, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Parola:");
		lblNewLabel_1.setBounds(107, 173, 84, 14);
		contentPane.add(lblNewLabel_1);
	}
}

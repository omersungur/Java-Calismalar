import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;

public class Frekanss extends JFrame {

	private javax.swing.JButton goster;
    private javax.swing.JLabel harf_alani;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kelime_alani;
    private JPanel contentPane;
	private JTextField yazi_alani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frekanss frame = new Frekanss();
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
	public Frekanss() {
		setTitle("Harf ve Kelime Say\u0131s\u0131 Program\u0131");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		yazi_alani = new JTextField();
		yazi_alani.setBackground(Color.LIGHT_GRAY);
		yazi_alani.setBounds(82, 122, 404, 90);
		contentPane.add(yazi_alani);
		yazi_alani.setColumns(10);
		
		JButton butonn = new JButton("Harf ve Kelime Say\u0131s\u0131n\u0131 G\u00F6ster");
		butonn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String yazi = yazi_alani.getText();
				int karakter_sayisi = 0;
				int kelime_sayisi = 0;
				
				for (int i = 0; i < yazi.length(); i++) {
					
					if (yazi.charAt(i) != ' ') {
						karakter_sayisi++;
					}
					
				}
				
				String kelime_arr [] = yazi.split(" ");
				
				for (String s : kelime_arr) {
					kelime_sayisi++;
				}
				
				kelime_alani.setText("Kelime Sayýsý : " + kelime_sayisi);
				harf_alani.setText("Harf Sayýsý : " + karakter_sayisi);
				
			}
		});
		butonn.setBounds(172, 289, 242, 23);
		contentPane.add(butonn);
		
		JLabel kelime_al = new JLabel("Kelime Say\u0131s\u0131:");
		kelime_al.setBounds(112, 69, 98, 14);
		contentPane.add(kelime_al);
		
		JLabel harf_al = new JLabel("Harf Say\u0131s\u0131:");
		harf_al.setBounds(388, 69, 90, 14);
		contentPane.add(harf_al);
	}
}

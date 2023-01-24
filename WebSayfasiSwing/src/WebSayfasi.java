import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class WebSayfasi extends JFrame {

	private int say;
	private JPanel contentPane;
	private JTextField web_sayfasi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WebSayfasi frame = new WebSayfasi();
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
	public WebSayfasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton tikla_butonu = new JButton("Týkla");
		tikla_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String internet_adresi = web_sayfasi.getText();
				
				Desktop d = Desktop.getDesktop();
				
				try {
					d.browse(new URI(internet_adresi));
				} catch (IOException | URISyntaxException e) {
					
					e.printStackTrace();
				}
			}
		});
		tikla_butonu.setBounds(242, 286, 133, 23);
		contentPane.add(tikla_butonu);
		
		web_sayfasi = new JTextField();
		web_sayfasi.setHorizontalAlignment(SwingConstants.CENTER);
		web_sayfasi.setBounds(179, 189, 311, 20);
		contentPane.add(web_sayfasi);
		web_sayfasi.setColumns(10);
	}
}

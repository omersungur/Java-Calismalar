import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingOrnegii extends JFrame {

	private JPanel contentPane;
	private JTextField txtHelloo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingOrnegii frame = new SwingOrnegii();
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
	public SwingOrnegii() {
		setTitle("Ba\u015Fl\u0131kkk");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton buton = new JButton("T\u0131kla");
		buton.setBounds(5, 336, 721, 23);
		buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtHelloo.setText("Denemee");
			}
		});
		contentPane.setLayout(null);
		contentPane.add(buton);
		
		txtHelloo = new JTextField();
		txtHelloo.setBounds(5, 5, 721, 331);
		txtHelloo.setBackground(Color.GRAY);
		txtHelloo.setHorizontalAlignment(SwingConstants.CENTER);
		txtHelloo.setText("Helloo");
		contentPane.add(txtHelloo);
		txtHelloo.setColumns(10);
	}

}

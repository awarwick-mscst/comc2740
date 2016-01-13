package awarwick27401a1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainForm extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel grossPayLabel;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
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
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gross Pay:");
		lblNewLabel.setBounds(42, 39, 76, 14);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(35, 64, 122, 23);
		contentPane.add(btnNewButton);
		
		grossPayLabel = new JLabel("");
		grossPayLabel.setBounds(111, 39, 180, 14);
		contentPane.add(grossPayLabel);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(arg0);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent arg0) {
		int hours = 40;
		double grossPay, payRate = 25.00;
		
		grossPay = hours * payRate;
		grossPayLabel.setText("Your gross pay is $" + grossPay + "0");
	}
}

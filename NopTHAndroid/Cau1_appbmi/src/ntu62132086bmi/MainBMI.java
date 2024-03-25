package ntu62132086bmi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainBMI extends JFrame {
	
    public double weight =0.0d, height = 0.0d, bmi =0.0d;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField weightValue;
	private JTextField hieghtValue;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainBMI frame = new MainBMI();
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
	public MainBMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Weight");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(24, 28, 73, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Height");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(24, 73, 73, 29);
		contentPane.add(lblNewLabel_1);
		
		weightValue = new JTextField();
		weightValue.setBounds(81, 38, 145, 19);
		contentPane.add(weightValue);
		weightValue.setColumns(10);
		
		hieghtValue = new JTextField();
		hieghtValue.setBounds(81, 80, 145, 19);
		contentPane.add(hieghtValue);
		hieghtValue.setColumns(10);
		
		JLabel label = new JLabel("New label");
		label.setBounds(117, 134, -74, 29);
		contentPane.add(label);
		
		JButton enter = new JButton("Enter");
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		enter.setBounds(10, 134, 67, 21);
		contentPane.add(enter);
		
		JRadioButton kg = new JRadioButton("kg");
		kg.setBounds(232, 37, 42, 21);
		contentPane.add(kg);
		
		JRadioButton inches = new JRadioButton("inches");
		inches.setBounds(232, 79, 81, 21);
		contentPane.add(inches);
		
		JRadioButton cm = new JRadioButton("cm");
		cm.setBounds(315, 79, 48, 21);
		contentPane.add(cm);
		
		JRadioButton lbs = new JRadioButton("lbs");
		lbs.setBounds(286, 37, 42, 21);
		contentPane.add(lbs);
		
		output = new JTextField();
		output.setText("BMI:");
		output.setColumns(10);
		output.setBounds(81, 134, 145, 19);
		contentPane.add(output);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 weightValue.setText("");
		            hieghtValue.setText("");
		            output.setText("BMI:");
			}
		});
		clear.setBounds(253, 134, 85, 21);
		contentPane.add(clear);
	}
}

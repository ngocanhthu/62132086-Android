package ntu_62132086_cau1_appbmi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class Chuongtinhtinhtoan extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel BMI;
	private JTextField inputweight;
	private JTextField inputheight;
	private JTextField kqenter;
	
	
	

	public static void main(String[] args) {
		
	}
	public  Chuongtinhtinhtoan() {
		setTitle("CALCULATOR BMI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 473);
		BMI = new JPanel();
		BMI.setBackground(new Color(255, 0, 255));
		BMI.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(BMI);
		BMI.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Weight");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(27, 34, 94, 35);
		BMI.add(lblNewLabel);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblHeight.setBounds(27, 109, 108, 35);
		BMI.add(lblHeight);
		
		JButton Enter = new JButton("Enter");
		Enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Enter();
			}
		});
		Enter.setForeground(new Color(0, 0, 0));
		Enter.setBackground(new Color(0, 128, 255));
		Enter.setFont(new Font("Tahoma", Font.ITALIC, 16));
		Enter.setBounds(27, 188, 94, 42);
		BMI.add(Enter);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clear();
			}
		});
		clear.setForeground(Color.BLACK);
		clear.setFont(new Font("Tahoma", Font.ITALIC, 16));
		clear.setBackground(new Color(255, 255, 0));
		clear.setBounds(141, 243, 94, 42);
		BMI.add(clear);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(108, 27, 192, 21);
		BMI.add(lblNewLabel_1);
		
		inputweight = new JTextField();
		inputweight.setFont(new Font("Tahoma", Font.PLAIN, 14));
		inputweight.setBounds(100, 37, 177, 35);
		BMI.add(inputweight);
		inputweight.setColumns(10);
		
		inputheight = new JTextField();
		inputheight.setFont(new Font("Tahoma", Font.PLAIN, 14));
		inputheight.setColumns(10);
		inputheight.setBounds(100, 109, 177, 35);
		BMI.add(inputheight);
		
		kqenter = new JTextField();
		kqenter.setBounds(131, 191, 310, 42);
		BMI.add(kqenter);
		kqenter.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("(kg)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(280, 48, 45, 13);
		BMI.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("(m)");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(287, 123, 45, 13);
		BMI.add(lblNewLabel_3);
	}
	void Enter() {
		String inputa = inputweight.getText();
		String inputb = inputheight.getText();
		double soA = Double.parseDouble(inputa);
		double soB = Double.parseDouble(inputb);
		double kq = soA / (soB*soB);
		String KQ;
		if(kq < 18.5) {
			KQ = "Gầy";
		}else if(kq >=18.5 && kq <=22.9) {
			KQ = "Thon gọn";
		}else if(kq>=23 && kq<=25.9) {
			KQ = "Cấn đối";
		}else if (kq >= 30 && kq <=34.9) {
            KQ = "Hơi mập";
        } else if (kq >= 35 && kq <=39.9) {
            KQ = "Béo phì";
        } else {
            KQ = "Nhập dữ liệu lại";
        }
		kqenter.setText(KQ);
	
	}
	void Clear() {
		inputweight.setText("");
		inputheight.setText("");
		kqenter.setText("");
	}
}
 





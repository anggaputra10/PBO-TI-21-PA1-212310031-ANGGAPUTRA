package com.ibik.pbo.praktikum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField field_Email;
	private JTextField field_Password;
	private JButton button_Login;
	private JButton btnRegister;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setTitle("Login Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 300, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_Email = new JLabel("Email");
		label_Email.setBounds(20,20,150,30);
		contentPane.add(label_Email);
		
		field_Email = new JTextField();
		field_Email.setColumns(10);
		field_Email.setBounds(110,20,150,30);
		contentPane.add(field_Email);
		
		JLabel label_Password = new JLabel("Password");
		label_Password.setBounds(20, 70,150,30);
		contentPane.add(label_Password);
		
		field_Password = new JTextField();
		field_Password.setColumns(10);
		field_Password.setBounds(110, 70,150,30);
		contentPane.add(field_Password);
		
		JCheckBox cb_RemPassword = new JCheckBox("Remember Password");
		cb_RemPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cb_RemPassword.setBounds(110, 120,150,30);
		contentPane.add(cb_RemPassword);
		
		button_Login = new JButton("LOGIN");
		button_Login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (field_Email.getText().equals("") || field_Password.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Silakan mengisi data dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
				}else if (field_Email.getText().equals("anggaputra@gmail.com") && field_Password.getText().equals("212310031")) {
					JOptionPane.showMessageDialog(null, "Selamat Datang Angga");
					new MainMenu().setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Data yang anda masukkan salah", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		button_Login.setBounds(160, 200, 100, 30);
		contentPane.add(button_Login);
		
		btnRegister = new JButton("REGISTER");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Register().setVisible(true);
			}
		});
		btnRegister.setBounds (30, 200, 100, 30);
		contentPane.add(btnRegister);
	}
}
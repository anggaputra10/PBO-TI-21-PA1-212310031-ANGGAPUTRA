package com.ibik.pbo.praktikum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicTacToe extends JFrame {

	private JPanel contentPane;
	final JButton button_1 = new JButton("");
	final JButton button_2 = new JButton("");
	final JButton button_3 = new JButton("");
	final JButton button_4 = new JButton("");
	final JButton button_5 = new JButton("");
	final JButton button_6 = new JButton("");
	final JButton button_7 = new JButton("");
	final JButton button_8 = new JButton("");
	final JButton button_9 = new JButton("");
	String value = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe frame = new TicTacToe();
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
	public TicTacToe() {
		setTitle("TicTacToe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 5, 0));
		
		
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(value == "X") {
					button_1.setText("O");
					value = "O";
				}else {
					button_1.setText("X");
					value = "X";
				}
				if (button_1.getText() == button_2.getText() && button_2.getText() == button_3.getText()) {
					JOptionPane.showMessageDialog(null, "X got point 1");
				}
			}
		});
		contentPane.add(button_1);
		
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(value == "X") {
					button_2.setText("O");
					value = "O";
				}else {
					button_2.setText("X");
					value = "X";
				}
				if (button_1.getText() == button_2.getText() && button_2.getText() == button_3.getText()) {
					JOptionPane.showMessageDialog(null, "X got point 1");
				}
			}
		});
		contentPane.add(button_2);
		
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(value == "X") {
					button_3.setText("O");
					value = "O";
				}else {
					button_3.setText("X");
					value = "X";
				}
				if (button_1.getText() == button_2.getText() && button_2.getText() == button_3.getText()) {
					JOptionPane.showMessageDialog(null, "X got point 1");
				}
			}
		});
		contentPane.add(button_3);
		
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(value == "X") {
					button_4.setText("O");
					value = "O";
				}else {
					button_4.setText("X");
					value = "X";
				}
			}
		});
		contentPane.add(button_4);
		
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(value == "X") {
					button_5.setText("O");
					value = "O";
				}else {
					button_5.setText("X");
					value = "X";
				}
			}
		});
		contentPane.add(button_5);
		
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(value == "X") {
					button_6.setText("O");
					value = "O";
				}else {
					button_6.setText("X");
					value = "X";
				}
			}
		});
		contentPane.add(button_6);
		
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(value == "X") {
					button_7.setText("O");
					value = "O";
				}else {
					button_7.setText("X");
					value = "X";
				}
			}
		});
		contentPane.add(button_7);
		
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(value == "X") {
					button_8.setText("O");
					value = "O";
				}else {
					button_8.setText("X");
					value = "X";
				}
			}
		});
		contentPane.add(button_8);
		
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(value == "X") {
					button_9.setText("O");
					value = "O";
				}else {
					button_9.setText("X");
					value = "X";
				}
			}
		});
		contentPane.add(button_9);
	}
}
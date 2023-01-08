package com.ibik.pbo.praktikum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Latihan01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Latihan01 frame = new Latihan01();
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
	public Latihan01() {
		setTitle("Latihan 01");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 150);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JButton button_Hello = new JButton("ciao");
		button_Hello.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane jop = new JOptionPane();
				
				jop.showMessageDialog(null, "ciao is a word for 'Hello' " ,"You Just Clicked " + button_Hello.getText(), jop.INFORMATION_MESSAGE);
			}
		});
		button_Hello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_Hello.setBounds(40, 20, 100, 25);
		contentPane.add(button_Hello);
		
		final JButton button_IBIK = new JButton("IBIK");
		button_IBIK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane jop = new JOptionPane();
				
				jop.showMessageDialog(null, "IBIK is an acronym of 'Institut Bisnis dan Informatika Kesatuan' " ,"You Just Clicked " + button_IBIK.getText(), jop.INFORMATION_MESSAGE);
			}
		});
		button_IBIK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_IBIK.setBounds(110, 60, 70, 25);
		contentPane.add(button_IBIK);
		
		final JButton button_Everyone = new JButton("mọi người");
		button_Everyone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane jop = new JOptionPane();
				
				jop.showMessageDialog(null, "mọi người is a word for 'Everyone' " ,"You Just Clicked " + button_Everyone.getText(), jop.INFORMATION_MESSAGE);
			}
		});
		button_Everyone.setBounds(160, 20, 100, 25);
		contentPane.add(button_Everyone);
	}

}
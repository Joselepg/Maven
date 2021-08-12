package UD21.UD21;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_Interaccion extends JFrame {

	private JPanel contentPane;
	private String ultimoBtn;
	private JLabel texto;

	public Ventana_Interaccion() {
		//Ventana
		setTitle("Calculadora");
		setBounds(600,500,600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane=new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		//Botones
		JButton btn1 = new JButton("Boton 1");
		btn1.setBounds(43, 130, 119, 81);
		contentPane.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				ultimoBtn="Has Pulsado: Boton 1";
				texto.setText(ultimoBtn);
			}
		});
		
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(195, 130, 119, 81);
		contentPane.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				ultimoBtn="Has Pulsado: Boton 2";
				texto.setText(ultimoBtn);
			}
		});
		//Texto
		texto=new JLabel("Has Pulsado: ");
		texto.setBounds(33,27,250,100);
		contentPane.add(texto);
	}

}

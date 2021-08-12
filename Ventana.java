package UD21.UD21;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField texto;

	public Ventana() {
		//Ventana
		setTitle("Calculadora");
		setBounds(600,500,600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane=new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		//Texto
		JLabel texto=new JLabel("Texto de Ejemplo");
		texto.setBounds(33,27,250,100);
		contentPane.add(texto);
	}

}

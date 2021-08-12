package UD21.UD21;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.event.*;

public class Masa_Corporal extends JFrame {

	private JPanel contentPane;
	private JLabel textoAltura;
	private JLabel textoPeso;
	private JLabel textoIMC;
	private JLabel textoResultado;
	private JTextField textoN1;
	private JTextField textoN2;
	
	public Masa_Corporal() {
		//Ventana
		setTitle("Indice de masa corporal");
		setBounds(600,500,600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane=new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		//Textos
		textoAltura = new JLabel("Altura(metros)");
		textoAltura.setBounds(92, 14, 86, 21);
		contentPane.add(textoAltura);
		textoPeso = new JLabel("Peso(kg)");
		textoPeso.setBounds(284, 14, 76, 21);
		contentPane.add(textoPeso);
		textoIMC = new JLabel("IMC");
		textoIMC.setBounds(256, 68, 38, 21);
		contentPane.add(textoIMC);
		textoResultado = new JLabel(" ");
		textoResultado.setBounds(284, 68, 76, 21);
		Border border = BorderFactory.createLineBorder(Color.BLACK,1);
		textoResultado.setBorder(border);
		contentPane.add(textoResultado);
		//Escribir
		textoN1 = new JTextField();
		textoN1.setBounds(188, 11, 86, 26);
		contentPane.add(textoN1);
		textoN2 = new JTextField();
		textoN2.setBounds(364, 11, 86, 26);
		contentPane.add(textoN2);
		//boton
		JButton Boton = new JButton("Calcular IMC");
		Boton.setBounds(127, 58, 119, 41);
		contentPane.add(Boton);
		Boton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				String N1=textoN1.getText();
				String N2=textoN2.getText();
				double Numero1= Double.parseDouble(N1);
				double Numero2= Double.parseDouble(N2);
				double Masa=Numero2/(Numero1*Numero1);
				String masaTexto=String.valueOf(Masa);
				textoResultado.setText(masaTexto);
			}
		});
	}

}

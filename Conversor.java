package UD21.UD21;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.event.*;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JLabel textoCantidad;
	private JLabel textoResultado;
	private JLabel textoCaja;
	private JTextField textoN1;
	private final double Pesetas=166.386;
	
	public Conversor() {
		//Ventana
		setTitle("Indice de masa corporal");
		setBounds(600,500,600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane=new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		//Textos
		textoCantidad = new JLabel("Cantidad a convertir");
		textoCantidad.setBounds(37, 14, 141, 21);
		contentPane.add(textoCantidad);
		textoResultado = new JLabel("Resultado");
		textoResultado.setBounds(304, 14, 76, 21);
		contentPane.add(textoResultado);
		textoCaja = new JLabel(" ");
		textoCaja.setBounds(399, 14, 76, 21);
		Border border = BorderFactory.createLineBorder(Color.BLACK,1);
		textoCaja.setBorder(border);
		contentPane.add(textoCaja);
		//Escribir
		textoN1 = new JTextField();
		textoN1.setBounds(188, 11, 86, 26);
		contentPane.add(textoN1);
		//boton
		JButton btnEP = new JButton("Euros a pesetas");
		btnEP.setBounds(152, 58, 153, 55);
		contentPane.add(btnEP);
		btnEP.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				String N1=textoN1.getText();
				double Numero1= Double.parseDouble(N1);
				double Resultado=Numero1*Pesetas;
				String masaTexto=String.valueOf(Resultado);
				textoCaja.setText(masaTexto);
			}
		});
		JButton btnPE = new JButton("Pesetas a euros");
		btnPE.setBounds(371, 58, 153, 55);
		contentPane.add(btnPE);
		btnPE.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				String N1=textoN1.getText();
				double Numero1= Double.parseDouble(N1);
				double Resultado=Numero1/Pesetas;
				String masaTexto=String.valueOf(Resultado);
				textoCaja.setText(masaTexto);
			}
		});

}
	}



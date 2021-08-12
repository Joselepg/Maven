package UD21.UD21;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_mas_Interacciones extends JFrame {

	private JPanel contentPane;
	private String ultimoBtn;
	private JLabel texto;
	private JLabel texto2;
	private int contadorBtn1=0;
	private int contadorBtn2=0;

	public Ventana_mas_Interacciones() {
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
				contadorBtn1++;
				texto.setText("Boton 1: "+contadorBtn1+" veces.");
			}
		});
		
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(195, 130, 119, 81);
		contentPane.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				contadorBtn2++;
				texto2.setText("Boton 2: "+contadorBtn2+" veces.");
			}
		});
		//Texto
		texto=new JLabel("Boton 1: "+contadorBtn1+" veces.");
		texto.setBounds(43,25,119,100);
		contentPane.add(texto);
		texto2=new JLabel("Boton 2: "+contadorBtn2+" veces.");
		texto2.setBounds(205,25,109,100);
		contentPane.add(texto2);
	}

}

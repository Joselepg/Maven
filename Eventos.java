package UD21.UD21;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.event.*;

public class Eventos extends JFrame {

	private JPanel contentPane;
	private JLabel texto;
	private JLabel textoEvento;
	private String evento="";
	
	public Eventos() {
		// Ventana
		setTitle("Eventos");
		setBounds(600, 500, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		// Texto
		texto = new JLabel("Eventos.");
		texto.setBounds(20, 112, 119, 100);
		contentPane.add(texto);
		// CampoEventos
		final JLabel textoEvento = new JLabel(evento);
		
		textoEvento.setBounds(188, 60, 386, 296);
		Border border = BorderFactory.createLineBorder(Color.BLACK,1);
		textoEvento.setBorder(border);
		contentPane.add(textoEvento);
		textoEvento.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
					textoEvento.setText(evento+="Click ");
			}
			public void mouseEntered(MouseEvent e) {
					textoEvento.setText(evento+="Entrar ");			
			}
			public void mouseExited(MouseEvent e) {
					textoEvento.setText(evento+="Salir ");
			}
		});
		
	}
}

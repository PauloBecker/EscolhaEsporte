import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Escolha implements ActionListener {

	JLabel label;
	JLabel resposta;
	
	JCheckBox futebol;
	JCheckBox volei;
	JCheckBox basquete;
	
	JButton votar;
	JButton terminar;
	Tela2 tela2;
	ImageIcon esportesIMG;
	ImageIcon basqueteIMG;
	ImageIcon futebolIMG;
	ImageIcon voleiIMG;
	
	double contV = 0, contF = 0, contB = 0;
	
	public Escolha() {
		
		JFrame frame = new JFrame("Esportes");
		frame.setVisible(true);
		frame.setSize(250, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label =  new JLabel("Quais esportes você pratica?");
		frame.add(label);
		
		
		futebol = new JCheckBox("Futebol");
		futebol.addActionListener(this);
		frame.add(futebol);
		
		volei = new JCheckBox("Vôlei");
		volei.addActionListener(this);
		frame.add(volei);
		
		basquete = new JCheckBox("Basquete");
		basquete.addActionListener(this);
		frame.add(basquete);
		
		votar = new JButton("Votar");
		votar.addActionListener(this);
		frame.add(votar);
		
		terminar = new JButton("Terminar");
		terminar.addActionListener(this);
		frame.add(terminar);
		
		tela2 = new Tela2();
		
		esportesIMG = new ImageIcon("img/esportes.jpeg");
		basqueteIMG =  new ImageIcon("img/basquete.jpeg");
		futebolIMG = new ImageIcon("img/futebol.jpeg");
		voleiIMG = new ImageIcon("img/volei.jpeg");
		
		resposta = new JLabel(esportesIMG);
		frame.add(resposta);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

				new Escolha();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equalsIgnoreCase("Votar")) {
			if(volei.isSelected()) {
				contV++;
				volei.setSelected(false);
			}
			if(futebol.isSelected()) {
				contF++;
				futebol.setSelected(false);
			}
			if(basquete.isSelected()) {
				contB++;
				basquete.setSelected(false);
			}
		}
			
			if(e.getActionCommand().equalsIgnoreCase("Terminar")) {
				
				tela2.setComponent(voleiIMG);
				
				if(contV > contF && contV > contB) {
					tela2.setComponent(voleiIMG);
				}else if(contF > contV && contF > contB) {
					tela2.setComponent(futebolIMG);
				}else if(contB > contV && contB > contF) {
					tela2.setComponent(basqueteIMG);
				}else if(contB == contF && contB == contV) {
					tela2.setComponent(esportesIMG);
				}
				tela2.setVisible(true);
			}
		}
		
	}


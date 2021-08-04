import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela2 extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	JLabel label;
	JLabel saida;
	JLabel label2;
	JTextField textField;
	JTextField textField2;
	
	public Tela2() {
		
		setTitle("Resultado");
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		label = new JLabel("Mais votado");
		add(label);
		
		saida = new JLabel("");
		add(saida);
		
//		textField = new JTextField(15);
//		textField.addActionListener(this);
//		textField.setEditable(true);
//		add(label);
//		
//		label2 = new JLabel("Qtd. de votos");
//		add(label2);
//		
//		textField2 = new JTextField(15);
//		add(label2);
		
	}
	public void setComponent(ImageIcon img)
	{
		
		saida.setIcon(img);
//		textField.setEditable(true);
	}

}

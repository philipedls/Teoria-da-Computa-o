package teoria.expressoesregulares;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExpressoesRegularesFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExpressoesRegularesFrame frame = new ExpressoesRegularesFrame();
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
	public ExpressoesRegularesFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 395);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(29, 11, 547, 321);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblProjeto = new JLabel("Projeto 1");
		lblProjeto.setFont(new Font("Berlin Sans FB", Font.PLAIN, 34));
		lblProjeto.setForeground(Color.BLACK);
		lblProjeto.setBounds(210, 11, 127, 62);
		panel.add(lblProjeto);
		
		JLabel lblInformeUmaCadeia = new JLabel("Informe uma cadeia:");
		lblInformeUmaCadeia.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInformeUmaCadeia.setBounds(82, 129, 154, 27);
		panel.add(lblInformeUmaCadeia);
		
		textField = new JTextField();
		textField.setBounds(246, 129, 197, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVerificar.setBounds(221, 188, 112, 23);
		btnVerificar.addActionListener(this);
		panel.add(btnVerificar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = textField.getText();
		textField.setText("");
		Expressao1 exp1 = new Expressao1(text);
		Expressao2 exp2 = new Expressao2(text);
		Expressao3 exp3 = new Expressao3(text);
		
		if(exp1.validarExpressao() == true){
			JOptionPane.showMessageDialog(null, "Válido!   Tipo da cadeia: cpf");
		
		}else if(exp2.validarExpressao() == true){
			JOptionPane.showMessageDialog(null, "Válido!   Tipo da cadeia: telefone");
		
		}else if(exp3.validarExpressao() == true){
			JOptionPane.showMessageDialog(null, "Válido!   Tipo da cadeia: Placa de Carro");
		
		}else{
			JOptionPane.showMessageDialog(null, "Cadeia Inválida");
		}
		
		
		
	}
}

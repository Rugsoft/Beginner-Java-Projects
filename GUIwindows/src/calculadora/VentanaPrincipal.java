package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNumeros;
	private double valorActual;
	private double valorAcumulado = 0;
	String acumulado = "";
	private JLabel lblAcumulado; // Declarar como atributo de la clase

	public VentanaPrincipal() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 281, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNumeros = new JTextField();
		textNumeros.setHorizontalAlignment(SwingConstants.RIGHT);
		textNumeros.setFont(new Font("Consolas", Font.BOLD, 14));
		textNumeros.setBounds(10, 37, 244, 37);
		contentPane.add(textNumeros);
		textNumeros.setColumns(10);
		
		JButton btnSumar = new JButton("+");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sumar();
			}
		});
		btnSumar.setFont(new Font("Consolas", Font.BOLD, 16));
		btnSumar.setBounds(10, 84, 244, 41);
		contentPane.add(btnSumar);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				restar();
			}
		});
		btnResta.setFont(new Font("Consolas", Font.BOLD, 16));
		btnResta.setBounds(10, 135, 244, 41);
		contentPane.add(btnResta);
		
		JButton btnProducto = new JButton("X");
		btnProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				multiplicar();
			}
		});
		btnProducto.setFont(new Font("Consolas", Font.BOLD, 16));
		btnProducto.setBounds(10, 186, 244, 41);
		contentPane.add(btnProducto);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dividir();
			}
		});
		btnDivision.setFont(new Font("Consolas", Font.BOLD, 16));
		btnDivision.setBounds(10, 237, 244, 41);
		contentPane.add(btnDivision);
		
		lblAcumulado = new JLabel("");
		lblAcumulado.setFont(new Font("Consolas", Font.PLAIN, 10));
		lblAcumulado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAcumulado.setBounds(10, 15, 244, 12);
		contentPane.add(lblAcumulado);
		
		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finalizar();
			}
		});
		btnResultado.setFont(new Font("Consolas", Font.BOLD, 16));
		btnResultado.setBounds(10, 288, 244, 41);
		contentPane.add(btnResultado);

	}

	protected void finalizar() {
		
		textNumeros.setText(String.valueOf(valorAcumulado));
		
	}

	protected void dividir() {
		try {
			acumulado += textNumeros.getText() + "/";
			lblAcumulado.setText(acumulado);
            valorActual = Double.parseDouble(textNumeros.getText());
            if (valorAcumulado != 0) {
            	valorAcumulado /= valorActual; 
            	textNumeros.setText(String.valueOf(valorAcumulado));
            } else {
            	valorAcumulado = valorActual;
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Detalles del error: " + e.getMessage());
        }
		
	}

	protected void multiplicar() {
		try {
			acumulado += textNumeros.getText() + "*";
			lblAcumulado.setText(acumulado);
            valorActual = Double.parseDouble(textNumeros.getText());
            if (valorAcumulado != 0) {
            	valorAcumulado *= valorActual; 
            	textNumeros.setText(String.valueOf(valorAcumulado));
            } else {
            	valorAcumulado = valorActual;
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Detalles del error: " + e.getMessage());
        }
		
	}

	protected void restar() {
		try {
			acumulado += textNumeros.getText() + "-";
			lblAcumulado.setText(acumulado);
            valorActual = Double.parseDouble(textNumeros.getText());
            if (valorAcumulado != 0) {
            	valorAcumulado -= valorActual; 
            	textNumeros.setText(String.valueOf(valorAcumulado));
            } else {
            	valorAcumulado = valorActual;
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Detalles del error: " + e.getMessage());
        }
		
	}

	protected void sumar() {
		
		try {
			acumulado += textNumeros.getText() + "+";
			lblAcumulado.setText(acumulado);
            valorActual = Double.parseDouble(textNumeros.getText());
            if (valorAcumulado != 0) {
            	valorAcumulado += valorActual; 
            	textNumeros.setText(String.valueOf(valorAcumulado));
            } else {
            	valorAcumulado = valorActual;
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Detalles del error: " + e.getMessage());
        } 
		
	}

}
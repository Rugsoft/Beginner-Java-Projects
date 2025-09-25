package ejemploVentana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiPrimeraVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JButton btnEjecutar2;
	private JLabel lblRespuesta;

	public MiPrimeraVentana() {
		setBackground(Color.DARK_GRAY);
		setTitle("Mi primera ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 287, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Introduce el nombre");
		lblTitulo.setBounds(10, 10, 136, 24);
		contentPane.add(lblTitulo);
		
		textNombre = new JTextField();
		textNombre.setBounds(10, 31, 213, 24);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JButton btnEjecutar = new JButton("Saludar");
		btnEjecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saludar();
			}

		});
		btnEjecutar.setBounds(10, 65, 127, 20);
		contentPane.add(btnEjecutar);
		
		btnEjecutar2 = new JButton("Saludo lbl");
		btnEjecutar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saludoLbl();
			}
		});
		btnEjecutar2.setBounds(139, 65, 84, 20);
		contentPane.add(btnEjecutar2);
		
		lblRespuesta = new JLabel("Esperando valor...");
		lblRespuesta.setBounds(10, 95, 213, 20);
		contentPane.add(lblRespuesta);

	}

	protected void saludoLbl() {
		
		String nombre = textNombre.getText();
		lblRespuesta.setText("Hola, " +nombre);
		
	}

	protected void saludar() {
		
		String nombre = textNombre.getText();
		JOptionPane.showMessageDialog(
				null,
				"Hola, " +nombre, 
				"Mensaje de saludo",
				JOptionPane.INFORMATION_MESSAGE
		);
		
	}
}

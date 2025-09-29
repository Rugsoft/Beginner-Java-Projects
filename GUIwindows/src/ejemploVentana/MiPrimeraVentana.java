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
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class MiPrimeraVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JLabel lblRespuesta;
	private JComboBox<String> comboBox_1;
	private JRadioButton rdbLabel;
	private JRadioButton rdbPane;
	private ButtonGroup bg = new ButtonGroup();
	private JCheckBox chckTerminos;
	private JCheckBox chckInfo;

	public MiPrimeraVentana() {
		setBackground(Color.DARK_GRAY);
		setTitle("Mi primera ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 309);
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
		btnEjecutar.setBounds(10, 65, 213, 20);
		contentPane.add(btnEjecutar);
		
		lblRespuesta = new JLabel("Esperando valor...");
		lblRespuesta.setBounds(10, 95, 213, 20);
		contentPane.add(lblRespuesta);
		
		comboBox_1 = new JComboBox<String>();
		String valores[] = {"Babau", "Huevon", "Franqueta"};
		comboBox_1.setModel(new DefaultComboBoxModel<>(valores));
		comboBox_1.setBounds(10, 153, 105, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblOpcionCombo = new JLabel("Seleccione Opcion");
		lblOpcionCombo.setBounds(10, 131, 105, 12);
		contentPane.add(lblOpcionCombo);
		
		rdbLabel = new JRadioButton("Salida Label");
		rdbLabel.setBounds(143, 153, 102, 20);
		contentPane.add(rdbLabel);
		
		rdbPane = new JRadioButton("Salida Panel");
		rdbPane.setBounds(143, 175, 102, 20);
		contentPane.add(rdbPane);
		
		bg.add(rdbLabel);
		bg.add(rdbPane);
		
		chckTerminos = new JCheckBox("Acepte Terminos");
		chckTerminos.setBounds(10, 189, 131, 20);
		contentPane.add(chckTerminos);
		
		chckInfo = new JCheckBox("Recibir info");
		chckInfo.setBounds(10, 211, 131, 20);
		contentPane.add(chckInfo);

	}
	
	protected void saludar() {
		if (rdbLabel.isSelected()) {
			saludarLabel();
		} else if (rdbPane.isSelected()) {
			saludarPane();
		} else {
			JOptionPane.showMessageDialog(
					null,
					"Selecciona algo weon", 
					"Mensaje de saludo",
					JOptionPane.ERROR_MESSAGE
			);
		}
			
	}

	private void saludarLabel() {
		String nombre = textNombre.getText();
		String combo = comboBox_1.getSelectedItem().toString();
		String seleccion ="";
		if (chckTerminos.isSelected()) {
			seleccion += "Terminos ";
		}
		if (chckInfo.isSelected()) {
			seleccion += " Info";
		}
		lblRespuesta.setText("Hola, " +nombre+" Combo Valor: " +combo+" Seleccion: " +seleccion);
	}

	private void saludarPane() {
		
		String nombre = textNombre.getText();
		String combo = comboBox_1.getSelectedItem().toString();
		String seleccion ="";
		if (chckTerminos.isSelected()) {
			seleccion += "Terminos";
		}
		if (chckInfo.isSelected()) {
			seleccion += "Info";
		}
		JOptionPane.showMessageDialog(
				null,
				"Hola, " +nombre+"\n"+
				"Combo Valor: " +combo+ "\n"+
				"Seleccion: " +seleccion, 
				"Mensaje de saludo",
				JOptionPane.INFORMATION_MESSAGE
		);
		
	}
}

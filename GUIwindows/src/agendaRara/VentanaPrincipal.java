package agendaRara;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import criaturasFantasticas.CriaturaEspecial;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> comboBox;
	private JRadioButton rdbVip;
	private JRadioButton rdbNormal;
	private JCheckBox chckTerminos;
	private JButton btnAñadir;
	private JButton btnGuardarAFichero;
	private JButton btnCargarDatos;
	private JTextField textNombre;
	private JTextField textDNI;
	private ButtonGroup bg = new ButtonGroup();
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("Ventana Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 198);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setBounds(10, 38, 96, 18);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 16, 68, 12);
		contentPane.add(lblNombre);
		
		textDNI = new JTextField();
		textDNI.setColumns(10);
		textDNI.setBounds(116, 38, 96, 18);
		contentPane.add(textDNI);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(116, 16, 44, 12);
		contentPane.add(lblDni);
		
		comboBox = new JComboBox<String>();
		String poblaciones[] = {"Badalona", "Barcelona", "Santa Coloma", "Hospitalet", "Sant Adrià"};
		comboBox.setModel(new DefaultComboBoxModel<>(poblaciones));
		comboBox.setBounds(222, 37, 96, 20);
		contentPane.add(comboBox);
		
		JLabel lblPoblacion = new JLabel("Poblacion");
		lblPoblacion.setBounds(222, 16, 57, 12);
		contentPane.add(lblPoblacion);
		
		rdbVip = new JRadioButton("Vip");
		rdbVip.setBounds(4, 62, 102, 20);
		contentPane.add(rdbVip);
		bg.add(rdbVip);
		
		rdbNormal = new JRadioButton("Normal");
		rdbNormal.setBounds(4, 88, 102, 20);
		contentPane.add(rdbNormal);
		bg.add(rdbNormal);
		
		chckTerminos = new JCheckBox("Terminos y condiciones");
		chckTerminos.setBounds(120, 77, 159, 20);
		contentPane.add(chckTerminos);
		
		btnAñadir = new JButton("Añadir Cliente");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirCliente();
			}
		});
		btnAñadir.setBounds(10, 127, 123, 20);
		contentPane.add(btnAñadir);
		
		btnGuardarAFichero = new JButton("Guardar Datos");
		btnGuardarAFichero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarDatos();
			}
		});
		btnGuardarAFichero.setBounds(143, 127, 123, 20);
		contentPane.add(btnGuardarAFichero);
		
		btnCargarDatos = new JButton("Cargar Datos");
		btnCargarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarDatos();
			}
		});
		btnCargarDatos.setBounds(276, 127, 123, 20);
		contentPane.add(btnCargarDatos);

	}

	protected void cargarDatos() {
		LeerFichero cargar = new LeerFichero();
		ArrayList<String> datosClientes= new ArrayList<String>(cargar.lecturaFichero());
		System.out.println(datosClientes);
		JOptionPane.showMessageDialog(
				null,
				"Datos leidos correctamente, cheka la consola weon!", 
				"Mensaje de informacion",
				JOptionPane.INFORMATION_MESSAGE
		);
		
		//for(int i = 0; i < datosClientes.size(); i++) {};
		
	}

	protected void guardarDatos() {
		EscribirFichero eF = new EscribirFichero();
		for (Cliente clients : clientes) {
			
			eF.pasarAFichero(clients.show());
			
		}
		JOptionPane.showMessageDialog(
				null,
				"Clientes añadidos a fichero correctamente", 
				"Mensaje de informacion",
				JOptionPane.INFORMATION_MESSAGE
		);
		
	}

	protected void añadirCliente() {
		String name = textNombre.getText();
		String dni = textDNI.getText();
		String poblacion = comboBox.getSelectedItem().toString();
		boolean isVip = false, isTerminos = false;
		if (rdbVip.isSelected()) {
			isVip = true;
		}
		if (chckTerminos.isSelected()) {
			isTerminos = true;
		}
		
		Cliente cliente = new Cliente(name, dni, poblacion, isVip, isTerminos);
		clientes.add(cliente);
		JOptionPane.showMessageDialog(
				null,
				"Cliente Añadido", 
				"Mensaje de informacion",
				JOptionPane.INFORMATION_MESSAGE
		);
	}
}

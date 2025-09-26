package fabricaRobots;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VentanaPrincipalRobots extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textModelo;
	private JTextField textFabricante;
	private JTextField textPais;
	private JTextField textTipo;
	private JTextField textSGuiado;
	private JTextField textMunicion;
	private JTextField textMaterial;
	private JTextField textPeso;
	private JTextField textTMovilidad;
	private int contadorRobots = 0;
	ArrayList<Robot> robots = new ArrayList<Robot>();

	/**
	 * Create the frame.
	 */
	public VentanaPrincipalRobots() {
		setTitle("Creador de Robots");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRobot = new JLabel("Robot Base");
		lblRobot.setFont(new Font("Consolas", Font.BOLD, 20));
		lblRobot.setBounds(216, 10, 121, 24);
		contentPane.add(lblRobot);
		
		textModelo = new JTextField();
		textModelo.setBounds(226, 44, 96, 18);
		contentPane.add(textModelo);
		textModelo.setColumns(10);
		
		textFabricante = new JTextField();
		textFabricante.setColumns(10);
		textFabricante.setBounds(226, 72, 96, 18);
		contentPane.add(textFabricante);
		
		textPais = new JTextField();
		textPais.setColumns(10);
		textPais.setBounds(226, 100, 96, 18);
		contentPane.add(textPais);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(157, 47, 44, 12);
		contentPane.add(lblModelo);
		
		JLabel lblFabricante = new JLabel("Fabricante");
		lblFabricante.setBounds(157, 75, 59, 12);
		contentPane.add(lblFabricante);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setBounds(157, 103, 44, 12);
		contentPane.add(lblPais);
		
		JLabel lblArmamento = new JLabel("Armamento");
		lblArmamento.setFont(new Font("Consolas", Font.BOLD, 20));
		lblArmamento.setBounds(80, 143, 121, 24);
		contentPane.add(lblArmamento);
		
		JLabel lblExoesqueleto = new JLabel("Exoesqueleto");
		lblExoesqueleto.setFont(new Font("Consolas", Font.BOLD, 20));
		lblExoesqueleto.setBounds(419, 143, 141, 24);
		contentPane.add(lblExoesqueleto);
		
		textTipo = new JTextField();
		textTipo.setColumns(10);
		textTipo.setBounds(80, 177, 96, 18);
		contentPane.add(textTipo);
		
		textSGuiado = new JTextField();
		textSGuiado.setColumns(10);
		textSGuiado.setBounds(80, 203, 96, 18);
		contentPane.add(textSGuiado);
		
		textMunicion = new JTextField();
		textMunicion.setColumns(10);
		textMunicion.setBounds(80, 231, 96, 18);
		contentPane.add(textMunicion);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(11, 180, 44, 12);
		contentPane.add(lblTipo);
		
		JLabel lblSguiado = new JLabel("S.Guiado");
		lblSguiado.setBounds(11, 206, 59, 12);
		contentPane.add(lblSguiado);
		
		JLabel lblMunicion = new JLabel("Municion");
		lblMunicion.setBounds(11, 234, 59, 12);
		contentPane.add(lblMunicion);
		
		textMaterial = new JTextField();
		textMaterial.setColumns(10);
		textMaterial.setBounds(429, 177, 96, 18);
		contentPane.add(textMaterial);
		
		textPeso = new JTextField();
		textPeso.setColumns(10);
		textPeso.setBounds(429, 203, 96, 18);
		contentPane.add(textPeso);
		
		textTMovilidad = new JTextField();
		textTMovilidad.setColumns(10);
		textTMovilidad.setBounds(429, 231, 96, 18);
		contentPane.add(textTMovilidad);
		
		JLabel lblMaterial = new JLabel("Material");
		lblMaterial.setBounds(362, 180, 44, 12);
		contentPane.add(lblMaterial);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(362, 206, 44, 12);
		contentPane.add(lblPeso);
		
		JLabel lblTmovilidad = new JLabel("T.Movilidad");
		lblTmovilidad.setBounds(362, 234, 57, 12);
		contentPane.add(lblTmovilidad);
		
		JButton btnCrearRobot = new JButton("Crear Robot");
		btnCrearRobot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearRobot();
			}
		});
		btnCrearRobot.setBounds(226, 172, 96, 24);
		contentPane.add(btnCrearRobot);
		
		JButton btnGuardarDatos = new JButton("Guardar");
		btnGuardarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarDatos();
			}
		});
		btnGuardarDatos.setBounds(226, 226, 96, 23);
		contentPane.add(btnGuardarDatos);

	}

	protected void guardarDatos() {
		
		for (Robot robot : robots) {
			String cadena = robot.datosRobot();
			cadena = "Robot: " +contadorRobots+ " " + cadena;
			EscribirFichero ef = new EscribirFichero();
			ef.pasarAFichero(cadena);
			contadorRobots += 1;
		}
        JOptionPane.showMessageDialog(
                null,
                "Roboces guardados",
                "Información",
                JOptionPane.INFORMATION_MESSAGE
        );
		//String cadena = (robots.get(contadorRobots)).datosRobot();
		//cadena = "Robot: " +contadorRobots+ " " + cadena;
		//EscribirFichero ef = new EscribirFichero();
		//ef.pasarAFichero(cadena);
		//contadorRobots += 1;
	}

	protected void crearRobot() {
		//Robot Base
		String modelo = textModelo.getText();
		String fabricante = textFabricante.getText();
		String pais = textPais.getText();
		//Armamento
		String tipo = textTipo.getText();
		boolean sguiado = Boolean.parseBoolean(textSGuiado.getText());
		int municion = Integer.parseInt(textMunicion.getText());
		//Exoesqueleto
		String material = textMaterial.getText();
		double peso = Double.parseDouble(textPeso.getText());
		String movilidad = textTMovilidad.getText();
		
		Armamento arma = new Armamento(tipo, sguiado, municion);
		Exoesqueleto exo = new Exoesqueleto(material, peso, movilidad);
		Robot robot = new Robot(modelo, fabricante, pais, exo, arma);
		robots.add(robot);
		
		JOptionPane.showMessageDialog(
                null,
                "Robot Creado!",
                "Información",
                JOptionPane.INFORMATION_MESSAGE
        );
		
	}
}

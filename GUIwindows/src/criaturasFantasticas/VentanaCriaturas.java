package criaturasFantasticas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fabricaRobots.EscribirFichero;
import fabricaRobots.Robot;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class VentanaCriaturas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textEspecie;
	private JTextField textNivelEnergia;
	private JTextField textHabilidadMagica;
	private JTextField textRareza;
	List<CriaturaEspecial> criaturasEsp = new ArrayList<CriaturaEspecial>();
	List<Criatura> criaturas = new ArrayList<Criatura>();

	/**
	 * Create the frame.
	 */
	public VentanaCriaturas() {
		setTitle("Registrar Criaturas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 246, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Criaturas SL");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setBounds(51, 10, 108, 22);
		contentPane.add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 48, 44, 12);
		contentPane.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(114, 42, 96, 18);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblEspecie = new JLabel("Especie");
		lblEspecie.setBounds(10, 73, 44, 12);
		contentPane.add(lblEspecie);
		
		textEspecie = new JTextField();
		textEspecie.setColumns(10);
		textEspecie.setBounds(114, 67, 96, 18);
		contentPane.add(textEspecie);
		
		JLabel lblNivelEnergia = new JLabel("Nivel Energia");
		lblNivelEnergia.setBounds(10, 98, 66, 12);
		contentPane.add(lblNivelEnergia);
		
		textNivelEnergia = new JTextField();
		textNivelEnergia.setColumns(10);
		textNivelEnergia.setBounds(114, 92, 96, 18);
		contentPane.add(textNivelEnergia);
		
		JLabel lblHabilidadMagica = new JLabel("Habilidad Magica");
		lblHabilidadMagica.setBounds(10, 155, 94, 12);
		contentPane.add(lblHabilidadMagica);
		
		textHabilidadMagica = new JTextField();
		textHabilidadMagica.setColumns(10);
		textHabilidadMagica.setBounds(114, 149, 96, 18);
		contentPane.add(textHabilidadMagica);
		
		JLabel lblRareza = new JLabel("Rareza");
		lblRareza.setBounds(10, 180, 44, 12);
		contentPane.add(lblRareza);
		
		textRareza = new JTextField();
		textRareza.setColumns(10);
		textRareza.setBounds(114, 174, 96, 18);
		contentPane.add(textRareza);
		
		JLabel lblEspeciales = new JLabel("Especiales");
		lblEspeciales.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspeciales.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEspeciales.setBounds(51, 117, 108, 22);
		contentPane.add(lblEspeciales);
		
		JButton btnAñadir = new JButton("Añadir Criatura");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirCriatura();
			}
		});
		btnAñadir.setBounds(10, 208, 212, 20);
		contentPane.add(btnAñadir);
		
		JButton btnGuardar = new JButton("Guardar a fichero");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarFichero();
			}
		});
		btnGuardar.setBounds(10, 236, 212, 20);
		contentPane.add(btnGuardar);

	}

	protected void guardarFichero() {
		for (int i=0;i<criaturas.size();i++) {
			
			String cadena = "Criatura: " +i+ "\n" +
							"Nombre: " + criaturas.get(i).getNombre() + "\n" +
							"Especie: " + criaturas.get(i).getEspecie() + "\n" +
							"Nivel de energia: " + criaturas.get(i).getNivelEnergia() + "\n\n";
							
			
			EscribirFichero ef = new EscribirFichero();
			ef.pasarAFichero(cadena);
		}
		for (int i=0;i<criaturasEsp.size();i++) {
			
			String cadena = "Criatura Especial: " +i+ "\n" +
							"Nombre: " + criaturasEsp.get(i).getNombre() + "\n" +
							"Especie: " + criaturasEsp.get(i).getEspecie() + "\n" +
							"Nivel de energia: " + criaturasEsp.get(i).getNivelEnergia() + "\n" +
							"Habilidad: " + criaturasEsp.get(i).getHabilidad() + "\n" + 
							"Rareza: " + criaturasEsp.get(i).getRareza() + "\n\n";
							
			
			EscribirFichero ef = new EscribirFichero();
			ef.pasarAFichero(cadena);
		}
		JOptionPane.showMessageDialog(
                null,
                "Criaturas guardadas en fichero.",
                "Información",
                JOptionPane.INFORMATION_MESSAGE
        );
		
	}

	protected void añadirCriatura() {
		
		String nombre = textNombre.getText();
		String especie = textEspecie.getText();
		int nivelEnergia = Integer.parseInt(textNivelEnergia.getText());
		
		if (!(textRareza.getText().isEmpty() && textHabilidadMagica.getText().isEmpty())) {
			
			String rareza = textRareza.getText();
			String habilidad = textHabilidadMagica.getText();
			
			CriaturaEspecial criaturaEs = new CriaturaEspecial(nombre, especie, nivelEnergia, habilidad, rareza);
			criaturasEsp.add(criaturaEs);
			JOptionPane.showMessageDialog(
	                null,
	                "Criatura Especial creada!",
	                "Información",
	                JOptionPane.INFORMATION_MESSAGE
	        );
			
		} else {
			
			Criatura criatura = new Criatura(nombre, especie, nivelEnergia);
			criaturas.add(criatura);
			JOptionPane.showMessageDialog(
	                null,
	                "Criatura creada!",
	                "Información",
	                JOptionPane.INFORMATION_MESSAGE
	        );
		}
	}
}

package INTERFAZ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import MUNDO.Usuario;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ventanaComprar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Principal miV;
	private JLabel lblUsuario;
	private String informacionUsuario;
	private JButton btnSalir;
	private JButton btnComprar;
	private JButton btnCerrarSesion;
	private JComboBox<String> comboConciertos;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public ventanaComprar(Principal miV) {
		this.miV = miV;
		setTitle("MI BOLETA");
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setBounds(100, 100, 1370, 854);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMiBoleta = new JLabel("Mi Boleta");
		lblMiBoleta.setBackground(Color.DARK_GRAY);
		lblMiBoleta.setOpaque(true);
		lblMiBoleta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 45));
		lblMiBoleta.setHorizontalAlignment(SwingConstants.CENTER);
		lblMiBoleta.setForeground(Color.WHITE);
		lblMiBoleta.setBounds(52, 21, 286, 97);
		contentPane.add(lblMiBoleta);

		ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/imagen1.jpg"));
		JLabel lblImagen1 = new JLabel("");
		lblImagen1.setBounds(10, 291, 268, 403);
		Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(lblImagen1.getWidth(), lblImagen1.getHeight(),
				Image.SCALE_DEFAULT));
		lblImagen1.setIcon(fondo1);
		contentPane.add(lblImagen1);

		ImageIcon imagen2 = new ImageIcon(getClass().getResource("/IMAGENES/gif1.gif"));
		JLabel lblGif = new JLabel("");
		lblGif.setBounds(523, 11, 386, 161);
		Icon fondo2 = new ImageIcon(
				imagen2.getImage().getScaledInstance(lblGif.getWidth(), lblGif.getHeight(), Image.SCALE_DEFAULT));
		lblGif.setIcon(fondo2);
		contentPane.add(lblGif);

		ImageIcon imagen3 = new ImageIcon(getClass().getResource("/IMAGENES/gif2.gif"));
		JLabel lblGif2 = new JLabel("");
		lblGif2.setBounds(937, 11, 386, 161);
		Icon fondo3 = new ImageIcon(
				imagen3.getImage().getScaledInstance(lblGif2.getWidth(), lblGif2.getHeight(), Image.SCALE_DEFAULT));
		lblGif2.setIcon(fondo3);
		contentPane.add(lblGif2);

		JLabel lblTitulo = new JLabel("");
		lblTitulo.setOpaque(true);
		lblTitulo.setBackground(Color.DARK_GRAY);
		lblTitulo.setBounds(0, 0, 1371, 183);
		contentPane.add(lblTitulo);

		JLabel lblArtistaDeLa = new JLabel("ARTISTA DE LA SEMANA");
		lblArtistaDeLa.setOpaque(true);
		lblArtistaDeLa.setBackground(Color.DARK_GRAY);
		lblArtistaDeLa.setForeground(Color.RED);
		lblArtistaDeLa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblArtistaDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblArtistaDeLa.setBounds(10, 246, 268, 23);
		contentPane.add(lblArtistaDeLa);

		modificalblUsuario();
		lblUsuario = new JLabel("<HTML> INFORMACION DEL USUARIO:  <br><br><br> " + informacionUsuario);
		lblUsuario.setVerticalAlignment(SwingConstants.TOP);
		lblUsuario.setOpaque(true);
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBackground(Color.DARK_GRAY);
		lblUsuario.setBounds(724, 231, 268, 236);
		contentPane.add(lblUsuario);

		comboConciertos = new JComboBox<String>();
		comboConciertos.addActionListener(this);
		comboConciertos.setBounds(376, 344, 323, 28);
		comboConciertos.setModel(
				new DefaultComboBoxModel<>(new String[] { " Seleccione ", "Gigantes de la Salsa ", " Marc Antony" }));
		comboConciertos.setSelectedItem(0);
		contentPane.add(comboConciertos);
		btnCerrarSesion = new JButton("CERRAR SESION");
		btnCerrarSesion.addActionListener(this);
		btnCerrarSesion.setForeground(Color.RED);
		btnCerrarSesion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCerrarSesion.setBackground(Color.ORANGE);
		btnCerrarSesion.setBounds(433, 501, 141, 36);
		contentPane.add(btnCerrarSesion);

		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setForeground(Color.RED);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalir.setBackground(Color.ORANGE);
		btnSalir.setBounds(433, 565, 141, 36);
		contentPane.add(btnSalir);

		btnComprar = new JButton("COMPRAR");
		btnComprar.addActionListener(this);
		btnComprar.setForeground(Color.RED);
		btnComprar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnComprar.setBackground(Color.ORANGE);
		btnComprar.setBounds(433, 438, 141, 36);
		contentPane.add(btnComprar);

		JLabel label = new JLabel("<HTML> INFORMACION DEL ESCENARIO:  <br><br><br> "
				+ "1. Segundo piso Occidental. Capacidad: 104<br><br>"
				+ " 2. Primer piso Occidental. Capacidad: 104<br><br> "
				+ "3. Primer piso Oriental. Capacidad: 104<br><br> "
				+ "4. Segundo piso Oriental. Capacidad: 104<br><br> "
				+ "5. Segundo piso Occidental. Capacidad: 126<br><br> "
				+ "6. Primer piso Occidental. Capacidad: 126<br><br>"
				+ " 7. Primer piso Oriental. Capacidad: 126<br><br> "
				+ "8. Segundo piso Oriental. Capacidad: 126<br><br> " + "9. Primer piso Sur. Capacidad: 400<br><br>"
				+ " 10. Primer piso Sur occidental. Capacidad: 150<br><br> "
				+ "11. Segundo piso Sur. Capacidad: 150<br><br>"
				+ " 12. Segundo piso Sur. Capacidad: 150<br><br></HTML>");

		label.setVerticalAlignment(SwingConstants.TOP);
		label.setOpaque(true);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBackground(Color.GRAY);
		label.setBounds(1026, 183, 318, 511);
		contentPane.add(label);

		JLabel label_1 = new JLabel(
				"<HTML> INFORMACION DEL ESCENARIO:  <br><br><br> Palco. Capacidad: 50"
						+ "<br><br> Platea. Capacidad: 66"
						+ "<br><br> VIP. Capacidad: 84</HTML>");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setOpaque(true);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBackground(Color.GRAY);
		label_1.setBounds(698, 511, 318, 183);
		contentPane.add(label_1);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == btnCerrarSesion) {
			miV.setVisible(true);
			miV.cerrarSesions();
			this.setVisible(false);

		}
		if (arg0.getSource() == btnSalir) {
			System.exit(0);
		}
		if (arg0.getSource() == comboConciertos) {

		}
		if (arg0.getSource() == btnComprar) {
			int x = miV.cuentapuestosselecciondos();
			if (x < 8) {
				if (x > 0) {
					JOptionPane.showMessageDialog(null, "Usted ya ha comprado: " + x + " Boletas", "Informacion",
							JOptionPane.INFORMATION_MESSAGE);
				}
				ventanaSeleccioneTribuna micompra = new ventanaSeleccioneTribuna(this, miV);
				micompra.setVisible(true);
				this.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "Usted ya ha comprado: " + x + " Boletas no puede comprar mas",
						"Informacion", JOptionPane.INFORMATION_MESSAGE);
			}
		}

	}

	public void usuarioIngreso() {
		Usuario miU = miV.getUsuario();
		if (miU == null) {
			informacionUsuario = "<HTML> No ha iniciado sesion. " + "<br><br><br>" + "</HTML>";
		} else {
			informacionUsuario = "<HTML>  INFORMACION DEL USUARIO:  <br><br>" + " " + miU.getNombre() + "<br>" + " "
					+ miU.getCorreo() + "<br>" + " " + miU.getCedula() + "<br>" + " " + miU.getDireccion() + "<br>"
					+ " " + miU.getTelefono() + "</HTML>";
		}
	}

	public void modificalblUsuario() {
		usuarioIngreso();
	}
}

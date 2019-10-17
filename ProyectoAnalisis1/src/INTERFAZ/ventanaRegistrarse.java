package INTERFAZ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import MUNDO.Usuario;

import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class ventanaRegistrarse extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Principal miV;
	private JTextField txtCorreo;
	private JTextField txtNombre;
	private JTextField txtContraseña;
	private JTextField txtContraseña2;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JButton btnRegistrarse;
	private JButton btnAtras;
	private JTextField txtCedula;
	private JPanel panel;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ventanaRegistrarse(Principal miV) {
		this.miV = miV;
		setTitle("MI BOLETA");
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setBounds(100, 100, 1370, 1008);
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
		lblGif.setBounds(526, 21, 386, 161);
		Icon fondo2 = new ImageIcon(
				imagen2.getImage().getScaledInstance(lblGif.getWidth(), lblGif.getHeight(), Image.SCALE_DEFAULT));
		lblGif.setIcon(fondo2);
		contentPane.add(lblGif);

		ImageIcon imagen3 = new ImageIcon(getClass().getResource("/IMAGENES/gif2.gif"));
		JLabel lblGif2 = new JLabel("");
		lblGif2.setBounds(938, 21, 386, 161);
		Icon fondo3 = new ImageIcon(
				imagen3.getImage().getScaledInstance(lblGif2.getWidth(), lblGif2.getHeight(), Image.SCALE_DEFAULT));
		lblGif2.setIcon(fondo3);
		contentPane.add(lblGif2);

		JLabel lblTitulo = new JLabel("");
		lblTitulo.setOpaque(true);
		lblTitulo.setBackground(Color.DARK_GRAY);
		lblTitulo.setBounds(0, 0, 1371, 201);

		contentPane.add(lblTitulo);

		JLabel lblInformacion = new JLabel(
				"<HTML> INFORMACION DEL CONTACTO:  <br><br><br> Productor: Nicolas Dario Ortiz Peña <br><br>Telefono: 3155246772 <br><br>Correo: nicolas950511@hotmail.com</HTML>");
		lblInformacion.setForeground(Color.WHITE);
		lblInformacion.setOpaque(true);
		lblInformacion.setBackground(Color.DARK_GRAY);
		lblInformacion.setVerticalAlignment(SwingConstants.TOP);
		lblInformacion.setBounds(980, 229, 308, 155);
		contentPane.add(lblInformacion);
		JLabel lblArtistaDeLa = new JLabel("ARTISTA DE LA SEMANA");
		lblArtistaDeLa.setOpaque(true);
		lblArtistaDeLa.setBackground(Color.GRAY);
		lblArtistaDeLa.setForeground(Color.RED);
		lblArtistaDeLa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblArtistaDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblArtistaDeLa.setBounds(10, 246, 268, 23);
		contentPane.add(lblArtistaDeLa);

		JLabel lblNewLabel = new JLabel("DATOS PERSONALES:");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(338, 229, 415, 42);
		contentPane.add(lblNewLabel);

		JLabel lblCorreo = new JLabel("Correo: ");
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setOpaque(true);
		lblCorreo.setBackground(Color.DARK_GRAY);
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblCorreo.setBounds(338, 291, 82, 31);
		contentPane.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(535, 291, 308, 31);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setOpaque(true);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNombre.setBackground(Color.DARK_GRAY);
		lblNombre.setBounds(338, 353, 82, 31);
		contentPane.add(lblNombre);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setOpaque(true);
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblContrasea.setBackground(Color.DARK_GRAY);
		lblContrasea.setBounds(338, 411, 118, 31);
		contentPane.add(lblContrasea);

		JLabel lblConfirmarContrasea = new JLabel("<HTML> Confirmar <br> contraseña:  </HTML>");
		lblConfirmarContrasea.setForeground(Color.WHITE);
		lblConfirmarContrasea.setOpaque(true);
		lblConfirmarContrasea.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblConfirmarContrasea.setBackground(Color.DARK_GRAY);
		lblConfirmarContrasea.setBounds(338, 472, 118, 62);
		contentPane.add(lblConfirmarContrasea);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(535, 353, 308, 31);
		contentPane.add(txtNombre);

		txtContraseña = new JTextField();
		txtContraseña.setColumns(10);
		txtContraseña.setBounds(535, 411, 308, 31);
		contentPane.add(txtContraseña);

		txtContraseña2 = new JTextField();
		txtContraseña2.setColumns(10);
		txtContraseña2.setBounds(535, 480, 308, 31);
		contentPane.add(txtContraseña2);

		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setOpaque(true);
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblTelefono.setBackground(Color.DARK_GRAY);
		lblTelefono.setBounds(338, 566, 118, 31);
		contentPane.add(lblTelefono);

		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setForeground(Color.WHITE);
		lblDireccion.setOpaque(true);
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblDireccion.setBackground(Color.DARK_GRAY);
		lblDireccion.setBounds(338, 626, 118, 31);
		contentPane.add(lblDireccion);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {

				if (!Character.isDigit(arg0.getKeyChar())) {
					getToolkit().beep();
					arg0.consume();
				}

			}
		});
		txtTelefono.setBounds(535, 566, 308, 31);
		contentPane.add(txtTelefono);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(535, 626, 308, 31);
		contentPane.add(txtDireccion);

		btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.addActionListener(this);
		btnRegistrarse.setForeground(Color.RED);
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegistrarse.setBackground(Color.ORANGE);
		btnRegistrarse.setBounds(900, 548, 194, 54);
		contentPane.add(btnRegistrarse);

		btnAtras = new JButton("ATRAS");
		btnAtras.addActionListener(this);
		btnAtras.setForeground(Color.RED);
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtras.setBackground(Color.ORANGE);
		btnAtras.setBounds(1130, 548, 194, 54);
		contentPane.add(btnAtras);

		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setForeground(Color.WHITE);
		lblCedula.setOpaque(true);
		lblCedula.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblCedula.setBackground(Color.DARK_GRAY);
		lblCedula.setBounds(875, 411, 82, 31);
		contentPane.add(lblCedula);

		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {

				if (!Character.isDigit(arg0.getKeyChar())) {
					getToolkit().beep();
					arg0.consume();
				}

			}
		});
		txtCedula.setBounds(980, 411, 308, 31);
		contentPane.add(txtCedula);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1334, 198, 37, 1115);
		contentPane.add(scrollBar);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == btnAtras) {
			miV.setVisible(true);
			this.setVisible(false);
		}
		if (arg0.getSource() == btnRegistrarse) {

			if (txtCedula.getText().equals("") || txtDireccion.getText().equals("") || txtNombre.getText().equals("")
					|| txtTelefono.getText().equals("") || txtContraseña.getText().equals("")
					|| txtContraseña2.getText().equals("") || txtCorreo.getText().equals("")) {

				JOptionPane.showMessageDialog(this, "CAMPOS VACIOS", "ERROR", JOptionPane.ERROR_MESSAGE);

			} else {
				if (txtContraseña.getText().equals(txtContraseña2.getText())) {

					Usuario miU = new Usuario(txtCedula.getText(), txtNombre.getText(), txtContraseña.getText(),
							txtCorreo.getText(), txtTelefono.getText(), txtDireccion.getText());
					boolean centinela = miV.retornarExiste(miU);
					if (centinela == false) {
						miV.agregarUsuario(miU);
						JOptionPane.showMessageDialog(null, "El registro ha sido exitoso, ahora puede ingresar");
						limpiar();
						miV.setVisible(true);
						this.setVisible(false);

					} else {
						JOptionPane.showMessageDialog(this, "EL USUARIO YA EXISTE ", "ERROR",
								JOptionPane.ERROR_MESSAGE);
						limpiar();
					}

				} else {
					JOptionPane.showMessageDialog(this, "CONTRASEÑA INCORRECTA ", "ERROR", JOptionPane.ERROR_MESSAGE);
					limpiarContraseña();
				}

			}
		}

	}

	public void limpiar() {
		txtCedula.setText("");
		txtContraseña.setText("");
		txtContraseña2.setText("");
		txtCorreo.setText("");
		txtDireccion.setText("");
		txtNombre.setText("");
		txtTelefono.setText("");
	}

	public void limpiarContraseña() {
		txtContraseña.setText("");
		txtContraseña2.setText("");
	}
}

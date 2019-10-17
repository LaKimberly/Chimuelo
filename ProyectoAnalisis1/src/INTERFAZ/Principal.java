package INTERFAZ;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MUNDO.TuBoleta;
import MUNDO.Usuario;

import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JScrollBar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private TuBoleta tuBoleta;
	private JButton btnIngresar;
	private JButton btnRegistrarse;
	private JButton btnSalir;
	private JButton btnEscenarios;
	private JLabel lblUsuario;
	private String informacionUsuario;
	private JButton btnCerrarSesion;
	private JButton btnConciertos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();

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
	public Principal() {

		tuBoleta = new TuBoleta();
		tuBoleta.inicializa();

		setTitle("MI BOLETA");
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setBounds(100, 100, 1370, 854);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
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

		btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(this);
		btnIngresar.setForeground(Color.RED);
		btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIngresar.setBackground(Color.ORANGE);
		btnIngresar.setBounds(52, 146, 166, 36);
		contentPane.add(btnIngresar);

		btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.addActionListener(this);
		btnRegistrarse.setForeground(Color.RED);
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRegistrarse.setBackground(Color.ORANGE);
		btnRegistrarse.setBounds(228, 146, 166, 36);
		contentPane.add(btnRegistrarse);

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

		btnConciertos = new JButton("CONCIERTOS");
		btnConciertos.addActionListener(this);
		btnConciertos.setForeground(Color.RED);
		btnConciertos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnConciertos.setBackground(Color.ORANGE);
		btnConciertos.setBounds(367, 212, 194, 36);
		contentPane.add(btnConciertos);

		JLabel lblInformacion = new JLabel(
				"<HTML> INFORMACION DEL CONTACTO:  <br><br><br> Productor: Nicolas Dario Ortiz Peña <br><br>Telefono: 3155246772 <br><br>Correo: nicolas950511@hotmail.com</HTML>");
		lblInformacion.setForeground(Color.WHITE);
		lblInformacion.setOpaque(true);
		lblInformacion.setBackground(Color.DARK_GRAY);
		lblInformacion.setVerticalAlignment(SwingConstants.TOP);
		lblInformacion.setBounds(1076, 229, 268, 132);
		contentPane.add(lblInformacion);

		JLabel lblConciertos = new JLabel("");
		lblConciertos.setBounds(356, 259, 590, 423);
		contentPane.add(lblConciertos);
		devuelveImagen();

		JLabel lblArtistaDeLa = new JLabel("ARTISTA DE LA SEMANA");
		lblArtistaDeLa.setOpaque(true);
		lblArtistaDeLa.setBackground(Color.GRAY);
		lblArtistaDeLa.setForeground(Color.RED);
		lblArtistaDeLa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblArtistaDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblArtistaDeLa.setBounds(10, 246, 268, 23);
		contentPane.add(lblArtistaDeLa);

		btnEscenarios = new JButton("ESCENARIOS");
		btnEscenarios.addActionListener(this);
		btnEscenarios.setForeground(Color.RED);
		btnEscenarios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEscenarios.setBackground(Color.ORANGE);
		btnEscenarios.setBounds(590, 212, 194, 36);
		contentPane.add(btnEscenarios);

		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setForeground(Color.RED);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalir.setBackground(Color.ORANGE);
		btnSalir.setBounds(1203, 627, 141, 36);
		contentPane.add(btnSalir);

		btnCerrarSesion = new JButton("CERRAR SESION");
		btnCerrarSesion.addActionListener(this);
		btnCerrarSesion.setForeground(Color.RED);
		btnCerrarSesion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCerrarSesion.setBackground(Color.ORANGE);
		btnCerrarSesion.setBounds(1052, 627, 141, 36);
		contentPane.add(btnCerrarSesion);

		usuarioIngreso();

		lblUsuario = new JLabel("<HTML> INFORMACION DEL USUARIO:  <br><br><br> " + informacionUsuario);

		lblUsuario.setVerticalAlignment(SwingConstants.TOP);
		lblUsuario.setOpaque(true);
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBackground(Color.DARK_GRAY);
		lblUsuario.setBounds(1076, 380, 268, 236);
		contentPane.add(lblUsuario);

	}

	static int contador = 0;

	public void devuelveImagen() {
		String c1 = "/IMAGENES/concierto1.jpg";
		String c2 = "/IMAGENES/concierto2.jpg";
		String c3 = "/IMAGENES/concierto3.jpg";
		String c4 = "/IMAGENES/concierto4.jpg";

		int velocidad = 5;
		Timer timer;
		TimerTask tarea;
		int vel = velocidad * 1000;
		JLabel lblGif2 = new JLabel("");
		lblGif2.setBounds(356, 259, 590, 423);
		tarea = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				switch (contador) {

				case 0:
					contador = 1;

					ImageIcon imagen3 = new ImageIcon(getClass().getResource(c1));
					Icon fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(lblGif2.getWidth(),
							lblGif2.getHeight(), Image.SCALE_DEFAULT));
					lblGif2.setIcon(fondo3);
					break;
				case 1:
					contador = 2;
					imagen3 = new ImageIcon(getClass().getResource(c2));
					fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(lblGif2.getWidth(), lblGif2.getHeight(),
							Image.SCALE_DEFAULT));
					lblGif2.setIcon(fondo3);
					break;

				case 2:
					contador = 3;
					imagen3 = new ImageIcon(getClass().getResource(c3));
					fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(lblGif2.getWidth(), lblGif2.getHeight(),
							Image.SCALE_DEFAULT));
					lblGif2.setIcon(fondo3);

					break;
				case 3:
					contador = 0;
					imagen3 = new ImageIcon(getClass().getResource(c4));
					fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(lblGif2.getWidth(), lblGif2.getHeight(),
							Image.SCALE_DEFAULT));
					lblGif2.setIcon(fondo3);

					break;

				}

			}
		};

		timer = new Timer();

		timer.scheduleAtFixedRate(tarea, 0, vel);
		contentPane.add(lblGif2);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == btnIngresar) {
			ventanaIngresar vn = new ventanaIngresar(this);
			vn.setVisible(true);
			this.setVisible(false);
		}
		if (arg0.getSource() == btnRegistrarse) {
			ventanaRegistrarse vr = new ventanaRegistrarse(this);
			vr.setVisible(true);
			this.setVisible(false);
		}
		if (arg0.getSource() == btnEscenarios) {
			ventanaEscenarios ve = new ventanaEscenarios(this);
			ve.setVisible(true);
			this.setVisible(false);
		}
		if (arg0.getSource() == btnSalir) {
			System.exit(0);
		}
		if (arg0.getSource() == btnCerrarSesion) {
			cerrarSesions();
		}
		if (arg0.getSource() == btnConciertos) {
			if (tuBoleta.getUsuario() == null) {
				JOptionPane.showMessageDialog(null, "Debe iniciar sesion ");
			} else {
				ventanaComprar comprar = new ventanaComprar(this);
				comprar.setVisible(true);
				this.setVisible(false);
			}
		}
	}

	public void agregarUsuario(Usuario miU) {
		tuBoleta.agregarClientes(miU);
	}

	public boolean retornarExiste(Usuario miU) {
		return tuBoleta.usuarioExiste(miU);
	}

	public boolean ingresaUsuario(String contraseña, String correo) {
		return tuBoleta.usuarioIngresa(contraseña, correo);
	}

	public void usuarioIngreso() {
		Usuario miU = tuBoleta.getUsuario();
		if (miU == null) {
			informacionUsuario = "<HTML> No ha iniciado sesion. " + "<br><br><br>" + "</HTML>";
		} else {
			informacionUsuario = "<HTML>  INFORMACION DEL USUARIO:  <br><br>" + " " + miU.getNombre() + "<br><br>" + " "
					+ miU.getCorreo() + "<br><br>" + " " + miU.getCedula() + "<br><br>" + " " + miU.getDireccion() + "<br><br>"
					+ " " + miU.getTelefono() + "</HTML>";
		}
	}

	public void modificalblUsuario() {
		usuarioIngreso();
		lblUsuario.setText(informacionUsuario);
	}

	public void cerrarSesions() {
		tuBoleta.CerrarSesion();
		modificalblUsuario();
	}

	public Usuario getUsuario() {
		return tuBoleta.getUsuario();
	}

	public JButton[][] getmatrizOccidental(int x) {
		return tuBoleta.getdevuelveMatrizOccidental1(x);

	}

	

	public void modificarmatrizTemporal(int i, int j, Color c, int x) {
		tuBoleta.modificaMatrizTemporal(i, j, c, x);
	}

	public int cuentapuestosselecciondos() {
		return tuBoleta.cuentacedula();
	}

	public void limpiarMatriz() {
		tuBoleta.LimpiarMatriz();
	}

	public void asegurarVentas() {
		tuBoleta.asegurarVenta();
	}
	public boolean boletayavendida(int i, int j) {
		return tuBoleta.BoletasVendidas(i ,j);
	}

	public int devuelvePrecio() {
		return tuBoleta.devuelvePrecio();
	}

}

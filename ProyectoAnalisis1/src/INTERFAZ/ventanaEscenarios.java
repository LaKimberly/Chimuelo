package INTERFAZ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.security.auth.Refreshable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class ventanaEscenarios extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Principal miV;
	private JButton btnAtras;
	private JButton btn11;
	private JButton btn5;
	private JButton btn2;
	private JButton btn9;
	private JButton btn8;
	private JButton btn7;
	private JButton btn4;
	private JButton btn3;
	private JButton btn6;
	private JButton btn10;
	private JButton btn12;
	private JButton btn1;
	private JComboBox<String> comboBox;
	private JButton btnBuscar;

	public ventanaEscenarios(Principal miV) {
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

		comboBox = new JComboBox<String>();
		comboBox.addActionListener(this);
		comboBox.addItem("Seleccione");
		comboBox.addItem("El campin");
		comboBox.addItem("Teatro la Catellana");

		btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(this);
		btnBuscar.setForeground(Color.RED);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnBuscar.setBackground(Color.ORANGE);
		btnBuscar.setBounds(360, 388, 268, 36);
		contentPane.add(btnBuscar);
		comboBox.setBounds(360, 322, 268, 36);
		contentPane.add(comboBox);

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

		JLabel lblInformacion = new JLabel("<HTML> INFORMACION DEL ESCENARIO:  <br><br><br>"
				+ " 1. Segundo piso Occidental. Capacidad: 600<br><br>"
				+ " 2. Primer piso Occidental. Capacidad: 400<br><br>"
				+ " 3. Primer piso Oriental. Capacidad: 400<br><br>"
				+ " 4. Segundo piso Oriental. Capacidad: 600<br><br>"
				+ " 5. Segundo piso Occidental. Capacidad: 600<br><br>"
				+ " 6. Primer piso Occidental. Capacidad: 400<br><br>"
				+ " 7. Primer piso Oriental. Capacidad: 400<br><br>"
				+ " 8. Segundo piso Oriental. Capacidad: 600<br><br>" + " 9. Primer piso Sur. Capacidad: 400<br><br>"
				+ " 10. Primer piso Sur occidental. Capacidad: 400<br><br>"
				+ " 11. Segundo piso Sur. Capacidad: 600<br><br>"
				+ " 12. Segundo piso Sur. Capacidad: 600<br><br></HTML>");
		lblInformacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInformacion.setForeground(Color.WHITE);
		lblInformacion.setOpaque(true);
		lblInformacion.setBackground(Color.GRAY);
		lblInformacion.setVerticalAlignment(SwingConstants.TOP);
		lblInformacion.setBounds(947, 183, 318, 511);
		contentPane.add(lblInformacion);

		JLabel lblArtistaDeLa = new JLabel("ARTISTA DE LA SEMANA");
		lblArtistaDeLa.setOpaque(true);
		lblArtistaDeLa.setBackground(Color.DARK_GRAY);
		lblArtistaDeLa.setForeground(Color.RED);
		lblArtistaDeLa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblArtistaDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblArtistaDeLa.setBounds(10, 246, 268, 23);
		contentPane.add(lblArtistaDeLa);

		btnAtras = new JButton("ATRAS");
		btnAtras.addActionListener(this);
		btnAtras.setForeground(Color.RED);
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAtras.setBackground(Color.ORANGE);
		btnAtras.setBounds(10, 199, 268, 36);
		contentPane.add(btnAtras);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnAtras) {
			miV.setVisible(true);
			this.setVisible(false);
		}
		if (e.getSource() == btnBuscar) {
			if (comboBox.getSelectedIndex() == 0) {

				JOptionPane.showMessageDialog(null, "Seleccione una opcion");
			}

			if (comboBox.getSelectedIndex() == 1) {

				escenario2 mie = new escenario2(this, miV);
				mie.setVisible(true);
				this.setVisible(false);
			}
			if (comboBox.getSelectedIndex() == 2) {
				escenario1 mie = new escenario1(this, miV);
				mie.setVisible(true);
				this.setVisible(false);
			}

		}
	}

}

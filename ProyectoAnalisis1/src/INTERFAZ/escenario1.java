package INTERFAZ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class escenario1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Principal miV;
	private ventanaEscenarios ve;
	private JButton btnAtras;

	public escenario1(ventanaEscenarios ve, Principal miV) {
		this.miV = miV;
		this.ve = ve;
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

		JLabel l1 = new JLabel("11");
		l1.setOpaque(true);
		l1.setBackground(new Color(173, 255, 47));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Tahoma", Font.BOLD, 15));
		l1.setBounds(775, 524, 62, 54);
		contentPane.add(l1);

		JLabel l2 = new JLabel("6");
		l2.setOpaque(true);
		l2.setBackground(new Color(173, 255, 47));
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Tahoma", Font.BOLD, 15));
		l2.setBounds(661, 408, 96, 47);
		contentPane.add(l2);

		JLabel l3 = new JLabel("9");
		l3.setOpaque(true);
		l3.setBackground(new Color(173, 255, 47));
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Tahoma", Font.BOLD, 15));
		l3.setBounds(475, 524, 59, 54);
		contentPane.add(l3);

		JLabel l4 = new JLabel("10");
		l4.setOpaque(true);
		l4.setBackground(new Color(173, 255, 47));
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Tahoma", Font.BOLD, 15));
		l4.setBounds(555, 524, 202, 54);
		contentPane.add(l4);

		JLabel l5 = new JLabel("5");
		l5.setOpaque(true);
		l5.setBackground(new Color(173, 255, 47));
		l5.setHorizontalAlignment(SwingConstants.CENTER);
		l5.setFont(new Font("Tahoma", Font.BOLD, 15));
		l5.setBounds(555, 408, 96, 46);
		contentPane.add(l5);

		JLabel l6 = new JLabel("12");
		l6.setOpaque(true);
		l6.setBackground(new Color(173, 255, 47));
		l6.setHorizontalAlignment(SwingConstants.CENTER);
		l6.setFont(new Font("Tahoma", Font.BOLD, 15));
		l6.setBounds(475, 589, 362, 54);
		contentPane.add(l6);

		JLabel l7 = new JLabel("1");
		l7.setOpaque(true);
		l7.setBackground(new Color(173, 255, 47));
		l7.setFont(new Font("Tahoma", Font.BOLD, 15));
		l7.setHorizontalAlignment(SwingConstants.CENTER);
		l7.setBounds(475, 327, 59, 186);
		contentPane.add(l7);

		JLabel l8 = new JLabel("7");
		l8.setOpaque(true);
		l8.setBackground(new Color(173, 255, 47));
		l8.setHorizontalAlignment(SwingConstants.CENTER);
		l8.setFont(new Font("Tahoma", Font.BOLD, 15));
		l8.setBounds(555, 465, 96, 47);
		contentPane.add(l8);

		JLabel l9 = new JLabel("4");
		l9.setOpaque(true);
		l9.setBackground(new Color(173, 255, 47));
		l9.setHorizontalAlignment(SwingConstants.CENTER);
		l9.setFont(new Font("Tahoma", Font.BOLD, 15));
		l9.setBounds(775, 327, 62, 186);
		contentPane.add(l9);

		JLabel l10 = new JLabel("2");
		l10.setOpaque(true);
		l10.setBackground(new Color(173, 255, 47));
		l10.setHorizontalAlignment(SwingConstants.CENTER);
		l10.setFont(new Font("Tahoma", Font.BOLD, 15));
		l10.setBounds(555, 349, 96, 48);
		contentPane.add(l10);

		JLabel l11 = new JLabel("3");
		l11.setOpaque(true);
		l11.setBackground(new Color(173, 255, 47));
		l11.setHorizontalAlignment(SwingConstants.CENTER);
		l11.setFont(new Font("Tahoma", Font.BOLD, 15));
		l11.setBounds(661, 349, 96, 48);
		contentPane.add(l11);

		JLabel l12 = new JLabel("8");
		l12.setOpaque(true);
		l12.setBackground(new Color(173, 255, 47));
		l12.setHorizontalAlignment(SwingConstants.CENTER);
		l12.setFont(new Font("Tahoma", Font.BOLD, 15));
		l12.setBounds(661, 466, 96, 47);
		contentPane.add(l12);

		JLabel lblEscenario = new JLabel("Escenario: TEATRO LA CASTELLANA.");
		lblEscenario.setOpaque(true);
		lblEscenario.setBackground(Color.WHITE);
		lblEscenario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEscenario.setBounds(321, 219, 442, 41);
		contentPane.add(lblEscenario);

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

		JLabel lblInformacion = new JLabel(
				"<HTML> INFORMACION DEL ESCENARIO:  <br><br><br>" + " 1 - 4. Capacidad: 100 cada uno. <br><br>"
						+ " 2 - 3 - 5 - 6 - 7 - 8. Capacidad: 50 cada uno. <br><br>"
						+ " 9 - 11. Capacidad: 25 cada uno.<br><br>" + " 10. Capacidad: 100<br><br>"
						+ " 12. Capacidad: 100<br><br>" + " <br><br></HTML>");
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

		JLabel lblEscenario_1 = new JLabel("ESCENARIO");
		lblEscenario_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscenario_1.setOpaque(true);
		lblEscenario_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEscenario_1.setBackground(Color.YELLOW);
		lblEscenario_1.setBounds(555, 271, 210, 61);
		contentPane.add(lblEscenario_1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnAtras) {
			ve.setVisible(true);
			this.setVisible(false);
		}

	}
}

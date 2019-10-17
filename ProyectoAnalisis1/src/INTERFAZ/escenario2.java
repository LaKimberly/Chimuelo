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

public class escenario2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Principal miV;
	private ventanaEscenarios ve;
	private JButton btnAtras;

	public escenario2(ventanaEscenarios ve, Principal miV) {
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

		JLabel lblEscenario = new JLabel("Escenario:  EL CAMPIN");
		lblEscenario.setOpaque(true);
		lblEscenario.setBackground(Color.WHITE);
		lblEscenario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEscenario.setBounds(321, 219, 442, 41);
		contentPane.add(lblEscenario);

		ImageIcon escenario = new ImageIcon(getClass().getResource("/IMAGENES/escenario1.png"));
		JLabel btn1 = new JLabel("");
		btn1.setOpaque(false);
		btn1.setBackground(Color.DARK_GRAY);
		btn1.setBounds(783, 325, 127, 105);
		Icon esce = new ImageIcon(
				escenario.getImage().getScaledInstance(btn1.getWidth(), btn1.getHeight(), Image.SCALE_DEFAULT));

		JLabel label_7 = new JLabel("7");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_7.setBounds(757, 458, 34, 23);
		contentPane.add(label_7);

		JLabel label_8 = new JLabel("8");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_8.setBounds(823, 458, 34, 23);
		contentPane.add(label_8);

		JLabel label_12 = new JLabel("12");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_12.setBounds(729, 619, 34, 23);
		contentPane.add(label_12);

		JLabel label_5 = new JLabel("5");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(429, 474, 34, 23);
		contentPane.add(label_5);

		JLabel label_6 = new JLabel("6");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBounds(506, 456, 34, 23);
		contentPane.add(label_6);

		JLabel label_11 = new JLabel("11");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_11.setBounds(523, 613, 34, 23);
		contentPane.add(label_11);

		JLabel label_10 = new JLabel("10");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_10.setBounds(704, 544, 34, 23);
		contentPane.add(label_10);

		JLabel label_9 = new JLabel("9");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(563, 555, 34, 23);
		contentPane.add(label_9);

		JLabel label_4 = new JLabel("4");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(841, 364, 34, 23);
		contentPane.add(label_4);

		JLabel label_3 = new JLabel("3");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(757, 364, 34, 23);
		contentPane.add(label_3);

		JLabel label_2 = new JLabel("2");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(506, 358, 34, 23);
		contentPane.add(label_2);

		JLabel label_1 = new JLabel("1");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(417, 358, 34, 23);
		contentPane.add(label_1);

		JLabel lblPalco = new JLabel("PALCO");
		lblPalco.setHorizontalAlignment(SwingConstants.CENTER);
		lblPalco.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPalco.setBounds(610, 347, 74, 23);
		contentPane.add(lblPalco);

		JLabel lblPlatea = new JLabel("PLATEA");
		lblPlatea.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlatea.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPlatea.setBounds(610, 407, 74, 23);
		contentPane.add(lblPlatea);

		JLabel lblVip = new JLabel("VIP");
		lblVip.setHorizontalAlignment(SwingConstants.CENTER);
		lblVip.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblVip.setBounds(634, 471, 34, 23);
		contentPane.add(lblVip);
		btn1.setIcon(esce);
		contentPane.add(btn1);

		ImageIcon escenario1 = new ImageIcon(getClass().getResource("/IMAGENES/escenario2.png"));
		JLabel btn2 = new JLabel("");
		btn2.setForeground(Color.BLACK);
		btn2.setOpaque(false);
		btn2.setBackground(Color.DARK_GRAY);
		btn2.setBounds(388, 316, 119, 114);
		contentPane.add(btn2);
		Icon esce1 = new ImageIcon(
				escenario1.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
		btn2.setIcon(esce1);
		contentPane.add(btn2);

		ImageIcon escenario2 = new ImageIcon(getClass().getResource("/IMAGENES/escenario 4.png"));
		JLabel btn4 = new JLabel("");
		btn4.setOpaque(false);
		btn4.setBackground(Color.DARK_GRAY);
		btn4.setBounds(473, 316, 127, 114);
		Icon esce2 = new ImageIcon(
				escenario2.getImage().getScaledInstance(btn4.getWidth(), btn4.getHeight(), Image.SCALE_DEFAULT));
		btn4.setIcon(esce2);
		contentPane.add(btn4);

		ImageIcon escenario3 = new ImageIcon(getClass().getResource("/IMAGENES/escenario 3.png"));
		JLabel btn3 = new JLabel("");
		btn3.setOpaque(false);
		btn3.setBackground(Color.DARK_GRAY);
		btn3.setBounds(704, 316, 127, 114);
		Icon esce3 = new ImageIcon(
				escenario3.getImage().getScaledInstance(btn3.getWidth(), btn3.getHeight(), Image.SCALE_DEFAULT));
		btn3.setIcon(esce3);
		contentPane.add(btn3);

		ImageIcon escenario4 = new ImageIcon(getClass().getResource("/IMAGENES/escenario5.png"));
		JLabel btn5 = new JLabel("");
		btn5.setOpaque(false);
		btn5.setBackground(Color.DARK_GRAY);
		btn5.setBounds(370, 420, 159, 147);
		Icon esce4 = new ImageIcon(
				escenario4.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
		btn5.setIcon(esce4);
		contentPane.add(btn5);

		ImageIcon escenario5 = new ImageIcon(getClass().getResource("/IMAGENES/escenario6.png"));
		JLabel btn6 = new JLabel("");
		btn6.setOpaque(false);
		btn6.setBackground(Color.DARK_GRAY);
		btn6.setBounds(753, 420, 159, 147);
		Icon esce5 = new ImageIcon(
				escenario5.getImage().getScaledInstance(btn6.getWidth(), btn6.getHeight(), Image.SCALE_DEFAULT));
		btn6.setIcon(esce5);
		contentPane.add(btn6);

		ImageIcon escenario6 = new ImageIcon(getClass().getResource("/IMAGENES/escenario7.png"));
		JLabel btn7 = new JLabel("");
		btn7.setOpaque(false);
		btn7.setBackground(Color.DARK_GRAY);
		btn7.setBounds(463, 404, 137, 129);
		Icon esce6 = new ImageIcon(
				escenario6.getImage().getScaledInstance(btn7.getWidth(), btn7.getHeight(), Image.SCALE_DEFAULT));
		btn7.setIcon(esce6);
		contentPane.add(btn7);

		ImageIcon escenario7 = new ImageIcon(getClass().getResource("/IMAGENES/escenario8.png"));
		JLabel btn8 = new JLabel("");
		btn8.setOpaque(false);
		btn8.setBackground(Color.DARK_GRAY);
		btn8.setBounds(694, 404, 137, 129);
		Icon esce7 = new ImageIcon(
				escenario7.getImage().getScaledInstance(btn8.getWidth(), btn8.getHeight(), Image.SCALE_DEFAULT));
		btn8.setIcon(esce7);
		contentPane.add(btn8);

		JLabel lblEscenario_1 = new JLabel("ESCENARIO");
		lblEscenario_1.setBackground(Color.YELLOW);
		lblEscenario_1.setOpaque(true);
		lblEscenario_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEscenario_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscenario_1.setBounds(563, 271, 176, 54);
		contentPane.add(lblEscenario_1);

		ImageIcon escenario8 = new ImageIcon(getClass().getResource("/IMAGENES/escenario9.png"));
		JLabel btn9 = new JLabel("");
		btn9.setOpaque(false);
		btn9.setBackground(Color.DARK_GRAY);
		btn9.setBounds(473, 490, 209, 161);
		Icon esce8 = new ImageIcon(
				escenario8.getImage().getScaledInstance(btn9.getWidth(), btn9.getHeight(), Image.SCALE_DEFAULT));
		btn9.setIcon(esce8);
		contentPane.add(btn9);

		ImageIcon escenario9 = new ImageIcon(getClass().getResource("/IMAGENES/escenario10.png"));
		JLabel btn10 = new JLabel("");
		btn10.setOpaque(false);
		btn10.setBackground(Color.DARK_GRAY);
		btn10.setBounds(610, 490, 209, 161);
		Icon esce9 = new ImageIcon(
				escenario9.getImage().getScaledInstance(btn10.getWidth(), btn10.getHeight(), Image.SCALE_DEFAULT));
		btn10.setIcon(esce9);
		contentPane.add(btn10);

		ImageIcon escenario10 = new ImageIcon(getClass().getResource("/IMAGENES/escenario11.png"));
		JLabel btn11 = new JLabel("");
		btn11.setOpaque(false);
		btn11.setBorder(null);
		btn11.setBackground(Color.DARK_GRAY);
		btn11.setBounds(418, 505, 250, 225);
		Icon esce10 = new ImageIcon(
				escenario10.getImage().getScaledInstance(btn11.getWidth(), btn11.getHeight(), Image.SCALE_DEFAULT));
		btn11.setIcon(esce10);
		contentPane.add(btn11);

		ImageIcon escenario11 = new ImageIcon(getClass().getResource("/IMAGENES/escenario12.png"));
		JLabel btn12 = new JLabel("");
		btn12.setOpaque(false);
		btn12.setBorder(null);
		btn12.setBackground(Color.DARK_GRAY);
		btn12.setBounds(620, 505, 250, 225);
		Icon esce11 = new ImageIcon(
				escenario11.getImage().getScaledInstance(btn12.getWidth(), btn12.getHeight(), Image.SCALE_DEFAULT));
		btn12.setIcon(esce11);
		btn12.setFocusable(false);
		contentPane.add(btn12);

		JLabel btnPalco = new JLabel("");
		btnPalco.setOpaque(true);
		btnPalco.setBackground(new Color(173, 255, 47));
		btnPalco.setBounds(593, 336, 112, 48);
		contentPane.add(btnPalco);

		JLabel btnPlatea = new JLabel("");
		btnPlatea.setOpaque(true);
		btnPlatea.setBackground(new Color(173, 255, 47));
		btnPlatea.setBounds(593, 394, 112, 48);
		contentPane.add(btnPlatea);

		JLabel btnVip = new JLabel("");
		btnVip.setOpaque(true);
		btnVip.setBackground(new Color(173, 255, 47));
		btnVip.setBounds(593, 458, 112, 48);
		contentPane.add(btnVip);

		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(new Color(0, 100, 0));
		label.setBounds(370, 252, 552, 442);
		contentPane.add(label);
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

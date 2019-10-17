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

public class ventanaSeleccioneTribuna2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Principal miV;
	private ventanaComprar ventanacomprar;
	private JButton btnAtras;
	private JButton btn3;
	private JButton btn4;
	private JButton btn7;
	private JButton btn6;
	private JButton btn8;
	private JButton btn9;
	private JButton btn2;
	private JButton btn5;
	private JButton btn11;
	private JButton btn10;
	private JButton btn12;
	private JButton btn1;

	public ventanaSeleccioneTribuna2(ventanaComprar ventanacomprar, Principal miV) {
		this.miV = miV;
		this.ventanacomprar = ventanacomprar;

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

		btnAtras = new JButton("ATRAS");
		btnAtras.addActionListener(this);
		btnAtras.setForeground(Color.RED);
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAtras.setBackground(Color.ORANGE);
		btnAtras.setBounds(10, 199, 268, 36);
		contentPane.add(btnAtras);

		JLabel lblEscenario = new JLabel("Escenario: Teatro la Catellana");
		lblEscenario.setOpaque(true);
		lblEscenario.setBackground(Color.WHITE);
		lblEscenario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEscenario.setBounds(321, 219, 442, 41);
		contentPane.add(lblEscenario);

		ImageIcon escenario = new ImageIcon(getClass().getResource("/IMAGENES/escenario1.png"));

		ImageIcon escenario1 = new ImageIcon(getClass().getResource("/IMAGENES/escenario2.png"));

		ImageIcon escenario2 = new ImageIcon(getClass().getResource("/IMAGENES/escenario 4.png"));

		ImageIcon escenario3 = new ImageIcon(getClass().getResource("/IMAGENES/escenario 3.png"));

		ImageIcon escenario4 = new ImageIcon(getClass().getResource("/IMAGENES/escenario5.png"));

		ImageIcon escenario5 = new ImageIcon(getClass().getResource("/IMAGENES/escenario6.png"));

		ImageIcon escenario6 = new ImageIcon(getClass().getResource("/IMAGENES/escenario7.png"));

		ImageIcon escenario7 = new ImageIcon(getClass().getResource("/IMAGENES/escenario8.png"));

		JLabel lblEscenario_1 = new JLabel("ESCENARIO");
		lblEscenario_1.setBackground(Color.YELLOW);
		lblEscenario_1.setOpaque(true);
		lblEscenario_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEscenario_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscenario_1.setBounds(555, 271, 202, 54);
		contentPane.add(lblEscenario_1);

		ImageIcon escenario8 = new ImageIcon(getClass().getResource("/IMAGENES/escenario9.png"));

		ImageIcon escenario9 = new ImageIcon(getClass().getResource("/IMAGENES/escenario10.png"));

		ImageIcon escenario10 = new ImageIcon(getClass().getResource("/IMAGENES/escenario11.png"));

		ImageIcon escenario11 = new ImageIcon(getClass().getResource("/IMAGENES/escenario12.png"));

		JLabel label = new JLabel("<HTML> INFORMACION DEL ESCENARIO:  <br><br><br> "
				+ "1. Segundo piso Occidental. Costo: 70000<br><br>"
				+ " 2. Primer piso Occidental. Costo: 70000<br><br> " + "3. Primer piso Oriental. Costo: 70000<br><br> "
				+ "4. Segundo piso Oriental. Costo: 70000<br><br> "
				+ "5. Segundo piso Occidental. Costo: 60000<br><br> "
				+ "6. Primer piso Occidental. Costo: 60000<br><br>" + " 7. Primer piso Oriental. Costo: 60000<br><br> "
				+ "8. Segundo piso Oriental. Costo: 60000<br><br> " + "9. Primer piso Sur. Costo: 50000<br><br>"
				+ " 10. Primer piso Sur occidental. Costo: 50000<br><br> "
				+ "11. Segundo piso Sur. Costo: 50000<br><br>" + " 12. Segundo piso Sur. Costo: 50000<br><br></HTML>");

		label.setVerticalAlignment(SwingConstants.TOP);
		label.setOpaque(true);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBackground(Color.GRAY);
		label.setBounds(1026, 183, 318, 511);
		contentPane.add(label);

		JLabel label_1 = new JLabel("<HTML> INFORMACION DEL ESCENARIO:  <br> <br> " + "VIP. Costo: 100000  "
				+ "<br> Platea. Costo: 150000 " + "<br> Palco. Costo: 200000</HTML>");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setOpaque(true);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBackground(Color.GRAY);
		label_1.setBounds(800, 186, 216, 139);
		contentPane.add(label_1);

		btn3 = new JButton("");
		btn3.setOpaque(true);
		btn3.setBackground(new Color(173, 255, 47));
		btn3.setBounds(555, 349, 96, 48);
		contentPane.add(btn3);

		btn4 = new JButton("");
		btn4.setOpaque(true);
		btn4.setBackground(new Color(173, 255, 47));
		btn4.setBounds(661, 349, 96, 48);
		contentPane.add(btn4);

		btn7 = new JButton("");
		btn7.setOpaque(true);
		btn7.setBackground(new Color(173, 255, 47));
		btn7.setBounds(555, 406, 96, 48);
		contentPane.add(btn7);

		btn6 = new JButton("");
		btn6.setOpaque(true);
		btn6.setBackground(new Color(173, 255, 47));
		btn6.setBounds(661, 408, 96, 48);
		contentPane.add(btn6);

		btn8 = new JButton("");
		btn8.setOpaque(true);
		btn8.setBackground(new Color(173, 255, 47));
		btn8.setBounds(555, 465, 96, 48);
		contentPane.add(btn8);

		btn9 = new JButton("");
		btn9.setOpaque(true);
		btn9.setBackground(new Color(173, 255, 47));
		btn9.setBounds(661, 465, 96, 48);
		contentPane.add(btn9);

		btn2 = new JButton("");
		btn2.setOpaque(true);
		btn2.setBackground(new Color(173, 255, 47));
		btn2.setBounds(475, 327, 59, 186);
		contentPane.add(btn2);

		btn5 = new JButton("");
		btn5.setOpaque(true);
		btn5.setBackground(new Color(173, 255, 47));
		btn5.setBounds(778, 327, 59, 186);
		contentPane.add(btn5);

		btn11 = new JButton("");
		btn11.setOpaque(true);
		btn11.setBackground(new Color(173, 255, 47));
		btn11.setBounds(555, 524, 202, 54);
		contentPane.add(btn11);

		btn10 = new JButton("");
		btn10.setOpaque(true);
		btn10.setBackground(new Color(173, 255, 47));
		btn10.setBounds(475, 524, 59, 54);
		contentPane.add(btn10);

		btn12 = new JButton("");
		btn12.setOpaque(true);
		btn12.setBackground(new Color(173, 255, 47));
		btn12.setBounds(778, 524, 59, 54);
		contentPane.add(btn12);

		btn1 = new JButton("");
		btn1.setOpaque(true);
		btn1.setBackground(new Color(173, 255, 47));
		btn1.setBounds(475, 589, 362, 54);
		contentPane.add(btn1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btn1) {

		}
		if (e.getSource() == btn2) {

		}
		if (e.getSource() == btn3) {

		}
		if (e.getSource() == btn4) {

		}
		if (e.getSource() == btn5) {

		}
		if (e.getSource() == btn6) {

		}
		if (e.getSource() == btn7) {

		}
		if (e.getSource() == btn8) {

		}
		if (e.getSource() == btn9) {

		}
		if (e.getSource() == btn10) {

		}
		if (e.getSource() == btn11) {

		}
		if (e.getSource() == btn12) {

		}

	}
}

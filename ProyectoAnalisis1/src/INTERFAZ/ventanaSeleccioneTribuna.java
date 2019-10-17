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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class ventanaSeleccioneTribuna extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnAtras;

	/**
	 * Launch the application.
	 */
	private Principal miV;
	private JButton bt11111;
	private ventanaComprar ventanacomprar;
	private JButton btn11_1;
	private JButton bt111;
	private JButton btn1111;
	private JButton bt1111;
	private JButton bt1;
	private JButton btnVIP1;
	private JButton btnPlatea1;
	private JButton btnt2;
	private JButton btnComprar;
	private JButton btnt22;
	private JButton btnt222;
	private JButton btnt2222;
	private JButton btnPalco;

	private JButton btn41;
	private JButton btn42;
	private JButton btn43;
	private JButton btn44;
	private JButton btn45;
	private JButton btn46;
	private JButton btn47;
	private JButton btn51;
	private JButton btn52;
	private JButton btn54;
	private JButton btn55;
	private JButton btn56;
	private JButton btn53;
	private JButton btn61;
	private JButton btn62;
	private JButton btn63;
	private JButton btn65;
	private JButton btn64;
	private JButton btn31;
	private JButton btn32;
	private JButton btn33;
	private JButton btn34;
	private JButton btn35;
	private JButton btn36;
	private JButton btn37;
	private JButton btn71;
	private JButton btn72;
	private JButton btn73;
	private JButton btn74;
	private JButton btn75;
	private JButton btn76;
	private JButton btn81;
	private JButton btn82;
	private JButton btn83;
	private JButton btn84;
	private JButton btn85;
	private JButton btn86;
	private JButton btn91;
	private JButton btn92;
	private JButton btn93;
	private JButton btn94;
	private JButton btn95;
	private JButton btn96;
	private JButton btn10_1;
	private JButton btn101;
	private JButton btn102;
	private JButton btn103;
	private JButton btn104;
	private JButton btn105;
	private JButton btn1101;
	private JButton btn1102;
	private JButton btn1103;
	private JButton btn1104;
	private JButton btn1105;
	private JButton btn1106;
	private JButton btn1107;
	private JButton btn1108;
	private JButton btn1109;
	private JButton btn1110;
	private JButton btn201;
	private JButton btn202;
	private JButton btn203;
	private JButton btn204;
	private JButton btn205;
	private JButton btn206;
	private JButton btn207;
	private JButton btn208;
	private JButton btn209;

	/**
	 * Create the frame.
	 * 
	 * @param ventanaComprar
	 */
	public ventanaSeleccioneTribuna(ventanaComprar ventanacomprar, Principal miV) {
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

		btn61 = new JButton("");
		btn61.addActionListener(this);

		btn51 = new JButton("");
		btn51.addActionListener(this);

		btn41 = new JButton("");
		btn41.addActionListener(this);

		btn37 = new JButton("");
		btn37.setOpaque(true);
		btn37.addActionListener(this);

		btnt22 = new JButton("");
		btnt22.addActionListener(this);

		btn1111 = new JButton("");
		btn1111.addActionListener(this);
		btn1111.addActionListener(this);
		btn1111.setOpaque(true);
		btn1111.setContentAreaFilled(false);
		btn1111.setBorderPainted(false);
		btn1111.setBackground(new Color(124, 252, 0));
		btn1111.setBounds(473, 346, 10, 23);
		contentPane.add(btn1111);

		bt1 = new JButton("");
		bt1.addActionListener(this);
		bt1.setOpaque(true);
		bt1.setContentAreaFilled(false);
		bt1.setBorderPainted(false);
		bt1.setBackground(new Color(124, 252, 0));
		bt1.setBounds(418, 325, 45, 97);
		contentPane.add(bt1);

		bt111 = new JButton("");
		bt111.addActionListener(this);
		bt111.setOpaque(true);
		bt111.setContentAreaFilled(false);
		bt111.setBorderPainted(false);
		bt111.setBackground(new Color(124, 252, 0));
		bt111.setBounds(473, 325, 19, 23);
		contentPane.add(bt111);

		bt1111 = new JButton("");
		bt1111.addActionListener(this);
		bt1111.setOpaque(true);
		bt1111.setContentAreaFilled(false);
		bt1111.setBorderPainted(false);
		bt1111.setBackground(new Color(124, 252, 0));
		bt1111.setBounds(463, 325, 10, 76);
		contentPane.add(bt1111);

		btn11_1 = new JButton("");
		btn11_1.addActionListener(this);
		btn11_1.setOpaque(true);
		btn11_1.setContentAreaFilled(false);
		btn11_1.setBorderPainted(false);
		btn11_1.setBackground(new Color(124, 252, 0));
		btn11_1.setBounds(403, 346, 19, 76);
		contentPane.add(btn11_1);
		btnt22.setOpaque(true);
		btnt22.setContentAreaFilled(false);
		btnt22.setBorderPainted(false);
		btnt22.setBackground(new Color(124, 252, 0));
		btnt22.setBounds(489, 366, 33, 54);
		contentPane.add(btnt22);

		btnt2 = new JButton("");
		btnt2.addActionListener(this);
		btnt2.setOpaque(true);
		btnt2.setContentAreaFilled(false);
		btnt2.setBorderPainted(false);
		btnt2.setBackground(new Color(124, 252, 0));
		btnt2.setBounds(519, 330, 39, 86);
		contentPane.add(btnt2);

		btnt222 = new JButton("");
		btnt222.addActionListener(this);
		btnt222.addActionListener(this);
		btnt222.setOpaque(true);
		btnt222.setContentAreaFilled(false);
		btnt222.setBorderPainted(false);
		btnt222.setBackground(new Color(124, 252, 0));
		btnt222.setBounds(502, 343, 27, 41);
		contentPane.add(btnt222);

		btnt2222 = new JButton("");
		btnt2222.addActionListener(this);
		btnt2222.setOpaque(true);
		btnt2222.setContentAreaFilled(false);
		btnt2222.setBorderPainted(false);
		btnt2222.setBackground(new Color(124, 252, 0));
		btnt2222.setBounds(532, 330, 45, 15);
		contentPane.add(btnt2222);
		btn37.setContentAreaFilled(false);
		btn37.setBorderPainted(false);
		btn37.setBackground(new Color(124, 252, 0));
		btn37.setBounds(781, 355, 19, 33);
		contentPane.add(btn37);

		btn36 = new JButton("");
		btn36.setOpaque(true);
		btn36.addActionListener(this);
		btn36.setContentAreaFilled(false);
		btn36.setBorderPainted(false);
		btn36.setBackground(new Color(124, 252, 0));
		btn36.setBounds(791, 367, 19, 33);
		contentPane.add(btn36);

		btn35 = new JButton("");
		btn35.addActionListener(this);
		btn35.setOpaque(true);
		btn35.setContentAreaFilled(false);
		btn35.setBorderPainted(false);
		btn35.setBackground(new Color(124, 252, 0));
		btn35.setBounds(751, 394, 59, 20);
		contentPane.add(btn35);

		btn31 = new JButton("");
		btn31.setOpaque(true);
		btn31.addActionListener(this);
		btn31.setContentAreaFilled(false);
		btn31.setBorderPainted(false);
		btn31.setBackground(new Color(124, 252, 0));
		btn31.setBounds(741, 330, 45, 76);
		contentPane.add(btn31);

		btn34 = new JButton("");
		btn34.setOpaque(true);
		btn34.addActionListener(this);
		btn34.setContentAreaFilled(false);
		btn34.setBorderPainted(false);
		btn34.setBackground(new Color(124, 252, 0));
		btn34.setBounds(783, 372, 27, 41);
		contentPane.add(btn34);

		btn33 = new JButton("");
		btn33.setOpaque(true);
		btn33.addActionListener(this);
		btn33.setContentAreaFilled(false);
		btn33.setBorderPainted(false);
		btn33.setBackground(new Color(124, 252, 0));
		btn33.setBounds(751, 394, 59, 15);
		contentPane.add(btn33);

		btn32 = new JButton("");
		btn32.setOpaque(true);
		btn32.addActionListener(this);
		btn32.setContentAreaFilled(false);
		btn32.setBorderPainted(false);
		btn32.setBackground(new Color(124, 252, 0));
		btn32.setBounds(731, 330, 59, 15);
		contentPane.add(btn32);
		btn41.setOpaque(true);
		btn41.setContentAreaFilled(false);
		btn41.setBorderPainted(false);
		btn41.setBackground(new Color(124, 252, 0));
		btn41.setBounds(810, 330, 64, 26);
		contentPane.add(btn41);

		btn42 = new JButton("");
		btn42.addActionListener(this);
		btn42.setOpaque(true);
		btn42.setContentAreaFilled(false);
		btn42.setBorderPainted(false);
		btn42.setBackground(new Color(124, 252, 0));
		btn42.setBounds(868, 347, 19, 41);
		contentPane.add(btn42);

		btn43 = new JButton("");
		btn43.addActionListener(this);
		btn43.setOpaque(true);
		btn43.setContentAreaFilled(false);
		btn43.setBorderPainted(false);
		btn43.setBackground(new Color(124, 252, 0));
		btn43.setBounds(825, 359, 62, 41);
		contentPane.add(btn43);

		btn46 = new JButton("");
		btn46.addActionListener(this);
		btn46.setOpaque(true);
		btn46.setContentAreaFilled(false);
		btn46.setBorderPainted(false);
		btn46.setBackground(new Color(124, 252, 0));
		btn46.setBounds(830, 381, 54, 41);
		contentPane.add(btn46);

		btn45 = new JButton("");
		btn45.addActionListener(this);
		btn45.setOpaque(true);
		btn45.setContentAreaFilled(false);
		btn45.setBorderPainted(false);
		btn45.setBackground(new Color(124, 252, 0));
		btn45.setBounds(869, 381, 19, 41);
		contentPane.add(btn45);

		btn47 = new JButton("");
		btn47.addActionListener(this);
		btn47.setOpaque(true);
		btn47.setContentAreaFilled(false);
		btn47.setBorderPainted(false);
		btn47.setBackground(new Color(124, 252, 0));
		btn47.setBounds(820, 330, 59, 39);
		contentPane.add(btn47);

		btn44 = new JButton("");
		btn44.addActionListener(this);
		btn44.setOpaque(true);
		btn44.setContentAreaFilled(false);
		btn44.setBorderPainted(false);
		btn44.setBackground(new Color(124, 252, 0));
		btn44.setBounds(840, 335, 33, 86);
		contentPane.add(btn44);
		btn51.setOpaque(true);
		btn51.setContentAreaFilled(false);
		btn51.setBorderPainted(false);
		btn51.setBackground(new Color(124, 252, 0));
		btn51.setBounds(428, 433, 35, 73);
		contentPane.add(btn51);

		btn53 = new JButton("");
		btn53.setOpaque(true);
		btn53.addActionListener(this);

		btn53.setContentAreaFilled(false);
		btn53.setBorderPainted(false);
		btn53.setBackground(new Color(124, 252, 0));
		btn53.setBounds(438, 505, 15, 41);
		contentPane.add(btn53);

		btn56 = new JButton("");
		btn56.addActionListener(this);
		btn56.setOpaque(true);
		btn56.setContentAreaFilled(false);
		btn56.setBorderPainted(false);
		btn56.setBackground(new Color(124, 252, 0));
		btn56.setBounds(418, 470, 27, 41);
		contentPane.add(btn56);

		btn55 = new JButton("");
		btn55.setOpaque(true);
		btn55.addActionListener(this);
		btn55.setContentAreaFilled(false);
		btn55.setBorderPainted(false);
		btn55.setBackground(new Color(124, 252, 0));
		btn55.setBounds(457, 492, 27, 41);
		contentPane.add(btn55);

		btn52 = new JButton("");
		btn52.addActionListener(this);
		btn52.setOpaque(true);
		btn52.setContentAreaFilled(false);
		btn52.setBorderPainted(false);
		btn52.setBackground(new Color(124, 252, 0));
		btn52.setBounds(456, 505, 36, 26);
		contentPane.add(btn52);

		btn54 = new JButton("");
		btn54.setOpaque(true);
		btn54.addActionListener(this);
		btn54.setContentAreaFilled(false);
		btn54.setBorderPainted(false);
		btn54.setBackground(new Color(124, 252, 0));
		btn54.setBounds(413, 441, 12, 39);
		contentPane.add(btn54);
		btn61.setOpaque(true);
		btn61.setContentAreaFilled(false);
		btn61.setBorderPainted(false);
		btn61.setBackground(new Color(124, 252, 0));
		btn61.setBounds(499, 441, 59, 39);
		contentPane.add(btn61);

		btn62 = new JButton("");
		btn62.addActionListener(this);
		btn62.setOpaque(true);
		btn62.setContentAreaFilled(false);
		btn62.setBorderPainted(false);
		btn62.setBackground(new Color(124, 252, 0));
		btn62.setBounds(518, 470, 27, 41);
		contentPane.add(btn62);

		btn64 = new JButton("");
		btn64.addActionListener(this);
		btn64.setOpaque(true);
		btn64.setContentAreaFilled(false);
		btn64.setBorderPainted(false);
		btn64.setBackground(new Color(124, 252, 0));
		btn64.setBounds(523, 420, 27, 41);
		contentPane.add(btn64);

		btn63 = new JButton("");
		btn63.addActionListener(this);
		btn63.setOpaque(true);
		btn63.setContentAreaFilled(false);
		btn63.setBorderPainted(false);
		btn63.setBackground(new Color(124, 252, 0));
		btn63.setBounds(539, 458, 27, 41);
		contentPane.add(btn63);

		btn65 = new JButton("");
		btn65.addActionListener(this);

		btn65.setOpaque(true);
		btn65.setContentAreaFilled(false);
		btn65.setBorderPainted(false);
		btn65.setBackground(new Color(124, 252, 0));
		btn65.setBounds(499, 426, 27, 48);
		contentPane.add(btn65);

		btn71 = new JButton("");
		btn71.setOpaque(true);
		btn71.addActionListener(this);
		btn71.setContentAreaFilled(false);
		btn71.setBorderPainted(false);
		btn71.setBackground(new Color(124, 252, 0));
		btn71.setBounds(731, 458, 27, 45);
		contentPane.add(btn71);

		btn72 = new JButton("");
		btn72.setOpaque(true);
		btn72.addActionListener(this);
		btn72.setContentAreaFilled(false);
		btn72.setBorderPainted(false);
		btn72.setBackground(new Color(124, 252, 0));
		btn72.setBounds(741, 425, 22, 36);
		contentPane.add(btn72);

		btn73 = new JButton("");
		btn73.setOpaque(true);
		btn73.addActionListener(this);
		btn73.setContentAreaFilled(false);
		btn73.setBorderPainted(false);
		btn73.setBackground(new Color(124, 252, 0));
		btn73.setBounds(759, 470, 19, 41);
		contentPane.add(btn73);

		btn74 = new JButton("");
		btn74.setOpaque(true);
		btn74.addActionListener(this);
		btn74.setContentAreaFilled(false);
		btn74.setBorderPainted(false);
		btn74.setBackground(new Color(124, 252, 0));
		btn74.setBounds(761, 425, 22, 36);
		contentPane.add(btn74);

		btn75 = new JButton("");
		btn75.setOpaque(true);
		btn75.addActionListener(this);
		btn75.setContentAreaFilled(false);
		btn75.setBorderPainted(false);
		btn75.setBackground(new Color(124, 252, 0));
		btn75.setBounds(781, 425, 19, 41);
		contentPane.add(btn75);

		btn76 = new JButton("");
		btn76.setOpaque(true);
		btn76.addActionListener(this);
		btn76.setContentAreaFilled(false);
		btn76.setBorderPainted(false);
		btn76.setBackground(new Color(124, 252, 0));
		btn76.setBounds(781, 439, 19, 41);
		contentPane.add(btn76);

		btn81 = new JButton("");
		btn81.setOpaque(true);
		btn81.addActionListener(this);
		btn81.setContentAreaFilled(false);
		btn81.setBorderPainted(false);
		btn81.setBackground(new Color(124, 252, 0));
		btn81.setBounds(810, 470, 33, 63);
		contentPane.add(btn81);

		btn82 = new JButton("");
		btn82.setOpaque(true);
		btn82.addActionListener(this);
		btn82.setContentAreaFilled(false);
		btn82.setBorderPainted(false);
		btn82.setBackground(new Color(124, 252, 0));
		btn82.setBounds(821, 443, 39, 41);
		contentPane.add(btn82);

		btn83 = new JButton("");
		btn83.setOpaque(true);
		btn83.addActionListener(this);
		btn83.setContentAreaFilled(false);
		btn83.setBorderPainted(false);
		btn83.setBackground(new Color(124, 252, 0));
		btn83.setBounds(811, 470, 45, 39);
		contentPane.add(btn83);

		btn84 = new JButton("");
		btn84.setOpaque(true);
		btn84.addActionListener(this);
		btn84.setContentAreaFilled(false);
		btn84.setBorderPainted(false);
		btn84.setBackground(new Color(124, 252, 0));
		btn84.setBounds(791, 513, 39, 15);
		contentPane.add(btn84);

		btn85 = new JButton("");
		btn85.setOpaque(true);
		btn85.addActionListener(this);
		btn85.setContentAreaFilled(false);
		btn85.setBorderPainted(false);
		btn85.setBackground(new Color(124, 252, 0));
		btn85.setBounds(835, 441, 39, 15);
		contentPane.add(btn85);

		btn86 = new JButton("");
		btn86.setOpaque(true);
		btn86.addActionListener(this);
		btn86.setContentAreaFilled(false);
		btn86.setBorderPainted(false);
		btn86.setBackground(new Color(124, 252, 0));
		btn86.setBounds(831, 470, 10, 76);
		contentPane.add(btn86);

		btn91 = new JButton("");
		btn91.setOpaque(true);
		btn91.addActionListener(this);
		btn91.setContentAreaFilled(false);
		btn91.setBorderPainted(false);
		btn91.setBackground(new Color(124, 252, 0));
		btn91.setBounds(539, 526, 38, 41);
		contentPane.add(btn91);

		btn92 = new JButton("");
		btn92.setOpaque(true);
		btn92.addActionListener(this);
		btn92.setContentAreaFilled(false);
		btn92.setBorderPainted(false);
		btn92.setBackground(new Color(124, 252, 0));
		btn92.setBounds(568, 553, 33, 41);
		contentPane.add(btn92);

		btn93 = new JButton("");
		btn93.setOpaque(true);
		btn93.addActionListener(this);
		btn93.setContentAreaFilled(false);
		btn93.setBorderPainted(false);
		btn93.setBackground(new Color(124, 252, 0));
		btn93.setBounds(602, 574, 33, 41);
		contentPane.add(btn93);

		btn94 = new JButton("");
		btn94.setOpaque(true);
		btn94.addActionListener(this);
		btn94.setContentAreaFilled(false);
		btn94.setBorderPainted(false);
		btn94.setBackground(new Color(124, 252, 0));
		btn94.setBounds(577, 563, 33, 41);
		contentPane.add(btn94);

		btn95 = new JButton("");
		btn95.setOpaque(true);
		btn95.addActionListener(this);
		btn95.setContentAreaFilled(false);
		btn95.setBorderPainted(false);
		btn95.setBackground(new Color(124, 252, 0));
		btn95.setBounds(528, 526, 37, 23);
		contentPane.add(btn95);

		btn96 = new JButton("");
		btn96.setOpaque(true);
		btn96.addActionListener(this);
		btn96.setContentAreaFilled(false);
		btn96.setBorderPainted(false);
		btn96.setBackground(new Color(124, 252, 0));
		btn96.setBounds(550, 513, 27, 54);
		contentPane.add(btn96);

		btn10_1 = new JButton("");
		btn10_1.setOpaque(true);
		btn10_1.addActionListener(this);
		btn10_1.setContentAreaFilled(false);
		btn10_1.setBorderPainted(false);
		btn10_1.setBackground(new Color(124, 252, 0));
		btn10_1.setBounds(659, 574, 33, 41);
		contentPane.add(btn10_1);

		btn101 = new JButton("");
		btn101.setOpaque(true);
		btn101.addActionListener(this);
		btn101.setContentAreaFilled(false);
		btn101.setBorderPainted(false);
		btn101.setBackground(new Color(124, 252, 0));
		btn101.setBounds(694, 553, 33, 41);
		contentPane.add(btn101);

		btn102 = new JButton("");
		btn102.setOpaque(true);
		btn102.addActionListener(this);
		btn102.setContentAreaFilled(false);
		btn102.setBorderPainted(false);
		btn102.setBackground(new Color(124, 252, 0));
		btn102.setBounds(710, 526, 33, 41);
		contentPane.add(btn102);

		btn103 = new JButton("");
		btn103.setOpaque(true);
		btn103.addActionListener(this);
		btn103.setContentAreaFilled(false);
		btn103.setBorderPainted(false);
		btn103.setBackground(new Color(124, 252, 0));
		btn103.setBounds(731, 526, 27, 41);
		contentPane.add(btn103);

		btn104 = new JButton("");
		btn104.setOpaque(true);
		btn104.addActionListener(this);
		btn104.setContentAreaFilled(false);
		btn104.setBorderPainted(false);
		btn104.setBackground(new Color(124, 252, 0));
		btn104.setBounds(716, 514, 27, 63);
		contentPane.add(btn104);

		btn105 = new JButton("");
		btn105.setOpaque(true);
		btn105.addActionListener(this);
		btn105.setContentAreaFilled(false);
		btn105.setBorderPainted(false);
		btn105.setBackground(new Color(124, 252, 0));
		btn105.setBounds(678, 561, 27, 54);
		contentPane.add(btn105);

		btn1101 = new JButton("");
		btn1101.setOpaque(true);
		btn1101.addActionListener(this);
		btn1101.setContentAreaFilled(false);
		btn1101.setBorderPainted(false);
		btn1101.setBackground(new Color(124, 252, 0));
		btn1101.setBounds(608, 640, 27, 54);
		contentPane.add(btn1101);

		btn1102 = new JButton("");
		btn1102.setOpaque(true);
		btn1102.addActionListener(this);
		btn1102.setContentAreaFilled(false);
		btn1102.setBorderPainted(false);
		btn1102.setBackground(new Color(124, 252, 0));
		btn1102.setBounds(489, 544, 27, 54);
		contentPane.add(btn1102);

		btn1103 = new JButton("");
		btn1103.setOpaque(true);
		btn1103.addActionListener(this);
		btn1103.setContentAreaFilled(false);
		btn1103.setBorderPainted(false);
		btn1103.setBackground(new Color(124, 252, 0));
		btn1103.setBounds(495, 561, 27, 54);
		contentPane.add(btn1103);

		btn1104 = new JButton("");
		btn1104.setOpaque(true);
		btn1104.addActionListener(this);
		btn1104.setContentAreaFilled(false);
		btn1104.setBorderPainted(false);
		btn1104.setBackground(new Color(124, 252, 0));
		btn1104.setBounds(502, 574, 27, 54);
		contentPane.add(btn1104);

		btn1105 = new JButton("");
		btn1105.setOpaque(true);
		btn1105.addActionListener(this);
		btn1105.setContentAreaFilled(false);
		btn1105.setBorderPainted(false);
		btn1105.setBackground(new Color(124, 252, 0));
		btn1105.setBounds(518, 578, 27, 54);
		contentPane.add(btn1105);

		btn1106 = new JButton("");
		btn1106.setOpaque(true);
		btn1106.addActionListener(this);
		btn1106.setContentAreaFilled(false);
		btn1106.setBorderPainted(false);
		btn1106.setBackground(new Color(124, 252, 0));
		btn1106.setBounds(532, 598, 27, 54);
		contentPane.add(btn1106);

		btn1107 = new JButton("");
		btn1107.setOpaque(true);
		btn1107.addActionListener(this);
		btn1107.setContentAreaFilled(false);
		btn1107.setBorderPainted(false);
		btn1107.setBackground(new Color(124, 252, 0));
		btn1107.setBounds(550, 615, 27, 54);
		contentPane.add(btn1107);

		btn1108 = new JButton("");
		btn1108.setOpaque(true);
		btn1108.addActionListener(this);
		btn1108.setContentAreaFilled(false);
		btn1108.setBorderPainted(false);
		btn1108.setBackground(new Color(124, 252, 0));
		btn1108.setBounds(568, 626, 27, 54);
		contentPane.add(btn1108);

		btn1109 = new JButton("");
		btn1109.setOpaque(true);
		btn1109.addActionListener(this);
		btn1109.setContentAreaFilled(false);
		btn1109.setBorderPainted(false);
		btn1109.setBackground(new Color(124, 252, 0));
		btn1109.setBounds(593, 639, 27, 41);
		contentPane.add(btn1109);

		btn1110 = new JButton("");
		btn1110.setOpaque(true);
		btn1110.addActionListener(this);
		btn1110.setContentAreaFilled(false);
		btn1110.setBorderPainted(false);
		btn1110.setBackground(new Color(124, 252, 0));
		btn1110.setBounds(465, 553, 27, 23);
		contentPane.add(btn1110);

		btn201 = new JButton("");
		btn201.setOpaque(true);
		btn201.addActionListener(this);
		btn201.setContentAreaFilled(false);
		btn201.setBorderPainted(false);
		btn201.setBackground(new Color(124, 252, 0));
		btn201.setBounds(783, 561, 45, 15);
		contentPane.add(btn201);

		btn202 = new JButton("");
		btn202.setOpaque(true);
		btn202.addActionListener(this);
		btn202.setContentAreaFilled(false);
		btn202.setBorderPainted(false);
		btn202.setBackground(new Color(124, 252, 0));
		btn202.setBounds(781, 539, 17, 15);
		contentPane.add(btn202);

		btn203 = new JButton("");
		btn203.setOpaque(true);
		btn203.addActionListener(this);
		btn203.setContentAreaFilled(false);
		btn203.setBorderPainted(false);
		btn203.setBackground(new Color(124, 252, 0));
		btn203.setBounds(659, 640, 27, 54);
		contentPane.add(btn203);

		btn204 = new JButton("");
		btn204.setOpaque(true);
		btn204.addActionListener(this);
		btn204.setContentAreaFilled(false);
		btn204.setBorderPainted(false);
		btn204.setBackground(new Color(124, 252, 0));
		btn204.setBounds(694, 626, 27, 54);
		contentPane.add(btn204);

		btn205 = new JButton("");
		btn205.setOpaque(true);
		btn205.addActionListener(this);
		btn205.setContentAreaFilled(false);
		btn205.setBorderPainted(false);
		btn205.setBackground(new Color(124, 252, 0));
		btn205.setBounds(731, 605, 27, 54);
		contentPane.add(btn205);

		btn206 = new JButton("");
		btn206.setOpaque(true);
		btn206.addActionListener(this);
		btn206.setContentAreaFilled(false);
		btn206.setBorderPainted(false);
		btn206.setBackground(new Color(124, 252, 0));
		btn206.setBounds(759, 574, 27, 54);
		contentPane.add(btn206);

		btn207 = new JButton("");
		btn207.setOpaque(true);
		btn207.addActionListener(this);
		btn207.setContentAreaFilled(false);
		btn207.setBorderPainted(false);
		btn207.setBackground(new Color(124, 252, 0));
		btn207.setBounds(773, 553, 27, 54);
		contentPane.add(btn207);

		btn208 = new JButton("");
		btn208.setOpaque(true);
		btn208.addActionListener(this);
		btn208.setContentAreaFilled(false);
		btn208.setBorderPainted(false);
		btn208.setBackground(new Color(124, 252, 0));
		btn208.setBounds(710, 615, 27, 54);
		contentPane.add(btn208);

		btn209 = new JButton("");
		btn209.setOpaque(true);
		btn209.addActionListener(this);
		btn209.setContentAreaFilled(false);
		btn209.setBorderPainted(false);
		btn209.setBackground(new Color(124, 252, 0));
		btn209.setBounds(677, 639, 19, 41);
		contentPane.add(btn209);

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

		btnPlatea1 = new JButton("New button");
		btnPlatea1.addActionListener(this);
		btnPlatea1.setOpaque(true);
		btnPlatea1.setContentAreaFilled(false);
		btnPlatea1.setBorderPainted(false);
		btnPlatea1.setBounds(593, 395, 112, 48);
		contentPane.add(btnPlatea1);

		btnVIP1 = new JButton("New button");
		btnVIP1.addActionListener(this);
		btnVIP1.setOpaque(true);
		btnVIP1.setContentAreaFilled(false);
		btnVIP1.setBorderPainted(false);
		btnVIP1.setBounds(593, 456, 112, 50);
		contentPane.add(btnVIP1);

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

		btnComprar = new JButton("COMPRAR");
		btnComprar.addActionListener(this);
		btnComprar.setForeground(Color.RED);
		btnComprar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnComprar.setBackground(Color.ORANGE);
		btnComprar.setBounds(298, 658, 209, 36);
		contentPane.add(btnComprar);

		JLabel label_1 = new JLabel("<HTML> INFORMACION DEL ESCENARIO:  <br> <br> " + "VIP. Costo: 100000  "
				+ "<br> Platea. Costo: 150000 " + "<br> Palco. Costo: 200000</HTML>");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setOpaque(true);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBackground(Color.GRAY);
		label_1.setBounds(800, 186, 216, 139);
		contentPane.add(label_1);

		btnPalco = new JButton("");
		btnPalco.setOpaque(true);
		btnPalco.addActionListener(this);
		btnPalco.setBackground(new Color(173, 255, 47));
		btnPalco.setBounds(593, 336, 112, 48);
		contentPane.add(btnPalco);
		JLabel btn5 = new JLabel("");
		btn5.setOpaque(false);
		btn5.setBackground(Color.DARK_GRAY);
		btn5.setBounds(370, 420, 159, 147);
		Icon esce4 = new ImageIcon(
				escenario4.getImage().getScaledInstance(btn5.getWidth(), btn5.getHeight(), Image.SCALE_DEFAULT));
		btn5.setIcon(esce4);
		contentPane.add(btn5);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnAtras) {
			ventanacomprar.setVisible(true);
			this.setVisible(false);
			miV.limpiarMatriz();
		}
		if (e.getSource() == bt1 || e.getSource() == btn11_1 || e.getSource() == bt111 || e.getSource() == bt1111
				|| e.getSource() == bt11111 || e.getSource() == btn1111) {

			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(1);
			this.setVisible(false);

		}
		if (e.getSource() == btnt2 || e.getSource() == btnt22 || e.getSource() == btnt222
				|| e.getSource() == btnt2222) {
			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(2);
			this.setVisible(false);
		}
		if (e.getSource() == btn31 || e.getSource() == btn32 || e.getSource() == btn33 || e.getSource() == btn34
				|| e.getSource() == btn35 || e.getSource() == btn36 || e.getSource() == btn37) {

			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(3);
			this.setVisible(false);

		}

		if (e.getSource() == btn41 || e.getSource() == btn42 || e.getSource() == btn43 || e.getSource() == btn44
				|| e.getSource() == btn45 || e.getSource() == btn46 || e.getSource() == btn47) {

			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(4);
			this.setVisible(false);

		}
		if (e.getSource() == btn51 || e.getSource() == btn52 || e.getSource() == btn53 || e.getSource() == btn54
				|| e.getSource() == btn55 || e.getSource() == btn56) {

			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(5);
			this.setVisible(false);

		}

		if (e.getSource() == btn61 || e.getSource() == btn62 || e.getSource() == btn63 || e.getSource() == btn64
				|| e.getSource() == btn65) {

			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(6);
			this.setVisible(false);

		}

		if (e.getSource() == btn71 || e.getSource() == btn72 || e.getSource() == btn73 || e.getSource() == btn74
				|| e.getSource() == btn75 || e.getSource() == btn76) {

			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(7);
			this.setVisible(false);

		}
		if (e.getSource() == btn81 || e.getSource() == btn82 || e.getSource() == btn83 || e.getSource() == btn84
				|| e.getSource() == btn85 || e.getSource() == btn86) {

			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(8);
			this.setVisible(false);

		}
		if (e.getSource() == btn91 || e.getSource() == btn92 || e.getSource() == btn93 || e.getSource() == btn94
				|| e.getSource() == btn95 || e.getSource() == btn96) {

			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(9);
			this.setVisible(false);

		}
		if (e.getSource() == btn10_1 || e.getSource() == btn101 || e.getSource() == btn102 || e.getSource() == btn103
				|| e.getSource() == btn104 || e.getSource() == btn105) {

			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(10);
			this.setVisible(false);

		}
		if (e.getSource() == btn1101 || e.getSource() == btn1102 || e.getSource() == btn1103 || e.getSource() == btn1104
				|| e.getSource() == btn1105 || e.getSource() == btn1106 || e.getSource() == btn1107
				|| e.getSource() == btn1108 || e.getSource() == btn1109 || e.getSource() == btn1110) {

			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(11);
			this.setVisible(false);

		}
		if (e.getSource() == btn201 || e.getSource() == btn202 || e.getSource() == btn203 || e.getSource() == btn204
				|| e.getSource() == btn205 || e.getSource() == btn206 || e.getSource() == btn207
				|| e.getSource() == btn208 || e.getSource() == btn209) {

			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(12);
			this.setVisible(false);

		}

		if (e.getSource() == btnPlatea1) {

			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(14);
			this.setVisible(false);
		}

		if (e.getSource() == btnVIP1) {

			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(13);
			this.setVisible(false);

		}
		if (e.getSource() == btnPalco) {

			seleccionePuestos ventana = new seleccionePuestos(miV, this);
			ventana.setVisible(true);
			ventana.matrizOccidental(15);
			this.setVisible(false);

		}

		if (e.getSource() == btnComprar) {

			int x = miV.devuelvePrecio();
			int a = JOptionPane.showConfirmDialog(null, "Realmente desea Comprar $" + x, "Confirmar salida",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (a == 0) {
				miV.asegurarVentas();
				miV.setVisible(true);
				this.setVisible(false);
			}
		}
	}
}

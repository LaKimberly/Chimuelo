package INTERFAZ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Dialog.ModalExclusionType;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class seleccionePuestos extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private JButton mim[][];
	private Principal miV;
	private ventanaSeleccioneTribuna ventana2;
	private JLabel lblPuestos;
	private JButton btnQuitarTodo;
	private JButton btnAtras;
	private int cont = 0;

	/**
	 * Create the frame.
	 */
	public seleccionePuestos(Principal miV, ventanaSeleccioneTribuna ventana2) {
		this.miV = miV;
		this.ventana2 = ventana2;

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

		btnAtras = new JButton("ATRAS");
		btnAtras.addActionListener(this);
		btnAtras.setForeground(Color.RED);
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAtras.setBackground(Color.ORANGE);
		btnAtras.setBounds(1136, 626, 190, 36);
		contentPane.add(btnAtras);

		lblPuestos = new JLabel("");
		lblPuestos.setBounds(10, 11, 1105, 651);
		contentPane.add(lblPuestos);

		btnQuitarTodo = new JButton("Quitar todo");
		btnQuitarTodo.setForeground(Color.RED);
		btnQuitarTodo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnQuitarTodo.setBackground(Color.ORANGE);
		btnQuitarTodo.setBounds(1136, 565, 190, 36);
		contentPane.add(btnQuitarTodo);

	}

	public void matrizOccidental(int x) {
		mim = new JButton[miV.getmatrizOccidental(x).length][miV.getmatrizOccidental(x)[0].length];
		mim = miV.getmatrizOccidental(x);
		for (int i = 0; i < mim.length; i++) {
			for (int j = 0; j < mim[0].length; j++) {
				mim[i][j].addActionListener(this);
				lblPuestos.add(mim[i][j]);
			}
		}

	}

	private int contador = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		

		for (int i = 0; i < mim.length; i++) {

			for (int j = 0; j < mim[0].length; j++) {

				if (e.getSource() == mim[i][j]) {
					boolean centinela = miV.boletayavendida(i, j);
					cont = miV.cuentapuestosselecciondos();
					if (centinela == true) {

						if (cont < 8) {

							if (mim[i][j].getBackground() != Color.red) {

								mim[i][j].setBackground(Color.red);
								miV.modificarmatrizTemporal(i, j, Color.red, 0);

							} else {

								mim[i][j].setBackground(Color.green);
								miV.modificarmatrizTemporal(i, j, Color.green, 1);

							}

						} else if (mim[i][j].getBackground() == Color.red) {

							mim[i][j].setBackground(Color.green);
							miV.modificarmatrizTemporal(i, j, Color.green, 1);

						} else {

							JOptionPane.showMessageDialog(null, "El usuario solo puede seleccionar 8 puestos ",
									"Informacion", JOptionPane.INFORMATION_MESSAGE);

						}

					} else {
						JOptionPane.showMessageDialog(null, "Esta ubicacion ya esta vendida ", "Informacion",
								JOptionPane.INFORMATION_MESSAGE);

					}
				}
			}

		}
		if (btnAtras == e.getSource()) {
			for (int i = 0; i < mim.length; i++) {
				for (int j = 0; j < mim[0].length; j++) {
					mim[i][j].removeActionListener(this);
				}
			}
			ventana2.setVisible(true);
			this.setVisible(false);
		}

	}

}

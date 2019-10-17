package INTERFAZ;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;

public class ventanaIngresar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnIngresar;
	private JButton btnAtras;

	/**
	 * Launch the application.
	 */
	private Principal miV;
	private JTextField txtCorreo;
	private JPasswordField txtContraseña;

	/**
	 * Create the frame.
	 */
	public ventanaIngresar(Principal miV) {
		setTitle("INGRESAR USUARIO");
		this.miV = miV;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCorreo = new JLabel("CORREO :");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setBounds(10, 31, 121, 14);
		contentPane.add(lblCorreo);

		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setBounds(10, 104, 121, 14);
		contentPane.add(lblContrasea);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(141, 28, 186, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);

		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(141, 101, 186, 20);
		contentPane.add(txtContraseña);

		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setForeground(Color.RED);
		btnIngresar.setBackground(Color.ORANGE);
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(29, 177, 128, 23);
		contentPane.add(btnIngresar);

		btnAtras = new JButton("ATRAS");
		btnAtras.setForeground(Color.RED);
		btnAtras.setBackground(Color.ORANGE);
		btnAtras.addActionListener(this);
		btnAtras.setBounds(199, 177, 128, 23);
		contentPane.add(btnAtras);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == btnAtras) {
			miV.setVisible(true);
			this.setVisible(false);
		}
		if (arg0.getSource() == btnIngresar) {

			if (txtContraseña.getText().equals("") || txtCorreo.getText().equals("")) {
				
				JOptionPane.showMessageDialog(this, "CAMPOS VACIOS", "ERROR", JOptionPane.ERROR_MESSAGE);
			} else {
				boolean centinela=miV.ingresaUsuario(txtContraseña.getText(), txtCorreo.getText());
				if(centinela==true) {
				miV.modificalblUsuario();	
				miV.setVisible(true);
				miV.usuarioIngreso();
				this.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(this, "EL USUARIO NO EXISTE, REGISTRESE", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}

		}
	}
}

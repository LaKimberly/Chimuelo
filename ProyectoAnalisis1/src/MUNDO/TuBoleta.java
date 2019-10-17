package MUNDO;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class TuBoleta {

	public ArrayList<Usuario> misUsuarios = new ArrayList<Usuario>();
	public ArrayList<JButton[][]> misEscenarios = new ArrayList<JButton[][]>();
	public ArrayList<String[][]> misCedulas = new ArrayList<String[][]>();
	public ArrayList<String[][]> BoletasVendidasCedulas = new ArrayList<String[][]>();

	public Usuario miUsuario = null;
	public int indice;

	public void inicializa() {
		Usuario miu = new Usuario("11148833175", "Nicolas Ortiz", "n", "n", "3155246772", "calle 27#20-20");
		Usuario mia = new Usuario("11138301210", "Carolina Cardona", "c", "c", "3155246772", "calle 27#20-20");

		agregarClientes(miu);
		agregarClientes(mia);
		ListaMatricesCedulas();
		llenarMisescenarios();
	}

	public void agregarClientes(Usuario miU) {

		misUsuarios.add(miU);

	}

	public boolean usuarioExiste(Usuario miU) {
		boolean centinela = false;

		for (int i = 0; i < misUsuarios.size(); i++) {
			if (misUsuarios.get(i).getCedula().equals(miU.getCedula())
					|| misUsuarios.get(i).getCorreo().equals(miU.getCorreo())) {

				centinela = true;

			}
		}
		return centinela;

	}

	public boolean usuarioIngresa(String contraseña, String correo) {
		boolean centinela = false;
		for (int j = 0; j < misUsuarios.size(); j++) {

			if (contraseña.equals(misUsuarios.get(j).getContraseña())
					&& correo.equals(misUsuarios.get(j).getCorreo())) {
				centinela = true;
				miUsuario = misUsuarios.get(j);
			}
		}
		return centinela;
	}

	public Usuario getUsuario() {
		return miUsuario;
	}

	public void CerrarSesion() {
		miUsuario = null;
		indice = 0;
	}

	public void llenarMisescenarios() {

		for (int i = 1; i < 16; i++) {

			if (i == 1 || i == 2 || i == 3 || i == 4) {
				misEscenarios.add(llenaMatriz(8, 13));
			}
			if (i == 5 || i == 6 || i == 7 || i == 8) {
				misEscenarios.add(llenaMatriz(9, 14));
			}
			if (i == 9 || i == 10 || i == 11 || i == 12) {
				misEscenarios.add(llenaMatriz(10, 15));
			}
			if (i == 13) {
				misEscenarios.add(llenaMatriz(7, 12));

			}
			if (i == 14) {
				misEscenarios.add(llenaMatriz(6, 11));

			}
			if (i == 15) {

				misEscenarios.add(llenaMatriz(5, 10));

			}
		}

	}

	public JButton[][] llenaMatriz(int p, int k) {
		int x = 10;
		int y = 10;
		JButton tribunaPuestos[][] = new JButton[p][k];

		for (int i = 0; i < tribunaPuestos.length; i++) {
			for (int j = 0; j < tribunaPuestos[0].length; j++) {
				char f = (char) (j + 65);
				tribunaPuestos[i][j] = new JButton();
				tribunaPuestos[i][j].setBackground(Color.green);
				tribunaPuestos[i][j].setBounds(x, y, 60, 25);
				tribunaPuestos[i][j].setText(f + " " + i);
				x += 65;
			}
			x = 5;
			y += 65;

		}

		return tribunaPuestos;
	}

	public void ListaMatricesCedulas() {
		for (int i = 1; i < 16; i++) {

			if (i == 1 || i == 2 || i == 3 || i == 4) {
				misCedulas.add(llenaMatrizCedulas(8, 13));
				BoletasVendidasCedulas.add(llenaMatrizCedulas(8, 13));
			}
			if (i == 5 || i == 6 || i == 7 || i == 8) {
				misCedulas.add(llenaMatrizCedulas(9, 14));
				BoletasVendidasCedulas.add(llenaMatrizCedulas(9, 14));
			}
			if (i == 9 || i == 10 || i == 11 || i == 12) {
				misCedulas.add(llenaMatrizCedulas(10, 15));
				BoletasVendidasCedulas.add(llenaMatrizCedulas(10, 15));
			}
			if (i == 13) {
				misCedulas.add(llenaMatrizCedulas(7, 12));
				BoletasVendidasCedulas.add(llenaMatrizCedulas(7, 12));
			}
			if (i == 14) {
				misCedulas.add(llenaMatrizCedulas(6, 11));
				BoletasVendidasCedulas.add(llenaMatrizCedulas(6, 11));
			}
			if (i == 15) {
				misCedulas.add(llenaMatrizCedulas(5, 10));
				BoletasVendidasCedulas.add(llenaMatrizCedulas(5, 10));

			}

		}

	}

	public String[][] llenaMatrizCedulas(int k, int p) {

		String matrizcedulas[][] = new String[k][p];

		for (int i = 0; i < matrizcedulas.length; i++) {
			for (int j = 0; j < matrizcedulas[0].length; j++) {
				matrizcedulas[i][j] = "";
			}
		}
		return matrizcedulas;
	}

	public JButton[][] getdevuelveMatrizOccidental1(int a) {
		indice = a - 1;
		return misEscenarios.get(indice);
	}

	public void modificaMatrizTemporal(int i, int j, Color c, int a) {

		misEscenarios.get(indice)[i][j].setBackground(c);

		if (a == 0) {
			misCedulas.get(indice)[i][j] = miUsuario.getCedula();
		} else {
			misCedulas.get(indice)[i][j] = "";
		}
	}

	public int cuentacedula() {
		int contador = 0;

		for (int y = 0; y < misCedulas.size(); y++) {

			for (int i = 0; i < misCedulas.get(y).length; i++) {

				for (int j = 0; j < misCedulas.get(y)[0].length; j++) {

					if (misCedulas.get(y)[i][j].equals(miUsuario.getCedula()+"v")) {

						contador++;

					}

				}
			}
		}

		return contador;
	}

	public void LimpiarMatriz() {

		for (int y = 0; y < misCedulas.size(); y++) {

			for (int i = 0; i < misCedulas.get(y).length; i++) {

				for (int j = 0; j < misCedulas.get(y)[0].length; j++) {

					if (misCedulas.get(y)[i][j].equals(miUsuario.getCedula())) {

						misCedulas.get(y)[i][j] = "";
						misEscenarios.get(y)[i][j].setBackground(Color.green);

					}

				}
			}
		}

	}

	public void asegurarVenta() {

		for (int y = 0; y < misCedulas.size(); y++) {

			for (int i = 0; i < misCedulas.get(y).length; i++) {

				for (int j = 0; j < misCedulas.get(y)[0].length; j++) {

					if (misCedulas.get(y)[i][j].equals(miUsuario.getCedula())) {

						BoletasVendidasCedulas.get(y)[i][j] = miUsuario.getCedula() + "v";
						misCedulas.get(y)[i][j] = miUsuario.getCedula() + "v";
					}
				}
			}
		}
	}

	public boolean BoletasVendidas(int i, int j) {
		boolean centinela = false;
		if (BoletasVendidasCedulas.get(indice)[i][j] == "") {
			centinela = true;
		}
		return centinela;
	}

	public int devuelvePrecio() {
		int x = 0;
		int w = 50000;
		int t = 60000;
		int u = 70000;
		int v = 100000;
		int p = 150000;
		int pl = 200000;
		int suma = 0;

		for (int y = 0; y < misCedulas.size(); y++) {

			for (int i = 0; i < misCedulas.get(y).length; i++) {

				for (int j = 0; j < misCedulas.get(y)[0].length; j++) {

					if (misCedulas.get(y)[i][j].equals(miUsuario.getCedula())) {

						if (y == 0 || y == 1 || y == 2 || y == 3) {
							suma = u;
						}
						if (y == 4 || y == 5 || y == 6 || y == 7) {
							suma = t;
						}
						if (y == 8 || y == 9 || y == 10 || y == 11) {
							suma = w;
						}
						if (y == 12) {
							suma = v;
						}
						if (y == 13) {
							suma = p;
						}
						if (y == 14) {
							suma = pl;
						}

						x += suma;

					}
				}
			}
		}

		return x;
	}
}

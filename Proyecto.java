package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Proyecto extends JFrame {

	private JPanel contentPane;
	
	// Datos mínimos de la primera lavadora
	public static String modelo0 = "WHIRLPOOL WWI16BSBLA";
	public static double precio0 = 999.0;
	public static double fondo0 = 67.0;
	public static double ancho0 = 64.0;
	public static double alto0 = 105.0;
	public static double capacidad0 = 16;
	// Datos mínimos de la segunda lavadora
	public static String modelo1 = "SAMSUNG WA17T6260BW";
	public static double precio1 = 1199.0;
	public static double ancho1 = 63.0;
	public static double alto1 = 108.0;
	public static double fondo1 = 69.0;
	public static double capacidad1 = 17;
	// Datos mínimos de la tercera lavadora
	public static String modelo2 = "MABE LMA72200WDBB1";
	public static double precio2 = 1599.0;
	public static double ancho2 = 68.0;
	public static double alto2 = 109.0;
	public static double fondo2 = 68.0;
	public static double capacidad2 = 22;
	// Datos mínimos de la cuarta lavadora
	public static String modelo3 = "WINIA WLA-195ECG";
	public static double precio3 = 899.0;
	public static double ancho3 = 52.5;
	public static double alto3 = 85.5;
	public static double fondo3 = 53.5;
	public static double capacidad3 = 6.5;
	// Datos mínimos de la quinta lavadora
	public static String modelo4 = "LG TS1604NW";
	public static double precio4 = 1099.0;
	public static double ancho4 = 63.2;
	public static double alto4 = 102.0;
	public static double fondo4 = 67;
	public static double capacidad4 = 17;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String obsequio1 = "Cafetera";
	public static String obsequio2 = "Licuadora";
	public static String obsequio3 = "Extractor";
	// Cantidad óptima de unidades vendidas
	public static int cantidadOptima = 10;
	// Cuota diaria
	public static double cuotaDiaria = 30000;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarLavadora;
	private JMenuItem mntmModificarLavadora;
	private JMenuItem mntmListarLavadoras;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmConfigurarCantidadptima;
	private JMenuItem mntmConfigurarCuotaDiaria;
	private JMenuItem mntmAcercaDeTienda;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto frame = new Proyecto();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Proyecto() {
		setFont(new Font("Calibri", Font.BOLD, 15));
		setTitle("Lavadoras Pepito");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarLavadora = new JMenuItem("Consultar Lavadora");
		mnMantenimiento.add(mntmConsultarLavadora);
		
		mntmModificarLavadora = new JMenuItem("Modificar Lavadora");
		mnMantenimiento.add(mntmModificarLavadora);
		
		mntmListarLavadoras = new JMenuItem("Listar Lavadoras");
		mnMantenimiento.add(mntmListarLavadoras);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracion);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar Descuentos");
		mnConfiguracion.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar Obsequios");
		mnConfiguracion.add(mntmConfigurarObsequios);
		
		mntmConfigurarCantidadptima = new JMenuItem("Configurar Cantidad \u00D3ptima");
		mnConfiguracion.add(mntmConfigurarCantidadptima);
		
		mntmConfigurarCuotaDiaria = new JMenuItem("Configurar Cuota Diaria");
		mnConfiguracion.add(mntmConfigurarCuotaDiaria);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mnAyuda.add(mntmAcercaDeTienda);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}

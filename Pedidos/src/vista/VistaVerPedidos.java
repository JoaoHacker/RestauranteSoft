package vista;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;

import inv.logica.IPedidos;

public class VistaVerPedidos implements IPedidos{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	@Override
	public void mostrarProductos() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaVerPedidos window = new VistaVerPedidos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void eliminarVentana() {
		frame.hide();
	}
	/**
	 * Create the application.
	 */
	
	public VistaVerPedidos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void hacerPedido() {
		// TODO Auto-generated method stub
		
	}

}

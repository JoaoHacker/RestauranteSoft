package com.logica;

import javax.swing.JOptionPane;

import inv.logica.IPedidos;
import vista.VistaVerPedidos;

public class Pedidos implements IPedidos {

	@Override
	public void hacerPedido() {
		JOptionPane.showMessageDialog(null, "a"+getClass().getName());

	}

	@Override
	public void mostrarProductos() {
		 IPedidos vp = new VistaVerPedidos();
		 vp.mostrarProductos();

	}

}

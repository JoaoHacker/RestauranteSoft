package com.logica;

import javax.swing.JOptionPane;


import inv.logica.IGestionInventarios;

public class GestionInventarios implements IGestionInventarios {

	@Override
	public void gestionarInventario() {
		JOptionPane.showMessageDialog(null, "Holas"+getClass().getName());

	}

}

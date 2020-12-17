package com.quantum.model;

import com.quantum.util.GenericDAO;
import com.quantum.util.Conexion;
import com.quantum.entities.Estado;

public class EstadoDAO extends Conexion<Estado> implements GenericDAO<Estado> {

	public EstadoDAO() {
		super(Estado.class);
	}

	public static void main(String[] args) {
		EstadoDAO c = new EstadoDAO();
		System.out.println(c.list());
	}
}
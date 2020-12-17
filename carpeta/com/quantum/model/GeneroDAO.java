package com.quantum.model;

import com.quantum.util.GenericDAO;
import com.quantum.util.Conexion;
import com.quantum.entities.Genero;

public class GeneroDAO extends Conexion<Genero> implements GenericDAO<Genero> {

	public GeneroDAO() {
		super(Genero.class);
	}

	public static void main(String[] args) {
		GeneroDAO c = new GeneroDAO();
		System.out.println(c.list());
	}
}
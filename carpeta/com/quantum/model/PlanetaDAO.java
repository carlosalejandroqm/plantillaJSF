package com.quantum.model;

import com.quantum.util.GenericDAO;
import com.quantum.util.Conexion;
import com.quantum.entities.Planeta;

public class PlanetaDAO extends Conexion<Planeta> implements GenericDAO<Planeta> {

	public PlanetaDAO() {
		super(Planeta.class);
	}

	public static void main(String[] args) {
		PlanetaDAO c = new PlanetaDAO();
		System.out.println(c.list());
	}
}
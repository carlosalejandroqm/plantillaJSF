package com.quantum.model;

import com.quantum.util.GenericDAO;
import com.quantum.util.Conexion;
import com.quantum.entities.Pelicula;

public class PeliculaDAO extends Conexion<Pelicula> implements GenericDAO<Pelicula> {

	public PeliculaDAO() {
		super(Pelicula.class);
	}

	public static void main(String[] args) {
		PeliculaDAO c = new PeliculaDAO();
		System.out.println(c.list());
	}
}
package com.quantum.model;

import com.quantum.util.GenericDAO;
import com.quantum.util.Conexion;
import com.quantum.entities.Heroe;

public class HeroeDAO extends Conexion<Heroe> implements GenericDAO<Heroe> {

	public HeroeDAO() {
		super(Heroe.class);
	}

	public static void main(String[] args) {
		HeroeDAO c = new HeroeDAO();
		System.out.println(c.list());
	}
}
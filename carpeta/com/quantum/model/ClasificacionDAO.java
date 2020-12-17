package com.quantum.model;

import com.quantum.util.GenericDAO;
import com.quantum.util.Conexion;
import com.quantum.entities.Clasificacion;

public class ClasificacionDAO extends Conexion<Clasificacion> implements GenericDAO<Clasificacion> {

	public ClasificacionDAO() {
		super(Clasificacion.class);
	}

	public static void main(String[] args) {
		ClasificacionDAO c = new ClasificacionDAO();
		System.out.println(c.list());
	}
}
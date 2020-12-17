package com.quantum.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.quantum.entities.*;
import com.quantum.model.*;

import java.util.*;

@ManagedBean(name = "heroebean")
@RequestScoped

public class HeroeBean {
	HeroeDAO HeroeDAO = new HeroeDAO();

	public HeroeBean() {
		HeroeDAO HeroeDAO = new HeroeDAO();
	}
	
	// retorna la lista de todos los heroes 
	public List<Heroe> listaHeroes() {

		System.out.println(HeroeDAO.list());
		return HeroeDAO.list();

	}
	
	// metodo para eliminar heroe , si se elimina el heroe se recarga el index , jsf retorna rutas 
	public String eliminar(String id) {

		Heroe Heroe = HeroeDAO.find(id);
		HeroeDAO.delete(Heroe);
		System.out.println("Heroe eliminado..");
//		return "/faces/index.xhtml";
		return "index";
	}

	public String actualizar(Heroe Heroe) {
		HeroeDAO.update(Heroe);
		return "editForm"; // no es necesario poner el xhtml 
	}

	public String editar(String id) {
		Heroe e = HeroeDAO.find(id);
		// dejar la sesion activa de heroe y los  datos se van a poder ver 
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("Heroe", e);
		System.out.println("Heroe buscando Heroe..");
		return "editForm";
	}

	public String agregar(Heroe Heroe) {
		HeroeDAO.insert(Heroe);
		return "editForm";
	}
	
	// va a crear un objeto heroe vacio donde se rellenan los datos del objeto 
	public String ir() {
		Heroe e = new Heroe();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("Heroe", e);
		return "form";
	}

}

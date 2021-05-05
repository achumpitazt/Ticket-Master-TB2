package com.ticketmaster.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.models.entities.Pais;
import com.ticketmaster.service.IPaisService;

@Named
@RequestScoped
public class PaisController {
	
	@Inject
	private IPaisService pService;
	
	private Pais pais;
	
	List<Pais> listaPaises;
	//constructor
	@PostConstruct
	public void init() {
		this.pais = new Pais();
		this.listaPaises= new ArrayList<Pais>();
		this.list();
		
	}
	
	//métodos especializados
	public String newPais() {
		this.setPais(new Pais());
		return "pais.xhtml";
		
	}
	
	public void insert() {
		try {
			pService.insert(pais);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void list() {
		try {
			listaPaises = pService.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void delete(Pais pa) {
		try {
			pService.delete(pa.getIdPais());
			this.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//getters and setter

	
	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Pais> getListaPaises() {
		return listaPaises;
	}

	public void setListaPaises(List<Pais> listaPaises) {
		this.listaPaises = listaPaises;
	}
	
	
	
	
	

}

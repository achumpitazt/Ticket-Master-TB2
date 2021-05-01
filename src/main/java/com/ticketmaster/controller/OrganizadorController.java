package com.ticketmaster.controller;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.ticketmaster.models.entities.Organizador;
import com.ticketmaster.service.IOrganizadorService;


public class OrganizadorController {
	
	@Inject
	private IOrganizadorService oService;
	// variables
	private Organizador organizador;
	List<Organizador> listaOrganizadores;

	/* Constructores */
	@PostConstruct
	public void init() {
		this.organizador = new Organizador();
		this.listaOrganizadores = new ArrayList<Organizador>();
		this.list();
	}
	
	
	/*Métodos especializados*/
	public String newOrganizador() {
		this.setOrganizador(new Organizador());
		return "organizador.xhtml";
	}
	
	public void insert() {
		try {
			oService.insert(organizador);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void list() {
		try {
			listaOrganizadores=oService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void delet(Organizador or) {
		try {
			oService.delete(or.getId());
			this.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Organizador getOrganizador() {
		return organizador;
	}
	public void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}
	public List<Organizador> getListaOrganizadores() {
		return listaOrganizadores;
	}
	public void setListaOrganizadores(List<Organizador> listaOrganizadores) {
		this.listaOrganizadores = listaOrganizadores;
	}

}

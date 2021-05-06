package com.ticketmaster.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.models.entities.Evento;
import com.ticketmaster.models.entities.Organizador;
import com.ticketmaster.models.entities.TipoDeEvento;
import com.ticketmaster.service.IEventoService;
import com.ticketmaster.service.IOrganizadorService;
import com.ticketmaster.service.ITipoDeEventoService;

@Named
@RequestScoped
public class EventoController {
	
	@Inject
	private IEventoService eService;
	@Inject
	private ITipoDeEventoService tService;
	@Inject
	private IOrganizadorService oService;
	
	//variables
	
	private Evento evento;
	
	List<Evento>listaEventos;
	List<TipoDeEvento>listaTipoDeEventos;
	List<Organizador>listaOrganizadores;
	
	//Constructor
	@PostConstruct
	public void init() {
		this.evento = new Evento();
		this.listaEventos = new ArrayList<Evento>();
		this.listaTipoDeEventos = new ArrayList<TipoDeEvento>();
		this.listaOrganizadores = new ArrayList<Organizador>();
		this.listEvento();
		this.listTipoDeEvento();
		this.listOrganizador();
	}
	
	//métodos especializados
	
	public String newEvento() {
		this.setEvento(new Evento());
		return "evento.xhtml";
	}
	
	public void insert() {
		try {
			eService.insert(evento);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void listEvento() {
		try {
			listaEventos = eService.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void listOrganizador() {
		try {
			listaOrganizadores = oService.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void listTipoDeEvento() {
		try {
			listaTipoDeEventos = tService.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	 
	public void delet(Evento ev) {
		try {
			eService.delete(ev.getIdEvento());
			this.listEvento();
			this.listTipoDeEvento();
			this.listOrganizador();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	//getters and setters
	
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public List<Evento> getListaEventos() {
		return listaEventos;
	}
	public void setListaEventos(List<Evento> listaEventos) {
		this.listaEventos = listaEventos;
	}
	public List<TipoDeEvento> getListaTipoDeEventos() {
		return listaTipoDeEventos;
	}
	public void setListaTipoDeEventos(List<TipoDeEvento> listaTipoDeEventos) {
		this.listaTipoDeEventos = listaTipoDeEventos;
	}
	public List<Organizador> getListaOrganizadores() {
		return listaOrganizadores;
	}
	public void setListaOrganizadores(List<Organizador> listaOrganizadores) {
		this.listaOrganizadores = listaOrganizadores;
	}
	
	
	
	
	
	

}

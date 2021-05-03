package com.ticketmaster.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.ticketmaster.models.entities.TipoDeEvento;
import com.ticketmaster.service.ITipoDeEventoService;

public class TipoDeEventoController {
	
	@Inject
	private ITipoDeEventoService rTipoDeEvento;
	
	private TipoDeEvento tipoDeEvento;
	
	List<TipoDeEvento>listaTipoDeEventos;

	//Constructor
	@PostConstruct
	public void init() {
		this.tipoDeEvento = new TipoDeEvento();
		this.listaTipoDeEventos = new ArrayList<TipoDeEvento>();
		this.list();
		
	}
	
	//métodos especializados
	public String newTipoDeEvento() {
		this.setTipoDeEvento(new TipoDeEvento());
		return "tipoDeEvento.xhtml";
	}
	
	public void insert() {
		try {
			rTipoDeEvento.insert(tipoDeEvento);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de Tipo de Eventos.");
		}
	}
	
	public void list() {
		try {
			listaTipoDeEventos = rTipoDeEvento.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de TipoDeEventos.");
		}
	}
	
	public void delet(TipoDeEvento te) {
		try {
			rTipoDeEvento.delete(te.getIdTipoDeEvento());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de Clientes");
		}
	}
	
	//getters and setters
	public TipoDeEvento getTipoDeEvento() {
		return tipoDeEvento;
	}

	public void setTipoDeEvento(TipoDeEvento tipoDeEvento) {
		this.tipoDeEvento = tipoDeEvento;
	}

	public List<TipoDeEvento> getListaTipoDeEvento() {
		return listaTipoDeEventos;
	}

	public void setListaTipoDeEvento(List<TipoDeEvento> listaTipoDeEventos) {
		this.listaTipoDeEventos = listaTipoDeEventos;
	}
	
	

}

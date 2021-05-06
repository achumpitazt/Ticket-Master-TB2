package com.ticketmaster.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.models.entities.Cliente;
import com.ticketmaster.models.entities.Comentario;
import com.ticketmaster.models.entities.Evento;
import com.ticketmaster.service.IClienteService;
import com.ticketmaster.service.IComentarioService;
import com.ticketmaster.service.IEventoService;

@Named
@RequestScoped
public class ComentarioController {
	
	@Inject
	private IComentarioService comService;
	@Inject
	private IClienteService cliService;
	@Inject
	private IEventoService eService;
	
	private Comentario comentario;
	List<Comentario>listaComentarios;
	List<Cliente>listaClientes;
	List<Evento>listaEvento;
	
	@PostConstruct
	public void init() {
		this.comentario = new Comentario();
		this.listaComentarios = new ArrayList<Comentario>();
		this.listaClientes = new ArrayList<Cliente>();
		this.listaEvento = new ArrayList<Evento>();
		this.listComentario();
		this.listCliente();
		this.listEvento();
		
	}
	
	//métodos especializados
	
	public String newComentario() {
		this.setComentario(new Comentario());
		return "comentario.xhtml";
	}
	
	public void insert() {
		try {
			comService.insert(comentario);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void listComentario() {
		try {
			listaComentarios = comService.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void listCliente() {
		try {
			listaClientes = cliService.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void listEvento() {
		try {
			listaEvento = eService.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void delete(Comentario co) {
		try {
			comService.delete(co.getIdComentario());
			this.listComentario();
			this.listCliente();
			this.listEvento();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//Getters and Setters
	public Comentario getComentario() {
		return comentario;
	}
	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}
	public List<Comentario> getListaComentarios() {
		return listaComentarios;
	}
	public void setListaComentarios(List<Comentario> listaComentarios) {
		this.listaComentarios = listaComentarios;
	}
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	public List<Evento> getListaEvento() {
		return listaEvento;
	}
	public void setListaEvento(List<Evento> listaEvento) {
		this.listaEvento = listaEvento;
	}
	
	
	

}

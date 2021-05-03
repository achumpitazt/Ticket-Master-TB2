package com.ticketmaster.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.models.entities.Cliente;
import com.ticketmaster.service.IClienteService;

@Named
@RequestScoped
public class ClienteController {
	
	@Inject
	private IClienteService rCliente;
	//variables
	private Cliente cliente;
	
	List<Cliente>listaClientes;
	//constructores
	
	@PostConstruct
	public void init() {
		this.cliente = new Cliente();
		this.listaClientes = new ArrayList<Cliente>();
		this.list();
	}
	
	
	//métodos especializados
	public String newRegion() {
		this.setCliente(new Cliente());
		return "cliente.xhtml";
	}
	
	public void insert() {
		try {
			
			rCliente.insert(cliente);
			
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de Clientes.");
		}
	}
	
	public void list() {
		try {
			listaClientes = rCliente.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de Clientes.");
		}
	}
	
	public void delet(Cliente cl) {
		try {
			rCliente.delete(cl.getIdCliente());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de Clientes");
		}
	}
	
	//get and setters

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
}

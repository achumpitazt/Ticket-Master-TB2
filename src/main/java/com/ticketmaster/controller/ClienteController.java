package com.ticketmaster.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.models.entities.Cliente;
import com.ticketmaster.models.entities.Pais;
import com.ticketmaster.models.entities.Sexo;
import com.ticketmaster.service.IClienteService;
import com.ticketmaster.service.IPaisService;
import com.ticketmaster.service.ISexoService;

@Named
@RequestScoped
public class ClienteController {
	
	@Inject
	private IClienteService rCliente;
	@Inject
	private ISexoService sService;
	@Inject
	private IPaisService pService;
	//variables
	
	
	private Cliente cliente;
	
	List<Cliente>listaClientes;
	List<Pais>listaPaises;
	List<Sexo>listaSexos;
	//constructores
	
	@PostConstruct
	public void init() {
		this.cliente = new Cliente();
		this.listaClientes = new ArrayList<Cliente>();
		this.listaPaises = new ArrayList<Pais>();
		this.listaSexos = new ArrayList<Sexo>();
		this.listCliente();
		this.listPais();
		this.listSexo();
		
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
	
	public void listCliente() {
		try {
			listaClientes = rCliente.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de Clientes.");
		}
	}
	
	public void listPais() {
		try {
			listaPaises = pService.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void listSexo() {
		
		try {
			listaSexos = sService.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public void delet(Cliente cl) {
		try {
			rCliente.delete(cl.getIdCliente());
			this.listCliente();
			this.listPais();
			this.listSexo();
			
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de Clientes");
		}
	}
	
	public void findByName() {
		try {
			if(cliente.getNombreCliente().isEmpty()) {
				this.listCliente();
				this.listPais();
				this.listSexo();
			}
			else {
				listaClientes = this.rCliente.findByName(this.getCliente());
			}
		} catch (Exception e) {
			System.out.println("Error al buscar al cliente.");		
		}
	}
	
	public void clear() {
		this.init();
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


	public List<Pais> getListaPaises() {
		return listaPaises;
	}


	public void setListaPaises(List<Pais> listaPaises) {
		this.listaPaises = listaPaises;
	}


	public List<Sexo> getListaSexos() {
		return listaSexos;
	}


	public void setListaSexos(List<Sexo> listaSexos) {
		this.listaSexos = listaSexos;
	}
	
	
	

	
	
	
}

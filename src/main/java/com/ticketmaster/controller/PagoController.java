package com.ticketmaster.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.models.entities.Cliente;
import com.ticketmaster.models.entities.MetodoPago;
import com.ticketmaster.models.entities.Pago;
import com.ticketmaster.service.IClienteService;
import com.ticketmaster.service.IMetodoPagoService;
import com.ticketmaster.service.IPagoService;

@Named
@RequestScoped
public class PagoController {
	@Inject
	private IPagoService pService;
	//Para acceder al metodo de metodo
	@Inject
	private IMetodoPagoService mService;
	//Para acceder al metodo de metodo
	@Inject
	private IClienteService cService;
	
	//variables 
	private Pago pago;
	List<Pago> listapagos;
	//Relacion OneToMany
	List<MetodoPago> listaMetodoPago;
	//Relacion OneToMany
	List<Cliente> listaCliente;
	
	//Constructor
	@PostConstruct
	public void init() {
		this.pago = new Pago();
		this.listapagos = new ArrayList<Pago>();
		this.listaMetodoPago = new ArrayList<MetodoPago>();
		this.listaCliente = new ArrayList<Cliente>();
		this.listPago();
		this.listMetodoPago();
		this.listCliente();
	}
	
	//Métodos especializados
	public String newPago() {
		this.setPago(new Pago());
		return "pago.xhtml";
	}
	
	public void insert() {
		try {
			pService.insert(pago);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void listPago() {
		try {
			listapagos = pService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//Para listar Metodos de pago
	public void listMetodoPago() {
		try {
			listaMetodoPago = mService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//Para listar Clientes
	public void listCliente() {
		try {
			listaCliente = cService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void deleted(Pago pg) {
		try {
			pService.deleted(pg.getIdPago());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Set y Get
	public Pago getPago() {
		return pago;
	}
	public IPagoService getpService() {
		return pService;
	}

	public void setpService(IPagoService pService) {
		this.pService = pService;
	}

	public IMetodoPagoService getmService() {
		return mService;
	}

	public void setmService(IMetodoPagoService mService) {
		this.mService = mService;
	}

	public IClienteService getcService() {
		return cService;
	}

	public void setcService(IClienteService cService) {
		this.cService = cService;
	}

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public List<MetodoPago> getListaMetodoPago() {
		return listaMetodoPago;
	}
	public void setListaMetodoPago(List<MetodoPago> listaMetodoPago) {
		this.listaMetodoPago = listaMetodoPago;
	}
	public void setPago(Pago pago) {
		this.pago = pago;
	}
	public List<Pago> getListapagos() {
		return listapagos;
	}
	public void setListapagos(List<Pago> listapagos) {
		this.listapagos = listapagos;
	}
	
	
}

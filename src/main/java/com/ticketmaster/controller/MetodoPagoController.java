package com.ticketmaster.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.models.entities.MetodoPago;
import com.ticketmaster.service.IMetodoPagoService;

@Named
@RequestScoped
public class MetodoPagoController {
	@Inject
	private IMetodoPagoService mService;
	//Variables
	private MetodoPago metodopago;
	
	List<MetodoPago> listaMetodoPago;
	//Constructores
	@PostConstruct
	public void init() {
		this.metodopago=new MetodoPago();
		this.listaMetodoPago = new ArrayList<MetodoPago>();
		this.list();
	}
	//Metodos especializados
	public String newMetodoPago() {
		this.setMetodopago(new MetodoPago());
		return "metodopago.xhtml";
	}
	public void insert() {
		try {
			mService.insert(metodopago);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de metodo de pago");
		}
	}
	public void list() {
		try {
			listaMetodoPago = mService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de metodo de pago");
		}
	}
	public void deleted(MetodoPago mp) {
		try {
			mService.deleted(mp.getIdMetodoPago());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de metodo de pago");
		}
	}
	
	//Get y Set
	public MetodoPago getMetodopago() {
		return metodopago;
	}

	public void setMetodopago(MetodoPago metodopago) {
		this.metodopago = metodopago;
	}

	public List<MetodoPago> getListaMetodoPago() {
		return listaMetodoPago;
	}

	public void setListaMetodoPago(List<MetodoPago> listaMetodoPago) {
		this.listaMetodoPago = listaMetodoPago;
	}
	
}

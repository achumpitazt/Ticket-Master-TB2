package com.ticketmaster.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ticketmaster.models.entities.Sexo;
import com.ticketmaster.service.ISexoService;

@Named
@RequestScoped
public class SexoController {
	
	@Inject
	private ISexoService sService;
	
	private Sexo sexo;
	
	List<Sexo>listaSexos;
	
	//Constructor
	@PostConstruct
	public void init() {
		this.sexo = new Sexo(); 
		this.listaSexos=new ArrayList<Sexo>();
		this.list();
	}
	
	//métodos especializados
	public String newSexo() {
		
		this.setSexo(new Sexo());
		return "sexo.html";
	}
	
	public void insert() {
		try {
			sService.insert(sexo);
		} catch (Exception e) {
			System.out.println("Error al insertar sexo en el controller");
		}
	}
	
	public void list() {
		try {
			listaSexos = sService.list();
			} 
		catch (Exception e) {
			System.out.println("Error el listar en el controller");
		}
	}
	
	public void delete(Sexo se)
	{
		try {
			sService.delete(se.getIdSexo());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller");
		}
	}
	public void findByName() {
		try {
			if(sexo.getNombreSexo().isEmpty()){
				this.list();
			}
			else {
				listaSexos = this.sService.findByName(this.getSexo());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public void clear() {
		this.init();
	}
	

	//getters and setters
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public List<Sexo> getListaSexos() {
		return listaSexos;
	}

	public void setListaSexos(List<Sexo> listaSexos) {
		this.listaSexos = listaSexos;
	}
	
	
	
	
	

}

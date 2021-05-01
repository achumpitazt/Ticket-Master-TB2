package com.ticketmaster.daoimpl;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.ticketmaster.dao.IOrganizadorDao;
import com.ticketmaster.models.entities.Organizador;

public class OrganizadorDaoImpl implements IOrganizadorDao {

	@PersistenceContext(unitName = "ticketmasterPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Organizador org) {
		
		try {
			em.persist(org);
		} catch (Exception e) {
			System.out.println("Error al insertar Organizador-DaoImpl");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Organizador> list() {
		
		List<Organizador> lista=new ArrayList<Organizador>();
		try {
			Query q=em.createQuery("from organizador o");
			lista=(List<Organizador>)q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar organizador-DaoImpl");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idOrganizador) {
		Organizador or=new Organizador();
		try {
			or=em.getReference(Organizador.class,idOrganizador);
			em.remove(or);
			
		} catch (Exception e) {
			System.out.println("Error al borrar organizador-DaoImpl");
		}
		
	}

}

package com.ticketmaster.daoimpl;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ticketmaster.dao.IEventoDao;
import com.ticketmaster.models.entities.Evento;

public class EventoDaoImpl implements IEventoDao {

	@PersistenceContext(unitName = "ticketmasterPU")
	private EntityManager em;
	
	@Override
	public void insert(Evento evento) {
		
		try {
			em.persist(evento);
		} catch (Exception e) {
			System.out.println("Error al insertar Evento en el dao");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Evento> list() {
		List<Evento>lista = new ArrayList<Evento>();
		try {
			Query q = em.createQuery("from Evento r");
			lista =(List<Evento>)q.getResultList();
		} catch (Exception e) {
			
		}
		return lista;
	}

	@Override
	public void delete(Integer idEvento) {
		// TODO Auto-generated method stub
		
	}

}

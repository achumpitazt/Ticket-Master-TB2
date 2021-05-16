package com.ticketmaster.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.ticketmaster.dao.IEventoDao;
import com.ticketmaster.models.entities.Evento;

public class EventoDaoImpl implements IEventoDao{

	@PersistenceContext(unitName="ticketmasterPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Evento event) {
		try {
			em.persist(event);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Evento> list() {
		List<Evento>lista = new ArrayList<Evento>();
		try {
			Query q = em.createQuery("from Evento e");
			lista = (List<Evento>)q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(Integer idEvento) {
		Evento ev = new Evento();
		try {
			ev = em.getReference(Evento.class, idEvento);
			em.remove(ev);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

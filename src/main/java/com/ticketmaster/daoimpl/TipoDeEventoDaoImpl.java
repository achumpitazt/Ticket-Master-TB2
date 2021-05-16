package com.ticketmaster.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.ticketmaster.dao.ITipoDeEventoDao;
import com.ticketmaster.models.entities.TipoDeEvento;

public class TipoDeEventoDaoImpl implements ITipoDeEventoDao{

	@PersistenceContext(unitName="ticketmasterPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(TipoDeEvento tev) {
		try {
			em.persist(tev);
			
		} catch (Exception e) {
			System.out.println("Error al insertar Tipo de Evento en el dao");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoDeEvento> list() {
		
		List<TipoDeEvento>lista = new ArrayList<TipoDeEvento>();
		try {
			Query q = em.createQuery("from TipoDeEvento r");
			lista = (List<TipoDeEvento>)q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return lista;
	}

	@Transactional
	@Override
	public void delete(Integer idTipoDeEvento) {
		TipoDeEvento te= new TipoDeEvento();
		try {
			te = em.getReference(TipoDeEvento.class, idTipoDeEvento);
			em.remove(te);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

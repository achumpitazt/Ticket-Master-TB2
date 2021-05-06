package com.ticketmaster.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.ticketmaster.dao.IPagoDao;
import com.ticketmaster.models.entities.Pago;

public class PagoDaoImpl implements IPagoDao{

	@PersistenceContext(unitName = "ticketmasterPU")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Pago pag) {
		try {
			em.persist(pag);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pago> list() {
		List<Pago> lista = new ArrayList<Pago>();
		try {
			Query q =em.createQuery("from Pago p");
			lista = (List<Pago>)q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void deleted(int idPago) {
		Pago p = new Pago();
		try {
			p = em.getReference(Pago.class, idPago);
			em.remove(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

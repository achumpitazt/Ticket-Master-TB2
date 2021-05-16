package com.ticketmaster.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.ticketmaster.dao.IPaisDao;
import com.ticketmaster.models.entities.Pais;

public class PaisDaoImpl implements IPaisDao{

	@PersistenceContext(unitName = "ticketmasterPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Pais pai) {
		
		try {
			em.persist(pai);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pais> list() {
		
		List<Pais>lista = new ArrayList<Pais>();
		try {
			Query q = em.createQuery("from Pais p");
			lista = (List<Pais>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idPais) {
		Pais pa = new Pais();
		
		try {
			pa = em.getReference(Pais.class, idPais);
			em.remove(pa);
					
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pais> findByName(Pais pai) {
		List<Pais> lista = new ArrayList<Pais>();
		try {
			Query q= em.createQuery("from Pais p where p.nombrePais like ?1");
			q.setParameter(1, "%"+pai.getNombrePais()+"%");
			lista =(List<Pais>)q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

}

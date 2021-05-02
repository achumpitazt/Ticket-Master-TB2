package com.ticketmaster.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.ticketmaster.dao.IMetodoPagoDao;
import com.ticketmaster.models.entities.MetodoPago;

public class MetodoPagoDaoImpl implements IMetodoPagoDao{

	@PersistenceContext(unitName = "ticketmasterPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(MetodoPago mpa) {
		try {
			em.persist(mpa);
		} catch (Exception e) {
			System.out.println("Error al insertar Metodo de Pago en el dao");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MetodoPago> list() {
		List<MetodoPago> lista = new ArrayList<MetodoPago>(); 
		try {
			Query q = em.createQuery("from MetodoPago m");
			lista =(List<MetodoPago>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Metodo de Pago en el dao");
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void deleted(int idMetodoPago) {
		MetodoPago me = new MetodoPago();
		try {
			me= em.getReference(MetodoPago.class, idMetodoPago);
			em.remove(me);
		} catch (Exception e) {
		System.out.println("Error al eliminar Metodo de Pago en el dao");
		}
	}
	

}

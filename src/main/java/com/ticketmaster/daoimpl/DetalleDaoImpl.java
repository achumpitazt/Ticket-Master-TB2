package com.ticketmaster.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ticketmaster.dao.IDetalleDao;
import com.ticketmaster.models.entities.Detalle;

public class DetalleDaoImpl implements IDetalleDao {

	@PersistenceContext(unitName = "ticketmasterPU")
	private EntityManager em;
	
	@Override
	public void insert(Detalle det) {
		
		try {
			em.persist(det);
		} catch (Exception e) {
			System.out.println("Error al insertar Detalle");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public java.util.List<Detalle> List() {
		
		List<Detalle> lista = new ArrayList<Detalle>();
		try {
			Query q=em.createQuery("from detalle d");
			lista=(List<Detalle>)q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Detalles");
		}
		return lista;
	}

	@Override
	public void delete(int idDetalle) {
		
		Detalle det= new Detalle();
		try {
			det=em.getReference(Detalle.class, idDetalle);
			em.remove(det);
		} catch (Exception e) {
			System.out.println("Error al botat el detalle");
		}
		
	}

}

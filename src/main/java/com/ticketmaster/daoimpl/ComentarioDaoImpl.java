package com.ticketmaster.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.ticketmaster.dao.IComentarioDao;
import com.ticketmaster.models.entities.Comentario;

public class ComentarioDaoImpl implements IComentarioDao{

	@PersistenceContext(unitName="ticketmasterPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Comentario com) {
		try {
			em.persist(com);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comentario> list() {
		List<Comentario>lista = new ArrayList<Comentario>();
		try {
			Query q = em.createQuery("From Comentario c");
			lista = (List<Comentario>)q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(Integer idComentario) {
		Comentario co = new Comentario();
		try {
			co = em.getReference(Comentario.class, idComentario);
			em.remove(co);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

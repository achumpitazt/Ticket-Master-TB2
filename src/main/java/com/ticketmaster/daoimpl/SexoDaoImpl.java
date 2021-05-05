package com.ticketmaster.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.ticketmaster.dao.ISexoDao;
import com.ticketmaster.models.entities.Sexo;

public class SexoDaoImpl implements ISexoDao{

	@PersistenceContext(unitName = "ticketmasterPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Sexo sex) {
		try {
			em.persist(sex);
		} catch (Exception e) {
			System.out.println("Error al insertar Sexo en el DAO");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sexo> list() {
		List<Sexo>lista = new ArrayList<Sexo>();
		try {
			Query q=em.createQuery("from Sexo s");
			lista = (List<Sexo>)q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el dao impl");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(Integer idSexo) {
		Sexo se = new Sexo();
		try {
			se = em.getReference(Sexo.class, idSexo);
			em.remove(se);
		} catch (Exception e) {
			System.out.println("Error al borrar en el imlpDao");
		}
		
	}

}

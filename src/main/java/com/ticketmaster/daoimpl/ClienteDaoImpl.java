package com.ticketmaster.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.ticketmaster.dao.IClienteDao;
import com.ticketmaster.models.entities.Cliente;

public class ClienteDaoImpl implements IClienteDao {

	@PersistenceContext(unitName="ticketmasterPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Cliente cli) {
		try {
			em.persist(cli);
		} catch (Exception e) {
			System.out.println("Error al insertar Cliente en el DAO");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> list() {
		List<Cliente> lista = new ArrayList<Cliente>();
		try {
			Query q= em.createQuery("from Cliente r");
			lista =(List<Cliente>)q.getResultList();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(Integer idCliente) {
		Cliente cl = new Cliente();
		try {
			cl = em.getReference(Cliente.class, idCliente);
			em.remove(cl);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

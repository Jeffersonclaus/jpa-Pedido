package br.com.claus.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.claus.entity.Categoria;
import br.com.claus.entity.Pedido;

public class PedidoDao {

	   private EntityManagerFactory entityManagerFactory;

	    public PedidoDao() {
	        entityManagerFactory = Persistence.createEntityManagerFactory("claus");
	    }

	    public void savePedido(Pedido pedido) {
	        EntityManager entityManager = entityManagerFactory.createEntityManager();
	        entityManager.getTransaction().begin();
	        entityManager.persist(pedido);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }

	    public void updatePedido(Pedido pedido) {
	        EntityManager entityManager = entityManagerFactory.createEntityManager();
	        entityManager.getTransaction().begin();
	        entityManager.merge(pedido);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }

	    public void delete(Pedido pedido) {
	        EntityManager entityManager = entityManagerFactory.createEntityManager();
	        entityManager.getTransaction().begin();
	        entityManager.remove(pedido);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }

	    public Pedido findById( Long id) {
	        EntityManager entityManager = entityManagerFactory.createEntityManager();
	        Pedido entity = entityManager.find(Pedido.class, id);
	        entityManager.close();
	        return entity;
	    }


	    public void close() {
	        entityManagerFactory.close();
	    }
	}


package br.com.claus.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.claus.entity.Categoria;

public class CategoriaDao {

	   private EntityManagerFactory entityManagerFactory;

	    public CategoriaDao() {
	        entityManagerFactory = Persistence.createEntityManagerFactory("claus");
	    }

	    public void saveCategoria(Categoria categoria) {
	        EntityManager entityManager = entityManagerFactory.createEntityManager();
	        entityManager.getTransaction().begin();
	        entityManager.persist(categoria);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }

	    public void update(Categoria categoria) {
	        EntityManager entityManager = entityManagerFactory.createEntityManager();
	        entityManager.getTransaction().begin();
	        entityManager.merge(categoria);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }

	    public void delete(Categoria categoria) {
	        EntityManager entityManager = entityManagerFactory.createEntityManager();
	        entityManager.getTransaction().begin();
	        entityManager.remove(categoria);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }

	    public Categoria findById( Long id) {
	        EntityManager entityManager = entityManagerFactory.createEntityManager();
	        Categoria entity = entityManager.find(Categoria.class, id);
	        entityManager.close();
	        return entity;
	    }


	    public void close() {
	        entityManagerFactory.close();
	    }
	}


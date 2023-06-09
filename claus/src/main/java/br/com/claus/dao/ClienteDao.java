package br.com.claus.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.claus.entity.Cliente;
import br.com.claus.entity.Produto;

public class ClienteDao {

	private EntityManagerFactory entityManagerFactory;

	public ClienteDao() {
		entityManagerFactory = Persistence.createEntityManagerFactory("claus");
	}

	public void saveCliente(Cliente cliente) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void updateProduto(Cliente cliente) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(cliente);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

	public void deleteProduto(Cliente cliente) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.remove(cliente);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
    public Cliente BuscarProdutoId( Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Cliente produto = entityManager.find(Cliente.class, id);
        entityManager.close();
        return produto;
    }

	public void close() {
		entityManagerFactory.close();
	}

}

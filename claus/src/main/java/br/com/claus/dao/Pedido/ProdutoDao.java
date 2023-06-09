package br.com.claus.dao.Pedido;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.claus.entity.Produto;

public class ProdutoDao {

	   private EntityManagerFactory entityManagerFactory;

	    public ProdutoDao() {
	        entityManagerFactory = Persistence.createEntityManagerFactory("claus");
	    }

	    public void saveProduto(Produto produto) {
	        EntityManager entityManager = entityManagerFactory.createEntityManager();
	        entityManager.getTransaction().begin();
	        entityManager.persist(produto);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }

	    public void updateProduto(Produto produto) {
	    	EntityManager  entityManager = entityManagerFactory.createEntityManager();
	    	entityManager.getTransaction().begin();
	    	entityManager.merge(produto);
	    	entityManager.getTransaction().commit();
	        entityManager.close();
	  
	    }

	    public void deleteProduto(Produto produto) {
	        EntityManager entityManager = entityManagerFactory.createEntityManager();
	        entityManager.getTransaction().begin();
	        entityManager.remove(produto);
	        entityManager.getTransaction().commit();
	        entityManager.close();
	    }

	    public Produto BuscarProdutoId( Long id) {
	        EntityManager entityManager = entityManagerFactory.createEntityManager();
	        Produto produto = entityManager.find(Produto.class, id);
	        entityManager.close();
	        return produto;
	    }

	    

	    public List<Produto> findAll() {
	        EntityManager entityManager = entityManagerFactory.createEntityManager();

	    	String jpql = "SELECT p FROM Produto p";
	    	return entityManager.createQuery(jpql,Produto.class).getResultList();

	       
	     }
	 
	    
	    public List<Produto> buscarProdutoNome(String nomeProduto) {
	        EntityManager entityManager = entityManagerFactory.createEntityManager();

	        String jpql = "SELECT p FROM Produto p WHERE p.name = ?1";
	        return entityManager.createQuery(jpql, Produto.class)
	                .setParameter(1, nomeProduto)
	                .getResultList();
	    }
	    
	    
	    
	    public List<Produto> nomeProdutoCategoria(String nomeCategoria){
	    	EntityManager entityManeger = entityManagerFactory.createEntityManager();
	    	String jpl = "SELECT p FROM Produto p WHERE p.categoria.nome = ?1";
	    			return entityManeger.createQuery(jpl, Produto.class)
	    					.setParameter(1, nomeCategoria)
	    					.getResultList();
	    	
	    }
	    
	
	    public Double buscarPrecoProdutoNome (String nomeProduto) {
	    	EntityManager entityManeger = entityManagerFactory.createEntityManager();
	    	String jpl = "SELECT p.preco_Produto FROM Produto p WHERE p.nome = ?1";
	    	return entityManeger.createQuery(jpl, Double.class)
					.setParameter(1, nomeProduto)
					.getSingleResult();
	    	
	    	
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    

	    public void close() {
	        entityManagerFactory.close();
	    }

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}


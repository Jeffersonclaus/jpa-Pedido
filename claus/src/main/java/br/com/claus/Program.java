package br.com.claus;

import br.com.claus.dao.CategoriaDao;
import br.com.claus.dao.ClienteDao;
import br.com.claus.dao.PedidoDao;
import br.com.claus.dao.ProdutoDao;
import br.com.claus.entity.Categoria;
import br.com.claus.entity.Cliente;
import br.com.claus.entity.ItemPedido;
import br.com.claus.entity.Pedido;
import br.com.claus.entity.Produto;

public class Program {
	public static void main(String[] args) {

		/*
		 * teste categoria e produto ProdutoDao proDao = new ProdutoDao(); Categoria
		 * celular = new Categoria("CELULAR"); proDao.save(celular);
		 * 
		 * Produto produto = new Produto("NOTE 9T", "XIOAMI ", 38000, celular);
		 * 
		 * 
		 * proDao.save(produto);
		 */

		/*
		 * teste buscar todos produtos
		 * 
		 * ProdutoDao proDao = new ProdutoDao(); List<Produto> prod =proDao.findAll();
		 * 
		 * prod.forEach(p2 -> System.out.println(p2));
		 */

		/*
		 * teste buscar por nome
		 * 
		 * ProdutoDao proDao = new ProdutoDao(); List<Produto> prod
		 * =proDao.buscarProdutoNome("NOTE9T");
		 * 
		 * prod.forEach(p2 -> System.out.println(p2.getName()));
		 * 
		 */

		/*
		 * teste buscar por nome produto ProdutoDao proDao = new ProdutoDao();
		 * List<Produto> prod =proDao.nomeProdutoCategoria("CELULAR");
		 * 
		 * prod.forEach(p2 -> System.out.println(p2));
		 * 
		 */

		/*
		 * teste salvar clinete
		 * 
		 * ClienteDao cliDao = new ClienteDao(); Cliente cliente = new
		 * Cliente("11111111111", "joao");
		 * 
		 * cliDao.saveProduto(cliente);
		 */

		/* Teste Pedido/ItemPedido */

		CategoriaDao categoriaDao = new CategoriaDao();
		Categoria celular = new Categoria("CELULAR");
		categoriaDao.saveCategoria(celular);

		ProdutoDao proDao = new ProdutoDao();
		Produto produto = new Produto("NOTE 9T", "XIOAMI ", 38000, celular);
		proDao.saveProduto(produto);

		ClienteDao cliDao = new ClienteDao();
		Cliente cliente = new Cliente("11111111111", "joao");

		cliDao.saveCliente(cliente);
		
		Produto produto1 = proDao.BuscarProdutoId(1l);
		Cliente cliente1 = cliDao.BuscarProdutoId(1l);
		
		
		
		Pedido pedido = new Pedido(cliente1);
		pedido.adicionarItem( new ItemPedido(10, pedido, produto1));
		
		PedidoDao pedidoDao = new  PedidoDao();
		
		
		
		pedidoDao.savePedido(pedido);
		
		

	}

}

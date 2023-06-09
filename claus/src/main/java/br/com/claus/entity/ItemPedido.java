package br.com.claus.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "itens_pedido")
public class ItemPedido {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Double precoUnitario;
	private Integer quantidade;
	
	
		
	@ManyToOne
	private Pedido pedido;
	
	@ManyToOne
	private Produto produto;
	
	
	public ItemPedido(){
		
	}


	public ItemPedido(Integer quantidade, Pedido pedido, Produto produto) {
	
		this.quantidade = quantidade;
		this.pedido = pedido;
		this.precoUnitario=produto.getPreco(); // puxar o preco do produto
		this.produto = produto;
	}


	public Double getPrecoUnitario() {
		return precoUnitario;
	}


	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
	
	
	
	
	
	

}

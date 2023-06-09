package br.com.claus.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String descricao;
	private Double preco;
	private LocalDate dataCadastroProduto = LocalDate.now();

	@ManyToOne	
	private Categoria categoria;
	
	
	public Produto() {
	}

	

	public Produto(String name, String descricao, double preco, Categoria categoria) {
		
		this.name = name;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco_Produto(double preco) {
		this.preco = preco;
	}

	public LocalDate getDataCadastroProduto() {
		return dataCadastroProduto;
	}

	public void setDataCadastroProduto(LocalDate dataCadastroProduto) {
		this.dataCadastroProduto = dataCadastroProduto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	



	@Override
	public String toString() {
		return "Produto [id=" + id + ", name=" + name + ", descricao=" + descricao + ", preco_Produto=" + preco
				+ ", dataCadastroProduto=" + dataCadastroProduto + ", categoria=" + categoria + "]";
	}

	
	
	
	
	
	
}

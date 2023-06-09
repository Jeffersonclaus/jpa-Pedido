package br.com.claus.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String  cpf;

	private String nome;

	

	public Cliente() {
		
		
	}
	
	



	public Cliente(String cpf, String nome) {
		
		this.cpf = cpf;
		this.nome = nome;
	}





	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	
/*	private boolean validarCPF(String cpf) {
        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }
        
        // Verifica se todos os caracteres são numéricos
        for (int i = 0; i < cpf.length(); i++) {
            if (!Character.isDigit(cpf.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }

*/





	
	
	
}

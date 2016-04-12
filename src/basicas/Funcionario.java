package basicas;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Funcionario extends Pessoa {


	private String senha;
	private String cargo;
	@ManyToOne
	private Setor setor;
	@OneToMany(mappedBy="funcionario")
	private List<Compra> compras;
	@OneToMany(mappedBy="funcionario")
	private List<Cotacao> cotacao;
	
	
	
	
	

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	
	
	
}

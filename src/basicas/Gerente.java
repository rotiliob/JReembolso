package basicas;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Gerente extends Pessoa{

	private String locacao;
	@OneToOne
	private Setor setor;
	

	public String getLocacao() {
		return locacao;
	}

	public void setLocacao(String locacao) {
		this.locacao = locacao;
	}
	
	
}

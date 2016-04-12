package basicas;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Fornecedor extends Pessoa {
	

	private int cpnj;
	
	
	
	
	public int getCpnj() {
		return cpnj;
	}
	public void setCpnj(int cpnj) {
		this.cpnj = cpnj;
	}

	
	
}

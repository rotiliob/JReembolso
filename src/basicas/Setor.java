package basicas;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Setor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descricao;
	@OneToOne(mappedBy="setor", fetch = FetchType.LAZY)
	private Gerente gerente;
	@OneToMany(mappedBy = "setor", fetch =FetchType.LAZY)
	private List<Funcionario> funcionarios;
	
}

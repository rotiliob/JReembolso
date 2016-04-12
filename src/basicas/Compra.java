package basicas;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.id.EntityIdentifierNature;

@Entity
public class Compra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.DATE)
	private Calendar dataSolicitacao;
	private String descricao;
	private int quantidade;
	@Enumerated(EnumType.STRING)
	private StatusAutorizacao status;
	@ManyToOne
	private Funcionario funcionario;
	@OneToOne(mappedBy ="compra")
	private Cotacao cotacao;
}

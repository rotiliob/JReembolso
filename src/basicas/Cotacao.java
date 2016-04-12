package basicas;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Cotacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.DATE)
	private Calendar dataCotacao;
	@Enumerated(EnumType.STRING)
	private StatusAutorizacao status;
	private BigDecimal valor;
	@ManyToOne
	private Funcionario funcionario;
	@OneToOne
	private Compra compra;
	
}

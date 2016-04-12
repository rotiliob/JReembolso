package basicas;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class CotacaoFornecedor {
	
	@EmbeddedId
	private CotacaoPK cotacaoPK;
	private BigDecimal valor;
	@Enumerated(EnumType.STRING)
	private StatusCotacao status;
	
	public CotacaoPK getCotacaoPK() {
		return cotacaoPK;
	}
	public void setCotacaoPK(CotacaoPK cotacaoPK) {
		this.cotacaoPK = cotacaoPK;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public StatusCotacao getStatus() {
		return status;
	}
	public void setStatus(StatusCotacao status) {
		this.status = status;
	}
	
	
	
}

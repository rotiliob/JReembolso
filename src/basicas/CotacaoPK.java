package basicas;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;


@Embeddable
public class CotacaoPK implements Serializable {
	
	@ManyToOne
	private Cotacao cotacao;
	@ManyToOne
	private Fornecedor fornecedor;
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof CotacaoPK)){
			CotacaoPK cotacaoPK = (CotacaoPK) obj;
			if(!cotacaoPK.getCotacao().equals(cotacao)){
				return false;
			}
			if(!cotacaoPK.getFornecedor().equals(fornecedor)){
				return false;
			}
			return true;
		}
		return false;
	}
	@Override
	public int hashCode(){
		return cotacao.hashCode()+fornecedor.hashCode();
	}
	
	public Cotacao getCotacao() {
		return cotacao;
	}
	public void setCotacao(Cotacao cotacao) {
		this.cotacao = cotacao;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	
}

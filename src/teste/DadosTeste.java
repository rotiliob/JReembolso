package teste;

import javax.persistence.EntityManager;

import basicas.Funcionario;

import util.JPAUtil;

public class DadosTeste {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager(); 
		em.getTransaction().begin(); 
		
		Funcionario f = new Funcionario();
		f.setNome("Marcus");
		em.persist(f);
		
		em.getTransaction().commit(); 
		em.close(); 
	}

}

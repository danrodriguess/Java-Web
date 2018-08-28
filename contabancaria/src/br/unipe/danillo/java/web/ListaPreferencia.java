package br.unipe.danillo.java.web;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.unipe.danillo.java.web.entidades.Preferencia;

public class ListaPreferencia {
	
	public static void main(String[] args) {
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro");
			EntityManager manager = factory.createEntityManager();
			
			String matricula = "1610014885";
					
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("SELECT * FROM PREFERENCIA p ");
			stringBuilder.append("INNER JOIN CLIENTE c ON p.IDCLIENTE = c.ID ");
			stringBuilder.append("WHERE c.MATRICULA = :matricula");

			Query query = manager.createNativeQuery(stringBuilder.toString(), Preferencia.class);
			query.setParameter("matricula", matricula);
			
			
			manager.close();
			factory.close();
	}

}

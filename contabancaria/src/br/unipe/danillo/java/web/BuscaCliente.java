package br.unipe.danillo.java.web;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.unipe.danillo.java.web.entidades.Cliente;

public class BuscaCliente {
	
	public static void main(String[] args) {
		
		String matricula = "1610014885";
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro");
		EntityManager manager = factory.createEntityManager();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("SELECT * FROM CLIENTE ");
		sql.append("WHERE MATRICULA = :matricula");
		
		Query query = manager.createNativeQuery(sql.toString(), Cliente.class);
		query.setParameter("matricula", matricula);
		
		manager.getTransaction().begin();
		
		Cliente cliente = (Cliente) query.getSingleResult();
		System.out.println(cliente.toString());
		
		manager.close();
		factory.close();
	}

}

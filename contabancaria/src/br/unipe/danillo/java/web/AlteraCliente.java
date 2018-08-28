package br.unipe.danillo.java.web;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.unipe.danillo.java.web.entidades.Cliente;

public class AlteraCliente {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro");
		EntityManager manager = factory.createEntityManager();
		
		Cliente cliente = manager.find(Cliente.class, 01D);
		
		cliente.setNome("Pedro");;
		
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
	}


}

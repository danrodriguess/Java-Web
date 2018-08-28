package br.unipe.danillo.java.web;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.unipe.danillo.java.web.entidades.Cliente;

public class DesativaCliente {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro");
		EntityManager manager = factory.createEntityManager();
		
		Cliente cliente = manager.find(Cliente.class, 01D);
		
		cliente.setAtivo(false);
		
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
		
		
		
	}

}

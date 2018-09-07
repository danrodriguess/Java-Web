package br.unipe.danillo.java.web;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.unipe.danillo.java.web.entidades.Cliente;

public class BuscaClienteByIdLazy {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Cliente cliente = manager.getReference(Cliente.class, 01D);
		System.out.println(cliente);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

}

package br.unipe.danillo.java.web;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.unipe.danillo.java.web.entidades.Preferencia;
import br.unipe.danillo.java.web.entidades.Cliente;

public class GravaCliente {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro");
		EntityManager manager = factory.createEntityManager();
		
		Cliente cliente = new Cliente();
		Preferencia preferencia = new Preferencia();
		
		
		cliente.setNome("Danillo");
		cliente.setSobrenome("Rodrigues");
		cliente.setMatricula("1610014885");
		cliente.setAtivo(true);
		
		preferencia.setCliente(cliente);
		preferencia.setPreferencia("Rock");
		
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
	}

}

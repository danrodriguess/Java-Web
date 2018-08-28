package br.unipe.danillo.java.web.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PREFERENCIA")
public class Preferencia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PREF_ID", nullable=true)
	private Long id;
	
	@Column(name="IDCLIENTE", nullable=true)
	private Cliente idCliente;
	
	@ManyToOne
	@Column(name="PREFERENCIAS", nullable=true)
	private String preferencias;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Cliente getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}
	public String getPreferencias() {
		return preferencias;
	}
	public void setPreferencias(String preferencias) {
		this.preferencias = preferencias;
	}
	
	
}

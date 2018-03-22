package com.algaworks.gestaofesta.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Karen 19 de mar de 2018
 */
@Entity
public class Convidado implements Serializable {

	private static final long serialVersionUID = -5326055725090862761L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;

	private String nome;

	private Integer quantidadeAcompanhantes;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the quantidadeAcompanhantes
	 */
	public Integer getQuantidadeAcompanhantes() {
		return quantidadeAcompanhantes;
	}

	/**
	 * @param quantidadeAcompanhantes
	 *            the quantidadeAcompanhantes to set
	 */
	public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}

}

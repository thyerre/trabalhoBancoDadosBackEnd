package br.ueg.gestaoEstacionamento.model;

import java.sql.Date;

import javax.persistence.Entity;


@Entity
public class Movimentacao extends AbstractEntity {
	
	private Date entrada;
	private Date saida;
	
	
	public Date getEntrada() {
		return entrada;
	}
	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}
	public Date getSaida() {
		return saida;
	}
	public void setSaida(Date saida) {
		this.saida = saida;
	}
	
	

}

package br.ueg.gestaoEstacionamento.model;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity//
public class Proprietario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_proprietario;
	private long id_pessoa;
	
	public long getId_proprietario() {
		return id_proprietario;
	}
	public long getId_pessoa() {
		return id_pessoa;
	}
	public void setId_proprietario(long id_proprietario) {
		this.id_proprietario = id_proprietario;
	}
	public void setId_pessoa(long id_pessoa) {
		this.id_pessoa = id_pessoa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id_pessoa ^ (id_pessoa >>> 32));
		result = prime * result + (int) (id_proprietario ^ (id_proprietario >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proprietario other = (Proprietario) obj;
		if (id_pessoa != other.id_pessoa)
			return false;
		if (id_proprietario != other.id_proprietario)
			return false;
		return true;
	}
	

}

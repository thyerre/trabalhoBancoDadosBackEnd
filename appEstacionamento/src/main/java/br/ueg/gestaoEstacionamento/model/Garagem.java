package br.ueg.gestaoEstacionamento.model;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity//
public class Garagem implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_garagem;
	private String nome_garagem;
	private long id_endereco;
	private long id_proprietario;
	
	public long getId_garagem() {
		return id_garagem;
	}
	public String getNome_garagem() {
		return nome_garagem;
	}
	public long getId_endereco() {
		return id_endereco;
	}
	public long getId_proprietario() {
		return id_proprietario;
	}
	public void setId_garagem(long id_garagem) {
		this.id_garagem = id_garagem;
	}
	public void setNome_garagem(String nome_garagem) {
		this.nome_garagem = nome_garagem;
	}
	public void setId_endereco(long id_endereco) {
		this.id_endereco = id_endereco;
	}
	public void setId_proprietario(long id_proprietario) {
		this.id_proprietario = id_proprietario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id_endereco ^ (id_endereco >>> 32));
		result = prime * result + (int) (id_garagem ^ (id_garagem >>> 32));
		result = prime * result + (int) (id_proprietario ^ (id_proprietario >>> 32));
		result = prime * result + ((nome_garagem == null) ? 0 : nome_garagem.hashCode());
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
		Garagem other = (Garagem) obj;
		if (id_endereco != other.id_endereco)
			return false;
		if (id_garagem != other.id_garagem)
			return false;
		if (id_proprietario != other.id_proprietario)
			return false;
		if (nome_garagem == null) {
			if (other.nome_garagem != null)
				return false;
		} else if (!nome_garagem.equals(other.nome_garagem))
			return false;
		return true;
	}

	
}

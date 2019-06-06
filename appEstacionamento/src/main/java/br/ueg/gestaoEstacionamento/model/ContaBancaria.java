package br.ueg.gestaoEstacionamento.model;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity//
public class ContaBancaria implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_contabancaria;
	private String nome_banco;
	private String tipo_banco;
	private String num_agencia;
	private String num_conta;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public long getId_contabancaria() {
		return id_contabancaria;
	}
	public String getNome_banco() {
		return nome_banco;
	}
	public String getTipo_banco() {
		return tipo_banco;
	}
	public String getNum_agencia() {
		return num_agencia;
	}
	public String getNum_conta() {
		return num_conta;
	}
	public void setId_contabancaria(long id_contabancaria) {
		this.id_contabancaria = id_contabancaria;
	}
	public void setNome_banco(String nome_banco) {
		this.nome_banco = nome_banco;
	}
	public void setTipo_banco(String tipo_banco) {
		this.tipo_banco = tipo_banco;
	}
	public void setNum_agencia(String num_agencia) {
		this.num_agencia = num_agencia;
	}
	public void setNum_conta(String num_conta) {
		this.num_conta = num_conta;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id_contabancaria ^ (id_contabancaria >>> 32));
		result = prime * result + ((nome_banco == null) ? 0 : nome_banco.hashCode());
		result = prime * result + ((num_agencia == null) ? 0 : num_agencia.hashCode());
		result = prime * result + ((num_conta == null) ? 0 : num_conta.hashCode());
		result = prime * result + ((tipo_banco == null) ? 0 : tipo_banco.hashCode());
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
		ContaBancaria other = (ContaBancaria) obj;
		if (id_contabancaria != other.id_contabancaria)
			return false;
		if (nome_banco == null) {
			if (other.nome_banco != null)
				return false;
		} else if (!nome_banco.equals(other.nome_banco))
			return false;
		if (num_agencia == null) {
			if (other.num_agencia != null)
				return false;
		} else if (!num_agencia.equals(other.num_agencia))
			return false;
		if (num_conta == null) {
			if (other.num_conta != null)
				return false;
		} else if (!num_conta.equals(other.num_conta))
			return false;
		if (tipo_banco == null) {
			if (other.tipo_banco != null)
				return false;
		} else if (!tipo_banco.equals(other.tipo_banco))
			return false;
		return true;
	}
	
	
	

}

package br.ueg.gestaoEstacionamento.model;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity//
public class Vaga implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_vaga;
	private String altura_garagem;
	private String largura_garagem;
	private String valor;
	private String descricao;
	private long id_garagem;
	private long quantidade_vaga;
	
	public long getId_vaga() {
		return id_vaga;
	}
	public String getAltura_garagem() {
		return altura_garagem;
	}
	public String getLargura_garagem() {
		return largura_garagem;
	}
	public String getValor() {
		return valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public long getId_garagem() {
		return id_garagem;
	}
	public long getQuantidade_vaga() {
		return quantidade_vaga;
	}
	public void setId_vaga(long id_vaga) {
		this.id_vaga = id_vaga;
	}
	public void setAltura_garagem(String altura_garagem) {
		this.altura_garagem = altura_garagem;
	}
	public void setLargura_garagem(String largura_garagem) {
		this.largura_garagem = largura_garagem;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setId_garagem(long id_garagem) {
		this.id_garagem = id_garagem;
	}
	public void setQuantidade_vaga(long quantidade_vaga) {
		this.quantidade_vaga = quantidade_vaga;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((altura_garagem == null) ? 0 : altura_garagem.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + (int) (id_garagem ^ (id_garagem >>> 32));
		result = prime * result + (int) (id_vaga ^ (id_vaga >>> 32));
		result = prime * result + ((largura_garagem == null) ? 0 : largura_garagem.hashCode());
		result = prime * result + (int) (quantidade_vaga ^ (quantidade_vaga >>> 32));
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		Vaga other = (Vaga) obj;
		if (altura_garagem == null) {
			if (other.altura_garagem != null)
				return false;
		} else if (!altura_garagem.equals(other.altura_garagem))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id_garagem != other.id_garagem)
			return false;
		if (id_vaga != other.id_vaga)
			return false;
		if (largura_garagem == null) {
			if (other.largura_garagem != null)
				return false;
		} else if (!largura_garagem.equals(other.largura_garagem))
			return false;
		if (quantidade_vaga != other.quantidade_vaga)
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	

}

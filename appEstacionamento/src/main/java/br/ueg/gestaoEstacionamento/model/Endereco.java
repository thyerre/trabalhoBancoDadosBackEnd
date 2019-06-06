package br.ueg.gestaoEstacionamento.model;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity//
public class Endereco implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_endereco;
	private String logradouro;
	private String quadra;
	private String lote;
	private String num_imovel;
	private String bairo;
	private String cidade;
	private String uf;
	private String cep;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public long getId_endereco() {
		return id_endereco;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public String getQuadra() {
		return quadra;
	}
	public String getLote() {
		return lote;
	}
	public String getNum_imovel() {
		return num_imovel;
	}
	public String getBairo() {
		return bairo;
	}
	public String getCidade() {
		return cidade;
	}
	public String getUf() {
		return uf;
	}
	public String getCep() {
		return cep;
	}
	public void setId_endereco(long id_endereco) {
		this.id_endereco = id_endereco;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public void setNum_imovel(String num_imovel) {
		this.num_imovel = num_imovel;
	}
	public void setBairo(String bairo) {
		this.bairo = bairo;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairo == null) ? 0 : bairo.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + (int) (id_endereco ^ (id_endereco >>> 32));
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
		result = prime * result + ((num_imovel == null) ? 0 : num_imovel.hashCode());
		result = prime * result + ((quadra == null) ? 0 : quadra.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
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
		Endereco other = (Endereco) obj;
		if (bairo == null) {
			if (other.bairo != null)
				return false;
		} else if (!bairo.equals(other.bairo))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (id_endereco != other.id_endereco)
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		if (num_imovel == null) {
			if (other.num_imovel != null)
				return false;
		} else if (!num_imovel.equals(other.num_imovel))
			return false;
		if (quadra == null) {
			if (other.quadra != null)
				return false;
		} else if (!quadra.equals(other.quadra))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}
	

}

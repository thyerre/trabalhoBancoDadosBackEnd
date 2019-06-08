package br.ueg.gestaoEstacionamento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class gerenciamento_de_estacionamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_gerenciamento_de_estacionamento;
	private String tempo_usado_saida;
	private String tempo_usado_entrada;
	private String tempo_reservado_saida;
	private String tempo_reservado_entrada;
	private boolean ocupado_desocupado;
	
	@OneToOne
	private Vaga id_vagas;
	
	@OneToOne
	private Motorista id_motorista;
	
	@OneToOne 
	private Veiculo id_veiculo;

	public long getId_gerenciamento_de_estacionamento() {
		return id_gerenciamento_de_estacionamento;
	}

	public void setId_gerenciamento_de_estacionamento(long id_gerenciamento_de_estacionamento) {
		this.id_gerenciamento_de_estacionamento = id_gerenciamento_de_estacionamento;
	}

	public String getTempo_usado_saida() {
		return tempo_usado_saida;
	}

	public void setTempo_usado_saida(String tempo_usado_saida) {
		this.tempo_usado_saida = tempo_usado_saida;
	}

	public String getTempo_usado_entrada() {
		return tempo_usado_entrada;
	}

	public void setTempo_usado_entrada(String tempo_usado_entrada) {
		this.tempo_usado_entrada = tempo_usado_entrada;
	}

	public String getTempo_reservado_saida() {
		return tempo_reservado_saida;
	}

	public void setTempo_reservado_saida(String tempo_reservado_saida) {
		this.tempo_reservado_saida = tempo_reservado_saida;
	}

	public String getTempo_reservado_entrada() {
		return tempo_reservado_entrada;
	}

	public void setTempo_reservado_entrada(String tempo_reservado_entrada) {
		this.tempo_reservado_entrada = tempo_reservado_entrada;
	}

	public boolean isOcupado_desocupado() {
		return ocupado_desocupado;
	}

	public void setOcupado_desocupado(boolean ocupado_desocupado) {
		this.ocupado_desocupado = ocupado_desocupado;
	}

	public Vaga getId_vagas() {
		return id_vagas;
	}

	public void setId_vagas(Vaga id_vagas) {
		this.id_vagas = id_vagas;
	}

	public Motorista getId_motorista() {
		return id_motorista;
	}

	public void setId_motorista(Motorista id_motorista) {
		this.id_motorista = id_motorista;
	}

	public Veiculo getId_veiculo() {
		return id_veiculo;
	}

	public void setId_veiculo(Veiculo id_veiculo) {
		this.id_veiculo = id_veiculo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (int) (id_gerenciamento_de_estacionamento ^ (id_gerenciamento_de_estacionamento >>> 32));
		result = prime * result + ((id_motorista == null) ? 0 : id_motorista.hashCode());
		result = prime * result + ((id_vagas == null) ? 0 : id_vagas.hashCode());
		result = prime * result + ((id_veiculo == null) ? 0 : id_veiculo.hashCode());
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
		gerenciamento_de_estacionamento other = (gerenciamento_de_estacionamento) obj;
		if (id_gerenciamento_de_estacionamento != other.id_gerenciamento_de_estacionamento)
			return false;
		if (id_motorista == null) {
			if (other.id_motorista != null)
				return false;
		} else if (!id_motorista.equals(other.id_motorista))
			return false;
		if (id_vagas == null) {
			if (other.id_vagas != null)
				return false;
		} else if (!id_vagas.equals(other.id_vagas))
			return false;
		if (id_veiculo == null) {
			if (other.id_veiculo != null)
				return false;
		} else if (!id_veiculo.equals(other.id_veiculo))
			return false;
		return true;
	}
	
	
}

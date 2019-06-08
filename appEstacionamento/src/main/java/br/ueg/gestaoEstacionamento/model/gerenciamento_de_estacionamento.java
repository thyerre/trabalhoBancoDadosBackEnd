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
	private String ocupado_desocupado;
	
	@OneToOne
	private Vaga id_vagas;
	
	@OneToOne
	private Motorista id_motorista;
	
	@OneToOne 
	private Veiculo id_veiculo;
}

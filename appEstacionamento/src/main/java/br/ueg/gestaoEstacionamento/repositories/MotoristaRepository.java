package br.ueg.gestaoEstacionamento.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.ueg.gestaoEstacionamento.model.Motorista;

public interface MotoristaRepository extends CrudRepository<Motorista, Long>{
	


}

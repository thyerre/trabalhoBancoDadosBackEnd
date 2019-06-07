package br.ueg.gestaoEstacionamento.repositories;

import org.springframework.data.repository.CrudRepository;

import br.ueg.gestaoEstacionamento.model.Pessoa;


public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

}

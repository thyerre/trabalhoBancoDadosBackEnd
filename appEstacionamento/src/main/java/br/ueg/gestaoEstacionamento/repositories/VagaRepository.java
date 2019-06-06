package br.ueg.gestaoEstacionamento.repositories;


import org.springframework.data.repository.CrudRepository;

import br.ueg.gestaoEstacionamento.model.Vaga;


public interface VagaRepository extends CrudRepository<Vaga, Long>
{

}
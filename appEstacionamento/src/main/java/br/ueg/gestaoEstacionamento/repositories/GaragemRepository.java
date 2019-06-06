package br.ueg.gestaoEstacionamento.repositories;


import org.springframework.data.repository.CrudRepository;

import br.ueg.gestaoEstacionamento.model.Garagem;


public interface GaragemRepository extends CrudRepository<Garagem, Long>
{

}
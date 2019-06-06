package br.ueg.gestaoEstacionamento.repositories;


import org.springframework.data.repository.CrudRepository;

import br.ueg.gestaoEstacionamento.model.Login;


public interface LoginRepository extends CrudRepository<Login, Long>
{

}
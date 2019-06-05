package br.ueg.gestaoEstacionamento.repositories;

import java.util.List;

import br.ueg.gestaoEstacionamento.model.Login;


public interface LoginRepository extends CludRepository<Login, Long>
{
	List<Login> findByName(String name);
}

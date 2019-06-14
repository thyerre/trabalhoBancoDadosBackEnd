package br.ueg.gestaoEstacionamento.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.ueg.gestaoEstacionamento.model.Login;


public interface LoginRepository extends CrudRepository<Login, Long>
{
	@Query("select m from Login m where m.usuario = ?1 and m.senha = ?2")
	List<Login>logar(String usuario,String senha);
}
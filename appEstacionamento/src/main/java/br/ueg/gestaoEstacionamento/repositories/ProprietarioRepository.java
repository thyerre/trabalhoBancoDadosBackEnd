package br.ueg.gestaoEstacionamento.repositories;


import org.springframework.data.repository.CrudRepository;

import br.ueg.gestaoEstacionamento.model.Proprietario;


public interface ProprietarioRepository extends CrudRepository<Proprietario, Long>
{

}
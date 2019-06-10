package br.ueg.gestaoEstacionamento.repositories;

import org.springframework.data.repository.CrudRepository;

import br.ueg.gestaoEstacionamento.model.Gerenciamento;

public interface GerenciamentoRepository extends CrudRepository<Gerenciamento, Long>
{

}

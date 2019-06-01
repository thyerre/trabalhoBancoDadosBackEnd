package br.ueg.gestaoEstacionamento.repositories;

import java.util.List;

import org.hibernate.type.DateType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.ueg.gestaoEstacionamento.model.Movimentacao;



public interface MovimentacaoRepository extends PagingAndSortingRepository<Movimentacao, Long> {

	@Query("select c from Movimentacao c where c.entrada Like %?1%")
	List<Movimentacao> ListByEntrada(DateType entrada);
	
	@Query("select c from Movimentacao c where c.saida Like %?1%")
	List<Movimentacao> ListBySaida(DateType saida);
}

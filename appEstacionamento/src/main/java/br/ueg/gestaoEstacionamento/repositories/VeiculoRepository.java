package br.ueg.gestaoEstacionamento.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.ueg.gestaoEstacionamento.model.Veiculo;



public interface VeiculoRepository extends PagingAndSortingRepository<Veiculo, Long> {

	@Query("select c from Veiculo c where c.placa Like %?1%")
	List<Veiculo> ListByPlaca(String placa);
}

package br.ueg.gestaoEstacionamento.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.ueg.gestaoEstacionamento.model.Login;



public interface LoginRepository extends PagingAndSortingRepository<Login, Long> {
	

}

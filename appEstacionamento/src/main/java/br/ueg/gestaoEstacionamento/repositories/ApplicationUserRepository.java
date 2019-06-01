package br.ueg.gestaoEstacionamento.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.ueg.gestaoEstacionamento.model.ApplicationUser;



public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {
	
	@Query("select c from ApplicationUser c where c.email Like %?1%")
	List<ApplicationUser> ListByEmail(String email);

}

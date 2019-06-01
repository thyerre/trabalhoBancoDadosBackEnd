package br.ueg.gestaoEstacionamento.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.ueg.gestaoEstacionamento.model.ApplicationUser;
import br.ueg.gestaoEstacionamento.repositories.ApplicationUserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("vi/user")
@Api("controller p/ operações com usuario")
public class ApplicationUserController {
	
	
	@Autowired
	private ApplicationUserRepository applicationUserRepository;
	
	@GetMapping
	@ApiOperation(value="Listar todos os usuarios")
	public ResponseEntity<?> list(){
		return new ResponseEntity<>(applicationUserRepository.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/applicationuser")
	public ResponseEntity<?> saveApplicationUser(@RequestBody ApplicationUser applicationuser) {
		return new ResponseEntity<>(applicationUserRepository.save(applicationuser), HttpStatus.OK);
	}
	
	@PutMapping("/applicationuser")
	public ResponseEntity<?>UpdateApplicationUser(@RequestBody ApplicationUser applicationuser){
		return new ResponseEntity<>(applicationUserRepository.save(applicationuser),HttpStatus.OK);
	}
	
	@DeleteMapping("applicationuser/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void remover(@PathVariable Long id) {
		applicationUserRepository.deleteById(id);
	}
		

}

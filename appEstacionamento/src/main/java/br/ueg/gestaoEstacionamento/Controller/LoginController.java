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
import org.springframework.web.bind.annotation.RestController;

import br.ueg.gestaoEstacionamento.model.Login;
import br.ueg.gestaoEstacionamento.repositories.LoginRepository;

@RestController
@RequestMapping("v1/login")
public class LoginController {
	
	@Autowired
	private LoginRepository loginRepository;
	
	@GetMapping
	public ResponseEntity<?>listAll()
	{
		return new ResponseEntity<>(loginRepository.findAll(),HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id_login}")
	public ResponseEntity<?> getLoginById(@PathVariable("id_login") Long id_login)
	{
		return new ResponseEntity(this.loginRepository.findById(id_login), HttpStatus.OK);
//		Login login = loginRepository.findById(id_login);
//		if (login == null)
//			return new ResponseEntity<>("login not found", HttpStatus.NOT_FOUND);
//		return new ResponseEntity<>(login,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Login login) 
	{
 		return new ResponseEntity<>(loginRepository.save(login), HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id_login}")
	public ResponseEntity<Login> deleteEntity (@PathVariable long id_login){
//		loginRepository.delete(id_login);
//		return new ResponseEntity<>(HttpStatus.OK);
		this.loginRepository.deleteById(id_login);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PutMapping("/{id_login}")
	public ResponseEntity<?>UpdateVeiculo(@RequestBody Login login)
	{
		this.loginRepository.save(login);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}

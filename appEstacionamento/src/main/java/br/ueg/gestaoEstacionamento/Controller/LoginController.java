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
import org.springframework.web.bind.annotation.RestController;

import br.ueg.gestaoEstacionamento.model.Login;
import br.ueg.gestaoEstacionamento.repositories.LoginRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("v1/login")
@Api("controller p/ operações com Login")
public class LoginController {
	
	private final LoginRepository loginRepository;
	
	@Autowired
	public  LoginController(LoginRepository loginRepository)
	{
		this.loginRepository = loginRepository;
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value="Listar todos os Usuarios")
	public ResponseEntity<?> listAll()
	{
		return new ResponseEntity<>(loginRepository.findAll(),HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id_login}")
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value="nserir todos os Usuarios")
	public ResponseEntity<?> getLoginById(@PathVariable("id_login") Long id_login)
	{
		Login login = loginRepository.findOne(id_login);
		if (login == null)
			return new ResponseEntity<>("login not found", HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(login,HttpStatus.OK);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value="gravavos dados no repositorio")
	public ResponseEntity<?> save(@RequestBody Login login) 
	{
 		return new ResponseEntity<>(loginRepository.save(login), HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id_login}")
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value="deleta os dados do repositorio")
	public ResponseEntity<Login> deleteEntity (@PathVariable long id_login){
		loginRepository.delete(id_login);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/{id_login}")
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value="mudar os dados do repositorio")
	public ResponseEntity<?>UpdateVeiculo(@RequestBody Login login)
	{
		loginRepository.save(login);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}

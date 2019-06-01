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
import org.springframework.web.bind.annotation.ResponseStatus;

import br.ueg.gestaoEstacionamento.model.Login;
import br.ueg.gestaoEstacionamento.repositories.LoginRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("controller p/ operações com Login")
public class LoginController {
	@Autowired
	private LoginRepository loginRepository;
	
	@GetMapping
	@ApiOperation(value="Listar todos os Usuarios")
	public ResponseEntity<?> list(){
		return new ResponseEntity<>(loginRepository.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> saveVeiculo(@RequestBody Login login) {
		return new ResponseEntity<>(loginRepository.save(login), HttpStatus.OK);
	}
	
	@PutMapping("/login")
	public ResponseEntity<?>UpdateVeiculo(@RequestBody Login id_login){
		return new ResponseEntity<>(loginRepository.save(id_login),HttpStatus.OK);
	}
	
	@DeleteMapping("login/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void remover(@PathVariable Long id) {
		loginRepository.deleteById(id);
	}

}

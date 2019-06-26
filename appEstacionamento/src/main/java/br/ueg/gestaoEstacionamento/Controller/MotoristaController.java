package br.ueg.gestaoEstacionamento.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ueg.gestaoEstacionamento.model.Motorista;
import br.ueg.gestaoEstacionamento.repositories.MotoristaRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("v3/Motorista")

public class MotoristaController {
	
	private MotoristaRepository motoristaRepository;
	
	@GetMapping
	public ResponseEntity<?>listAllGaragem()
	{
		return new ResponseEntity<>(motoristaRepository.findAll(),HttpStatus.OK);
	}
	@GetMapping(path = "{/id_motorista}")
	public ResponseEntity<?> getMotoristaById(@PathVariable("id_motorista") Long id_motorista)
	{
		if (id_motorista == null)
			return new ResponseEntity<>("login not found", HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(this.motoristaRepository.findById(id_motorista), HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<?> saveMotorista(@RequestBody Motorista motorista) 
	{
		return new ResponseEntity<>(motoristaRepository.save(motorista), HttpStatus.OK);
	}
	@DeleteMapping(path = "/{id_motorista}")
	public ResponseEntity<Motorista> deleteMotorista (@PathVariable long id_motorista){

		motoristaRepository.deleteById(id_motorista);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@PutMapping("/{id_garagem}")
	public ResponseEntity<?>UpdateGaragem(@RequestBody Motorista motorista)
	{
		this.motoristaRepository.save(motorista);			
		return new ResponseEntity<>(HttpStatus.OK);
	}
			
}



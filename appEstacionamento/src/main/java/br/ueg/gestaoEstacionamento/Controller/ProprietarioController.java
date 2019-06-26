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

import br.ueg.gestaoEstacionamento.model.Proprietario;
import br.ueg.gestaoEstacionamento.repositories.ProprietarioRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("v4/Proprietario")
public class ProprietarioController {

	private ProprietarioRepository proprietarioRepository;

	@GetMapping
	public ResponseEntity<?>listAllGaragem()
	{
		return new ResponseEntity<>(proprietarioRepository.findAll(),HttpStatus.OK);
	}
	@GetMapping(path = "{/id_proprietario}")
	public ResponseEntity<?> getProprietarioById(@PathVariable("id_proprietario") Long id_proprietario)
	{
		if (id_proprietario == null)
			return new ResponseEntity<>("login not found", HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(this.proprietarioRepository.findById(id_proprietario), HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<?> saveProprietario(@RequestBody Proprietario proprietario) 
	{
		return new ResponseEntity<>(proprietarioRepository.save(proprietario), HttpStatus.OK);
	}
	@DeleteMapping(path = "/{id_proprietario}")
	public ResponseEntity<Proprietario> deleteProprietario (@PathVariable long id_proprietario){

		proprietarioRepository.deleteById(id_proprietario);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@PutMapping("/{id_proprietario}")
	public ResponseEntity<?>UpdateProprietario(@RequestBody Proprietario proprietario)
	{
		this.proprietarioRepository.save(proprietario);			
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

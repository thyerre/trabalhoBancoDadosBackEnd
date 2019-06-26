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

import br.ueg.gestaoEstacionamento.model.Garagem;
import br.ueg.gestaoEstacionamento.repositories.GaragemRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("v1/Garagem")
public class GaragemController {

	private GaragemRepository garagemRepository;

	@GetMapping
	public ResponseEntity<?>listAllGaragem()
	{
		return new ResponseEntity<>(garagemRepository.findAll(),HttpStatus.OK);
	}
	@GetMapping(path = "{/id_garagem}")
	public ResponseEntity<?> getGaragemById(@PathVariable("id_garagem") Long id_garagem)
	{
		if (id_garagem == null)
			return new ResponseEntity<>("login not found", HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(this.garagemRepository.findById(id_garagem), HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<?> saveGaragem(@RequestBody Garagem Garagem) 
	{
		return new ResponseEntity<>(garagemRepository.save(Garagem), HttpStatus.OK);
	}
	@DeleteMapping(path = "/{id_garagem}")
	public ResponseEntity<Garagem> deleteGaragem (@PathVariable long id_garagem){

		garagemRepository.deleteById(id_garagem);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@PutMapping("/{id_garagem}")
	public ResponseEntity<?>UpdateGaragem(@RequestBody Garagem garagem)
	{
		this.garagemRepository.save(garagem);			
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

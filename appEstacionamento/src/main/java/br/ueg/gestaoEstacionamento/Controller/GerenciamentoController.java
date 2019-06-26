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

import br.ueg.gestaoEstacionamento.model.Gerenciamento;
import br.ueg.gestaoEstacionamento.repositories.GerenciamentoRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("v5/Gerenciamento")
public class GerenciamentoController {

	private GerenciamentoRepository gerenciamentoRepository;

	@GetMapping
	public ResponseEntity<?>listAllGerenciamento()
	{
		return new ResponseEntity<>(gerenciamentoRepository.findAll(),HttpStatus.OK);
	}
	@GetMapping(path = "{/id_gerenciamento}")
	public ResponseEntity<?> getGerenciamentoById(@PathVariable("id_gerenciamento") Long id_gerenciamento)
	{
		if (id_gerenciamento == null)
			return new ResponseEntity<>("login not found", HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(this.gerenciamentoRepository.findById(id_gerenciamento), HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<?> saveGerenciamento(@RequestBody Gerenciamento gerenciamento) 
	{
		return new ResponseEntity<>(gerenciamentoRepository.save(gerenciamento), HttpStatus.OK);
	}
	@DeleteMapping(path = "/{id_gerenciamento}")
	public ResponseEntity<Gerenciamento> deleteGerenciamento (@PathVariable long id_gerenciamento){

		gerenciamentoRepository.deleteById(id_gerenciamento);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@PutMapping("/{id_gerenciamento}")
	public ResponseEntity<?>UpdateGerenciamento(@RequestBody Gerenciamento gerenciamento)
	{
		this.gerenciamentoRepository.save(gerenciamento);			
		return new ResponseEntity<>(HttpStatus.OK);
	}
}

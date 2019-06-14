package br.ueg.gestaoEstacionamento.Controller;

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

import br.ueg.gestaoEstacionamento.model.Garagem;
import br.ueg.gestaoEstacionamento.model.Login;
import br.ueg.gestaoEstacionamento.repositories.GaragemRepository;

@RestController
@RequestMapping("v1/Garagem")
public class GaragemController {

		private GaragemRepository GaragemRepository;
		
		@GetMapping
		public ResponseEntity<?>listAll()
		{
			return new ResponseEntity<>(GaragemRepository.findAll(),HttpStatus.OK);
		}
		@GetMapping(path = "{/id_garagem}")
		public ResponseEntity<?> getLoginById(@PathVariable("id_garagem") Long id_garagem)
		{
			return new ResponseEntity(this.GaragemRepository.findById(id_garagem), HttpStatus.OK);
//			Login login = loginRepository.findById(id_login);
//			if (login == null)
//				return new ResponseEntity<>("login not found", HttpStatus.NOT_FOUND);
//			return new ResponseEntity<>(login,HttpStatus.OK);
		}
		@PostMapping
		public ResponseEntity<?> save(@RequestBody Garagem Garagem) 
		{
	 		return new ResponseEntity<>(GaragemRepository.save(Garagem), HttpStatus.OK);
		}
		@DeleteMapping(path = "/{id_garagem}")
		public ResponseEntity<Garagem> deleteEntity (@PathVariable long id_garagem){

			this.GaragemRepository.deleteById(id_garagem);
			return new ResponseEntity(HttpStatus.OK);
		}
		
		@PutMapping("/{id_garagem}")
		public ResponseEntity<?>UpdateVeiculo(@RequestBody Garagem Garagem)
		{
			this.GaragemRepository.save(Garagem);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		
}
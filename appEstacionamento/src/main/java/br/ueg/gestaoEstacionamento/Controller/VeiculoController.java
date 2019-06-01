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

import br.ueg.gestaoEstacionamento.model.Veiculo;
import br.ueg.gestaoEstacionamento.repositories.VeiculoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("controller p/ operações com Veiculos")
public class VeiculoController {
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@GetMapping
	@ApiOperation(value="Listar todos os Veiculos")
	public ResponseEntity<?> list(){
		return new ResponseEntity<>(veiculoRepository.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/veiculo")
	public ResponseEntity<?> saveVeiculo(@RequestBody Veiculo veiculo) {
		return new ResponseEntity<>(veiculoRepository.save(veiculo), HttpStatus.OK);
	}
	
	@PutMapping("/veiculo")
	public ResponseEntity<?>UpdateVeiculo(@RequestBody Veiculo veiculo){
		return new ResponseEntity<>(veiculoRepository.save(veiculo),HttpStatus.OK);
	}
	
	@DeleteMapping("applicationuser/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void remover(@PathVariable Long id) {
		veiculoRepository.deleteById(id);
	}

}

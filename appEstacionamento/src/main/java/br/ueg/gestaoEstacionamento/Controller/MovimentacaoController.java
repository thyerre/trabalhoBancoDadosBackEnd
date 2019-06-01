package br.ueg.gestaoEstacionamento.Controller;

import org.hibernate.type.DateType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.ueg.gestaoEstacionamento.model.Movimentacao;
import br.ueg.gestaoEstacionamento.repositories.MovimentacaoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("controller p/ operações com Entrada e Saida")
public class MovimentacaoController {
	@Autowired
	private MovimentacaoRepository movimentacaoRepository;
	
	@PostMapping("/movimentacao")
	public ResponseEntity<?> saveMovimentacao(@RequestBody Movimentacao movimentacao) {
		return new ResponseEntity<>(movimentacaoRepository.save(movimentacao), HttpStatus.OK);
	}
	@PutMapping("/movimentacao")
	public ResponseEntity<?>UpdateMovimentacao(@RequestBody Movimentacao movimentacao){
		return new ResponseEntity<>(movimentacaoRepository.save(movimentacao),HttpStatus.OK);
	}
	@DeleteMapping("movimentacao/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void remover(@PathVariable Long id) {
		movimentacaoRepository.deleteById(id);
		
	}
	@GetMapping("/movimentacaoentrada")
	@ApiOperation(value="Listar todos as Entrada")
	public ResponseEntity<?> ListMovimentacaoEntrada(@RequestParam(value="entrada", defaultValue="")DateType entrada){														
		return new ResponseEntity<>(movimentacaoRepository.ListByEntrada(entrada) , HttpStatus.OK);
	}
	
	@GetMapping("/movimentacaosaida")
	@ApiOperation(value="Listar todos as Saidas")
	public ResponseEntity<?> ListMovimentacaoSaida(@RequestParam(value="saida", defaultValue="")DateType saida){														
		return new ResponseEntity<>(movimentacaoRepository.ListBySaida(saida) , HttpStatus.OK);
	}
	
	@GetMapping("movimentacao/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id){
		return new ResponseEntity<Object>(movimentacaoRepository.findById(id), HttpStatus.OK);
	}

}

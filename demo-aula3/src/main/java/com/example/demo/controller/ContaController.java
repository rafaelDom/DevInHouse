package com.example.demo.controller;

import com.example.demo.model.Conta;
import com.example.demo.service.CrudService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/conta")
public class ContaController {

	private CrudService<Conta> ContaService;

	public ContaController(CrudService<Conta> ContaService) {
		this.ContaService = ContaService;
	}

	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Conta>> getContas() {
		return ResponseEntity.ok().body(ContaService.get());
	}

	@GetMapping(produces = "application/json", path = "/{id}")
	public ResponseEntity<Conta> getConta(@PathVariable int id) {
		return ResponseEntity.ok().body(ContaService.findById(id));
	}

	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<String> postConta(@RequestBody @Validated Conta conta2, UriComponentsBuilder uriBuilder) {
		URI uri = uriBuilder.path("/conta/").buildAndExpand(conta2).toUri();
		System.out.println(uri);

		return ResponseEntity.created(uri).body("\"id:\"" + ContaService.save(conta2));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Conta> putConta(@PathVariable int id, @RequestBody @Validated Conta conta2,
			UriComponentsBuilder uriBuilder) {
		URI uri = uriBuilder.path("/conta/{id}").buildAndExpand(id).toUri();
		System.out.println(uri);
		return ResponseEntity.ok().body(ContaService.update(id, conta2));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Conta> deletetConta(@PathVariable int id, UriComponentsBuilder uriBuilder) {
		URI uri = uriBuilder.path("/conta/{id}").buildAndExpand(id).toUri();
		System.out.println(uri);
		return ResponseEntity.ok().body(ContaService.delete(id));
	}

	@PutMapping("/sacar")
	public ResponseEntity<Object> sacarConta(@RequestParam int id, @RequestParam Double valor,
			@RequestBody @Validated Conta conta2, UriComponentsBuilder uriBuilder) {
		URI uri = uriBuilder.path("/sacar/").buildAndExpand(id).toUri();
		System.out.println(uri);
		if(conta2.sacar(valor)) {
			return ResponseEntity.ok().body(ContaService.update(id, conta2));
		}
		
		return ResponseEntity.ok().body("Não foi possível realizar o Saque!!!");

	}
	
	@PutMapping("/depositar")
	public ResponseEntity<Object> depositarConta(@RequestParam int id, @RequestParam Double valor,
			@RequestBody @Validated Conta conta2, UriComponentsBuilder uriBuilder) {
		URI uri = uriBuilder.path("/sacar/").buildAndExpand(id).toUri();
		System.out.println(uri);
		if(conta2.depositar(valor)) {
			return ResponseEntity.ok().body(ContaService.update(id, conta2));
		}
		
		return ResponseEntity.ok().body("Não foi possível realizar o deposito!!!");

	}
}

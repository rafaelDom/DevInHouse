package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.service.CrudService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private CrudService<Cliente> ClienteService;

    public ClienteController(CrudService<Cliente> ClienteService) {
        this.ClienteService = ClienteService;
    }

    @GetMapping(produces="application/json")
    public ResponseEntity<List<Cliente>> getClientes(){
        return ResponseEntity.ok().body(ClienteService.get());
    }

    @GetMapping(produces="application/json",path = "/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable int id){
        return ResponseEntity.ok().body(ClienteService.findById(id));
    }

    @PostMapping(produces="application/json", consumes = "application/json")
    public ResponseEntity<String> postCliente(
            @RequestBody @Validated Cliente Cliente2,
            UriComponentsBuilder uriBuilder
    ){
        URI uri = uriBuilder.path("/Cliente/").buildAndExpand(Cliente2).toUri();
        System.out.println(uri);
        if(ClienteService.validateCPF(Cliente2.getcpf())) {
        	return  ResponseEntity.created(uri).body("\"id:\"" + ClienteService.save(Cliente2));
        }
        return  ResponseEntity.created(uri).body("\"id:\"" + "Falha ao salvar cliente, CPF inválido!!!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> putCliente(
            @PathVariable int id, @RequestBody @Validated Cliente Cliente2,
            UriComponentsBuilder uriBuilder
    ){
        URI uri = uriBuilder.path("/Cliente/{id}").buildAndExpand(id).toUri();
        System.out.println(uri);
        return  ResponseEntity.ok().body( ClienteService.update(id, Cliente2));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> deletetCliente(@PathVariable int id, UriComponentsBuilder uriBuilder){
        URI uri = uriBuilder.path("/Cliente/{id}").buildAndExpand(id).toUri();
        System.out.println(uri);
        return  ResponseEntity.ok().body(ClienteService.delete(id));
    }
}

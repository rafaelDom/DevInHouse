package com.example.demo.repository;

import com.example.demo.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository implements CrudRepository<Cliente>{

    private final List<Cliente> lista = new ArrayList<>();

    @Override
    public List<Cliente> findAll() {
        return lista;
    }

    @Override
    public Cliente findById(int id) {
       return lista.get(id);
    }

    @Override
    public int add(Cliente curso2) {
        this.lista.add(curso2);
        return this.lista.indexOf(curso2);
    }

    @Override
    public Cliente update(int id, Cliente curso2) {
        return this.lista.set(id, curso2);
    }

    @Override
    public Cliente delete(int id) {
        return this.lista.remove(id);
    }

}

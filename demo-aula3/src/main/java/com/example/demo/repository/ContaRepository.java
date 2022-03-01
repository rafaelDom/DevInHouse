package com.example.demo.repository;

import com.example.demo.model.Conta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContaRepository implements CrudRepository<Conta>{

    private final List<Conta> lista = new ArrayList<>();

    @Override
    public List<Conta> findAll() {
        return lista;
    }

    @Override
    public Conta findById(int id) {
       return lista.get(id);
    }

    @Override
    public int add(Conta curso2) {
        this.lista.add(curso2);
        return this.lista.indexOf(curso2);
    }

    @Override
    public Conta update(int id, Conta curso2) {
        return this.lista.set(id, curso2);
    }

    @Override
    public Conta delete(int id) {
        return this.lista.remove(id);
    }
}

package com.example.demo.service;

import com.example.demo.model.Cliente;
import com.example.demo.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements CrudService<Cliente> {
    
    private CrudRepository<Cliente> ClienteRepository;
    private ValidatorCPFService validatorCPFService;

    public ClienteService(CrudRepository<Cliente> ClienteRepository) {
        this.ClienteRepository = ClienteRepository;
    }

    @Override
    public List<Cliente> get() {
        return ClienteRepository.findAll();
    }

    @Override
    public Cliente findById(int id) {
        return ClienteRepository.findById(id);
    }

    @Override
    public int save(Cliente Cliente2) {
        return ClienteRepository.add(Cliente2);
    }

    @Override
    public Cliente update(int id, Cliente Cliente2) {
        return ClienteRepository.update(id, Cliente2);
    }

    @Override
    public Cliente delete(int id) {
        return ClienteRepository.delete(id);
    }

	@Override
	public boolean validateCPF(String cpf) {
		validatorCPFService = new ValidatorCPFService();
		if(validatorCPFService.isCPF(cpf)){
			return true;
		}
		return false;
	}
}

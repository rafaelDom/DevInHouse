package com.example.demo.service;

import com.example.demo.model.Conta;
import com.example.demo.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService implements CrudService<Conta> {
    
    private CrudRepository<Conta> ContaRepository;
    private ValidatorCPFService validatorCPFService;

    public ContaService(CrudRepository<Conta> ContaRepository) {
        this.ContaRepository = ContaRepository;
    }

    @Override
    public List<Conta> get() {
        return ContaRepository.findAll();
    }

    @Override
    public Conta findById(int id) {
        return ContaRepository.findById(id);
    }

    @Override
    public int save(Conta Conta2) {
        return ContaRepository.add(Conta2);
    }

    @Override
    public Conta update(int id, Conta Conta2) {
        return ContaRepository.update(id, Conta2);
    }

    @Override
    public Conta delete(int id) {
        return ContaRepository.delete(id);
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

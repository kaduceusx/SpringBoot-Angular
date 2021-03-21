package com.bolsaDeIdeas.springBoot.backend.apiRest.models.services;

import java.util.List;
import com.bolsaDeIdeas.springBoot.backend.apiRest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	

}

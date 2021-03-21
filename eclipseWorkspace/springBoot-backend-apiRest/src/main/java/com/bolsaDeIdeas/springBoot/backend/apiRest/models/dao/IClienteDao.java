package com.bolsaDeIdeas.springBoot.backend.apiRest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsaDeIdeas.springBoot.backend.apiRest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}

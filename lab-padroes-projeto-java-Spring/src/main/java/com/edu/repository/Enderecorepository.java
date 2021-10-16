package com.edu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.model.Endereco;

@Repository
public interface Enderecorepository extends CrudRepository<Endereco, String> {

}

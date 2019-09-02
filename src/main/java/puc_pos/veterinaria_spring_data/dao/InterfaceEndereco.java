package puc_pos.veterinaria_spring_data.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import puc_pos.veterinaria_spring_data.model.Endereco;

@Repository
public interface InterfaceEndereco extends CrudRepository<Endereco, Long>{

}

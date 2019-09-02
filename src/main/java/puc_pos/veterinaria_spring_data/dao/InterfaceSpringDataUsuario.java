package puc_pos.veterinaria_spring_data.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import puc_pos.veterinaria_spring_data.model.Usuario;

@Repository
public interface InterfaceSpringDataUsuario extends CrudRepository<Usuario, Long> {
	
	
	@Query(value=" select u from Usuario u where u.sobreNome like %?1% ")
	public List<Usuario> buscaPorNome(String sobreNome);
	
	
	@Query(value = " select u from Usuario u where u.nome = :parametronome")
	public Usuario buscaNomeParametro(@Param("parametronome") String parametronome);
	
	
	@Modifying
	@Transactional
	@Query(" delete from Usuario u where u.nome = ?1")
	public void deletePorNome(String nome);
	
	@Modifying
	@Transactional
	@Query("update Usuario u set u.email = ?1 where u.nome = ?2")
	public void updatePorCPF(String email, String nome);
	
	
}

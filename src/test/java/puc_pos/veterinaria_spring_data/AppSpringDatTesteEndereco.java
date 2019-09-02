package puc_pos.veterinaria_spring_data;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import puc_pos.veterinaria_spring_data.dao.InterfaceEndereco;
import puc_pos.veterinaria_spring_data.dao.InterfaceSpringDataUsuario;
import puc_pos.veterinaria_spring_data.model.Endereco;
import puc_pos.veterinaria_spring_data.model.Usuario;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring-config.xml"})
public class AppSpringDatTesteEndereco {

	@Autowired
	private InterfaceEndereco interfaceEndereco;
	
	@Autowired
	private InterfaceSpringDataUsuario interfaceSpringDataUsuario;
	
	@Test
	public void TesteInsertEndereco() {
		
	Optional<Usuario> usuario = interfaceSpringDataUsuario.findById(8L);
		
		Endereco endereco = new Endereco();
		endereco.setBairro("Campo Grande");
		endereco.setCEP("23013-390");
		endereco.setCidade("Rio de Janeiro");
		endereco.setComplemento("Rua Padre Luis Riou");
		endereco.setEstado("Rio de Janeiro");
		endereco.setNumero(19);
		endereco.setRua("Coronel Ancoras");
		endereco.setUsuario(usuario.get());
		
		interfaceEndereco.save(endereco);
	}
	
}

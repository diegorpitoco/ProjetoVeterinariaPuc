package puc_pos.veterinaria_spring_data;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import puc_pos.veterinaria_spring_data.dao.InterfaceSpringDataUsuario;
import puc_pos.veterinaria_spring_data.model.Endereco;
import puc_pos.veterinaria_spring_data.model.Usuario;
import util.Util;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring-config.xml" })
public class AppSpringDataTest {

	@Autowired
	private InterfaceSpringDataUsuario interfaceSpringDataUsuario;

	@Test
	public void testInsert() {
		Usuario usuario = new Usuario();
		usuario.setNome("Alex");
		usuario.setSobrenome("Pitoco");
		usuario.setCpf("058.078.577-71");
		usuario.setRg("20.699.560-7");
		usuario.setEmail("diegopitoco@gmail.com");
		Calendar calendar = new GregorianCalendar(1987, 8, 17);
		usuario.setDtNascomento(Util.getSqlDate(calendar.getTime()));
		usuario.setTelefone("(21) 96430-8191");

		interfaceSpringDataUsuario.save(usuario);

		System.out.println("Usuário cadastrados :" + interfaceSpringDataUsuario.count());
	}

	@Test
	public void testeConsulta() {
		Optional<Usuario> usuario = interfaceSpringDataUsuario.findById(2L);

		System.out.println("Nome: " + usuario.get().getNome());
		System.out.println(usuario.get().getSobrenome());
		System.out.println(usuario.get().getDtNascomento());
		System.out.println(usuario.get().getCpf());
		System.out.println(usuario.get().getEmail());
		System.out.println(usuario.get().getTelefone());
		System.out.println(usuario.get().getRg());
		
		for (Endereco endereco : usuario.get().getEnderecos()) {
			System.out.println(endereco.getBairro());
			System.out.println(endereco.getCidade());
			System.out.println(endereco.getCEP());
			System.out.println("");
			System.out.println("--------------------");
			
		}
	}

	@Test
	public void testeConsultaTodos() {

		Iterable<Usuario> lista = interfaceSpringDataUsuario.findAll();

		for (Usuario usuario : lista) {
			System.out.println(usuario.getIdUsuario());
			System.out.println("Nome: " + usuario.getNome());
			System.out.println(usuario.getSobrenome());
			System.out.println(usuario.getDtNascomento());
			System.out.println(usuario.getCpf());
			System.out.println(usuario.getEmail());
			System.out.println(usuario.getTelefone());
			System.out.println(usuario.getRg());
			System.out.println();
			System.out.println("_____________________________________");
		}

	}
	
	@Test
	public void testUpdate() {
		Optional<Usuario> usuario = interfaceSpringDataUsuario.findById(5L);
		
		Usuario update = usuario.get();
		
		update.setNome("Teste Update 2");
		interfaceSpringDataUsuario.save(update);
		System.out.println("Nome alterado com Sucesso");
	}
	
	@Test
	public void testDelete() {
		Optional<Usuario> usuario = interfaceSpringDataUsuario.findById(5L);
		
		interfaceSpringDataUsuario.delete(usuario.get());
		
		// tambem pode ser deste jeito
		/*interfaceSpringDataUsuario.deleteById(5L);*/		
	}
	
	
	@Test
	public void testeConsultaSobreNome() {
		List<Usuario> lista = interfaceSpringDataUsuario.buscaPorNome("Pitoco");
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.getIdUsuario());
			System.out.println("Nome: " + usuario.getNome());
			System.out.println(usuario.getSobrenome());
			System.out.println(usuario.getDtNascomento());
			System.out.println(usuario.getCpf());
			System.out.println(usuario.getEmail());
			System.out.println(usuario.getTelefone());
			System.out.println(usuario.getRg());
			System.out.println();
			System.out.println("_____________________________________");
		}
	
	}
	
	@Test
	public void testeConsultaNomeParametro() {
		
		Usuario usuario = interfaceSpringDataUsuario.buscaNomeParametro("Alex");
		
		
			System.out.println(usuario.getIdUsuario());
			System.out.println("Nome: " + usuario.getNome());
			System.out.println(usuario.getSobrenome());
			System.out.println(usuario.getDtNascomento());
			System.out.println(usuario.getCpf());
			System.out.println(usuario.getEmail());
			System.out.println(usuario.getTelefone());
			System.out.println(usuario.getRg());
			System.out.println();
			System.out.println("_____________________________________");
		
	}
	
	@Test
	public void testeDeletePorNome() {
		interfaceSpringDataUsuario.deletePorNome("Alex");
	}
	
	@Test
	public void updateEmailPorNome() {
		interfaceSpringDataUsuario.updatePorCPF("davipitoco@gmail.com", "Davi");
	}
}

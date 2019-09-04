package manageBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import puc_pos.veterinaria_spring_data.dao.InterfaceSpringDataUsuario;
import puc_pos.veterinaria_spring_data.model.Usuario;

@ManagedBean(name="usuarioManageBean")
@ViewScoped
public class UsuarioManageBean {
	
	private Usuario usuario = new Usuario();
	private InterfaceSpringDataUsuario interfaceSpringDataUsuario = new InterfaceSpringDataUsuario() {
		
		@Override
		public <S extends Usuario> Iterable<S> saveAll(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends Usuario> S save(S entity) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Optional<Usuario> findById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Iterable<Usuario> findAllById(Iterable<Long> ids) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Iterable<Usuario> findAll() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean existsById(Long id) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAll(Iterable<? extends Usuario> entities) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(Usuario entity) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public void updatePorCPF(String email, String nome) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deletePorNome(String nome) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public List<Usuario> buscaPorNome(String sobreNome) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Usuario buscaNomeParametro(String parametronome) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	public List<Usuario> getList() {
		return list;
	}

	private List<Usuario> list = new ArrayList<Usuario>();
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	

}

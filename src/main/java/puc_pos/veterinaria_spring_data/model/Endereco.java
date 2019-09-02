package puc_pos.veterinaria_spring_data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idEndereco;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private String cidade;
	private String complemento;

	@Column(nullable = false)
	private String  estado;
	private int	numero;
	@Column(nullable = false)
	private String rua;
	@Column(nullable = false)
	private String CEP;
	
	
	@ManyToOne()
	private Usuario usuario;


	public long getIdEndereco() {
		return idEndereco;
	}


	public void setIdEndereco(long idEndereco) {
		this.idEndereco = idEndereco;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getCEP() {
		return CEP;
	}


	public void setCEP(String cEP) {
		CEP = cEP;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}

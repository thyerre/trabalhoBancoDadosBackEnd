package br.ueg.gestaoEstacionamento.model;



import javax.persistence.Entity;


@Entity//
public class Login extends AbstractEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String tipo;
	private String usuario;
	private String senha;
	private boolean status;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}

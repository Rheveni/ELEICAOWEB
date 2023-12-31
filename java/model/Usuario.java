package model;

public class Usuario {
	private int idUsuario;
	private String login;
	private String senha;
	private String perfil;

	public Usuario() {

	}

	public Usuario(int idUsuario, String login, String senha, String perfil) {
		super();
		this.idUsuario = idUsuario;
		this.login = login;
		this.senha = senha;
		this.perfil = perfil;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

}

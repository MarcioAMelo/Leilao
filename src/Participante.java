
public class Participante {
	private String nome;
	private String login;
	private String senha;
	private String email;

	// getters setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	private String endereco;
	private String telefone;

	public void login() {

		int login;
	}

	public void regPart() {
		int regPart;

	}

	// constructor
	public Participante(String nome, String login, String senha, String email, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
	}
}



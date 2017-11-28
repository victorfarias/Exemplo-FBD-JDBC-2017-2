package ufc.quixada.ContatoEntity;

public class Contato {
	private int id;
	private String nome;
	private String email;
	private String endereco;
	
	public Contato(
			int id, String nome, String email, String endereco) {
		this.id= id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}
	public Contato() {}
	
	public int getId() {
		return this.id;
	}
	public String getNome() {
		return this.nome;
	}
	public void setId(int id) {
		this.id = id;
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
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}

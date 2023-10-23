package br.com.fiap.beans;

public class Cliente {
	private String nome;
	private String telefone;
	private String email;
	private String sexo;
	private int idade;
	private Endereco endereco;
	private Acessibilidade acessbilidade;
	private Empresa empresa;
	
	// Construtor vazio
	public Cliente() {
		super();
	}
	
	// Construtor cheio
	public Cliente(String nome, String telefone, String email, String sexo, int idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.sexo = sexo;
		this.idade = idade;
	}

	
	// Getters
	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getSexo() {
		return sexo;
	}

	public int getIdade() {
		return idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Acessibilidade getAcessbilidade() {
		return acessbilidade;
	}

	public Empresa getEmpresa() {
		return empresa;
	}
	
	
	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setAcessbilidade(Acessibilidade acessbilidade) {
		this.acessbilidade = acessbilidade;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
}

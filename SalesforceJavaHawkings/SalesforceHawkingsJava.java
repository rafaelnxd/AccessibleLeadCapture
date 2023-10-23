package br.com.fiap.beans;

public class Endereco {
	private String pais;
	private String cidade;
	private String estado;
	private String cep;
	private String rua;
	private int numero;
	
	// Construtor vazio
	public Endereco() {
		super();
	}
	
	// Construtor cheio
	public Endereco(String pais, String cidade, String estado, String cep, String rua, int numero) {
		super();
		this.pais = pais;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.rua = rua;
		this.numero = numero;
	}
	
	// Getters
	public String getPais() {
		return pais;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public String getCep() {
		return cep;
	}
	public String getRua() {
		return rua;
	}
	public int getNumero() {
		return numero;
	}
	
	// Setters
	public void setPais(String pais) {
		this.pais = pais;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}

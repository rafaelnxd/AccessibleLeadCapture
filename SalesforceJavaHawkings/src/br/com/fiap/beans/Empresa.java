package br.com.fiap.beans;

public class Empresa {
	private String nomeEmpresa;
	private String segmento;
	private int tamanhoEmpresa;
	private String cargo;
	private String pais;
	private String estado;
	
	// Construtor vazio
	public Empresa() {
		super();
	}
	
	// Construtor cheio
	public Empresa(String nomeEmpresa, String segmento, int tamanhoEmpresa, String cargo, String pais, String estado) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.segmento = segmento;
		this.tamanhoEmpresa = tamanhoEmpresa;
		this.cargo = cargo;
		this.pais = pais;
		this.estado = estado;
	}
	
	// Getters
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public String getSegmento() {
		return segmento;
	}
	public int getTamanhoEmpresa() {
		return tamanhoEmpresa;
	}
	public String getCargo() {
		return cargo;
	}
	public String getPais() {
		return pais;
	}
	public String getEstado() {
		return estado;
	}
	
	// Setters
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public void setTamanhoEmpresa(int tamanhoEmpresa) {
		this.tamanhoEmpresa = tamanhoEmpresa;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}

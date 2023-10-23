package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Acessibilidade;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;


public class ProjetoAnalisePublico {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Vamos iniciar uma pesquisa de acessibilidade");
		// Instanciando objetos / Entradas
		Cliente objCliente = new Cliente(
				JOptionPane.showInputDialog("Digite seu nome: "), 
				JOptionPane.showInputDialog("Digite seu telefone: "), 
				JOptionPane.showInputDialog("Digite seu email: "), 
				JOptionPane.showInputDialog("Digite seu sexo: "), 
				Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "))
				);
		
		Empresa objEmpresa = new Empresa(
				JOptionPane.showInputDialog("Digite o nome da sua Empresa: "), 
				JOptionPane.showInputDialog("Digite o Segmento da sua Empresa: "), 
				Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho aproximado de funcionários(Ex: 10 / 500 / 10.000): ")),
				JOptionPane.showInputDialog("Informe seu cargo: "), 
				JOptionPane.showInputDialog("Informe em qual pais a empresa está localizada: "),
				JOptionPane.showInputDialog("Em qual estado você trabalha: ")
				);
		
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Digite seu Pais: "),
				JOptionPane.showInputDialog("Digite seu Estado: "), 
				JOptionPane.showInputDialog("Digite seu Cidade: "), 
				JOptionPane.showInputDialog("Digite seu CEP: "), 
				JOptionPane.showInputDialog("Digite o nome da rua: "), 
				Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da casa: "))
				);
		
		// Definindo os valores para a variavel
		objCliente.setEndereco(objEndereco);
		objCliente.setEmpresa(objEmpresa);
		
		// Puxando a classe de acessibilidade
		Acessibilidade minhaClasse = new Acessibilidade();
		minhaClasse.perguntarDeficiencia();
		String tipoDeficiencia = minhaClasse.getTipoDeficiencia();
        
        System.out.println(
        		"\n\n--- INFORMACOES DO CLIENTE ---" + 
        		"\nNome: " + objCliente.getNome() + 
        		"\nEmail: " + objCliente.getEmail() + 
        		"\nTelefone: " + objCliente.getTelefone() + 
           		"\nIdade" + objCliente.getIdade()+ 
        		"\nSexo: " + objCliente.getSexo() +
        		"\n\n--- DADOS DA EMPRESA ---" + 
        		"\nNome da empresa: " + objCliente.getEmpresa().getNomeEmpresa() + 
        		"\nSegmento da empresa: " + objCliente.getEmpresa().getSegmento() + 
        		"\nCargo do funcionário: " + objCliente.getEmpresa().getCargo()+ 
           		"\nTamanho da empresa: " + objCliente.getEmpresa().getTamanhoEmpresa() + "Funcionários" + 
        		"\nPais da empresa: " + objCliente.getEmpresa().getPais() + 
        		"\nEstado em que trabalha: " + objCliente.getEmpresa().getEstado() + 
        		"\n\n--- ENDERECO FUNCIONARIO ---" + 
        		"\nPais: " + objCliente.getEndereco().getPais() + 
        		"\nEstado: " + objCliente.getEndereco().getEstado() + 
        		"\nCidade: " + objCliente.getEndereco().getCidade() + 
        		"\nCEP: " + objCliente.getEndereco().getCep() + 
        		"\nRua: " + objCliente.getEndereco().getRua() + 
        		"\nNumero: " + objCliente.getEndereco().getNumero() + 
        		"\n\n--- Acessibilidade ---" + 
        		"Tipo de deficiencia: " + tipoDeficiencia
        		);
		 
	}
}

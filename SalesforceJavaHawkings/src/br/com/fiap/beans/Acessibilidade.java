package br.com.fiap.beans;
import javax.swing.JOptionPane;

public class Acessibilidade {
	private String tipoDeficiencia;

    public void perguntarDeficiencia() {
        String resposta = JOptionPane.showInputDialog("Você possui alguma deficiência? (1 para sim, 2 para não):");
        
        tipoDeficiencia = "";

        if (resposta != null && !resposta.isEmpty()) {
            int escolha = Integer.parseInt(resposta);
            if (escolha == 1) {
                String[] opcoesDeficiencia = {"Deficiencia visual", "Deficiencia auditiva", "Outra deficiencia"};
                resposta = (String) JOptionPane.showInputDialog(null, "Selecione o tipo de deficiencia:", "Escolha sua deficiencia", JOptionPane.QUESTION_MESSAGE, null, opcoesDeficiencia, opcoesDeficiencia[0]);
                
                if (resposta != null) {
                    tipoDeficiencia = resposta;
                } else {
                    tipoDeficiencia = "Nenhuma deficiência selecionada.";
                }
            } else if (escolha == 2) {
                tipoDeficiencia = "Nenhuma deficiencia";
            } else {
                tipoDeficiencia = "Opção invalida. Por favor, selecione 1 para sim ou 2 para não.";
            }
        } else {
            tipoDeficiencia = "Resposta invalida. Por favor, selecione 1 para sim ou 2 para não.";
        }

        JOptionPane.showMessageDialog(null, "Sua deficiencia é: " + tipoDeficiencia);
    }

    public String getTipoDeficiencia() {
        return tipoDeficiencia;
    }
}

package Conversor;

import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.text.DecimalFormat;

public class Conversor {
    public static void main(String[] args) {
        double valorEmReal, valorConvertido;
        String[] opcoes = { "Real para Dólar", "Dólar para Real", "Real para Peso Chileno", "Peso Chileno para Real",
                "Real para Euro", "Euro para Real", "Real para Libra", "Libra para Real", "Real para Peso Argentino",
                "Peso Argentino para Real", "Real para Yuan", "Yuan para Real", "Celsius para Fahrenheit",
                "Fahrenheit para Celsius", "Sair" };

        do {
            JComboBox<String> comboOpcoes = new JComboBox<>(opcoes);
            JPanel panel = new JPanel();
            panel.add(new JLabel("Escolha a conversão:"));
            panel.add(comboOpcoes);

            int result = JOptionPane.showOptionDialog(null, panel, "Conversor de Moedas e Temperaturas",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

            if (result == JOptionPane.CLOSED_OPTION || result == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "Encerrando o programa. Até mais!");
                break;
            }

            int opcao = comboOpcoes.getSelectedIndex();
            DecimalFormat decimalFormat = new DecimalFormat("#0.00"); // Formato para duas casas decimais
            switch (opcao) {
                case 0:
                    valorEmReal = obterValorNumerico("Digite o valor em Real:");
                    valorConvertido = valorEmReal / 4.75; // Cotação do Dólar em relação ao Real
                    JOptionPane.showMessageDialog(null, "Valor em Dólar: " + decimalFormat.format(valorConvertido));
                    break;
                case 1:
                    valorEmReal = obterValorNumerico("Digite o valor em Dólar:");
                    valorConvertido = valorEmReal * 4.75; // Cotação do Dólar em relação ao Real
                    JOptionPane.showMessageDialog(null, "Valor em Real: " + decimalFormat.format(valorConvertido));
                    break;
                case 2:
                    valorEmReal = obterValorNumerico("Digite o valor em Real:");
                    valorConvertido = valorEmReal / 0.0057; // Cotação do Peso Chileno em relação ao Real
                    JOptionPane.showMessageDialog(null, "Valor em Peso Chileno: " + decimalFormat.format(valorConvertido));
                    break;
                case 3:
                    valorEmReal = obterValorNumerico("Digite o valor em Peso Chileno:");
                    valorConvertido = valorEmReal * 0.0057; // Cotação do Peso Chileno em relação ao Real
                    JOptionPane.showMessageDialog(null, "Valor em Real: " + decimalFormat.format(valorConvertido));
                    break;
                case 4:
                    valorEmReal = obterValorNumerico("Digite o valor em Real:");
                    valorConvertido = valorEmReal / 5.21; // Cotação do Euro em relação ao Real
                    JOptionPane.showMessageDialog(null, "Valor em Euro: " + decimalFormat.format(valorConvertido));
                    break;
                case 5:
                    valorEmReal = obterValorNumerico("Digite o valor em Euro:");
                    valorConvertido = valorEmReal * 5.21; // Cotação do Euro em relação ao Real
                    JOptionPane.showMessageDialog(null, "Valor em Real: " + decimalFormat.format(valorConvertido));
                    break;
                case 6:
                    valorEmReal = obterValorNumerico("Digite o valor em Real:");
                    valorConvertido = valorEmReal / 6.07; // Cotação da Libra em relação ao Real
                    JOptionPane.showMessageDialog(null, "Valor em Libra: " + decimalFormat.format(valorConvertido));
                    break;
                case 7:
                    valorEmReal = obterValorNumerico("Digite o valor em Libra:");
                    valorConvertido = valorEmReal * 6.07; // Cotação da Libra em relação ao Real
                    JOptionPane.showMessageDialog(null, "Valor em Real: " + decimalFormat.format(valorConvertido));
                    break;
                case 8:
                    valorEmReal = obterValorNumerico("Digite o valor em Real:");
                    valorConvertido = valorEmReal / 0.017; // Cotação do Peso Argentino em relação ao Real
                    JOptionPane.showMessageDialog(null, "Valor em Peso Argentino: " + decimalFormat.format(valorConvertido));
                    break;
                case 9:
                    valorEmReal = obterValorNumerico("Digite o valor em Peso Argentino:");
                    valorConvertido = valorEmReal * 0.017; // Cotação do Peso Argentino em relação ao Real
                    JOptionPane.showMessageDialog(null, "Valor em Real: " + decimalFormat.format(valorConvertido));
                    break;
                case 10:
                    valorEmReal = obterValorNumerico("Digite o valor em Real:");
                    valorConvertido = valorEmReal / 0.67; // Cotação do Yuan em relação ao Real
                    JOptionPane.showMessageDialog(null, "Valor em Yuan: " + decimalFormat.format(valorConvertido));
                    break;
                case 11:
                    valorEmReal = obterValorNumerico("Digite o valor em Yuan:");
                    valorConvertido = valorEmReal * 0.67; // Cotação do Yuan em relação ao Real
                    JOptionPane.showMessageDialog(null, "Valor em Real: " + decimalFormat.format(valorConvertido));
                    break;
                case 12:
                    valorEmReal = obterValorNumerico("Digite o valor em Celsius:");
                    valorConvertido = (valorEmReal * 9 / 5) + 32; // Celsius para Fahrenheit
                    JOptionPane.showMessageDialog(null, "Valor em Fahrenheit: " + decimalFormat.format(valorConvertido));
                    break;
                case 13:
                    valorEmReal = obterValorNumerico("Digite o valor em Fahrenheit:");
                    valorConvertido = (valorEmReal - 32) * 5 / 9; // Fahrenheit para Celsius
                    JOptionPane.showMessageDialog(null, "Valor em Celsius: " + decimalFormat.format(valorConvertido));
                    break;
                case 14:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa. Até mais!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Digite novamente.");
                    break;
            }
        } while (true);
    }

    // Função para obter um valor numérico válido da entrada do usuário
    private static double obterValorNumerico(String mensagem) {
        double valor;
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensagem);
                if (input == null) {
                    return 0; // Se o usuário cancelar, retorna 0
                }
                valor = Double.parseDouble(input);
                break; // Sai do loop se a conversão for bem-sucedida
            } catch (NumberFormatException e) {
                // Exibe mensagem de erro caso não seja possível converter para número
                JOptionPane.showMessageDialog(null, "Valor inválido. Digite apenas números.", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        return valor;
    }
}


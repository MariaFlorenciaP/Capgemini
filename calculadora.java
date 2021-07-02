
package calculadora;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double investimento;
        System.out.print("Digite o valor do investimento: ");
        investimento = entrada.nextDouble();

        Double visualizaOriginal = investimento * 30;
        Double contadorVisualizacoes = visualizaOriginal;

        for (int i = 0; i <= 3; i++) {

            Double pessoasClicam = visualizaOriginal * 0.12;
            Double pessoasCompartilham = pessoasClicam * 0.15;
            Double visualizacoesCompartilhadas = pessoasCompartilham * 40;
            contadorVisualizacoes += visualizacoesCompartilhadas;

        }
        int total = (int) Math.round(contadorVisualizacoes);
        System.out.println("A quantidade aproximada de pessoas que visualizaram o anúncio é: " + total);

    }

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atividade74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        List<Double> notas = new ArrayList<>();

        System.out.println("=== SISTEMA DE LEITURA DE NOTAS ===");
        System.out.println("Digite as notas. Para encerrar, digite -1.\n");

       
        while (true) {
            System.out.print("Digite uma nota: ");
            String entrada = sc.nextLine().trim().replace(',', '.');

            try {
                double valor = Double.parseDouble(entrada);
                if (valor == -1) break; 
                notas.add(valor);       
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite um número válido.");
            }
        }

        System.out.println("\n===== RESULTADOS =====");

      
        System.out.println("Quantidade de notas informadas: " + notas.size());

        
        System.out.print("Notas na ordem informada: ");
        for (double n : notas) System.out.print(n + " ");

        
        System.out.println("\n\nNotas na ordem inversa:");
        List<Double> invertida = new ArrayList<>(notas);
        Collections.reverse(invertida);
        for (double n : invertida) System.out.println(n);

        
        double soma = 0;
        for (double n : notas) soma += n;
        double media = notas.isEmpty() ? 0 : soma / notas.size(); 
        System.out.println("\nSoma dos valores: " + soma);
        System.out.println("Média das notas: " + media);

       
        int acimaMedia = 0;
        for (double n : notas) if (n > media) acimaMedia++;
        System.out.println("Quantidade de valores acima da média: " + acimaMedia);

        
        int abaixoDeSete = 0;
        for (double n : notas) if (n < 7) abaixoDeSete++;
        System.out.println("Quantidade de valores abaixo de 7: " + abaixoDeSete);

        
        System.out.println("\nFim do programa. Obrigado por utilizar!");

        sc.close();
    }
}
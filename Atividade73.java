import java.util.*;

public class Atividade73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        List<String> perguntas = Arrays.asList(
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        );

        int respostasPositivas = 0; 

        System.out.println("===== INTERROGATÓRIO SOBRE O CRIME =====");

       
        for (String p : perguntas) {
            while (true) {
                System.out.print(p + " (S/N): ");
                String resp = sc.nextLine().trim().toUpperCase();

                
                if (resp.equals("S")) {
                    respostasPositivas++;
                    break;
                } else if (resp.equals("N")) {
                    break;
                } else {
                    System.out.println("Resposta inválida! Digite apenas 'S' para sim ou 'N' para não.");
                }
            }
        }

       
        String classificacao;
        if (respostasPositivas == 2) classificacao = "Suspeita";
        else if (respostasPositivas >= 3 && respostasPositivas <= 4) classificacao = "Cúmplice";
        else if (respostasPositivas == 5) classificacao = "Assassino";
        else classificacao = "Inocente";

        System.out.println("\n===== RESULTADO FINAL =====");
        System.out.println("Respostas positivas: " + respostasPositivas);
        System.out.println("Classificação: " + classificacao);

        sc.close();
    }
}
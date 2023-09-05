import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //declaração dos pesos
        float p1 = 0.5f, p2 = 0.3f, p3 = 0.2f;

        System.out.println("- Calculo da Média -");

        // entrada do valor das notas
        System.out.println("Nota 1: ");
        float n1 = input.nextFloat();

        System.out.println("Nota 2: ");
        float n2 = input.nextFloat();

        System.out.println("Nota 3: ");
        float n3 = input.nextFloat();

        // calculo da média
        float media = ((n1 * p1) + (n2 * p2) + (n3 * p3));

        System.out.println("Faltas: ");
        float faltas = input.nextFloat();

        //processamento
        if((media >= 6) && (faltas <= 18)){ // se media for maior do que 6  e faltas menores do que 18 = "Aprovado";
            System.out.println("Aprovado!");
            System.out.println("Média " + media);
        } else if (media <= 6 && faltas >= 18) { //se média menor que 6 e maior que 18 = "Reprovado";
            System.out.println("Reprovado por média e falta!");
            System.out.println("Faltas: " + faltas);
            System.out.println("Média: " + media);
        } else if (faltas >= 18) { // se faltas maior do que 18 = "Reprovado por falta";
            System.out.println("Reprovado por falta!");
            System.out.println("Faltas: " + faltas);
        }
        else { // se média menor que 6 "Reprovado por nota". - O que sobrou é o que é, Almeida Fernando.
            System.out.println("Reprovado por nota!");
            System.out.println("Média " + media);
        }

    }
}

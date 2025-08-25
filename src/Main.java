import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nivel = 0;
        int maxTentativas = 5;

    while (true) {
        try {

            System.out.println("-");
            System.out.println("Escolha a dificuldade: ");
            System.out.println("1- Fácil (10 tentativas)");
            System.out.println("2- Médio (5 tentativas)");
            System.out.println("3- Difícil (3 tentativas)");

            nivel = sc.nextInt();

            maxTentativas = switch (nivel) {
                case 1 -> 10;
                case 2 -> 5;
                case 3 -> 3;
                default -> 5;
            };

            break;
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Digite apenas números de 1 a 100.");
            System.out.println("x.x");
            sc.next();
        }
    }

        JogoAdivinhcao jogo = new JogoAdivinhcao(maxTentativas);

        boolean fim = false;
        while (!fim){
          try {
              System.out.println("-------------------------");
              System.out.println("Digite seu palpite (1 - 100): ");
              int palpite = sc.nextInt();

              if (palpite < 1 || palpite > 100) {
                  System.out.println("Por favor, digite um numero entre 1 e 100!");
                  continue;
              }

              fim = jogo.jogar(palpite);

          } catch (InputMismatchException e){
              System.out.println("Entrada inválida! Digite apenas números");
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
              sc.next();
          }
        }
        sc.close();
    }
}

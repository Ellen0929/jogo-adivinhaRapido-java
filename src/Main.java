import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        JogoAdivinhcao jogo = new JogoAdivinhcao();

        boolean fim = false;
        while (!fim){
            System.out.println("-------------------------");
            System.out.println("Digite seu palpite (1 - 100): ");
            int palpite = sc.nextInt();
            fim = jogo.jogar(palpite);
        }
        sc.close();
    }
}

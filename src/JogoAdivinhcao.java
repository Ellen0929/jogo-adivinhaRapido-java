import java.util.Random;

public class JogoAdivinhcao {
    private int numeroSecreto;
    private int tentativas;

    public JogoAdivinhcao() {
        Random random= new Random();
        this.numeroSecreto = random.nextInt(100) + 1;
        this.tentativas = 5;
    }

    public boolean jogar(int palpite){
        tentativas --;

        if (palpite == numeroSecreto){
            System.out.println("__>>>>>>>>>><<<<<<<<<<__");
            System.out.println("Parabéns, você acertou!");
            return true;
        }else if(palpite < numeroSecreto){
            System.out.println("O número é MAIOR! o.o ");
        }else {
            System.out.println("O número é MENOR -.-' ");
        }

        if (tentativas == 0){
            System.out.println("__>>>>>>>>>><<<<<<<<<<__");
            System.out.println("GAME OVER! O número era " + numeroSecreto);
            return true;
        }

        System.out.println("Tentativas restantes: " + tentativas);
        return false;
    }
}

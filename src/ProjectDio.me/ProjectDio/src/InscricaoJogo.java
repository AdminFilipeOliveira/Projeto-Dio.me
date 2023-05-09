import java.util.Scanner;

public class InscricaoJogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do jogo: ");
        String nomeJogo = scan.nextLine();
        Jogo jogo = new Jogo(nomeJogo);

        System.out.print("Digite o número de jogadores que deseja inscrever: ");
        int numJogadores = scan.nextInt();


        for (int i = 1; i <= numJogadores; i++) {
            System.out.print("Digite o nome do jogador " + i + ": ");
            String nomeJogador = scan.next();

            System.out.print("Digite o email do jogador " + i + ": ");
            String emailJogador = scan.next();

            System.out.print("O jogador " + nomeJogador + " é profissional (S/N)? ");
            String resposta = scan.next();
            if (resposta.equalsIgnoreCase("S")) {
                System.out.print("Digite o nome da equipe do jogador " + nomeJogador + ": ");
                String equipeJogador = scan.next();
                jogo.adicionarJogador(new JogadorProfissional(nomeJogador, emailJogador, equipeJogador));
            } else {
                System.out.print("Digite o nome da equipe do jogador " + nomeJogador + ": ");
                String equipeAmatur = scan.next();
                jogo.adicionarJogador(new JogadorAmador(nomeJogador, emailJogador, equipeAmatur));
            }
        }

        jogo.jogar();
    }
}

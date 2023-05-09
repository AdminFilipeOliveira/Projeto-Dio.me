import java.util.ArrayList;
import java.util.List;

class Jogo {
    private String nome;
    private List<Jogador> jogadores;

    public Jogo(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void jogar() {
        System.out.println("Bem vindos ao jogo " + nome + "boa sorte para as equipes!!!");
        for (Jogador jogador : jogadores) {
            jogador.jogar();
        }
    }
}
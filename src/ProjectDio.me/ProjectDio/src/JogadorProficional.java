class JogadorProfissional extends Jogador {
    private String equipe;

    public JogadorProfissional(String nome, String email, String equipe) {
        super(nome, email);
        this.equipe = equipe;
    }

    public String getEquipe() {
        return equipe;
    }

    public void jogar() {
        System.out.println("O jogador profissional " + nome + " da equipe " + equipe + " está jogar.");
    }
}

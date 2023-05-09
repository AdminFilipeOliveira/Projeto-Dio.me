class JogadorAmador extends Jogador {
    private String equipeAmatur;
    public JogadorAmador(String nome, String email, String equipeAmatur) {
        super(nome, email);
        this.equipeAmatur = equipeAmatur;
    }
    public String getEquipe() {
        return equipeAmatur;
    }
    public void jogar() {
        System.out.println("O jogador amador " + nome + " da equipe " + equipeAmatur + " está jogar!.");
    }
}
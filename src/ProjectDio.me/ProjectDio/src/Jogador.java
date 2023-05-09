abstract class Jogador {
    protected String nome;
    protected String email;

    public Jogador(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public abstract void jogar();
}
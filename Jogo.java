package abstrato;

public abstract class Jogo {
    private final String nome;
    private final int nJogadores;

    public Jogo(String nome, int nJogadores) {
        this.nome = nome;
        this.nJogadores = nJogadores;
    }

    // Método abstrato
    public abstract void iniciar();

    public abstract void regras();

    // Método concreto
    @Override
    public String toString() {
        return "Nome: " + nome + ", Jogadores: " + nJogadores;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getNJogadores() {
        return nJogadores;
    }
}

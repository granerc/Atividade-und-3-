package abstrato;

public class JogoTabuleiro extends Jogo {
    private final String tipoTabuleiro;

    public JogoTabuleiro(String nome, int nJogadores, String tipoTabuleiro) {
        super(nome, nJogadores);
        this.tipoTabuleiro = tipoTabuleiro;
    }

    @Override
    public void iniciar() {
        System.out.println("Jogo: " + getNome());
    }

    @Override
    public void regras() {
        System.out.println("Cada jogador deve mover suas peças");
    }

    // Getter
    public String getTipoTabuleiro() {
        return tipoTabuleiro;
    }
}

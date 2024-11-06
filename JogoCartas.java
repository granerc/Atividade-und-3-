package abstrato;

public class JogoCartas extends Jogo {
    private final String tipoBaralho;

    public JogoCartas(String nome, int nJogadores, String tipoBaralho) {
        super(nome, nJogadores);
        this.tipoBaralho = tipoBaralho;
    }

    @Override
    public void iniciar() {
        System.out.println("Jogo de cartas: " + getNome());
    }

    @Override
    public void regras() {
        System.out.println("Cada jogador deve jogar uma carta por vez");
    }

    // Getter
    public String getTipoBaralho() {
        return tipoBaralho;
    }
}

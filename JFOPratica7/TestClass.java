package JFOPratica7;

public class TestClass {
    public static void main(String[] args) {
        // Instanciando cartões
        Cartao cartao1 = new Cartao(1);
        Cartao cartao2 = new Cartao(2);

        // Carregando créditos nos cartões
        cartao1.adicionarCredito(20.0);
        cartao2.adicionarCredito(30.0);

        // Criando jogos
        Jogo jogo1 = new Jogo(5);
        Jogo jogo2 = new Jogo(10);

        // Jogando com os cartões
        int ticketsGanhos1 = jogo1.jogar(cartao1);
        int ticketsGanhos2 = jogo2.jogar(cartao2);

        // Transferindo créditos e tíquetes
        Terminal terminal = new Terminal(cartao1, new Premio[]{
                new Premio("Prêmio 1", 10, 5),
                new Premio("Prêmio 2", 20, 3),
                new Premio("Prêmio 3", 30, 1)
        });

        terminal.transferirCreditos(cartao2, 10.0);
        terminal.trocarPremio(terminal.premios[0]);

        // Verificando saldos dos cartões
        terminal.verificarSaldos();
    }
}

package JFOPratica7;

public class Jogo {
    private int creditosNecessarios;
    private int numTickets;

    public Jogo(int creditosNecessarios) {
        this.creditosNecessarios = creditosNecessarios;
    }

    public int getCreditosNecessarios() {
        return creditosNecessarios;
    }

    public int jogar(Cartao cartao) {
        if (cartao.getSaldoCredito() >= creditosNecessarios) {
            cartao.deduzirCredito(creditosNecessarios);
            numTickets = (int) (Math.random() * 100);
            cartao.adicionarTickets(numTickets);
            return numTickets;
        } else {
            System.out.println("Créditos insuficientes para jogar.");
            return 0;
        }
    }
}
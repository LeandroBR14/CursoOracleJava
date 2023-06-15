package JFOPratica7;

public class Terminal {
    private Cartao cartao;
    protected Premio[] premios;

    public Terminal(Cartao cartao, Premio[] premios) {
        this.cartao = cartao;
        this.premios = premios;
    }

    public void adicionarCredito(double valor) {
        cartao.adicionarCredito(valor);
        System.out.println("Crédito adicionado ao cartão " + cartao.getNumeroCartao() + ": $" + valor);
        System.out.println("Saldo atual de crédito: $" + cartao.getSaldoCredito());
    }

    public void verificarSaldos() {
        System.out.println("Saldo do cartão " + cartao.getNumeroCartao() + ":");
        System.out.println("Crédito: $" + cartao.getSaldoCredito());
        System.out.println("Tickets: " + cartao.getSaldoTickets());
    }

    public void transferirCreditos(Cartao outroCartao, double valor) {
        if (cartao.getSaldoCredito() >= valor) {
            cartao.deduzirCredito(valor);
            outroCartao.adicionarCredito(valor);
            System.out.println("Créditos transferidos do cartão " + cartao.getNumeroCartao() +
                    " para o cartão " + outroCartao.getNumeroCartao() + ": $" + valor);
        } else {
            System.out.println("Créditos insuficientes para transferência.");
        }
    }

    public void trocarPremio(Premio premio) {
        if (premio.verificarDisponibilidade()) {
            premio.concederPremio(cartao);
            System.out.println("Saldo atual de tíquetes: " + cartao.getSaldoTickets());
            System.out.println("Quantidade restante do prêmio " + premio.getNome() + ": " +
                    premio.getQuantidadeDisponivel());
        } else {
            System.out.println("Prêmio " + premio.getNome() + " indisponível no momento.");
        }
    }
}
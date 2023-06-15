package JFOPratica7;

public class Cartao {
    private int numeroCartao;
    private double saldoCredito;
    private int saldoTickets;

    public Cartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
        this.saldoCredito = 0.0;
        this.saldoTickets = 0;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public double getSaldoCredito() {
        return saldoCredito;
    }

    public int getSaldoTickets() {
        return saldoTickets;
    }

    public void adicionarCredito(double valor) {
        saldoCredito += valor;
    }

    public void adicionarTickets(int quantidade) {
        saldoTickets += quantidade;
    }

    public void deduzirCredito(double valor) {
        saldoCredito -= valor;
    }

    public void deduzirTickets(int quantidade) {
        saldoTickets -= quantidade;
    }
}






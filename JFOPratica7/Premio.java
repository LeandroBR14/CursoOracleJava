package JFOPratica7;

public class Premio {
    private String nome;
    private int ticketsNecessarios;
    private int quantidadeDisponivel;

    public Premio(String nome, int ticketsNecessarios, int quantidadeDisponivel) {
        this.nome = nome;
        this.ticketsNecessarios = ticketsNecessarios;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public int getTicketsNecessarios() {
        return ticketsNecessarios;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public boolean verificarDisponibilidade() {
        return quantidadeDisponivel > 0;
    }

    public void concederPremio(Cartao cartao) {
        if (cartao.getSaldoTickets() >= ticketsNecessarios) {
            cartao.deduzirTickets(ticketsNecessarios);
            quantidadeDisponivel--;
            System.out.println("Prêmio " + nome + " concedido!");
        } else {
            System.out.println("Tickets insuficientes para solicitar o prêmio " + nome + ".");
        }
    }
}
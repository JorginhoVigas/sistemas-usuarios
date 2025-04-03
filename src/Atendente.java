class Atendente extends Usuario {
    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.valorEmCaixa = 0.0;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void receberPagamento(double valor) {
        valorEmCaixa += valor;
        System.out.println("Pagamento recebido! Valor em caixa: R$ " + valorEmCaixa);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado com R$ " + valorEmCaixa);
        valorEmCaixa = 0.0;
    }

    public void alterarDados(String nome, String email) {
        setNome(nome);
        setEmail(email);
        System.out.println("Dados alterados com sucesso!");
    }
}
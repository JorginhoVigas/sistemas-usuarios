class Vendedor extends Usuario {
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.quantidadeVendas = 0;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void realizarVenda() {
        quantidadeVendas++;
        System.out.println("Venda realizada! Total de vendas: " + quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("O vendedor realizou " + quantidadeVendas + " vendas.");
    }

    public void alterarDados(String nome, String email) {
        setNome(nome);
        setEmail(email);
        System.out.println("Dados alterados com sucesso!");
    }
}
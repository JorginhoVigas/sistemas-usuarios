public class SistemaUsuarios {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", "carlos@email.com", "1234");
        Vendedor vendedor = new Vendedor("Ana", "ana@email.com", "5678");
        Atendente atendente = new Atendente("João", "joao@email.com", "91011");

        gerente.realizarLogin();
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();
        gerente.realizarLogoff();

        vendedor.realizarLogin();
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        vendedor.realizarLogoff();

        atendente.realizarLogin();
        atendente.receberPagamento(100.50);
        atendente.fecharCaixa();
        atendente.realizarLogoff();
    }
}
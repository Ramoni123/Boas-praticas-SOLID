package OSolid.Exemplo2;

public class PagamentoPix implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
    }
}

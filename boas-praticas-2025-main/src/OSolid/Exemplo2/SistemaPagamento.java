package OSolid.Exemplo2;

public class SistemaPagamento {
    public void realizarPagamento(double valor, PagamentoStrategy metodo) {
        metodo.pagar(valor);
    }
}

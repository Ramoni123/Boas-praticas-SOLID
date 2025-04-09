package SSolid.Exemplo2;

import java.util.Scanner;

public class ProcessadorEncomendas {
    private final ArquivoEncomendaDAO arquivoDAO = new ArquivoEncomendaDAO();

    public void processar() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o ID da encomenda: ");
            String id = sc.nextLine();

            System.out.println("Digite o peso (em kg): ");
            double peso = sc.nextDouble();

            Encomenda encomenda = new Encomenda(id, peso);
            double valorFrete = encomenda.calcularFrete();

            System.out.println("Valor do frete calculado: " + valorFrete);

            arquivoDAO.salvar(encomenda, valorFrete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

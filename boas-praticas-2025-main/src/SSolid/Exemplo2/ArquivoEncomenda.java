package SSolid.Exemplo2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoEncomendaDAO {
    public void salvar(Encomenda encomenda, double valorFrete) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("encomendas.txt", true))) {
            bw.write("ID: " + encomenda.getId() + " - Frete: " + valorFrete);
            bw.newLine();
            System.out.println("Salvo no arquivo encomendas.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

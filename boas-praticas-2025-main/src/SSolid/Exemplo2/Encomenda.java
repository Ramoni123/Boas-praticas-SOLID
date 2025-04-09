package SSolid.Exemplo2;

public class Encomenda {
    private String id;
    private double peso;

    public Encomenda(String id, double peso) {
        this.id = id;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public double getPeso() {
        return peso;
    }

    public double calcularFrete() {
        return peso * 10;
    }
}

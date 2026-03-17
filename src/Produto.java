public class Produto {

    String nome;
    double preco;
    int quantidade;
    int op;

    public double valorTotal() {
        System.out.println("Valor total do produto: R$" + preco * quantidade);
        return preco * quantidade;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Produto menu = new Produto();

        System.out.println("==> Seja bem-vindo <==");
        System.out.println("\n1 - Cadastrar Produto");
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Mostrar Valor Total do Estoque");
        System.out.println("0 - Sair");

        menu.op = input.nextInt();

        switch (menu.op) {
            case 1:
                Produto produto1 = new Produto();

                System.out.print("Produto: ");
                produto1.nome = input.nextLine();

                System.out.print("Preço: R$");
                produto1.preco = input.nextDouble();

                System.out.print("Quantidade: ");
                produto1.quantidade = input.nextInt();

                System.out.println("\nProduto: "+produto1.nome);
                System.out.println("Preço: R$"+produto1.preco);
                System.out.println("Quantidade: "+produto1.quantidade);

                produto1.valorTotal();

            case 2:

        }



    }
}

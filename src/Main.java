import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Produto menu = new Produto();
        do {
            System.out.println("==> Seja bem-vindo <==");
            System.out.println("\n1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Mostrar Valor Total do Estoque");
            System.out.println("0 - Sair");

            menu.op = input.nextInt();

            switch (menu.op) {
                case 1:
                    ArrayList<String> produto = new ArrayList<String>();
                    System.out.print("Digite o nome do produto: ");
                    produto.add(input.next());

                    ArrayList<Double> preco = new ArrayList<Double>();
                    System.out.print("Qual o valor do produto? R$");
                    preco.add(input.nextDouble());

                    ArrayList<Integer> quantidade = new ArrayList<Integer>();
                    System.out.print("Quantidade de produto disponível: ");
                    quantidade.add(input.nextInt());

                case 2:




                case 0:
                    break;
            }
        }while (menu.op != 0);
    }
}

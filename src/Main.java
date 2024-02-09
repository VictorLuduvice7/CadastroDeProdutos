import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // criando MENU
        CadastroProdutos cadastro = new CadastroProdutos();
        Scanner scanner = new Scanner(System.in);

        // iniciando o DoWhile
        int opcao;

        do {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Detalhar produto");
            System.out.println("4 - Excluir produto");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    cadastro.cadastrarProduto(nome, preco); //Chamando o metodo cadastrarProduto e armazenando oq o usuario cadastrou!
                    break;
                case 2:
                    cadastro.listarProdutos(); // pega oq foi cadastrado e coloca na listarProdutos!
                    break;
                case 3:
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Digite o nome do produto: ");
                    nome = scanner.nextLine();
                    cadastro.detalharProduto(nome);
                    break;
                case 4:
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Digite o nome do produto a ser excluído: ");
                    nome = scanner.nextLine();
                    cadastro.excluirProduto(nome);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}

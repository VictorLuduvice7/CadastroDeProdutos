package Visual;
import Controller.CadastroProdutos;
import Controller.CadastroUsuarios;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        CadastroUsuarios cadastroUsuarios = new CadastroUsuarios();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Cadastro de produtos");
            System.out.println("2 - Cadastro de usuários");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Listar usuários");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    cadastroProdutos.cadastrarProduto(nomeProduto, precoProduto);
                    break;
                case 2:
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Digite o nome do usuário: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("Digite o email do usuário: ");
                    String emailUsuario = scanner.nextLine();
                    cadastroUsuarios.cadastrarUsuario(nomeUsuario, emailUsuario);
                    break;
                case 3:
                    cadastroProdutos.listarProdutos();
                    break;
                case 4:
                    cadastroUsuarios.listarUsuarios();
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
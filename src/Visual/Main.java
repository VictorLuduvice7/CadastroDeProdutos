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
            System.out.println("1 - Cadastro de Produtos");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Excluir Produtos");
            System.out.println("4 - Cadastrar Usuários");
            System.out.println("5 - Listar Usuários");
            System.out.println("6 - Excluir Usuários");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // cadastrando produto!
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    cadastroProdutos.cadastrarProduto(nomeProduto, precoProduto);
                    break;
                case 2: // listando produtos !         ( ✔ )
                    cadastroProdutos.listarProdutos();
                    break;
                case 3: // Excluir produtos !     ( X )
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Digite o nome do produto a ser excluído: ");
                    Object nome = scanner.nextLine();
                    cadastroProdutos.excluirProduto((String) nome);
                    break;
                case 4: // Cadastrar Usuário!    ( ✔ )
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Digite o nome do usuário: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("Digite o email do usuário: ");
                    String emailUsuario = scanner.nextLine();
                    cadastroUsuarios.cadastrarUsuario(nomeUsuario, emailUsuario);
                    break;
                case 5: // Listar Usuário!    ( ✔ )
                   cadastroUsuarios.listarUsuarios();
                    break;
                case 6: // Excluir Usuário!     ( ✔ )
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Digite o nome do Usuário a ser excluído: ");
                    nomeUsuario = scanner.nextLine();
                    cadastroUsuarios.excluirUusuario(nomeUsuario);
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
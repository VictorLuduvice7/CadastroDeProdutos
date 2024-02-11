package Controller;

import Models.Produto;

import java.util.ArrayList;

public class CadastroProdutos {
    private ArrayList<Produto> produtos ; //Aqui é declarada uma variável de instância privada chamada produtos
                                          // É uma instância da classe ArrayList que pode armazenar objetos do tipo Produto.

    // Construtor da classe CadastroProdutos
    public CadastroProdutos(){
        produtos = new ArrayList<>();  //nova instância de ArrayList é criada e atribuída à variável produtos.
                                      // Isso cria uma lista vazia que será usada para armazenar objetos do tipo Produto.
    }


    public void cadastrarProduto(String nome, double preco) {
        produtos.add(new Produto(nome, preco));  // adiciona Novo objeto a lista de produtos usando "Add"
        System.out.println("Produto cadastrado com sucesso!");
    }

    // METODO PARA LISTAR OS PRODUTOS
    public Produto listarProdutos() {
        if (produtos.isEmpty()) { // coloquei o metodo isEmpty() para verificar se a lista esta vazia
            System.out.println("Não há produtos cadastrados.");
        } else {
            System.out.println("Produtos cadastrados:");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
        return null;
    }

    /*
        // metodo para detalhar o produto  ( VOU ATIVAR MAIS PARA FRENTE )

    public void detalharProduto(String nomeProduto, Scanner scanner) {

        Produto produto = listarProdutos(nomeProduto);
        if (produto != null) {
            System.out.println("Detalhes do produto:");
            System.out.println(produto);
            System.out.print("Digite informações adicionais sobre o produto: ");
            String informacoesExtras = scanner.nextLine();
            produto.add("(" + informacoesExtras + ")");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
*/

    //Metodo para excluir produtos!
    public void excluirProduto(String nome) {
        for (int i = 0; i < produtos.size(); i++) { // metodo size faz com que reforme o tamanho da lista
            Produto produto = produtos.get(i); //Para cada iteração do loop, ele obtém o produto na posição i da lista de produtos.
            nome = new String();
            if (produto.getNome(nome).equalsIgnoreCase(produto.getNome(nome))) { // equalsIgnoreCase é um metodo que ignora as diferenças de maiúsculas e minúsculas
                produtos.remove(i); // Se o nome do produto atual for igual ao nome fornecido como entrada, o produto é removido da lista na posição i.
                System.out.println("Produto excluído com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}


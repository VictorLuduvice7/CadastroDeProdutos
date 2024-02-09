package Controller;

import Models.Produto;

import java.util.ArrayList;

public class CadastroProdutos {
    private ArrayList<Produto> produtos ; //Aqui é declarada uma variável de instância privada chamada produtos
                                          // É uma instância da classe ArrayList que pode armazenar objetos do tipo Models.Produto.


    // Construtor da classe Controller.CadastroProdutos
    public CadastroProdutos(){
        produtos = new ArrayList<>();  //nova instância de ArrayList é criada e atribuída à variável produtos.
                                      // Isso cria uma lista vazia que será usada para armazenar objetos do tipo Models.Produto.
    }


    public void cadastrarProduto(String nome, double preco) {
        produtos.add(new Produto(nome, preco));  // adiciona Novo objeto a lista de produtos usando "Add"
        System.out.println("Models.Produto cadastrado com sucesso!");
    }

    // METODO PARA LISTAR OS PRODUTOS
    public void listarProdutos() {
        if (produtos.isEmpty()) { // coloquei o metodo isEmpty() para verificar se a lista esta vazia
            System.out.println("Não há produtos cadastrados.");
        } else {
            System.out.println("Produtos cadastrados:");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    // metodo para detalhar o produto
    public void detalharProduto(String nome) {
        boolean encontrado = false; //Aqui é declarada uma variável booleana chamada encontrado e inicializada como false. Esta variável será usada para controlar se o produto com o nome fornecido foi encontrado na lista de produtos.
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Detalhes do produto:");
                System.out.println(produto);
                encontrado = true; //Define-se a variável encontrado como true, indicando que o produto foi encontrado.
                break;
            }
        }
        if (!encontrado) { // caso o produto não for encontrado
            System.out.println("Models.Produto não encontrado.");
        }
    }
    //Metodo para excluir produtos!
    public void excluirProduto(String nome) {
        for (int i = 0; i < produtos.size(); i++) { // metodo size faz com que reforme o tamanho da lista
            Produto produto = produtos.get(i); //Para cada iteração do loop, ele obtém o produto na posição i da lista de produtos.
            if (produto.getNome().equalsIgnoreCase(nome)) { // equalsIgnoreCase é um metodo que ignora as diferenças de maiúsculas e minúsculas
                produtos.remove(i); // Se o nome do produto atual for igual ao nome fornecido como entrada, o produto é removido da lista na posição i.
                System.out.println("Models.Produto excluído com sucesso!");
                return;
            }
        }
        System.out.println("Models.Produto não encontrado.");
    }
}


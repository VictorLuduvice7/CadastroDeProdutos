
// Classes
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // usei o toString para retornar uma representação em string do objeto atual, no caso "nome" e "preco"
    @Override   //usada para indicar que o método está sobrescrevendo um método da classe pai (nesse caso, o método toString() da classe Object).
    public String toString() {
        return "Nome: " + nome + ", Preço: R$" + preco;
    }


    // fzd o metodo para aplicar o desconto
    public void aplicarDesconto(double percentualDesconto) {
        double desconto = preco * (percentualDesconto / 100);
        preco -= desconto;
    }
}

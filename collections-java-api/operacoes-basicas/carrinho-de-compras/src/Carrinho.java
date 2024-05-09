
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtoList;

    public Carrinho() {
        this.produtoList = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco, int quantidade) {
        produtoList.add(new Produto(nome, preco, quantidade));
    }

    public void removerProduto(String nome) {
        List<Produto> produtosParaRemover = new ArrayList<>();
        for (Produto produto : produtoList) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtosParaRemover.add(produto);
            }
        }
        produtoList.removeAll(produtosParaRemover);
    }

    public void calcularValorTotal() {
        double total = 0;
        for (Produto produto : produtoList) {
            double produtoPrecoTotal = produto.getPrecoUnitario() * produto.getQuantidade();
            total += produtoPrecoTotal;
        }
        System.out.println("Total: " + total);
    }

    public void exibirItens() {
        for (Produto produto : produtoList) {
            System.out.println("O nome do produto é " + produto.getNome() + " o preço unitário é de "
                    + produto.getPrecoUnitario() + " e a quantidade em estoque é " + produto.getQuantidade());
        }
    }

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto("Mouse Gamer", 123.5, 20);
        carrinho.adicionarProduto("Teclado Gamer", 305.5, 15);
        carrinho.adicionarProduto("Headset Gamer", 150.5, 10);

        carrinho.calcularValorTotal();
        carrinho.exibirItens();

        carrinho.removerProduto("Mouse Gamer");
        carrinho.exibirItens();
    }
}

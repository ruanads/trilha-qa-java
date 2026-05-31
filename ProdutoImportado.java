public class ProdutoImportado extends Produto implements Tributavel {

    public ProdutoImportado(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    public double calcularImposto() {
        return getPreco() * 0.20;
    }

    
    public static void main(String[] args) {
        ProdutoImportado[] carrinho = {
            new ProdutoImportado("Smartphone", 999.99, 5),
            new ProdutoImportado("Notebook", 1999.99, 3)
        };

        System.out.println("--- RELATÓRIO DE IMPORTAÇÃO (QA) ---");
        for (ProdutoImportado produto : carrinho) {
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Preço: R$ " + produto.getPreco());
            System.out.println("Imposto Total: R$ " + produto.calcularImposto());
        }
    }
}

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isDisponivel() {
        return quantidade > 0;
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Camiseta", 29.99, 10);
        Produto p2 = new Produto("Calça Jeans", 79.99, 0);
        Produto p3 = new Produto("Tênis", -149.99, 5);

        // Regra de Negócio 1: Checar Estoque
    if (p1.isDisponivel()) {
        System.out.println("Status: Disponível para compra.");
    } else {
        System.out.println("Status: Esgotado!");
    }

    // Regra de Negócio 2: O preço é válido? (Aba de QA)
    if (p1.getPreco() <= 0) {
        System.out.println("ALERTA: Preço inválido ou produto de graça!");
    }

    // --- TESTE DO PRODUTO 2 ---
    System.out.println("\n--- Testando: " + p2.getNome() + " ---");
    if (p2.isDisponivel()) {
        System.out.println("Status: Disponível para compra.");
    } else {
        System.out.println("Status: Esgotado!"); // Esse aqui vai cair aqui porque a quantidade é 0
    }

    // --- TESTE DO PRODUTO 3 ---
    System.out.println("\n--- Testando: " + p3.getNome() + " ---");
    if (p3.getPreco() < 0) {
        System.out.println("ALERTA: Bug detectado! Preço negativo: R$" + p3.getPreco());
    }
    }
}

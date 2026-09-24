public class Produto {
    private String nome;
    private double preco;
    private static int totalProdutos;

    public Produto (String nome) {
        this.nome = nome;
        totalProdutos = totalProdutos + 1;
    }

    public static void getTotalProdutos () {
        System.out.println("Total de podutos: " + totalProdutos);
        
    }
}


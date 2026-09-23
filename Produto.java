public class Produto {
    String nome;
    double preco;

    // Criando dois construtores. Um recebe parâmetros,
    // que serão utilizados para preencher os atributos da classe.
    // Caso o usuário não passe nenhum argumento, será chamado
    // o construtor vazio. Esse construtor utiliza this(...)
    // para chamar o outro construtor, passando valores pré-definidos.
    // O outro construtor então utiliza esses valores para preencher
    // os atributos da classe.

    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public Produto () {
        this("Sem nome", 0);
    }
    
}

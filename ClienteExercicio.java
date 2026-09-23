public class ClienteExercicio {

    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    //Método pra validar a alteração de CPF:
    public void mudaCPF(String cpf, int idade) {
        if (idade <= 59) {
            validaCPF(cpf, idade);
        } else {
            this.cpf = cpf;
            System.out.println("CPF alterado com sucesso");
        }
    }

    private void validaCPF(String cpf, int idade) {
        if (idade <= 17) {
            System.out.println("Você é menor de idade");
        } else if(idade >= 18) {
            System.out.println("CPF ATUALIZADO");
        }
    }
}

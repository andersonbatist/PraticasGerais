public class ContaExercicio {

    //Atributos da minha classe:
    private String nomeTitular;
    private String dataAbertura;
    private String agencia;
    private int numero;
    private double saldo;



    //Construtor para as contas
    ContaExercicio (String nomeT, String dataA, String agenciA, int numerO, double saldO) {
        this.nomeTitular = nomeT;
        this.dataAbertura = dataA;
        this.agencia = agenciA;
        this.numero = numerO;
        this.saldo = saldO;
    }

    //Exibir informações da conta
    public void recuperaDadosParaImpressao() {
        System.out.println("INFORMAÇÕES DA CONTA\n=-=-=-=-=-=-=-=-=-=-=-=\nNome do titular: " + nomeTitular + "\nAgência: " + agencia + "\nNúmero da conta: " + numero + "\nSaldo: R$" + saldo + "\nData de Abertura: " + dataAbertura);
    }

    //Métodos de funções da minha classe:
    public void sacar (double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor Inválido para saque nessa conta");
        }
    }

    public void deposito (int numeroConta, double valor) {
        this.saldo += valor;
        System.out.println("Deposito de R$" + valor + " realizado com sucesso!");
    }

    public void calcularRendimento () {
        double valor = this.saldo * 0.1;
        System.out.println("O rendimento mensal foi de R$" + valor);
    }

    public void compararContas (ContaExercicio c1, ContaExercicio c2) {
        if (c1 == c2) {
            System.out.println("Estão apontando para o mesmo objeto");
        } else {
            System.out.println("Não estão apontando para o mesmo objeto");
        }
    }
    
}

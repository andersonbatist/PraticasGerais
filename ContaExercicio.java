public class ContaExercicio {

    //Atributos da minha classe:
    private String nomeTitular;
    private String agencia;
    private int numero;
    private double saldo;
    private Data data;

    public void exdataAbertura (int d, int m, int a) {

        this.data = new Data();

        this.data.dia = d;
        this.data.mes = m;
        this.data.ano = a;

        System.out.printf(
            "Data: %02d/%02d/%04d%n",
            data.dia,
            data.mes,
            data.ano
        ); 
    }



    //Construtor para as contas
    ContaExercicio (String nomeT, int d, int m, int a, String agenciA, int numerO, double saldO) {

        this.data = new Data();

        this.nomeTitular = nomeT;
        this.data.dia = d;
        this.data.mes = m;
        this.data.ano = a;
        this.agencia = agenciA;
        this.numero = numerO;
        this.saldo = saldO;
    }

    //Exibir informações da conta
    public void recuperaDadosParaImpressao() {

    System.out.println("INFORMAÇÕES DA CONTA\n=-=-=-=-=-=-=-=-=-=-=-");

    System.out.printf(
        "Nome do Titular: %s%n" +
        "Agência: %s%n" +
        "Número da Conta: %d%n" +
        "Saldo: R$%.2f%n" +
        "Data de Abertura: %02d/%02d/%04d%n",
        
        this.nomeTitular,
        this.agencia,
        this.numero,
        this.saldo,
        this.data.dia,
        this.data.mes,
        this.data.ano
    );
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

    public void getRendimento () {
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

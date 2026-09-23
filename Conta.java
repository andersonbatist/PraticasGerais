public class Conta {

    private int numeroConta;
    private String primeiroNome;
    private double saldo;
    public Cliente titular;

    
    public Conta (int numeroConta, String primeiroNome, double saldo) {
        this.numeroConta = numeroConta;
        this.primeiroNome = primeiroNome;
        this.saldo = saldo;
    } 


    //Método para obter informações da conta
    public void getDados () {
        System.out.println("===================\nCliente: " + primeiroNome + "\nN° da Conta: " + numeroConta + "\nSaldo: R$" + saldo);
    }

    //Método para Sacar dinheiro da conta
    public boolean saque (double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("===================\nSaque realizado com Sucesso!\nSeu novo saldo é: R$" + saldo);
            return true;
        } else {
            System.out.println("===================\nNão foi possível realizar o saque");
            return false;
        }
    }

    //Método pra Depositar dinheiro
    public boolean deposito (double valor) {
        this.saldo += valor;
        System.out.println("===================\nDeposito de R$" + valor + " realizado com sucesso!");
        return true;
    }

    //Método pra transferir dinheiro entre contas
    public void transferePara (Conta destino, double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            destino.saldo = destino.saldo + valor;
        } else {
            System.out.println("Valor inválido");
        }
        
    }

    //Método alternativo pra transferir dinheiro entre contas]
    public boolean transfereParadois (Conta destino, double valor) {
        if (this.saldo >= valor) {
            destino.saque(valor);
            destino.deposito(valor);
            return true;
        } else {
            System.out.println("Valor inválido");
            return false;
        }
    }
     
}
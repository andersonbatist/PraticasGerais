public class Conta {

    private double saldo;

    public void depositaa(double valor) {
        this.saldo += valor;
    }

    public void mostraSaldo() {
        System.out.println(this.saldo);
    }

    public void saca (double valor) {
        this.saldo -= valor;
    }
}
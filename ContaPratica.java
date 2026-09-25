public class ContaPratica {

    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void mostraSaldo() {
        System.out.println(saldo);
    }
}
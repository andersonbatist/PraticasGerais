public class ManipuladorDeContas {
    public Conta contaGuardada;

    public void criaConta () {
        this.contaGuardada = new Conta();
    }

    public void deposita (Evento evento) {
        this.contaGuardada.depositaa(evento.valor);
    }

    public void saca (Evento evento){
        this.contaGuardada.saca(evento.valor);
    }
}
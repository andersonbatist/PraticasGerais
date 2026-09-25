public class StartPrograma {

    public static void main(String[] args) {

        ManipuladorDeContas manipulador = new ManipuladorDeContas ();
        ManipuladorDeContas manipulador2 = new ManipuladorDeContas ();
        
        manipulador.criaConta();
        manipulador2.criaConta();

        manipulador.deposita(new Evento(1000));
        manipulador2.deposita(new Evento(500));
    
        manipulador.saca(new Evento(200));

        manipulador.contaGuardada.mostraSaldo();
        manipulador2.contaGuardada.mostraSaldo();
    }
}
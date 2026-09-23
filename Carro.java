public class Carro {
    private String cor;
    private String modelo;
    public int velocidadeAtual;
    private int velocidadeMaxima;
    Motor motor;

    //Escolher cor do carro
    public void escolherCor (String cor) {
        this.cor = cor;
        System.out.println("A cor do carro será " + this.cor);
    }

    //Escolher modelo do carro
    public void escolherModelo (String modelo) {
        this.modelo = modelo;
        System.out.println("O modelo do carro será " + this.modelo);
    }

    //Definindo a velociade máxima do carro
    public void velocidadeM(int velocidade){
        this.velocidadeMaxima = velocidade;
    }


    //liga o carro
    void ligar() {
        System.out.println("O carro está ligado");
    }  

    //acelera uma certa quantidade
    public void acelerar(int quantidade) {
        int velocidadeNova = this.velocidadeAtual + quantidade; 
        this.velocidadeAtual = velocidadeNova;
        System.out.println("Acelerando " + quantidade + "KM agora! IIIIRÚUU");
    }

    //devolve a marcha do carro
    public int pegaMarcha() {

        if (this.velocidadeAtual < 0) {
            return -1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
            return 1;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        }
        return 3;
    }


}

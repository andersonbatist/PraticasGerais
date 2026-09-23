public class Data {
    int dia;
    int mes;
    int ano;

    public String formatada (int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;

        String dataFormatada = String.format(
            "%02d/%02d/%04d",
            this.dia,
            this.mes,
            this.ano
        );

        System.out.println(dataFormatada);

        return dataFormatada;
        
    }
}

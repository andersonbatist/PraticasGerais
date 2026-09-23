class StartPrograma {
    public static void main(String[] args) {
        ContaExercicio c1 = new ContaExercicio("Anderson B.", "22/09/2026", "A01", 123, 50000.00);
        ContaExercicio c2 = new ContaExercicio("Davilla S.", "23/09/2026", "A02", 456, 60000);
        ContaExercicio c3 = c2;
        c1.compararContas (c2, c3);


    }
}
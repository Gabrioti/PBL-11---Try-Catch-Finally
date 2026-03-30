interface Validador{
    public boolean validar();
}

interface Calculavel{
    public double calcular();
}   

interface Auditavel{
    public void auditar();
}

interface Relatavel{
    public String gerarRelatorio();

}
public class ContratoPublico implements Validador, Calculavel{

    private String descricao;
    private double valorTotal;
    private double valorPago;

    public ContratoPublico(String descricao, double valorTotal, double valorPago) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.valorPago = valorPago;
    }

    public double calcular(){
        double percentual = (valorPago / valorTotal) * 100;
        return percentual;
    }

    public boolean validar(){
        if (valorPago > valorTotal) {
            return false;
        }
        return true;
    }
}
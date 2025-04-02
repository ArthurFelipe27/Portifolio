public class ContaBancaria {
    private String titular;
    private double saldo;

    public void setTitular (String titular){
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if (valor >= 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor);
        } else {
            System.out.println("Erro: Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor);
        } else {
            System.out.println("Erro: Saldo insuficiente!");
        }
    }

    public void exibirInfo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    
}

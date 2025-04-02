public class Main {
    public static void main(String[] args) {
     ContaBancaria c = new ContaBancaria();
     
     
     c.setTitular("Luana");
     c.depositar(255.5);
     c.exibirInfo();

     c.sacar(65);
     c.exibirInfo();

     System.out.println("Titular da conta: " + c.getTitular());
     c.exibirInfo();
    }
}
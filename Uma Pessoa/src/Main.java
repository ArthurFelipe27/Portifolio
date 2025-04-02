public class Main {
    public static void main (String[] args){
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Arthur";
        pessoa1.idade = 18;
        pessoa1.profissao = "Desenvolvedor de Sistemas";

        System.out.println("-----------------------------------");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Luana";
        pessoa2.idade = 19;
        pessoa2.profissao = "Analista de Sistemas";

        System.out.println("Pessoa 1");
        pessoa1.exibirInfo();

        System.out.println("-----------------------------------");

        System.out.println("Pessoa 2");
        pessoa2.exibirInfo();

        System.out.println("-----------------------------------");
    }
}
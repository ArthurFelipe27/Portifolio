package src;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
    
    Scanner exibir = new Scanner(System.in);


    System.out.println("Olá! Qual o seu nome?");
    String nome = exibir.nextLine();

    System.out.println("Qual a sua idade?");
    int idade = exibir.nextInt();


    if (idade < 18) {
        System.out.println("Infelizmente você não tem idade " + 
        "para utilizar o sistema.");
        return;
    } else {
        System.out.println("Seja bem-vindo " + nome );
        System.out.println("Você sabia que o marco de completar " +
        "18 anos de idade significa a transição para a vida adulta.");
    }

    System.out.println("------------------------------------------------");
    
    Verificar verificar = new Verificar();
    verificar.verificar();

    

    exibir.close();
    }
}
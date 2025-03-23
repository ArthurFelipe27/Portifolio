package src;
import java.util.Scanner;

public class Verificar {
    public void verificar(){
        
        Scanner exibir = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double nota = exibir.nextDouble();

        if (nota >= 6) {
            System.out.println("Aprovado, parabéns!");
        } else if (nota >= 5){
            System.out.println("Recuperação! Mas calma você ainda tem chances...");
        } else {
            System.out.println("Reprovado! Infelizmente você não chegou lá... porém " +
            "não desanime!");
        }

        exibir.close();
    }
}

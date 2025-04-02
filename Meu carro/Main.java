import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner exibir = new Scanner(System.in);

        System.out.println("Olá! Vamos coemçar?");
        System.out.println("Digite seu nome: ");
        String nome = exibir.nextLine();
        System.out.println("---------------------------------------------------------");


        System.out.println("Olá " + nome + ", escolha a marca do seu carro: ");
        System.out.println("1 -- TOYOTA:");
        System.out.println("2 -- FORD:");
        System.out.println("3 -- CHEVROLET:");
        System.out.println("4 -- NISSAN:");
        System.out.println("5 -- FIAT:");
        System.out.println("6 -- VOLKSWAGEN:");
        System.out.println("7 -- MITSUBISHI:");
        System.out.println("8 -- VOLVO:");
        System.out.println("9 -- FERRARI");


        int escolhaMarca = exibir.nextInt();
        String marca;
    
        switch (escolhaMarca) {
            case 1:
                marca = "Toyota";
                break;
            case 2:
                marca = "Ford";
                break;
            case 3:
                marca = "Chevrolet";
                break;
            case 4:
                marca = "Nissan";
                break;
            case 5:
                marca = "Fiat";
                break;
            case 6:
                marca = "Volkswagen";
                break;
            case 7:
                marca = "Mitsubishi";
                break;
            case 8:
                marca = "Volvo";
                break;
            case 9:
                marca = "Honda";
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }
        

        System.out.println("---------------------------------------------------------");
        System.out.println("Boa escolha! Você escolheu " + marca);
        System.out.println("Agora vamos esolher qual modelo do " + marca +":");

        
        if (marca.equals("Toyota")) {
            System.out.println("1 - Corolla");
            System.out.println("2 - Hilux");
        } else if (marca.equals("Ford")) {
            System.out.println("1 - Mustang");
            System.out.println("2 - Ranger");
        } else if (marca.equals("Chevrolet")) {
            System.out.println("1 - Onix");
            System.out.println("2 - S10");
        } else if (marca.equals("Volkswagen")) {
            System.out.println("1 - Gol");
            System.out.println("2 - Polo");
        } else if (marca.equals("Nissan")){
            System.out.println("1 - Kicks");
            System.out.println("2 - Frontier");
        } else if (marca.equals("Fiat")) {
            System.out.println("1 - Fastback");
            System.out.println("2 - Uno Mille");
        } else if (marca.equals("Mitsubishi")) {
            System.out.println("1 - Eclipse Cross");
            System.out.println("2 - L200 Triton");
        } else if (marca.equals("Volvo")) {
            System.out.println("1 - XC40");
            System.out.println("2 - XC60");
        } else if (marca.equals("Honda")){
            System.out.println("1 - Civic");
            System.out.println("2 - City");
        } 

        int escolhaModelo = exibir.nextInt();
        String modelo = "";

        switch (marca) {
            case "Toyota":
                modelo = (escolhaModelo == 1) ? "Corolla" : (escolhaModelo == 2) ? "Hilux" : "Desconhecido";
                break;
            case "Ford":
                modelo = (escolhaModelo == 1) ? "Mustang" : (escolhaModelo == 2) ? "Ranger" : "Desconhecido";
                break;
            case "Chevrolet":
                modelo = (escolhaModelo == 1) ? "Onix" : (escolhaModelo == 2) ? "S10" : "Desconhecido";
                break;
            case "Volkswagen":
                modelo = (escolhaModelo == 1) ? "Gol" : (escolhaModelo == 2) ? "Polo" : "Desconhecido";
                break;
            case "Nissan":
                modelo = (escolhaModelo == 1) ? "Kicks" : (escolhaModelo == 2) ? "Frontier" : "Desconhecido";
            case "Fiat":
                modelo = (escolhaModelo == 1) ? "Fastback" : (escolhaModelo == 2) ? "Uno mille" : "Desconhecido";
                break;
            case "Mitsubishi":
                modelo = (escolhaModelo == 1) ? "Eclipse Cross" : (escolhaModelo == 2) ? "L200 Triton" : "Desconhecido";
                break;
            case "Volvo":
                modelo = (escolhaModelo == 1) ? "XC40" : (escolhaModelo == 2) ? "XC60" : "Desconhecido";
                break;
            case "Honda":
                modelo = (escolhaModelo == 1) ? "Civic" : (escolhaModelo == 2) ? "City" : "Desconhecido";
        }

        if (modelo.equals("Desconhecido")) {
            System.out.println("Modelo inválido. Saindo...");
            return;
        }

        System.out.println("---------------------------------------------------------");
        System.out.println("Parabéns! Você montou um " + marca + " " + modelo);
        
        exibir.close();

    }    

}

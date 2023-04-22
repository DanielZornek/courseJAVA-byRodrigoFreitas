import java.util.Scanner;

public class aula003 {
    
    public static void main(String[] args) {

        boolean verdade = true;
        boolean falso = false;

        if(!verdade || falso){
            System.out.println("Verdade");
            System.out.println(verdade);
        }else{
            System.out.println("Falso");
            System.out.println(falso);
        }

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira sua idade abaixo: ");
        Integer idade = entrada.nextInt();

        if(idade >= 18 && idade <= 59){
            System.out.println("Você é de maior e adulto");
        }else if(idade > 60){
            System.out.println("Você é um idoso");
        }else{
            System.out.println("Você é de menor");
        }

    }
}
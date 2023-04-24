import java.util.Scanner;

public class Game{
    public static void main(String[] args) {
        raca personagem001;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();

        System.out.println("Olá, "+nome+" deseja ser um saiyajin? [1/n]");
        Integer confirma = entrada.nextInt();

        if(confirma == 1){
            System.out.println("Bem-vindo a raça guerreira!!");
            personagem001 = new saiyajin();
            personagem001.raca(nome);
        }else{
            System.out.println("Bem-vindo a raça namekuseyjin");
            personagem001 = new namek();
            personagem001.raca(nome);
        }
        
        System.out.println(personagem001);

    }
}
    
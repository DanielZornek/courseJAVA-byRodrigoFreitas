import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aula004 {
    public static void main(String[] args) {
        String genero = "Homem";

        switch (genero) {
            case "Homem":
                System.out.println("Você é um homem");
                break;
            case "Mulher":
                System.out.println("Você é uma mulher");
                break;       
            default:
                System.out.println("Você é um animal");
                break;
        }

        /* 

        List<String> homem = new ArrayList<>();
        homem.add("mamifero");
        homem.add("bipede");
        homem.add("masculino");

        Scanner entrada = new Scanner(System.in);
        String valor1 = entrada.nextLine();
        String valor2 = entrada.nextLine();
        String valor3 = entrada.nextLine();
        List<String> valores = new ArrayList<>();
        valores.add(valor1);
        valores.add(valor2);
        valores.add(valor3);

        boolean animal = true;

        for(int i = 0; i<homem.size();i++){
            if(valores.get(i) == homem.get(i)){
                animal = false;
            }else{
                animal = true;
            }

            System.out.println(valores.get(i));
            System.out.println(homem.get(i));
        }

        if(animal){
            System.out.println("Você é um animal");
        }else{
            System.out.println("Você é um homem");
        }*/
    }
}
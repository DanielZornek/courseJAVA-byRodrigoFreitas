import java.util.Scanner;

public class aula002 {
    public static void main(String[] args) {
        String n1 = "10";
        String n2 = "19";
        System.out.println(n1+n2); // Cuidado com tipos primitivos
        // vamos fazer um cast
        
        Integer x = Integer.parseInt(n1);
        Integer y = Integer.parseInt(n2);//está esperando uma string
        System.out.println(x+y);

        Double price = 39.49;
        Double desconto = 10d;
        Double newPrice = price-(price/100)*desconto;
        System.out.println("O preço Kg do queijo está em: "+price);
        System.out.println("Com desconto fica: "+newPrice);

        Float price2 = 5.8f; // f no final obrigatório
        // o float ocupa menos espaço na memória
        // mas seu valor max de casa decimal é menor que o double

        String price2_1 = "8.3";
        Float price2_2 = Float.parseFloat(price2_1);

        System.out.println(price2_2 - price2);

        char characterYes = 'y'; // aspas simples, só armazena um caracter
        char characterNo = 'n';

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor 1: ");
        String valor = entrada.nextLine();

        System.out.println("Digite o valor 2: ");
        String valor2 = entrada.nextLine();

        Integer valorNumber = Integer.parseInt(valor);
        Integer valor2Number = Integer.parseInt(valor2);

        Integer soma = valorNumber * valor2Number;

        System.out.println(valor + " X " + valor2+" = "+soma);

    }
}

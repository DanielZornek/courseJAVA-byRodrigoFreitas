public class aula005 {
    public static void main(String[] args) {
        // while
        // do while
        // for

        System.out.println("Contagem até 5: ");

        Integer i = 0;
        while(i<=5){
            System.out.println(i);
            i++;
        }

        System.out.println("\n Contagem regressiva: \n");

        Integer j = 10;
        do {
            System.out.println(j);
            j--;
        }while(j!=0);

        System.out.println("\n Contagem de 10 em 10 até 100: \n");

        for(int k = 0; k <= 100; k+=10){
            System.out.println(k);
        }
        
    }
}

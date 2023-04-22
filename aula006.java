import java.util.Scanner;

public class aula006 {
    public static void main(String[] args) {
        String [] array = new String[3];

        for(Integer i = 0; i < 3; i++){
            array[i] = new Scanner(System.in).nextLine();
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array); // não vai retornar os elementos

        // Agora com matrizes que terão colunas

        String[][]array2 = new String[3][2];// pode colocar mais

        for(Integer j = 0; j < 3; j++){
            for(Integer k = 0; k < 2; k++){
                array2[j][k] = new Scanner(System.in).nextLine();
            }
        }

        System.out.println(array2[2][1]);

    }
}

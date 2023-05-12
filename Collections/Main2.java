import java.util.ArrayList;
import java.util.List;

// Lists

public class Main2{
    public static void main(String[] args) {
        // A list é uma coleção ordenada, então os elementos dela estarão juntos por inserção

        List<Integer> lista = new ArrayList<>();

        lista.add(2);
        lista.add(4);
        lista.add(7);
        lista.add(null);
        lista.add(12);
        System.out.println(lista);

        int tamanhoLista = lista.size(); // tamanho da lista
        System.out.println(tamanhoLista);
        System.out.println("Quem é o primeiro? " + lista.get(0));

        System.out.println("Todos os elementos da lista: ");
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

    }
}
import java.util.HashMap;
import java.util.Map;

// Maps

public class Main4 {
    public static void main(String[] args) {
        // O map possui uma relação de chave - valor
        Map<String, Integer> valores002 = new HashMap<>();
        valores002.put("Naruto", 1);
        valores002.put("Goku", 2);
        valores002.put("Seiya", 3);
        valores002.put("Deku", 4);
        valores002.put("Deku", 5);
        // Os valores ele aceita repetido, porém chaves não
        
        valores002.forEach((chave, valor) -> {
            System.out.println(chave + " " + valor);
        });

        System.out.println("Tem chave Goku? " + valores002.containsKey("Goku"));
    }
}
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Sets

public class Main3 {
    // O set não garante a ordem e também não aceita elementos duplicados
    public static void main(String[] args) {
        Set<Integer> valores001 = new HashSet<>();
        valores001.add(2);
        valores001.add(4);
        valores001.add(6);
        valores001.add(8);
        valores001.add(10);
        valores001.add(2);
        System.out.print(valores001+"\n");

        Iterator<Integer> ite = valores001.iterator();

        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }
    
}

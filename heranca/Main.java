package heranca;

public class Main {

    public static void main(String[] args) {
        
        ContaCorrente cC001 = new ContaCorrente(100);
        ContaPoupanca cP001 = new ContaPoupanca(200);

        cC001.View();
        cP001.View();
    }
    
}

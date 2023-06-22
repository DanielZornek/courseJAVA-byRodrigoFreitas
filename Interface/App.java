package Interface;
// Uma interface é uma espécie de contrato
// As classes que implementarem ela terão de seguir
public class App {
    public static void main(String[] args) {
       ContaInterface cC001 = new ContaCorrente();
       ContaInterface cP001 = new ContaPoupanca(); 

       cC001.setSaldo(300);
       cP001.setSaldo(300);

       print(cC001);
       System.out.println(cC001 instanceof ContaInterface);
       print(cP001);
    }

    private static void print(ContaInterface conta){
        System.out.println("======================================");
        System.out.println(conta.getSaldo());
        System.out.println(conta.getRendimento());
        System.out.println("======================================\n");
    }

}

public class Main{
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setNome("Corsa");
        carro1.setPortas(2);
        carro1.setRodas(4);

        System.out.println(carro1.getNome());
        System.out.println(carro1.getPortas());
        System.out.println(carro1.getRodas());
        System.out.println(carro1);

        AgeVerfication userVerfication001 = new AgeVerfication();
        System.out.println(userVerfication001.AgeVerfication(14, 19));
    }
}
public class aula007 {
    public static void main(String[] args) {
        Integer a = 12;
        Integer b = 11;
        Integer calc = 0;

        calc = calculo(a, b);
        System.out.println(retornaString() + calc);
        
    }

    private static Integer calculo(Integer a, Integer b){
        Integer calc = 0; 

        if(a % 2 == 0){
            calc = a + b;
        }else{
            calc = a * b;
        }

        return calc;
    }

    private static String retornaString(){
        return "A conta resulta em: ";
    }
}

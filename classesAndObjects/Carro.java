public class Carro {

    private int rodas;
    private int portas;
    private String nome;

    public void setRodas(int rodas){
        this.rodas = rodas;
    }

    public void setPortas(int portas){
        this.portas = portas;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getRodas(){
        return rodas;
    }

    public int getPortas(){
        return portas;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Carro [rodas=" + rodas + ", portas=" + portas + ", nome=" + nome + "]";
    }
}

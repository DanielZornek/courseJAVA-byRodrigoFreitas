package Interface;

public class ContaCorrente implements ContaInterface{

    private Integer saldo;

    @Override
    public Integer getRendimento() {
        return this.saldo * 2;
    }

    @Override
    public Integer getSaldo() {
        return this.saldo;
    }

    @Override
    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
    
}

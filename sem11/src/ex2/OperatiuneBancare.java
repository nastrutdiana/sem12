package ex2;

public abstract class OperatiuneBancare {
    protected String contBancar;
    public OperatiuneBancare(String contBancar) {
        this.contBancar = contBancar;
    }

    public abstract void efectuareOperatiune();
}

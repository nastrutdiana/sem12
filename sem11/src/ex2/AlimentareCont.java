package ex2;

public class AlimentareCont extends OperatiuneBancare{
    private String cont;
    private double suma;

    public AlimentareCont(String cont, double suma) {
        super(cont);
        this.suma = suma;
    }

    @Override
    public void efectuareOperatiune() {
        System.out.println("Alimentare cont");
    }
}

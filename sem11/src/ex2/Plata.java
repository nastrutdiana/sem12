package ex2;

public class Plata extends OperatiuneBancare{
    private double suma;
    private String contDestinatie;

    public Plata(double suma, String contDestinatie) {
        super(contDestinatie);
        this.suma = suma;
    }

    @Override
    public void efectuareOperatiune() {
        System.out.println("plata");
    }
}

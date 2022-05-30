package ex2;

public class main {
    public static void main(String[] args) {

        ServerOpBancare serverOpBancare = new ServerOpBancare();
        OperatiuneBancare op1 = new AlimentareCont("1", 1000);
        OperatiuneBancare op2 = new AlimentareCont("2", 500);
        OperatiuneBancare op3 = new AlimentareCont("3", 6000);

        serverOpBancare.inregistrareOperatiune(op1);
        serverOpBancare.inregistrareOperatiune(op2);
        serverOpBancare.inregistrareOperatiune(op3);
        serverOpBancare.efectueazaToateOperatiunile();

    }
}

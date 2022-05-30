package ex2;

import java.util.ArrayList;

public class ServerOpBancare {
    private ArrayList<OperatiuneBancare> listaOperatiuni = new ArrayList<OperatiuneBancare>();

    public void inregistrareOperatiune(OperatiuneBancare o){
        listaOperatiuni.add(o);
    }
    public void efectueazaToateOperatiunile(){
        for (OperatiuneBancare op: listaOperatiuni) {
            op.efectuareOperatiune();
        }

    }
}

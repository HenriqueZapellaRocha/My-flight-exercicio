package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.List;

public class VooVariasEscalas {

    List <VooEscala> vooVariasEscalas;

    public VooVariasEscalas() {
        vooVariasEscalas = new ArrayList<VooEscala>();
    }

    public void adicionarVooEscalas(VooEscala voo) {
        vooVariasEscalas.add(voo);
    }

    public List<VooEscala> getVooVariasEscalas() {
        return vooVariasEscalas;
    }

    @Override
    public String toString() {
        return "VooVariasEscalas [vooVariasEscalas=" + vooVariasEscalas + "]";
    }

    
    

    
    
}

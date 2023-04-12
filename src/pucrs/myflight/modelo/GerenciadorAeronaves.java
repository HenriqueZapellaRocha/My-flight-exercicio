package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeronaves {

    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves(ArrayList<Aeronave> aeronaves) {
        this.aeronaves  = new ArrayList<Aeronave>();
    }

    public void adicionar(Aeronave aviao) {
        aeronaves.add(new Aeronave(aviao.getCodigo(), aviao.getDescricao(), aviao.getCapacidade())); 
    }

    public ArrayList<Aeronave> listarTodas() {
        return aeronaves;
    }

    public Aeronave buscarCodigo(String cod) {

        for(Aeronave aviao : aeronaves) {
            if(aviao.getCodigo() == cod) {
                return aviao;
            }
        }
        return null;
    }

   

}

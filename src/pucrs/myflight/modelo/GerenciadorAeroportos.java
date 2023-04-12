package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {

    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(ArrayList<Aeroporto> aeroportos) {
        this.aeroportos = new ArrayList<Aeroporto>();
    }

    public ArrayList<Aeroporto> getAeroportos() {
        return aeroportos;
    }

    public void adicionar(Aeroporto aeroporto) {
        aeroportos.add(aeroporto);
    }

    public ArrayList<Aeroporto> listarTodos() {
        return aeroportos;
    }

    public Aeroporto buscarPorCodigo(String codigo) {
        for(Aeroporto buscar : aeroportos) {
            if(buscar.getCodigo() == codigo) {
                return buscar;
            }
        }
        return null;
    }
}

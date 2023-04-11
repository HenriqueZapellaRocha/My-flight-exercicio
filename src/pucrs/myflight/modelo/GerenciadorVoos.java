package pucrs.myflight.modelo;
import java.time.LocalDateTime;
import java.util.ArrayList;



public class GerenciadorVoos {

    private ArrayList<Voo> voos;

    public GerenciadorVoos(Voo voo) {
        voos = new ArrayList<Voo>();
    }

    public void adicionar(Voo voo) {
        voos.add(voo);
    }

    public ArrayList<Voo> listarTodos() {
        return voos;
    }

    public ArrayList<Voo> buscarData(LocalDateTime data) {
        ArrayList<Voo> voosEncontrados = new ArrayList<Voo>();

        for(Voo buscar : voos) {
            if(buscar.getDatahora() == data) {
                voosEncontrados.add(buscar);
            }
        }

        return voosEncontrados;
    }
    

}

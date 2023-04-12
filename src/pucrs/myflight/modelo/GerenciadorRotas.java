package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {

	private ArrayList<Rota> rotas;

	public GerenciadorRotas(ArrayList<Rota> rotas) {
        rotas = new ArrayList<Rota>();
    }    

    public void adicionar(Rota rota) {
        rotas.add(rota);
    }

    public ArrayList<Rota> listarTodas() {
        return rotas;
    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto origem) {
        ArrayList<Rota> rotasEncotradas = new ArrayList<Rota>();

        for(Rota buscar : rotas) {
            if(buscar.getOrigem() == origem) {
                rotasEncotradas.add(buscar);
            }
        }
        return rotasEncotradas;
    }
}

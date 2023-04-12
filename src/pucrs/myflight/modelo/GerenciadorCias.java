package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias(ArrayList<CiaAerea> ciaAerea) {
		empresas = new ArrayList<CiaAerea>();
	}

	public void adicionar(CiaAerea cia) {
	empresas.add(new CiaAerea(cia.getCodigo(), cia.getNome()));
	}

	public ArrayList<CiaAerea> listarTodas() {
		return empresas;
	}

	public CiaAerea buscarCodigo(String cod) {

		for(CiaAerea cia: empresas) {
			if (cia.getCodigo() == cod) {
				return cia;
		}
		}

		return null;
		}

	public CiaAerea buscarNome(String cod) {

		for(CiaAerea cia: empresas) {
			if (cia.getNome() == cod) {
				return cia;
			}
		}
		
		return null;
		}
}

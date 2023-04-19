package pucrs.myflight.consoleApp;
import java.time.Duration;
import java.time.LocalDateTime;
import pucrs.myflight.admin.Admin;
import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.Rota;
import pucrs.myflight.modelo.Voo;


public class App {

	public static void main(String[] args) {
	
	Admin administra = new Admin();

	administra.getGerenciaVoos().adicionar(new Voo(new Rota(new CiaAerea("sdasdasd", "dasdsadsa"), new Aeroporto("asdsada", "sdsadsada", new Geo(231312, 01232131)), new Aeroporto("asdasd", "dasdasd", new Geo(21321, 01232131)), new Aeronave("sadasdas", "asdsad", 200)), LocalDateTime.of(2025, 2, 10, 0, 0, 0) , Duration.ofMinutes(120)));
	
	administra.getGerenciaVoos().adicionar(new Voo(Duration.ofMinutes(120), new Rota(new CiaAerea("das", "asdsad"), new Aeroporto("asdasds", "asddsada", new Geo(213, 123210)), new Aeroporto("adasd", "asdsad", new Geo(21312, 123210)), new Aeronave("asdasdas", "sadasd", 200)) ));

	Geo Sbpa = new Geo(-29.9942, -51.1714);
	Geo Sbgr = new Geo(-23.4322, -46.4692);

	

	System.out.println(Sbpa.calculaDistancia(Sbgr));

	



	System.out.println("nidasd");
	}
}

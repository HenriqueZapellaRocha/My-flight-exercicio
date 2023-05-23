package pucrs.myflight.admin;
import java.util.ArrayList;
import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.GerenciadorAeronaves;
import pucrs.myflight.modelo.GerenciadorAeroportos;
import pucrs.myflight.modelo.GerenciadorCias;
import pucrs.myflight.modelo.GerenciadorRotas;
import pucrs.myflight.modelo.GerenciadorVoos;
import pucrs.myflight.modelo.Rota;



public class Admin {

    private GerenciadorAeronaves gerenciaAeronaves;
    private GerenciadorAeroportos gerenciaAeroportos;
    private GerenciadorCias gerenciaCias;
    private GerenciadorVoos gerenciaVoos;
    private GerenciadorRotas gerenciaRotas;


    public Admin() {
        gerenciaAeronaves = new GerenciadorAeronaves(new ArrayList<Aeronave>());
        gerenciaAeroportos = new GerenciadorAeroportos(new ArrayList<Aeroporto>());
        gerenciaCias = new GerenciadorCias(new ArrayList<CiaAerea>());
        gerenciaRotas = new GerenciadorRotas(new ArrayList<Rota>());
    }


    public GerenciadorAeronaves getGerenciaAeronaves() {
        return gerenciaAeronaves;
    }


    public GerenciadorAeroportos getGerenciaAeroportos() {
        return gerenciaAeroportos;
    }


    public GerenciadorCias getGerenciaCias() {
        return gerenciaCias;
    }


    public GerenciadorVoos getGerenciaVoos() {
        return gerenciaVoos;
    }


    public GerenciadorRotas getGerenciaRotas() {
        return gerenciaRotas;
    }
    
   
    
  


    

    
    

}

package pucrs.myflight.modelo;
import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscala extends Voo {

   
    private Rota r2;
    private Rota r1;
    private LocalDateTime dh;
    private int dur;

    
    public VooEscala(Rota rota, LocalDateTime datahora, Duration duracao, Rota r2, LocalDateTime dh, int dur) {
        super(rota, datahora, duracao);
        this.r2 = r2;
        this.dh = dh;
        this.dur = dur;
    }


    public Rota getR2() {
        return r2;
    }


    public Rota getR1() {
        return r1;
    }


    public LocalDateTime getDh() {
        return dh;
    }


    public int getDur() {
        return dur;
    }


    @Override
    public String toString() {
        return "VooEscala [r2=" + r2 + ", r1=" + r1 + ", dh=" + dh + ", dur=" + dur + "]";
    }

    
    
    

}
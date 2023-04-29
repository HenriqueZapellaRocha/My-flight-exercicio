package pucrs.myflight.modelo;
import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscala extends Voo {

   
    private Rota r2;
    private Rota r1;
    private LocalDateTime dh;
    private int dur;

    
    public VooEscala(Rota rota, LocalDateTime datahora, Duration duracao, Rota r2, Rota r1, LocalDateTime dh, int dur) {
        super(rota, datahora, duracao);
        this.r2 = r2;
        this.r1 = r1;
        this.dh = dh;
        this.dur = dur;
    }

    
    

}
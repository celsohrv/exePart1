import java.util.Random;

public class Cliente implements Observer {
    private boolean cancelarAssinatura = false;
    public String pessoa;
    private final Random gerador = new Random ();
    private String tipoAssinatura;

    public Cliente(String nome) {
        this.pessoa = nome;
    }

    @Override
    public void update(Periodico pr) {
        System.out.println("Recebido: " + pr.getConteudo());
        
        if (gerador.nextDouble() == 0.1) {
            
            setCancelarAssinatura();
        }
    }

    public boolean  setCancelarAssinatura () {
	this.cancelarAssinatura = true;
        return this.cancelarAssinatura;
    }
    
    public String getTipoAssinatura(){
        return this.tipoAssinatura;
    }

    @Override
    public boolean getCancelarAssinatura() {
        return this.cancelarAssinatura;
        
    }

}

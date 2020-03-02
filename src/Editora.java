
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Editora implements Subject {

    private Periodico pr;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);

    }
      
    @Override
    public void noticarObserver() {
        
        List<Observer> aux = new ArrayList<>();
        int x=0;
        Calendar rightNow = Calendar.getInstance();
        int dia = rightNow.get(Calendar.DAY_OF_WEEK);
        aux.clear();
        for (Observer o : observers) {
            if ((dia == 7 || dia == 8)) {
               o.update(pr);
                if (!o.getCancelarAssinatura()) {
                 aux.add(o);
                }
            }
            ++x;
        }
        observers.clear();
        observers.addAll(aux);
        
        if (observers.isEmpty()) {
            System.out.println("falimos!!");
            System.exit(0);
        }
        
    }

    void iniciar() {
    
    }

}

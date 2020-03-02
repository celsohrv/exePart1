
public class Assinante {

    public static void main(String[] args) {
        Editora editora = new Editora();
        editora.addObserver(new Cliente("Jose"));
        editora.addObserver(new Cliente("Joao"));
        editora.addObserver(new Cliente("Maria"));
        editora.iniciar();

    }

}

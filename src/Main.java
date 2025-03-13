import java.util.Scanner;

public class Main {
    /**
     * Crea una classe que repliqui el funcionament del comando 'Undo'.
     * Aquesta classe serà utilitzada per la classe Main, que permetrà introduir
     * opcions per consola.
     *
     * La classe 'Undo' ha de guardar les últimes comandes introduïdes.
     * Ha de permetre afegir o eliminar comandes, així com llistar les últimes comandes
     * introduïdes (semblant a la comanda 'history' en Linux).
     *
     * La classe 'Undo' ha d'implementar imprescindiblement un patró Singleton.
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Undo undo_1 = new Undo();
        undo_1.startConsoleReader();

        Undo undo_2 = new Undo();
        undo_2.startConsoleReader();

    }
}
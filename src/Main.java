import java.util.Scanner;

public class Main {
    /**
     * Crea una classe que repliqui el funcionament del comando 'Undo'.
     * Aquesta classe serà utilitzada per la classe Main, que permetrà introduir
     * opcions per consola.
     * <p>
     * La classe 'Undo' ha de guardar les últimes comandes introduïdes.
     * Ha de permetre afegir o eliminar comandes, així com llistar les últimes comandes
     * introduïdes (semblant a la comanda 'history' en Linux).
     * <p>
     * La classe 'Undo' ha d'implementar imprescindiblement un patró Singleton.
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UndoConsoleController singletonCtrl = UndoConsoleController.getInstance();
        singletonCtrl.startConsoleReader();

        UndoConsoleController singletonCtrl2 = UndoConsoleController.getInstance();
        singletonCtrl2.startConsoleReader();

    }
}
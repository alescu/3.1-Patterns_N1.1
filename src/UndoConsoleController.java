import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;

public class UndoConsoleController {

    private static UndoConsoleController instance = null;
    private static Stack<String> stackList = new Stack<String>();;

    private UndoConsoleController() {
    }

    public static UndoConsoleController getInstance() {
        if (instance == null) {
            instance = new UndoConsoleController();
        }
        return instance;
    }

    public void startConsoleReader() {
        Scanner sc = new Scanner(System.in);
        System.out.println("................................");
        System.out.println("LIFO console: ");
        System.out.println("    Type 'd' to delete last value");
        System.out.println("    Type 'q' to skip.");
        System.out.println("................................");
        System.out.println(stackList.reversed().toString());
        System.out.print("> ");
        String strIn = sc.nextLine();
        do {
            if (strIn.equals("d")) {
                delValue();
            }else if (strIn.equals("q")) {
                return;
            }else if (!strIn.isEmpty()) {
                stackList.add(strIn);
            }
            System.out.println(stackList.reversed().toString());
            System.out.print("> ");
            strIn = sc.nextLine();
        } while (!strIn.equals("q"));
        System.out.println("\n");
    }

    private static void delValue() {
        if(!stackList.isEmpty()){
            stackList.pop();
        }else{
            System.out.println(" The list is empty");
        }

    }

}

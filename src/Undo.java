import java.util.Scanner;

public class Undo {

    public void startConsoleReader(){
        Scanner sc = new Scanner(System.in);
        SingletonCtrl controlObj = SingletonCtrl.getInstance();
        System.out.println("................................");
        System.out.println("LIFO console: ");
        System.out.println("    Type 'd' to delete last value");
        System.out.println("    Type 'q' to skip.");
        System.out.println("................................");
        System.out.print("> ");
        String strIn = sc.nextLine();
        do{
            if(strIn.equals("d")){
                controlObj.delValue();
            }else{
                controlObj.addValue(strIn);
            }
            System.out.println(controlObj.printListValues());
            System.out.print("> ");
            strIn = sc.nextLine();
        }while(!strIn.equals("q"));
        System.out.println("\n");
    }

}

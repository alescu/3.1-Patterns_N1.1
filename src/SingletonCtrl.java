import java.util.Stack;
import java.util.EmptyStackException;

public class SingletonCtrl {

    private static SingletonCtrl instance = null;
    private Stack<String> stackList = new Stack<String>();

    private SingletonCtrl() {
    }
    public static SingletonCtrl getInstance(){
        if(instance==null){
            instance = new SingletonCtrl();
        }
        return instance;
    }

    public void addValue(String value){  stackList.add(value); }

    public void delValue(){
        try{
            stackList.pop();
        }catch(EmptyStackException e){
            System.out.println("The list is empty.");
        }
    }

    public String printListValues(){
        return stackList.reversed().toString();
    }

}

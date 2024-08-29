import java.util.*;


public class afunction {
    public static void printMyName(String name){

        System.out.println(name);
        return;
    } 

public static void main(String []args){
    System.out.println("enter");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    
    printMyName(name);
    sc.close();
}
        
}




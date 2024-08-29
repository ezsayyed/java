/*abstract class Bike{

    abstract void run();
}
class Honda extends Bike {

    void run(){

    {System.out.println("s");}

           }
           public static void main(String args[])
           {
            Bike obj = new Bike();
            obj.run();

           }
        }*/
    abstract class Bike {
    abstract void run();
}

class Honda extends Bike {
    void run() {
        System.out.println("Running safely");
    }
}

public class Main {
    public static void main(String args[]) {
        Bike obj = new Honda();
        obj.run();
    }
}

        
    
    


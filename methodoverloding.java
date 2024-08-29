public class methodoverloding {

    public static void main(String[] args) {
        System.out.println("enter hare :>");

        main("sayyed",89);
    }
     void main(int a){

        System.out.println("main methode of int argument");

     }

       static void main(String str,int i){
         System.out.println("main methode of 2 argumebnts"); 

     }
     int main(int id,String name){
        return id;

     }
}

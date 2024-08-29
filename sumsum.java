import java.util.*;
public class sumsum {

    public static int sum2(int a, int b){
        int sum = a+b;
        return sum;
    }
        public static void main(String[] args){
            System.out.println("enter output");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = sum2(a,b);
        System.out.println(sum);
        
         sc.close();
    

        }


    }
    


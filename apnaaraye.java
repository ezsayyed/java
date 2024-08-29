import java.util.*;

public class apnaaraye{

    public static void main(String[] args) {
        System.out.println("enter output:>");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int numbers[] = new int[size];

        for(int i=0; i<size; i++){

            System.out.println(numbers[i]);
            sc.close();
        }
    }
}
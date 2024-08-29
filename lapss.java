import java.util.Scanner;
public class lapss {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int year = sc.nextInt();
    if((year%4==0)&&(year%400==0 || year%100!=0)){


    System.out.println(" year is leep");
 
}
else{
    System.out.println("year is not leep");
    sc.close();
}
}
}
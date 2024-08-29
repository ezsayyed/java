import java.util.Scanner;
public class Addition{

public static void main(String []args){

Scanner sc = new Scanner(System.in);

System.out.println("enter the first value");
int num1 = sc.nextInt();
System.out.println("enter the 2nd value");
int num2 = sc.nextInt();
int sum = num1+num2;
System.out.println(sum);
}
}
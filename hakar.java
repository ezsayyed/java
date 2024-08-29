import java.util.Scanner;
public class hakar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer, a string, and a double:");

        int i;
        String s;
        double d;

        try {
            i = Integer.parseInt(scan.nextLine().trim());
            s = scan.nextLine().trim();
            d = Double.parseDouble(scan.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter the correct data type.");
            return;
        }

        // Print the values
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

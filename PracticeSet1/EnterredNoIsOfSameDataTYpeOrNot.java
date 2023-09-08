import java.util.Scanner;

public class EnterredNoIsOfSameDataTYpeOrNot {
    public static void main(String[] args) {
        System.out.print("Ener a no.: ");
        Scanner sc = new Scanner(System.in);
        boolean b = sc.hasNextInt();
        System.out.print("User enterred right datatype?"+b);
    }
}

import java.util.Scanner;
public class CoverKmtoMile {
    public static void main(String[] args) {
        System.out.print("Enter the distance in Kilometer: ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.print("The distance in miles are: "+a/0.621);
    }
}

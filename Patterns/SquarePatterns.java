package Patterns;
import java.util.Scanner;
public class SquarePatterns {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        int star = n;
        while(row<=n){
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}

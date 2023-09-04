import java.util.Scanner;
public class InvertedHalfPyramidRotated180Deg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n= sc.nextInt();
        //OUTER LOOP
        for(int i=1; i<=n ;i++){
            //INNER LOOP --> SPACE PRINT
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //INNER LOOP --> STAR PRINT
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Enter the size: 4
//    *
//   **
//  ***
// ****
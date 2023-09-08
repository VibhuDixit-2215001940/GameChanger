import java.util.Scanner;

public class RightDownStarPattern {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        n = sc.nextInt();
        for (i= n; i>= 1; i--){  
            for (j=n; j>i;j--){  
                System.out.print(" ");  
            }  
            for (int k=1;k<=i;k++){  
                System.out.print("*");  
            }  
            System.out.println("");
        }  
    }  
}
// Enter the size: 
// 5
// *****
//  ****
//   ***
//    **
//     *
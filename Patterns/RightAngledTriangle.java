package Patterns;
import java.util.Scanner;
public class RightAngledTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");         //TAKES SIZE OF PATTERN
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n-1;
        int star = 1;
        while(row<=n){              //FOR ROWS
            int i = 1;
            while(i<=space){        //FOR SPACE
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<=star){         //FOR STAR
                System.out.print("* ");
                j++;
            }
            row++;
            star++;
            space--;
            System.out.println();       //FOR NEXT LINE
        }
    }
}
// Enter the size: 
// 6
//           * 
//         * * 
//       * * * 
//     * * * *
//   * * * * *
// * * * * * *
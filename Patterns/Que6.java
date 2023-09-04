package Patterns;

import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");         //TAKES SIZE OF PATTERN
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = 1;
        int star = n;
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
            star--;
            space=space+2;
            System.out.println();       //FOR NEXT LINE
        }
    }
}
// Enter the size: 
// 5
//   * * * * * 
//       * * * * 
//           * * * 
//               * *
//                   *
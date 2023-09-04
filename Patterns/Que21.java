package Patterns;

import java.util.Scanner;

public class Que21 {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");         //TAKES SIZE OF PATTERN
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = 2*n-3;
        int star = 1;
        while(row<=n){              //FOR ROWS
            int i = 1;
            while(i<=star){        //FOR STAR
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while(j<=space){         //FOR SPACE
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if(row==n){
                k = 2;
            }
            while(k<=star){         //FOR STAR
                System.out.print("* ");
                k++;
            }
            row++;
            star++;
            space=space-2;
            System.out.println();       //FOR NEXT LINE
        }
    }
}
// Enter the size: 
// 5
// *               * 
// * *           * * 
// * * *       * * * 
// * * * *   * * * *
// * * * * * * * * * 
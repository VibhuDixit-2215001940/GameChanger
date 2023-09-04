package Patterns;

import java.util.Scanner;

public class UpperRightPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");         //TAKES SIZE OF PATTERN
        Scanner sc = new Scanner(System.in);                //USING SCANNER CLASS
        int n = sc.nextInt();
        int row=1;
        int star = n;
        while(row<=n){                          //LOOPS FOR ROWS
            int i = star;
            while(i>=row){
                System.out.print("* ");
                i--;
            }
            System.out.println();               //FOR NEXT LINE
            row++;
        }
    }
}
// Enter the size: 
// 6
// * * * * * * 
// * * * * * 
// * * * * 
// * * *
// * *
// *
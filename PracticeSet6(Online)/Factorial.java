//WRITE A JAVA PROGRAM TO PRINT FACTORIAL OF A NUMBER.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int i;
        int factorial=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no. to find factorial: ");
        int n=sc.nextInt();
        for(i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+n+" is: "+factorial);
    }
}

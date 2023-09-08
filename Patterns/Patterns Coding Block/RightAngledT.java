import java.util.Scanner;

public class RightAngledT {
     public static void main(String[] args) {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        n = sc.nextInt();
        for (i=0; i<n; i++){      
            for (j=2*(n-i); j>=0; j--){      
                System.out.print(" ");   
            }       
            for (j=0; j<=i; j++ ){     
                System.out.print("* ");   
            }       
            System.out.println();   
        }   
    }
}
// Enter the size: 
// 8
//                  * 
//                * * 
//              * * * 
//            * * * *
//          * * * * *
//        * * * * * * 
//      * * * * * * *
//    * * * * * * * *
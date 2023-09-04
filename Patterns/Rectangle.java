package Patterns;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");         //TAKES SIZE OF PATTERN
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = 1;
        int star = n;
        while(row<=n){
            int i = 1;
            //STAR
            while(i<=star){
                if(i==1 || i==n){
                    System.out.print("* ");
                } 
                else{} 
                i++;
            }
            // //SPACE
            // int j = 1;
            // while(j<=space){
                
            // }
        }
    }
}

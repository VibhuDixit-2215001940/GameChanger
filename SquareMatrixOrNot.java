import java.util.Scanner;

public class SquareMatrixOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows:- ");
        int r=sc.nextInt();
        System.out.print("Enter the no. of columns:- ");
        int c=sc.nextInt();
        if(r==c){
            System.out.println("Square matrix!!");
        }
        else{
            System.out.println("Not a square Matrix!!");
        }
    }
}

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){
        System.out.print("Enter the size of 2D Array: ");
        Scanner sc=new Scanner(System.in);          //CREATING SCANNER OBJECT
        int n=sc.nextInt();                         //TAKING SIZE OF 2D ARRAY
        int a[][]=new int[n][n];                    //DEFINIG THE ARRAY
        for(int i=0;i<n;i++){                       //TAKING INPUT FROM USER
            for(int j=0;j<n;j++){
                System.out.print("Enter "+i+""+j+" index no.: ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your entered matrix is: ");
        for(int i=0;i<n;i++){                       //PRINTING OUTPUT
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();                   //FOR NEXT LINE 
        }
    }
}

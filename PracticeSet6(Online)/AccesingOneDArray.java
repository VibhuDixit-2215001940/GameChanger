import java.util.Scanner;

public class AccesingOneDArray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);      //DEFINING SCANNER CLASS
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();                     //TAKING SIZE
         int b[]=new int[n];                    //DEFINING ARRAY
        for(int i=0;i<n;i++){                   //LO0P FOR ACCESING AN ARRAY
            System.out.print("Enter a no. for index "+i+": ");
            b[i]=sc.nextInt();
        }
        for(int c : b){                         //PRINTING ARRAY
            System.out.print(c+" ");
        }
    }
}

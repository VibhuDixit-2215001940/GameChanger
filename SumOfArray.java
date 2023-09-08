//WRITE A JAVA PROGRAM TO PRINT SUM OF ARRAY

import java.util.Scanner;      

public class SumOfArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);          //Defining Scanner Object
        System.out.print("Enter the size of your array: ");       //Taking Size Of Array
        int n=sc.nextInt();
        int a[] =new int [n];               //Defining An Array
        for(int i=0;i<n;i++){
            System.out.print("Enter the element of index "+i+" :- ");
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}

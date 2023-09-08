// WRITE A JAVA PROGRAM TO INPUT AN ARRAY AND PRINT Kth largest element in it.

import java.util.*;

public class KthLargestElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);          //Defining Scanner Object
        System.out.print("Enter the size of your array: ");       //Taking Size Of Array
        int n=sc.nextInt();
        int a[] =new int [n];               //Defining An Array
        for(int i=0;i<n;i++){
            System.out.print("Enter the element of index "+i+" :- ");
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Enter the kth value: ");      //Taking the value of kth
        int x=sc.nextInt();
        System.out.print("kth largest element is: "+a[n-x]);       
    }
}

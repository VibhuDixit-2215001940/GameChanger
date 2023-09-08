// Find Index Of Element In An Array Using Binary Search

import java.util.Scanner;

public class FindIndexOfElementInAnArrayUsingBinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of 1D array: ");       //Taking Array Size
        int n=sc.nextInt();
        int a[]=new int [n];                        //Defining Array
        for(int i=0;i<n;i++){                       //Taking Array Input
            System.out.print("Enter the element of index "+i+" :- ");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the element to search: ");        //Taking Element To Search
        int key=sc.nextInt();
        int l=0;
        int r=a.length-1;
        while(l<=r){
            int m=l+(r-1)/2;
            if(a[m]==key){
                System.out.println("Element founded at index: "+m);
                break;
            }
            else if(a[m]<key){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
    }
}

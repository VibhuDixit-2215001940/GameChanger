// Linear Search in Java
// Linear search is used to search a key element from multiple elements. Linear search is less used today because it is slower than binary search and hashing.

// Algorithm:

// Step 1: Traverse the array
// Step 2: Match the key element with array element
// Step 3: If key element is found, return the index position of the array element
// Step 4: If key element is not found, return -1

import java.util.Scanner;

public class LinearSearch {
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int j=0; j<arr.length; j++){
            if(arr[j] == target){
                return j;
            }
        }
        //This will execute if no element found!!
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of ann array: ");
        int n,i,target,index;
        n = sc.nextInt();
        int a[] = new int[n];
        for(i=0 ; i<n ; i++){
            System.out.print("Enter the value of index "+i+" : ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the no. to check availability: ");
        target = sc.nextInt();
        index = linearSearch(a, target);
        if(index == -1){
            System.out.println("No element found!!");
        }
        else{
            System.out.println("The element found at: "+index);
        }
    }
    
}






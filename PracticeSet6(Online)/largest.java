// import java.util.Scanner;

public class largest{  
    public static void main(String[] args) {  
        // Scanner sc = new Scanner(System.in);
	    // n = sc.nextInt();
        int [] arr = new int [] {25, 11, 7, 75, 56};   //Initialize array   
        int max = arr[0];                               //Initialize max with first element of array. 
        for (int i = 0; i < arr.length; i++) {          //Loop through the array 
           if(arr[i] > max)                             //Compare elements of array with max  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
} 
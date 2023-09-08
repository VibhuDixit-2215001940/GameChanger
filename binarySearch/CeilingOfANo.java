//CEILING OF NO.
//1.Firstly an sorted array with target elemenet should be inputed.
//2.A ceiling no. is the smallest elelement freater or equal to target.

import java.util.Scanner;
public class CeilingOfANo{
    static void binarysearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= target){
                System.out.print(arr[i]);
                break;
            }
        }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the sorted array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        binarysearch(arr, target);
    }
}
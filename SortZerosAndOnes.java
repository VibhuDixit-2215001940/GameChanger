import java.util.Scanner;

public class SortZerosAndOnes {
    static int[] sort(int[] arr){
        int n = arr.length;
        int zeros = 0;
        //COUNT NO. OF ZEROS
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeros){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        return new int[] arr;
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter 0 and ones: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The sorted array is: "+sort(arr));
    }
}

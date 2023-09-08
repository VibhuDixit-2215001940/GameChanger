import java.util.Scanner;

public class FindUniqueNo {
    static int FindUnique(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans=-1;
        for(int k=0;k<n;k++){
            if(arr[k]>0){
                ans=arr[k];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Unique element: "+FindUnique(arr));
    }
}

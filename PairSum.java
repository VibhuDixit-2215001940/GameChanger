import java.util.Scanner;

public class PairSum {
    static int pairsum(int[] arr,int target){       //METHOD STORED IN HEAP
        int m = arr.length;
        int ans=0;
        for(int i=0;i<m;i++){       //FOR FIRST NO.
            for(int j=i;j<m;j++){       //FOR SECOND NO.
                if(arr[i] +arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;         //RETURNING THE PAIR ACCORDING TO TARGET
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        System.out.println("The no. of pairs are: "+pairsum(arr,target));
    }
}

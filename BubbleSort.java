import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i <n; i++){
            System.out.print("Enter the value of index "+i+" : ");
            a[i] = sc.nextInt();
        }
        System.out.println("Array before sort: ");
        for(int j: a){              //FOR EACH LOOP USING TO DISPLAY THE ELEMENTS
            System.out.println(j);
        }

        //BUBBLE SORT
        //Time complexity = O(n^2)
        for(int i=0; i<a.length-1;i++){
            for(int j=0; j<a.length-i-1; j++){
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        System.out.println("Array after sort: ");
        for(int j: a){              //FOR EACH LOOP USING TO DISPLAY THE ELEMENTS
            System.out.println(j);
        }
    }
}

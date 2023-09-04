import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        System.out.print("Enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){               //TAKING THE INPUT FOR EVERY INDEX
            System.out.printf("Enter the element of index %d : ",i);
            a[i]=sc.nextInt();
        } 
        for(int j: a){              //FOR EACH LOOP USING TO DISPLAY THE ELEMENTS
            System.out.println(j);
        }
    }
}
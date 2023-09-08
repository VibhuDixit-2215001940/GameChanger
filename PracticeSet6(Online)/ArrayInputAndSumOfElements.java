import java.util.Scanner;

public class ArrayInputAndSumOfElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);          //Making Scanner As Object
        System.out.print("Enter the size of an array: ");
        int n=sc.nextInt();                         //Taking Size Of An Array
        int a[]=new int [n];                        //Defining An Array
        for(int i=0;i<n;i++){                       //Taking No. One-By-One
            System.out.print("Enter the value of "+i+" index: ");
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){                       //Adding Elements of array
            sum=sum+a[i];
        }
        System.out.println("Sum of given arry elements are: "+sum);
    }
}

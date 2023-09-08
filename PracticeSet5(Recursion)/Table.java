import java.util.Scanner;

public class Table{
    static void multiplication(int a){          //METHOD FOR SOLVING CODE
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d\n",a,i,a*i);        //FOR NEXT LINE \n   
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a no. to find its table: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiplication(n);      //METHOD CALLING
    }
}
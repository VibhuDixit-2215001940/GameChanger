import java.util.Scanner;

public class SumOfANo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int i=4,sum=0;
        while(i>0){
            int z = a%10;
            sum = sum+z;
            a=a/10;
            i--;
        }
        System.out.println(sum);
    }
}

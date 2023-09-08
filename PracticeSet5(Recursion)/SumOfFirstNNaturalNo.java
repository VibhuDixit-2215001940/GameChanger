import java.util.Scanner;

public class SumOfFirstNNaturalNo {
    static int sumrect(int a){
        if(a==1){
            return 1;
        }
        return a + sumrect(a-1);
    }
    public static void main(String[] args) {
        System.out.print("Enter the limit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = sumrect(n);
        System.out.println(z);
    }
}

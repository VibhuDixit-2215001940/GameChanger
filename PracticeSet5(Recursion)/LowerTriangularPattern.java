import java.util.Scanner;

public class LowerTriangularPattern {
    static void pattern(int a){
        for(int i=1;i<=a;i++){
            for(int j=i;j<=a;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of pattern: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}

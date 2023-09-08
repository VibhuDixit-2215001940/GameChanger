import java.util.Scanner;

public class InvertedHalfPyramidWithNo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        for(int i=n; i>=1 ;i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
// Enter the size: 5
// 12345
// 1234
// 123
// 12
// 1
import java.util.Scanner;

public class RightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                //USING SCANNER CLASS
        int n = sc.nextInt();
        int row=1;
        int star = n;
        while(row<=n){                          //LOOPS FOR ROWS
            int i = 1;
            while(i<=row){
                System.out.print("*");
                i++;
            }
            System.out.println("\n");               //FOR NEXT LINE
            row++;
        }
    }
}
// Enter the size: 
// 5
// * 
// * * 
// * * * 
// * * * *
// * * * * *

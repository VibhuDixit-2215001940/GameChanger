import java.util.Scanner;
public class SolidRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int l = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int b = sc.nextInt();
        for(int i=0;i<l;i++){
            for(int j=0;j<b;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// Enter the no. of rows: 3
// Enter the no. of columns: 4
// * * * * 
// * * * * 
// * * * * 
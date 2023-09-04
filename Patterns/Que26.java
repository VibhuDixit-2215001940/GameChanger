import java.util.Scanner;

public class Que26 {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");         //TAKES SIZE OF PATTERN
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n-1;
        int star = 1;
        while(row<=n){              //FOR ROWS
            int i = 1;
            while(i<=space){        //FOR SPACE
                System.out.print("\t");
                i++;
            }
            int j = 1;
            int z = 1;
            while(j<=star){         //FOR STAR
                System.out.print(z+"\t");
                j++;
                z++;
            }
            row++;
            star=star+2;
            space--;
            System.out.println();       //FOR NEXT LINE
        }
    }
}
// Enter the size: 
// 5
//                                 1
//                         1       2       3
//                 1       2       3       4       5
//         1       2       3       4       5       6       7
// 1       2       3       4       5       6       7       8       9
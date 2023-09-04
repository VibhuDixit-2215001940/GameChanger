import java.util.Scanner;

public class Que27 {
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
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int val = 1;
            while(j<=star){  
                System.out.print(val+"\t");
                if(j<=star/2){
                    val++;
                }
                else{
                    val--;
                }
                j++;
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
//         1 
//       1 2 1 
//     1 2 3 2 1 
//   1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1 
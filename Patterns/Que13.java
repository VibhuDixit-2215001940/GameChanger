import java.util.Scanner;
//MIRROR METHODS
public class Que13 {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");         //TAKES SIZE OF PATTERN
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        while(row<=2*n-1){              //FOR ROWS
            int i = 1;
            while(i<=star){        //FOR STAR
                System.out.print("* ");
                i++;
            }
            row++;
            //Mirror
            if(row<n){
                star++;
            }
            else{
                star--;
            }
            System.out.println();       //FOR NEXT LINE
        }
    }
}
// Enter the size: 
// 5
// * 
// * * 
// * * * 
// * * * *
// * * *
// * *
// *
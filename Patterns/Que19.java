import java.util.Scanner;

public class Que19 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //SCANNER OBJECT
        int n = sc.nextInt();                   //TAKING INPUT
        int row = 1;
        int space = -1;
        int star = (n/2)+1;
        while(row<=n){       //ROW LOOP
            int i = 1;
            while(i<=star){                 //STAR LOOP
                if(i<n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                i++;
            }
            int j = 1;
            while(j<=space){                //SPACE LOOP
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k<=star){                 //STAR LOOP AGAIN
                System.out.print("* ");
                k++;
            }
            //MIRROR
            if(row<=n/2){
                star--;space+=2;
            }
            else{
                star++;space-=2;
            }
            row++;                      //INCREASING ROW
            System.out.println();       //NEXT LINE
        }
    }
}

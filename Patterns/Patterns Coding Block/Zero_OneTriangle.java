import java.util.Scanner;

public class Zero_OneTriangle {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the size: ");
            int n = sc.nextInt();
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    if((i+j)%2==0){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
    }
}
// Enter the size: 5
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1
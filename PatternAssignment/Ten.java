import java.util.*;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int row = 1;
        int r = 0;
        int space = size - 1;
        
        while (row <= 2 * size - 1) {
            r = row > size ? 2 * size - row : row;
            int i = 1;
            while (space >= i) {
                System.out.print("\t");
                i++;
            }
            int n = 0;
            int k = 0;
            int ra = 1; // Define ra outside the loop
            while (2 * r - 1 > n) {
                if (n < r) {
                    k = r + n;
                    System.out.print(k + "\t");
                } else {
                    System.out.print(k - ra + "\t");
                    ra++;
                }
                n++;
            }
            row++;
            if(row<=size)
            space--;
            else
            space++; 
            ra = 1;  
            System.out.println();
        }
    }
}
// 5
//                                 1
//                         2       3       2
//                 3       4       5       4       3
//         4       5       6       7       6       5       4
// 5       6       7       8       9       8       7       6       5
//         4       5       6       7       6       5       4
//                 3       4       5       4       3
//                         2       3       2
//                                 1
import java.util.*;
public class Thirteen {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=n/2;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("*\t");
				j++;
			}
			if(row<=n/2) {
				star+=2;
				space--;
			}else {
				star-=2;
				space++;
			}
			row++;
			System.out.println();
		}
    }
}
// 5
//                 *
//         *       *       *
// *       *       *       *       *
//         *       *       *
//                 *
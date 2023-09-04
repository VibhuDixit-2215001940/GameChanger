import java.util.*;
public class Eleven {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		int space2=n-2;
		int star2=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			int j=1;
			if(row==1 || row==n) {
				star=n-1;
			}else {
				star=1;
			}
			while(j<=star) {
				System.out.print("*");
				
				j++;
			}
			int k=1;
			if(row==1 || row==n) {
				space2=0;
			}else {
				space2=n-2;
			}
			while(k<=space2) {
				System.out.print(" ");
				k++;
			}
			int l=1;
			
			while(l<=star2) {
				System.out.print("*");
				l++;
			}
			row++;
			space--;
			System.out.println();
		}


    }
}
// 5
//     *****
//    *   *
//   *   *
//  *   *
// *****
import java.util.*;
public class Twelev {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int num=1;
		int val=1;
		while(row<=n) {
			int i=1;
			while(i<=num) {
				System.out.print(val+"\t");
				i++;	
				val++;
			}
			row++;
			num++;
			System.out.println();
		}

    }
}
// 5
// 1
// 2       3
// 4       5       6
// 7       8       9       10
// 11      12      13      14      15
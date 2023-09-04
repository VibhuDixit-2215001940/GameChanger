import java.util.*;
public class Three {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		while(row<=n){
			int i=1;
			int val=1;
			while(i<=row){
				System.out.print(val+"\t");
				val=val*(row-i)/i;
				i++;
			}
			System.out.println();
			row++;
		}

    }
}
// 5
// 1
// 1       1
// 1       2       1
// 1       3       3       1
// 1       4       6       4       1
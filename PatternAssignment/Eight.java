import java.util.*;
public class Eight {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int a=0;
		int b=1;
		int c=0;
		while(row<=n){
			int i=1;
			while(i<=star){
				System.out.print(a+"\t");
				c=a;
				a=a+b;
				b=c;
				i++;
				
			}
			row++;
			star++;
			System.out.println();

		}

    }
}
// 5
// 0
// 1       1
// 2       3       5
// 8       13      21      34
// 55      89      144     233     377
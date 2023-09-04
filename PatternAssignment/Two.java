import java.util.*;
public class Two {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int star2=n;
		int gap=2*n-1;
		while(row<=2*n+1){
			int i=1;
			while(i<=star){
				System.out.print(n-i+1+" ");
				i++;
			}
			int j=1;
			while(j<=gap){
				System.out.print("  ");
				j++;
			}
			int k=n-star+1;
			if(row==n+1){
				k=n-star+2;
			}
			while(k<=star2){
				System.out.print(k+" ");
				k++;
			}
			row++;
			if(row<=n+1){
				star++;
				gap-=2;
			}else{
				star--;
				gap+=2;
			}
			System.out.println();
		}

    }
}
// 5
// 5                   5 
// 5 4               4 5 
// 5 4 3           3 4 5 
// 5 4 3 2       2 3 4 5 
// 5 4 3 2 1   1 2 3 4 5
// 5 4 3 2 1 0 1 2 3 4 5
// 5 4 3 2 1   1 2 3 4 5
// 5 4 3 2       2 3 4 5
// 5 4 3           3 4 5
// 5 4               4 5 
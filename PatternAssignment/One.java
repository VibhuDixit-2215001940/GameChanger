import java.util.*;
public class One {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int s=0;
        while(i<=n){
            if(n%i==0){
                s++;
            }else{

            }
            i++;
        }
        if(s==2){
            System.out.print("Prime");
        }else{
            System.out.print("Not Prime");
        }
    }
}
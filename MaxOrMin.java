import java.util.*;
public class MaxOrMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.: ");
        int n = sc.nextInt();
        System.out.println("Enter second no.: ");
        int m = sc.nextInt();
        if(n>m){
            System.out.println("Maximum no. is: "+n);
        }
        else if(n==m){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Maximum no. is: "+m);
        }
    }
}

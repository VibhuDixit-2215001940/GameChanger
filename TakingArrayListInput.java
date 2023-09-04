import java.util.ArrayList;
import java.util.Scanner;

public class TakingArrayListInput {
    public static void main(String[] args) {
        System.out.println("Enter the size of arraylist: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);

        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        //Getting item at any index
        for(int i=0;i<n;i++){
            System.out.println(list.get(i));
        }
    }
}
//ARRAY LIST:------------------------>
//1.Size is fixed internally
//2.Say arraylist fills by some amount.
//3.It will create a new arraylist of say double size.
//4.Old elements get copied to new arraylist.
//5.Old arrayList will be deleted.
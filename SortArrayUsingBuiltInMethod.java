import java.util.*;

public class SortArrayUsingBuiltInMethod {
    public static void main(String[] args){

        //APPROACH1
        int a[]={30,50,20,10,60};
        System.out.println("Arrays element before sort: "+Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Arrays element after sort: "+Arrays.toString(a));

        //APPROACH2
        int b[]={30,50,20,10,60};
        System.out.println("Arrays element before sort: "+Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("Arrays element after sort: "+Arrays.toString(b));

        //DESCENDING ORDER SORTING
        Integer c[]={30,50,20,10,60};
        System.out.println("Arrays element before sort: "+Arrays.toString(c));
        Arrays.sort(c,Collections.reverseOrder());          //It supports only Integer type data or primitive type data
        System.out.println("Arrays element after sort: "+Arrays.toString(c));
    }
}

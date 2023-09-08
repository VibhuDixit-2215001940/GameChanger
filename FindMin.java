package LinearSearch;

public class FindMin {
    static int min(int[] arr){
        int minimum = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        int[] arr={10,2,67,9,8,5,12};
        System.out.println("The minimum no. in given array is: "+min(arr));
    }
}

package LinearSearch;

public class SearchInRage {
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int j=start; j<=end; j++){
            if(arr[j] == target){
                return j;
            }
        }
        //This will execute if no element found!!
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 3;
        int start = 1;
        int end = 4;
        System.out.println(linearSearch(arr,target,start,end));
    }
}

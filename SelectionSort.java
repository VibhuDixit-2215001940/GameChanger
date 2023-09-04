public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        //SELECTION SORT
        for(int i=0; i<arr.length-1;i++){
            int smallest = i;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Array after sort: ");
        for(int j: arr){              //FOR EACH LOOP USING TO DISPLAY THE ELEMENTS
            System.out.println(j);
        }
    }
}

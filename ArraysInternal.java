public class ArraysInternal {
    public static void main(String[] args) {
        System.out.print("Arrays memory insider!!");
        int[] arr; //Declaration of array which is defined in stack during compile time
        arr = new int[5]; //Initialization actually here object is being created in heap memory at runtime!!
        System.out.print(arr[1]);   //When no values are inserted in an array then 0 is default value stored
    }
}

//int[] arr = new int[5]

//int[] -->datatype
//arr --> ref variable
//new -->keyword defining a object
//new int[5] --> creating the object in heap memory

//int[] arr --> done in compile time
//new int[5] --> done in runtime (dyanamic memory allocation)

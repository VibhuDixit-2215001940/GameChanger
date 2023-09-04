package LinearSearch;

public class CountEvenLengthDigitsInArray {
    //FUNCTION TO CHECK WHETHER A NO. COUNTAINS EVEN DIGITS OR NOT
    static boolean even(int num){
        int noOfDigit = digits(num);
        return noOfDigit%2==0;
    }
    //COUNT NO. OF DIGT IN A NO.
    static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
 
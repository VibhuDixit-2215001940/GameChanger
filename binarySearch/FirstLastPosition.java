//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//34. Find First and Last Position of Element in Sorted Array
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.
public class FirstLastPosition {
    public static void main(String[] args) {
        
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};        //If element not found
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(target < nums[mid]){
                end = mid -1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return ans;
    }
}

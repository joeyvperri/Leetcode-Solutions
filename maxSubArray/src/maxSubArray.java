public class maxSubArray {
    public static void main(String[] args){
        //kadane's algorithm

        int nums[] = {5,4,-1,7,8};
        //set max and current sum to first number initially
        int max_sum = nums[0];
        int current_sum = max_sum;
        //then we check whats greater, the current sum added to the next number or the next number by itself
        for(int i = 1; i < nums.length; i++){
            current_sum = Math.max(nums[i] + current_sum, nums[i]);
            //set current sum to the max between those two values
            max_sum = Math.max(max_sum, current_sum);
            //we then check to see if the current sum is greater than the max sum
            //if it is we set the max sum
        }
        //return
        System.out.println(max_sum);

    }
}

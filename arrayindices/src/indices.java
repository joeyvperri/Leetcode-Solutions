import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        final int[] result = new int[2];
        if(nums==null || nums.length<2)
            return new int[]{0,0};

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashmap.containsKey(complement)) {
                result[0] = hashmap.get(complement);
                result[1] = i;
                return result;
            } else {
                hashmap.put(nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {10, 20, 30, 30};
        int target = 60;
        int[] result = twoSum(nums, target);
        System.out.print(Arrays.toString(result));
    }
}
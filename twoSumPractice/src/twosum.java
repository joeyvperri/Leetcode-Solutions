import java.util.HashMap;
import java.util.Map;

//return indices of numbers in array that add up to target

public class twosum {

    public static void main (String args[]){
        int[] nums = {1, 2, 3, 4, 6};
        int target = 6;

        int complement = 0;
        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            complement = target - nums[i];
            if(hashmap.containsKey(complement)){
                int[] output = {hashmap.get(complement), i};
                System.out.println(output[0]);
                System.out.println(output[1]);
            }
            hashmap.put(nums[i], i);
        }

    }
}

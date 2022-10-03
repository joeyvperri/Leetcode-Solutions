public class productExceptSelf {

    public static void main(String args[]){
        int[] nums = {1, 2, 3, 4};
        //            1  1   2  6 left products
        //            24 12  4  1 right products
        //            24 12  8  6 multiplied together
        int length = nums.length;
        int[] output = new int[length];
        output[0] = 1;
        int rightTemp = 1;

        for(int i = 1; i < length; i++){
            output[i] = output[i-1] * nums[i-1];
        }

        for(int i = length-1; i >= 0; i--){
            output[i] = output[i] * rightTemp;
            rightTemp = rightTemp * nums[i];
        }

        for(int i = 0; i < length; i++){
            System.out.println(output[i]);
        }

    }
}



/*
    public static void main(String args[]){
        int[] nums = {1, 2, 3, 4};
        //            1  1   2  6 left products
        //            24 12  4  1 right products
        //            24 12  8  6 multiplied together
        int length = nums.length;
        int[] leftproducts = new int[length];
        int[] rightproducts = new int[length];
        int[] output = new int[length];
        leftproducts[0] = 1;
        rightproducts[length - 1] = 1;

        for(int i = 1; i < length; i++){
            leftproducts[i] = leftproducts[i-1] * nums[i-1];
        }

        for(int i = length-2; i >= 0; i--){
            rightproducts[i] = rightproducts[i+1] * nums[i+1];
        }

        for(int i = 0; i < length; i++){
            output[i] = leftproducts[i] * rightproducts[i];
            System.out.println(output[i]);
        }

    }
 */
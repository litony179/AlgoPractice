package TwoSum;


public class TwoSum{
    public static int findMax(int[] nums){
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
}




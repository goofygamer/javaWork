import java.util.HashMap;

public class TwoSum() {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> nums_sum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int solution  = target - nums[i];
            if (nums_sum.containsKey(solution)){
                return new int[] {nums_sum.get(solution), i};
            }

            nums_sum.put(nums[i], i);
        }

        throw new IllegalArgumentException("Not a right case!");
    }
}
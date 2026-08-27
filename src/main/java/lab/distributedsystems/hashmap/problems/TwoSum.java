package lab.distributedsystems.hashmap.problems;

import java.util.HashMap;

public class TwoSum {

    //target = 11
    //num[] = 2, 7, 3, 1, 8, 4

    public TwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>(); // value → index
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) {
                System.out.println("Indices: " + seen.get(need) + ", " + i);
                return;
            }
            seen.put(nums[i], i);
        }
        System.out.println("No pair found");
    }

}

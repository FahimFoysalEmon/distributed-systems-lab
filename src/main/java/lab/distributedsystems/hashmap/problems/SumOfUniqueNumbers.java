package lab.distributedsystems.hashmap.problems;

import java.util.HashSet;
import java.util.Set;

public class SumOfUniqueNumbers {

    public Integer sumOfUniqueNumbers(int[] nums) {


        int sum = 0;

//        Input: nums = [1,2,3,2];
//        Input: nums = [1,2,3,4,5];
//        Input: nums = [1,1,1,1,1];

        Set<Integer> unqNum = new HashSet<>();
        Set<Integer> dupNum = new HashSet<>();


        for (int i = 0; i < nums.length; i++) {
            if (unqNum.add(nums[i])) {
                sum += nums[i];
            } else if (dupNum.add(nums[i])) {
                sum -= nums[i];
            }
        }

        System.out.println(sum);

        return null;

    }

}

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.google.common.collect.Sets;

public class Day1 {
    public static void main(String [] args){
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(solution.search(nums, target));
    }

    static class Solution{
        public int search(int [] nums, int target) {
            List<Integer> result = IntStream.range(0, nums.length)
                    .filter(i -> nums[i] == target)
                    .mapToObj(i -> i)
                    .collect(Collectors.toList());
            if (result.get(0) != null){
                return result.get(0);
            }
            return -1;
        }
    }
}


import java.util.HashMap;
import java.util.Map;

public class Day2 {
	public static void main(String [] args){
		int [] nums = new int[]{2,7,11,15};
		int target = 9;

		int [] result = twoSum(nums, target);
		for (int i : result){
			System.out.print(i);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		Map <Integer, Integer> storage = new HashMap<>();
		for (int i = 0; i < nums.length; i++){
			int diff = target - nums[i];
			if (storage.containsKey(diff)){
				return new int []{storage.get(diff), i};
			}
			else
				storage.put(nums[i], i);
		}
		return new int [] {};
	}
}

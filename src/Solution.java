import java.util.HashMap;
import java.util.Map;

public class Solution
{
	/**
	 * This method finds two indices of numbers that add up to a certain target
	 * number. The way this algorithm works is that it goes through each of the
	 * numbers, then stores its complement (i.e target - number) in the
	 * complement set then, if we find the complement number later in our array,
	 * we know we found the two numbers, otherwise returns null array.
	 * 
	 * @Param Array of integers, unsorted
	 * @Param Target sum you are looking for
	 * @return indices of the two numbers such that they add up to the specific
	 *         target.
	 **/
	public int[] twoSum(int[] nums, int target)
	{
		// Create a complement set to store complements
		Map<Integer, Integer> comp = new HashMap<>();
		// Loop over the array
		for (int i = 0; i < nums.length; i++)
		{
			// Build up the complement set as you go
			
			if (comp.containsKey(nums[i]))
			{
				// if we find the complement again but in our array,
				// that means we have a solution!
				return new int[] { comp.get(nums[i]), i};
			}
			comp.put(target - nums[i], i);
		}
		// If we didn't find anything, return null array.
		return new int[0];
	}
}
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {             
	        Map<Integer,Integer> set = new HashMap();
			int l = nums.length;
			for(int i = 0;i < l; i++){			
				if(set.containsKey(nums[i])) {
                    return new int[] { set.get(nums[i]),i };
					}
				set.put(target -nums[i],i);
			}
			throw new IllegalArgumentException("No two sum solution");			
    }
}

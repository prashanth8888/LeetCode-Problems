import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
   
     
	    boolean result = false;
	    boolean to_be_returned = false;
		Set<Integer> set_result = new HashSet<Integer>();
		if(nums.length == 1){
			to_be_returned = false;
		}
		
		else {
		
		Arrays.sort(nums);
		outer:
		for(int i=0; i<nums.length - 1; i++){
				if(nums[i] == nums[i+1]){
					to_be_returned = true;
					break outer;
				}
			}
					
			}
		    	return to_be_returned;
		}
	} 
       
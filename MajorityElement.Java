import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        
    HashMap<Integer,Integer> mehmp = new HashMap<Integer,Integer>();
	int value = 0;
	int max_occurences = 0;
	int element_of_max_occurence = 0;
	if(nums.length == 1){
		element_of_max_occurence = nums[0];
	}
	else{
	for(int i=0; i<nums.length; i++){
		if(mehmp.containsKey(nums[i])){
			value = mehmp.get(nums[i]);
			++value;
			mehmp.replace(nums[i], value);
			//Logic for getting the maximum occurences
			if(value > max_occurences){
				element_of_max_occurence = nums[i];
				max_occurences = value;
			}
		}
		else{
			mehmp.put(nums[i], 1);
		}
	}
	}
	return element_of_max_occurence;
	  
    }
}
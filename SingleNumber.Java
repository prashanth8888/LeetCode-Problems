public class Solution {
    public int singleNumber(int[] nums) {
    
    List<Integer> result_list = new ArrayList<Integer>();
	    
	     if(nums.length == 1){
	            return nums[0];
	    }
	    
	    else{
	         	    
	    for(int i = 0; i < nums.length ; i++){
	    	if(result_list.isEmpty() || (!result_list.contains(nums[i]))){
	    		result_list.add(nums[i]);
	        }
	    	else if(result_list.contains(nums[i])){
	    		int position=result_list.indexOf(nums[i]);
	    		result_list.remove(position);
	    	}
	    }
	    
	    return result_list.get(0);
	    
	    }
	    
	    
	}
            
    
}
    
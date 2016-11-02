import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> result_verify = new TreeSet<Integer>();
	
	for(int i=0; i<nums1.length; i++){
		for(int j=0;j<nums2.length; j++){
			if(nums1[i] == nums2[j]){
				//Check for the existence in the result array
				result_verify.add(nums1[i]);
			}
		}
	}
	
	
	Iterator<Integer> result_iterator = result_verify.iterator();
	int[] result = new int[result_verify.size()];
	int result_counter = 0;
	while(result_iterator.hasNext()){
		int value = (int) result_iterator.next();
		result[result_counter] = value;
		result_counter++;
	}
	
	return result;
        
    }
}
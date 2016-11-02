public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i: nums1){
			if(map1.containsKey(i)){
				map1.replace(i, map1.get(i) + 1);
			}
			else{
				map1.put(i, 1);
			}
		}
		
		for(int j: nums2){
			if(map1.containsKey(j)){
				if(map1.get(j) >= 1){
					map1.replace(j, map1.get(j) - 1);
					al.add(j);
				}
			}
		}
		
		int[] result_set = new int[al.size()];
		int result_set_counter = 0;
		for(int values: al){
			result_set[result_set_counter] = values;
			System.out.print(result_set[result_set_counter] + " ");
			result_set_counter++;
		}
		
		return result_set;	
        
    }
}
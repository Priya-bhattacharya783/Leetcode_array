class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            
            map.put(num, map.getOrDefault(num, 0) + 1);

           if (map.get(num) > nums.length/2) {  //map.get() is used for count the num
                return num;
            }
        }

        return -1;
        
    }
}

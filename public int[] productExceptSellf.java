class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] ans=new int[nums.length];
       
        
        for(int i=0;i<nums.length;i++)
        {
             int m=1;
            for(int j=0;j<nums.length;j++)
            {

                if(j==i)
                {
                 continue;
                }
                else{
                    m=m*nums[j];
                }
            }
            ans[i]=m;;
            
        }
        return ans;
        
    }
}

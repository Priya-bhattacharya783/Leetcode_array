class Solution {
    public void rotate(int[] nums, int k) {
       int []temp=new int[nums.length];
       int n=nums.length;

       for(int i=0;i<nums.length;i++)
       {
        temp[(i+k)%n]=nums[i];  //(0+3)%7 =3 means temp[3]=nums[0]=1........
                                //(4+3)%7 =0 means temp[0]=nums[4]=5
       }
       
       for(int i=0;i<n;i++)
       {
        nums[i]=temp[i];
       }
    }
}

class Search_Insert_Java{
    public int searchInsert(int[] nums, int target) {
        int pos = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                pos=i;
            }else if(target>nums[i]){
                pos=i+1;
            }
        }
        return pos;
    }
}
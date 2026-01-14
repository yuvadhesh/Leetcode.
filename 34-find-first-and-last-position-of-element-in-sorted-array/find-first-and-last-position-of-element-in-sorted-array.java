class Solution{
    public int[] searchRange(int[] nums,int target){
        int index=binarySearch(nums,target);
        if(index==-1)
            return new int[]{-1,-1};
        int left=index;
        int right=index;
        while(left>0&&nums[left-1]==target)
            left--;
        while(right<nums.length-1&&nums[right+1]==target)
            right++;
        return new int[]{left,right};
    }
    private int binarySearch(int[]nums,int target){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return-1;
    }
}

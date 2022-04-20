class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        int[] res = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        res[0] = first(arr,x);
        res[1] = last(arr,x);
        if(res[0]==-1){
            list.add(-1);
            return list;
        }
        list.add(res[0]);
        list.add(res[1]);
        return list;
    }
    public int first(int[] nums,int target){
        int index = -1;
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(nums[mid]==target){
                index = mid;
                e = mid-1;
            }
            else if(target<nums[mid]){
                e = mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return index;
    }
    public int last(int[] nums,int target){
        int index = -1;
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(nums[mid]==target){
                index = mid;
                s = mid+1;
            }
            else if(target<nums[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return index;
    }
    
}

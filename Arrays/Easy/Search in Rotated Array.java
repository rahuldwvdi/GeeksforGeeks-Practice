class Solution
{
    int search(int nums[], int l, int h, int key)
    {
        if(l>h){
            return -1;
        }
        int mid = l+ (h-l)/2;
        
        if(nums[mid] == key){
            return mid;
        }
        
        if(nums[l]<=nums[mid]){ // array is sorted in first half
            if(key<=nums[mid] && key>=nums[l]){
                return search(nums, l, mid -1, key); //target lies in that portion
            }
            else{
                return search(nums, mid+1, h, key); //target lies in other portion
            }
        }
        if(key>=nums[mid] && key <= nums[h]){ //target is in other half
            return search(nums, mid+1, h, key);
        }
        return search(nums, l, mid-1, key); //target is in first half
    }
}

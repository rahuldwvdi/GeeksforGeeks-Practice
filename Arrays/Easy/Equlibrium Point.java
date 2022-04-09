class Solution {  
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        int left = 0;
        int right = n-1;
        long leftsum = 0;
        long rightsum = 0;
        while(left<=right){
            if(leftsum==rightsum && left==right){
                return left+1;
            }
            else if(leftsum < rightsum){
                leftsum +=arr[left];
                left++;
            }
            else{
                rightsum += arr[right];
                right--;
            }
        }
        return -1;
    }
}

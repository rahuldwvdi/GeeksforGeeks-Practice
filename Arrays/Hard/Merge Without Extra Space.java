//https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1

class Solution
{
    //Function to merge the arrays.
    
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int i=0;
        int j=0;
        int k= n-1;
        while(i<=k && j<m){
            if(arr1[i]<arr2[j]){
                i++;
                continue;
            }
            else{
                long temp = arr1[k];
                arr1[k] = arr2[j];
                arr2[j] = temp;
                k--;
                j++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}

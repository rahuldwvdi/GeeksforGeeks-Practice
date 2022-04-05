//https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1/#

class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        reverse(arr,0,n-1);
        reverse(arr,0,n-1-d);
        reverse(arr,n-d,n-1);
    }
    static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

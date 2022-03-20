//using set, O(n) space
class Solve {
    int[] findTwoElement(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        int[] res = new int[2];
        //for duplicate
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])){
                res[0] = arr[i];
            }
            set.add(arr[i]);
        }
        //for missing number
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                res[1] = i;
                break;
            }
        }
        return res;
    }
}

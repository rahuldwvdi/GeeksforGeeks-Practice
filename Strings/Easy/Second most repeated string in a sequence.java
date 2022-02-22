class Solution
{
    String secFrequent(String arr[], int N)
    {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        int max = 0;
        for(String s: map.keySet()){
            if(map.get(s) > max) max= map.get(s);
        }
        int secondmax = 0;
        String str = "";
        for(String s : map.keySet()){
            if(map.get(s)<max && map.get(s)>secondmax){
                secondmax = map.get(s);
                str = s;
            }
        }
        return str;
    }
}

//https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Walmart&page=1&query=category[]StringsproblemTypefunctionaldifficulty[]0company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Walmartcategory[]Stringspage1#

class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String a[], int n)
    {
        String[] result = new String[2];
        HashMap<String, Integer> map = new HashMap<>();
        int max =0;
        for (int i=0;i<n;i++){
            int value = map.getOrDefault(a[i],0);
            map.put(a[i], value+1);
            max = Math.max(value+1, max);
        }
        ArrayList<String> topCandidates = new ArrayList<>();
        for(String str : map.keySet()){
            if((map.get(str))==max) topCandidates.add(str);
        }
        Collections.sort(topCandidates);
        String[] dummy = new String[topCandidates.size()];
        dummy = topCandidates.toArray(dummy);
        result[0] = dummy[0];
        result[1] = Integer.toString(max);
        return result;
    }
}

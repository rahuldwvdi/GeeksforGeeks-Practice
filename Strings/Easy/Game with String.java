//https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Walmart&page=1&query=category[]StringsproblemTypefunctionaldifficulty[]0company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Walmartcategory[]Stringspage1
//using hashmap and arraylist

class Solution{
    static int minValue(String s, int k){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int lastindex = list.size()-1;
        while(k!=0){
            Collections.sort(list);
            int size = list.size();
            list.set(lastindex, list.get(size-1) -1);
            k = k-1;
        }
        int sum =0;
        for(Integer a: list){
            sum += a*a;
        }
        return sum;
    }
}

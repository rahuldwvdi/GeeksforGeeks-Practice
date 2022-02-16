//https://practice.geeksforgeeks.org/problems/twice-counter4236/1/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&page=1&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Samsung&company[]=Goldman%20Sachs&company[]=Paytm&company[]=Walmart&company[]=Morgan%20Stanley&company[]=OYO%20Rooms&query=category[]StringsproblemTypefunctionaldifficulty[]0page1company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Samsungcompany[]Goldman%20Sachscompany[]Paytmcompany[]Walmartcompany[]Morgan%20Stanleycompany[]OYO%20Roomscategory[]Strings#

class Solution
{
    public int countWords(String list[], int n)
    {
        int count=0;
        HashMap<String, Integer> map = new HashMap<>();
        for(String str: list){
            int value = map.getOrDefault(str, 0);
            map.put(str, value+1);
        }
        for(String s: map.keySet()){
            if(map.get(s)==2) count++;
        }
        return count;
    }
}

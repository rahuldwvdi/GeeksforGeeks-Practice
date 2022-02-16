//https://practice.geeksforgeeks.org/problems/match-specific-pattern/1/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&page=1&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Samsung&company[]=Goldman%20Sachs&company[]=Paytm&company[]=Walmart&company[]=Morgan%20Stanley&company[]=OYO%20Rooms&query=category[]StringsproblemTypefunctionaldifficulty[]0page1company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Samsungcompany[]Goldman%20Sachscompany[]Paytmcompany[]Walmartcompany[]Morgan%20Stanleycompany[]OYO%20Roomscategory[]Strings#

class GfG{
    public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern){
	    ArrayList<String> result = new ArrayList<>();
	    String pat = checkPattern(pattern);
	    for(String word : dict){
	        String matching = checkPattern(word);
	        if(matching.equals(pat)) result.add(word);
	    }
	    return result;
	}
    public static String checkPattern(String p){
        String pat = "";
        int value = 0;
        for(int i=0;i<p.length()-1;i++){
            if(p.charAt(i) == p.charAt(i+1)){
                value +=1;
            }
            else{
                pat += value;
                value = 1;
            }
        }
        pat += value;
        return pat;
    }
}

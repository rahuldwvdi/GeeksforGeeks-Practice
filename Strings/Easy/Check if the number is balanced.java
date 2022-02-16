//https://practice.geeksforgeeks.org/problems/check-if-the-number-is-balanced3014/1/?category[]=Strings&category[]=Strings&difficulty[]=0&page=1&query=category[]Stringsdifficulty[]0page1category[]Strings

class Sol
{
    Boolean balancedNumber(String N)
    {
      int l = 0;
	    int sumr = 0;
	    int suml = 0;
	    int r = N.length()-1;
	    while(l<r){
	        suml += N.charAt(l);
	        sumr += N.charAt(r);
	        l++;
	        r--;
	    }
	    return suml==sumr;       
    }
}

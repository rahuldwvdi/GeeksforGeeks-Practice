class GfG
 {
	String encode(String str)
	{
        String res ="";
        int count = 1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1))  count++;
            else{
                res = res + str.charAt(i);
                res = res + (count);
                count = 1;
            }
        }
        res = res + str.charAt(str.length()-1);
        res = res + (count);
        return res;
	}
	
 }

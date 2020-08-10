public class Solution {
    public int isPalindrome(String A) {
        A=A.replaceAll("\\p{Punct}","");
        A=A.replaceAll("\\s","");
        String str=A.toLowerCase();
        String b="";
        int n=str.length();
        boolean flag=true;
        if(n==1)
            return 1;
        for(int i=n-1;i>=0;i--)
        {
            Character c1=new Character((str.charAt(i)));
            Character c2=new Character((str.charAt(n-i-1)));
            if(c1.equals(c2))
                continue;
            else
                {
                    flag=false;
                    break;
                    
                }
            
        }
        
        if(flag)
        {
            return 1;
        }
        
        else{
            return 0;
        }
        
        
        
    }
}

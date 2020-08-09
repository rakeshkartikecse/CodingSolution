//Program to find SquareRoot of Integer without using sqrt function


public class Solution {
    public int sqrt(int A) {
        double sqr=A/2;
        if(A==0 && A>=0)
            return 0;
        else if(A==1)
            return 1;
        else{
        double temp;
        do{
            
            temp=sqr;
            sqr=(temp+(A/temp))/2;
        }while((temp-sqr)!=0);
        
        int t=(int)Math.floor(sqr);
        
        return t;
        }
    }
}

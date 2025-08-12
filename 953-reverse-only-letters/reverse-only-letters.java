class Solution {
    public String reverseOnlyLetters(String s) 
    {
        int n=s.length();
        char[] c = s.toCharArray();
        int l=0,h=n-1;
        while(l<h)
        {
            if(!Character.isLetter(c[l]))
            {
                l++;
            }
            else if(!Character.isLetter(c[h]))
            {
                h--;
            }
            else
            {
                char a=c[l];
                c[l]=c[h];
                c[h]=a;
                l++;
                h--;
            }
            
         
        }
        String b = new String(c);
        return b;
    }
}
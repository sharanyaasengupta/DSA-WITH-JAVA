class Solution {
    public boolean isAnagram(String s, String t) 
    {
     char ch[]=s.toCharArray();
     char ch2[]=t.toCharArray();
     if(s.length()!=t.length())
     return false;
     
     else
     {
        Arrays.sort(ch);
        Arrays.sort(ch2);
        s=ch.toString();
        t=ch2.toString();
        
        if(Arrays.equals(ch,ch2))
        return true;
     }   
     return false;
    }
}
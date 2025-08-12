class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        int n=strs.length,i;
        Arrays.sort(strs);
        int m=strs[0].length();
        for(i=0;i<m;i++)
        {
          if(strs[0].charAt(i)!=strs[n-1].charAt(i))
          break;
        }
        return strs[0].substring(0,i);
    }
}
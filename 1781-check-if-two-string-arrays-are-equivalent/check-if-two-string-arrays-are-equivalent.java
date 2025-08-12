class Solution
 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2)
    {
     int n=word1.length;
     int m=word2.length;
     StringBuilder sb=new StringBuilder();
     StringBuilder ss=new StringBuilder();
     for(int i=0;i<n;i++)
     sb.append(word1[i]);
     for(int j=0;j<m;j++)
     ss.append(word2[j]);
     String s=sb.toString();
     String str=ss.toString();
     return (s.equals(str));
    }
}
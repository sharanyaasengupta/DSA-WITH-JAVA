class Solution {
    public int maxArea(int[] height) 
    {
        int n=height.length;
       int l=0,r=n-1,sum=0,h,w=0;
       while(l<r)
       {
        h=Math.min(height[l],height[r]);
        w=Math.max(w,(h*Math.abs(l-r)));
        if(height[l]<height[r])
        l++;
        else
        r--;
        
       }
       return w;
    }
}
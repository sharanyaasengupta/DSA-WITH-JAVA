
    class Solution {
    public int primePalindrome(int n) {
        while(true) {
            
            if(10000000 < n && n < 100000000) {
                n = 100000000;  
            }

            if(primne(n)==1 && palindrome(n)==1) {
                return n;
            }
            n++;
        }
    }

    public int primne(int n) {
        if(n < 2) return 0;
        for(int i=2; i*i<=n; i++) {   // check till sqrt(n)
            if(n % i == 0) return 0;
        }
        return 1;
    }

    public int palindrome(int n) {
        int copy=n, rev=0;
        while(n!=0) {
            rev = rev*10 + n%10;
            n = n/10;
        }
        if(copy==rev) return 1;
        else return 0;
    }
}

class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        int i=1;
        while(n>=i){
            n=n-i;
            count=count+1;
            i=i+1;
        }
        return count;
    }
}
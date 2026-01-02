class KokoEating {
    public int maxEl(int []piles){
        int n = piles.length;
        int maxi = Integer.MIN_VALUE;

        for(int i =0 ;i<n ;i++){
            if(maxi < piles[i]){
                maxi = piles[i];
            }
        }
        return maxi;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1 ;
        int r = maxEl(piles);
        int ans = r;

        while(l <= r){
            int mid = l + (r - l)/ 2;

            int totalTime = 0;

            for(int pile : piles){
                totalTime += (pile + mid -1)/mid;
            }

            if(totalTime <= h){
                ans = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
}

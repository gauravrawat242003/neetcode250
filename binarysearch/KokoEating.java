package binarysearch;

class KokoEating {
     int maxEl(int []piles){
        int n = piles.length;
        int maxi = Integer.MIN_VALUE;

        for(int i =0 ;i<n ;i++){
            if(maxi < piles[i]){
                maxi = piles[i];
            }
        }
        return maxi;
    }
     int minEatingSpeed(int[] piles, int h) {
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
    public static void main(String[] args) {
        KokoEating sol = new KokoEating();

        int[] piles = {3,6,7,11};
        int h = 8;

        int ans = sol.minEatingSpeed(piles, h);

        System.out.println(ans);
    }
}

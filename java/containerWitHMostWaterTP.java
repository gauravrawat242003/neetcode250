public class containerWitHMostWaterTP {
     public static int maxArea(int[] heights) {
       int n = heights.length;
       int i = 0 , j = n-1;
       int maxWater = Integer.MIN_VALUE;

       while(i<j){
        int width = j-i;
        int area = Math.min(heights[i],heights[j]);
        maxWater = Math.max(maxWater , area * width);

        if(heights[i] <= heights[j]){
            i++;
        }else{
            j--;
        }
       }
       return maxWater; 
    }
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(heights);
        System.out.println("The maximum area of water that can be contained is: " + result);
    }
}

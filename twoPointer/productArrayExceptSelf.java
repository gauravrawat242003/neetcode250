public class productArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int zeroCount =0;

        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                product *= nums[i] ;
            }else{
                zeroCount++;
            }
        }

        if(zeroCount > 1){
            return (new int[n]);
        }

        int []result = new int[n];
        
        for(int i=0;i<n;i++){
            if(zeroCount > 0){
                result[i] = (nums[i]==0) ? product : 0;
            }else{
                result[i] = product/nums[i];
            }
        }

        return result;
    }
    public static void main(String[] args) {
        productArrayExceptSelf sol = new productArrayExceptSelf();

        int[] nums = {1,2,3,4};

        int[] result = sol.productExceptSelf(nums);

        System.out.print("Product array except self: ");
        for(int num : result){
            System.out.print(num + " ");
        }
    }
} 

/**second approach
         1 ,2 , 3, 4
prefix   1 ,2 , 6, 24
postfix  24,24 ,12 ,4
output   24, 12, 8, 6; 
but we can make it more space efficient
by not using extra arrays for prefix and postfix
         1 ,2 , 3, 4
*/

class productArrayExceptSelfOptimized {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Calculate prefix products
        result[0] = 1;
        for(int i=1;i<n;i++){
            result[i] = result[i-1] * nums[i-1];
        }

        // Calculate postfix products and final result
        int postfixProduct = 1;
        for(int i=n-1;i>=0;i--){
            result[i] = result[i] * postfixProduct;
            postfixProduct *= nums[i];
        }

        return result;
    }
    public static void main(String[] args) {
        productArrayExceptSelfOptimized sol = new productArrayExceptSelfOptimized();

        int[] nums = {1,2,3,4};

        int[] result = sol.productExceptSelf(nums);

        System.out.print("Product array except self (optimized): ");
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}


import java.util.HashSet;
import java.util.Set;

public class duplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();

        for(int num : nums){
            if(st.contains(num)){
                return true;
            }
            st.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        duplicate obj = new duplicate();
        int[] nums = {1, 2, 3, 4, 5, 1};
        System.out.println("Contains duplicates: " + obj.hasDuplicate(nums));
    }
}

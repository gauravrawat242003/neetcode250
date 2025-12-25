import java.util.HashMap;
import java.util.PriorityQueue;
class topKFrequentElem {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new  HashMap<>();
        
        for(int num : nums){
            mp.put(num , mp.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> a[0] - b[0]
        );

        for(int key : mp.keySet()){
            pq.add(new int[]{mp.get(key), key});

            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] result = new int[k];

        int index = 0;

        while(!pq.isEmpty()){
            result[index++] = pq.poll()[1];
        }

        return result;
    }

    public static void main(String[] args) {
        topKFrequentElem sol = new topKFrequentElem();

        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        int[] topK = sol.topKFrequent(nums, k);

        System.out.print("Top " + k + " frequent elements: ");
        for(int num : topK){
            System.out.print(num + " ");
        }
    }
}


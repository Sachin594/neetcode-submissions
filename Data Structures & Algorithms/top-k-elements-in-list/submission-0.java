class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[k];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.putIfAbsent(num, 1);
            map.put(num,map.get(num)+1);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a,b)->map.get(b).compareTo(map.get(a)));
        int i=0;
        for (Integer integer : keys) {
            if(i<k){
                res[i] = integer;
                i++;
            }
            else{
                break;
            }
        }
        return res;
    }
}

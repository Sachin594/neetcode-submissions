class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        HashMap<List<Integer>,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str=strs[i];
            int[] freArr = new int[26];
            for(int j=0;j<str.length();j++){
                freArr[str.charAt(j) - 'a']++;
            }
            List<Integer> key = Arrays.stream(freArr).boxed().toList();
            if(!map.containsKey(key)){
                List<String> strss = new ArrayList<>();
                strss.add(str);
                map.put(key,strss);
            }
            else{
                List<String> strAr= map.get(key);
                strAr.add(str);
                map.put(key,strAr);
            }
        }
        for (List<String> list : map.values()) {
            lists.add(list);
        }
        return lists;
    }
}

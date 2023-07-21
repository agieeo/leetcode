class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        String key;
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            key = new String(arr); //这个不会改变原来的arr，如果使用arr.toString()则会改变原来的arr
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
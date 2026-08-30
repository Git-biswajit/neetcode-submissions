class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String word: strs){
            int[] freq = new int[26];
            for(char c : word.toCharArray()){
                freq[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(freq[i]).append('#');
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
        
    }
}

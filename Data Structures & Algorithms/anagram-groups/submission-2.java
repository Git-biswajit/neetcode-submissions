class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[] freq = new int[26];
            String str = strs[i];
            for(int j=0;j<str.length();j++){
             freq[str.charAt(j)-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int k=0;k<26;k++){
                sb.append(freq[k]);
                sb.append('#');
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }  
        return new ArrayList<>(map.values());      
    }
}

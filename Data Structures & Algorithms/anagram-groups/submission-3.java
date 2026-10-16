class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String,ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String str = strs[i];
            int[] freq = new int[26];
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

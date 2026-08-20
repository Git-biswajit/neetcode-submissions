class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        int start =0;
        int end =0;
        for(int i=0;i<s.length();i++){
            end = Math.max(end, map.get(s.charAt(i)));
            if(i==end){
                int len = end-start+1;
                list.add(len);
                start = i+1;
            }
        }
        return list;
        
    }
}

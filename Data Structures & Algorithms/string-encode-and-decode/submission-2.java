class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String value: strs){
            sb.append(value.length());
            sb.append("#");
            sb.append(value);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String> result = new ArrayList<>();
        while(i<str.length()){
            int j =i;
            while(str.charAt(j)!='#'){
                j++;
            }
            // int len = Integer.parseInt(str.substring(i,j));
            int len = Integer.parseInt(str.substring(i, j));
            i=j+1;
            String res = str.substring(i,i+len);
            result.add(res);
            i = i+len;
        }
        return result;

    }
}

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map=new HashMap<>();
        List<String> result=new ArrayList<>();
        int i=0;
        while(i+10<=s.length()){
            StringBuilder sb=new StringBuilder(s.substring(i,i+10));
            i++;
            map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
            if(map.get(sb.toString())==2){
                result.add(sb.toString());
            }
        }
        return result;
    }
}

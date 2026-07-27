class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++) {
            char ch  = magazine.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            char ch2 = ransomNote.charAt(i);
            if(!map.containsKey(ch2)){
                return false;
            }
            if(map.get(ch2) == 0) {
                return false;
            }
            map.put(ch2,map.get(ch2)-1);
            
        }
    return true;

        
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
            s = s.toLowerCase();
            t = t.toLowerCase();
            char[] charS = s.toCharArray();
            char[] charT = t.toCharArray();
            Arrays.sort(charS);
            Arrays.sort(charT);
            s = Arrays.toString(charS);
            t = Arrays.toString(charT);
            if(s.equals(t)){
                return true;
            }
            return false;
    }
}

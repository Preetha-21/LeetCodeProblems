class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for(String s:word1)
        {
            sb.append(s);
        }
        StringBuilder s = new StringBuilder();
        for(String a:word2)
        {
            s.append(a);
        }
        return sb.toString().equals(s.toString());
    }
}
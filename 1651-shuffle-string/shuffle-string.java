class Solution {
    public String restoreString(String s, int[] indices) {
         String arr[]=new String[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[indices[i]]=Character.toString(s.charAt(i));
        }
        String res="";
        for(int i=0;i<arr.length;i++)
        {
            res+=arr[i];
        }
        return res;
    }
}
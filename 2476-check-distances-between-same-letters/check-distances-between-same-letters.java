class Solution {
    public boolean checkDistances(String s, int[] distance) {
        char a[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==',')
            {
                continue;
            }
            int b=s.indexOf(s.charAt(i));
            int c=s.lastIndexOf(s.charAt(i));
            c=c-1;
            int dif=c-b;
            char ch=s.charAt(i);
            int h=ch-'a';
            String l=Character.toString(s.charAt(i));
            s.replace(l,",");
            if(distance[h]==dif)
            {
                continue;
            }
            else{
                return false;
            }
        
        }
        return true;
    }
}
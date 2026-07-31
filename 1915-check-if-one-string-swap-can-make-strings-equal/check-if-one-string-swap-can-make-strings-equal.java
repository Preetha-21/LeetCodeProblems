class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        boolean b[]=new boolean[s2.length()];
        int a[]=new int[26];
        int b1[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                  b[i]=true;
                  char ch1=s1.charAt(i);
                  char ch2=s2.charAt(i);
                  a[ch1-'a']++;
                  b1[ch2-'a']++;
            }
        }
        int count=0;
        for(boolean i:b)
        {
            if(i==true)
            {
                count++;
            }
        }
         System.out.print(Arrays.toString(b));
        return (count==2||count==0)&&Arrays.equals(a, b1);
    }
}
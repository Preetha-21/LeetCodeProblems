class Solution {
    public String[] findWords(String[] b) {
        String s="qwertyuiopQWERTYUIOP";
            String t="asdfghjklASDFGHJKL"; 
            String a="zxcvbnmZXCVBNM";
            List<String> sl=new ArrayList<>();
           
            for(String w:b) 
            {
                String r="";
                int count=0;
                char c[]=w.toCharArray();
               if(s.contains(String.valueOf(c[0])))
               {
                  r=s;
               }
               else if(t.contains(String.valueOf(c[0])))
               {
                  r=t;
               }
               else
               {
                r=a;
               }
               for(int j=0;j<c.length;j++)
               {
               if(r.contains(String.valueOf(c[j])))
               {
                count+=1;
               }
               }
               if(count==c.length)
               {
                sl.add(w);
               }
               
            }
            return sl.toArray(new String[0]);
    }
}
class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        char arr[]=s.toCharArray();
        int p=2*k;
        int h=0;
        for(int i=0;i<s.length();i++)
        {
            if(arr[i]=='0')
            {
                h++;
            }
    
            if(h==0&&arr[i]!=0)
            {
                int l=0;
                for(int j=i;j<s.length();j++)
                {
                sb1.append(Character.toString(arr[j]));
                arr[j]='0';
                l++;
                if(l==k)
                {

                    break;
                }
                }
                sb1.reverse();
                sb.append(sb1.toString());
                sb1.setLength(0);
                h++;
            }
            if(h==p)
            {
                h=0;
            }
            else if (arr[i]!='0'){
                sb.append(Character.toString(arr[i]));
                h++;
                if(h==p)
                 {
                   h=0;
                 }
            }
        }
        return sb.toString();
    }
}
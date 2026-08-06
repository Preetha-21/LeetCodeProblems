class Solution {
    public int findComplement(int num) {
       String s=Integer.toBinaryString(num);
       char arr[]=s.toCharArray();
       for(int i=0;i<s.length();i++)
       {
          if(arr[i]=='1')
          {
            arr[i]='0';
          }
          else{
            arr[i]='1';
          }
       } 
       String res=new String(arr);
       int a=Integer.parseInt(res,2);
       return a;

    }
}
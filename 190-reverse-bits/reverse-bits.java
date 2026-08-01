class Solution {
    public int reverseBits(int n) {
        String a=String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        System.out.print(sb);
        int decimal =Integer.parseInt(sb.toString(), 2);
        return decimal;
    }
}
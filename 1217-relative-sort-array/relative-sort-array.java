class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k=0;
        int count=0;
        //int a[]=new int[arr1.length];
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    count++;
                    int temp=arr1[k];
                    arr1[k]=arr1[j];
                    arr1[j]=temp;
                    k++;
                }
            }
        }
       int n=arr1.length-1;
       int m=arr2.length-1;
       for(int i=count;i<=n;i++)
       {
        for(int j=i+1;j<=n;j++)
        {
           if(arr1[i]>arr1[j])
           {
             int temp=arr1[i];
             arr1[i]=arr1[j];
             arr1[j]=temp;
           }
        }
          
       }
       return arr1;
    }
}
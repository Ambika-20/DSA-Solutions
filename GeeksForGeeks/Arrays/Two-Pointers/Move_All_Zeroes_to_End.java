class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int start = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
            arr[start] = arr[i];
            start+=1;
            }
        }
        while(start<arr.length)
        {
            arr[start] = 0;
            start+=1;
        }
    }
}
class Solution {
    int countPairs(int arr[], int target) {
        //  Code Here
        Arrays.sort(arr);
        int count = 0;
        int left = 0;
        int right = arr.length-1;
        
        while(left<right)
        {
            int currSum = arr[left]+arr[right];
            if(currSum==target)
            {
                count+=1;
                left++;
                right--;
            }
            else if(currSum>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return count;
    }
}

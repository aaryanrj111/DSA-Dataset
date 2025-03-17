// Java Program to find the maximum subarray sum using nested loops 



class Solution {

    // Function to find the sum of subarray with maximum sum
    static int maxSubarraySum(int[] arr) {
        int res = arr[0];
  
        // Outer loop for starting point of subarray
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
      
            // Inner loop for ending point of subarray
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];
              
                // Update res if currSum is greater than res
                res = Math.max(res, currSum);
            }
        }
        return res;
    }

}
// Java program to find the maximum product of a subarray
// of size k


class Solution 
{
	// Function returns maximum product of a subarray
	// of size k in given array, arr[0..n-1]. This function
	// assumes that k is smaller than or equal to n.
	static int findMaxProduct(int arr[], int n, int k)
	{
		// Initialize the MaxProduct to 1, as all elements
		// in the array are positive
		int MaxProduct = 1;
		for (int i=0; i<k; i++)
			MaxProduct *= arr[i];

		int prev_product = MaxProduct;

		// Consider every product beginning with arr[i]
		// where i varies from 1 to n-k-1
		for (int i=1; i<=n-k; i++)
		{
			int curr_product = (prev_product/arr[i-1]) *
								arr[i+k-1];
			MaxProduct = Math.max(MaxProduct, curr_product);
			prev_product = curr_product;
		}

		// Return the maximum product found
		return MaxProduct;
	}
	
	
}

// This code is contributed by Pramod Kumar

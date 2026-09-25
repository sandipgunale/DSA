class Solution { 
    public int[] sortArrayByParity(int[] nums) { 
        int n = nums.length; 
        int l = 0; 
        int r = n - 1; 
        int i = 0; 
        
        while (i < n) { 
            if (l > r) { 
                break; 
            } 
            
            if (nums[i] % 2 == 0) { 
                int temp = nums[l]; 
                nums[l] = nums[i]; 
                nums[i] = temp; 
                l++; 
                i++;
            } else { 
                int temp = nums[r]; 
                nums[r] = nums[i]; 
                nums[i] = temp; 
                r--;
            } 
        } 
        return nums; 
    } 
}

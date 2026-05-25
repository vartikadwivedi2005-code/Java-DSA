//Given an integer array nums and an integer k, return true if there 
// are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.


class Duplicate2  {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++ ){
            
                if((j-i)>k){
                    break;
                }
                if(nums[i]==nums[j]){
                    return true;
                }
            }

        }
        return false;
    }
    
    public static void main(String[] args) {
       // int[] nums = {1,2,3,1,2,3};
        //int[] nums = {1,2,3,1};
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k)); // true
    }
}

//nums[0] = 1, nums[3] = 1 → equal values.
//abs(0 - 3) = 3, which is ≤ k (3) → ✅
//Return true.

class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean bool=false;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                bool =true;
                break;
            }else{
                map.put(nums[i],1);
            }

        }
        return bool;
        
    }
}
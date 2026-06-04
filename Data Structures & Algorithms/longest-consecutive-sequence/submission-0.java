class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new  HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int lon = 0;
        for(int num : set){
        if(!set.contains(num-1)){
            int currentNum = num;
            int streak = 1;
           while(set.contains(currentNum+1)){
            currentNum++;
            streak++;
           }
         lon = Math.max(lon,streak);
        }
        }
        return lon;
    }
}
